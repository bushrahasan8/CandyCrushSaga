package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.util.Preconditions;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: DiskCacheWriteLocker.class */
public final class DiskCacheWriteLocker {
    private final Map locks = new HashMap();
    private final WriteLockPool writeLockPool = new WriteLockPool();

    /* loaded from: DiskCacheWriteLocker$WriteLock.class */
    public static class WriteLock {
        int interestedThreads;
        final Lock lock = new ReentrantLock();

        WriteLock() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: DiskCacheWriteLocker$WriteLockPool.class */
    public static class WriteLockPool {
        private final Queue pool = new ArrayDeque();

        WriteLockPool() {
        }

        WriteLock obtain() {
            WriteLock writeLock;
            synchronized (this.pool) {
                writeLock = (WriteLock) this.pool.poll();
            }
            WriteLock writeLock2 = writeLock;
            if (writeLock == null) {
                writeLock2 = new WriteLock();
            }
            return writeLock2;
        }

        void offer(WriteLock writeLock) {
            synchronized (this.pool) {
                if (this.pool.size() < 10) {
                    this.pool.offer(writeLock);
                }
            }
        }
    }

    public void acquire(String str) {
        WriteLock writeLock;
        synchronized (this) {
            WriteLock writeLock2 = (WriteLock) this.locks.get(str);
            writeLock = writeLock2;
            if (writeLock2 == null) {
                writeLock = this.writeLockPool.obtain();
                this.locks.put(str, writeLock);
            }
            writeLock.interestedThreads++;
        }
        writeLock.lock.lock();
    }

    public void release(String str) {
        WriteLock writeLock;
        synchronized (this) {
            writeLock = (WriteLock) Preconditions.checkNotNull(this.locks.get(str));
            int i = writeLock.interestedThreads;
            if (i < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + writeLock.interestedThreads);
            }
            int i2 = i - 1;
            writeLock.interestedThreads = i2;
            if (i2 == 0) {
                WriteLock writeLock2 = (WriteLock) this.locks.remove(str);
                if (!writeLock2.equals(writeLock)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + writeLock + ", but actually removed: " + writeLock2 + ", safeKey: " + str);
                }
                this.writeLockPool.offer(writeLock2);
            }
        }
        writeLock.lock.unlock();
    }
}

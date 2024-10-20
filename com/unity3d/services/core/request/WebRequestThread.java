package com.unity3d.services.core.request;

import android.os.ConditionVariable;
import com.unity3d.ads.core.domain.InitializeAndroidBoldSDK;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.WebRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: WebRequestThread.class */
public class WebRequestThread {
    private static int _corePoolSize = 1;
    private static long _keepAliveTime = 1000;
    private static int _maximumPoolSize = 1;
    private static CancelableThreadPoolExecutor _pool;
    private static LinkedBlockingQueue<Runnable> _queue;
    private static boolean _ready = false;
    private static final Object _readyLock = new Object();

    /* renamed from: com.unity3d.services.core.request.WebRequestThread$2, reason: invalid class name */
    /* loaded from: WebRequestThread$2.class */
    class AnonymousClass2 implements Runnable {
        final String val$host;
        final IResolveHostListener val$listener;

        AnonymousClass2(String str, IResolveHostListener iResolveHostListener) {
            this.val$host = str;
            this.val$listener = iResolveHostListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread thread;
            ConditionVariable conditionVariable = new ConditionVariable();
            try {
                thread = new Thread(new Runnable(this, conditionVariable) { // from class: com.unity3d.services.core.request.WebRequestThread.2.1
                    final AnonymousClass2 this$0;
                    final ConditionVariable val$cv;

                    {
                        this.this$0 = this;
                        this.val$cv = conditionVariable;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            String hostAddress = InetAddress.getByName(this.this$0.val$host).getHostAddress();
                            AnonymousClass2 anonymousClass2 = this.this$0;
                            anonymousClass2.val$listener.onResolve(anonymousClass2.val$host, hostAddress);
                        } catch (UnknownHostException e) {
                            DeviceLog.exception("Unknown host", e);
                            AnonymousClass2 anonymousClass22 = this.this$0;
                            anonymousClass22.val$listener.onFailed(anonymousClass22.val$host, ResolveHostError.UNKNOWN_HOST, e.getMessage());
                        }
                        this.val$cv.open();
                    }
                });
            } catch (Exception e) {
                e = e;
                thread = null;
            }
            try {
                thread.start();
            } catch (Exception e2) {
                e = e2;
                DeviceLog.exception("Exception while resolving host", e);
                this.val$listener.onFailed(this.val$host, ResolveHostError.UNEXPECTED_EXCEPTION, e.getMessage());
                if (conditionVariable.block(20000L)) {
                    return;
                } else {
                    return;
                }
            }
            if (conditionVariable.block(20000L) || thread == null) {
                return;
            }
            thread.interrupt();
            this.val$listener.onFailed(this.val$host, ResolveHostError.TIMEOUT, InitializeAndroidBoldSDK.MSG_TIMEOUT);
        }
    }

    public static void cancel() {
        synchronized (WebRequestThread.class) {
            try {
                CancelableThreadPoolExecutor cancelableThreadPoolExecutor = _pool;
                if (cancelableThreadPoolExecutor != null) {
                    cancelableThreadPoolExecutor.cancel();
                    Iterator<Runnable> it = _queue.iterator();
                    while (it.hasNext()) {
                        Runnable next = it.next();
                        if (next instanceof WebRequestRunnable) {
                            ((WebRequestRunnable) next).setCancelStatus(true);
                        }
                    }
                    _queue.clear();
                    _pool.purge();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void init() {
        synchronized (WebRequestThread.class) {
            try {
                _queue = new LinkedBlockingQueue<>();
                CancelableThreadPoolExecutor cancelableThreadPoolExecutor = new CancelableThreadPoolExecutor(_corePoolSize, _maximumPoolSize, _keepAliveTime, TimeUnit.MILLISECONDS, _queue);
                _pool = cancelableThreadPoolExecutor;
                cancelableThreadPoolExecutor.prestartAllCoreThreads();
                _queue.add(new Runnable() { // from class: com.unity3d.services.core.request.WebRequestThread.1
                    @Override // java.lang.Runnable
                    public void run() {
                        boolean unused = WebRequestThread._ready = true;
                        synchronized (WebRequestThread._readyLock) {
                            WebRequestThread._readyLock.notifyAll();
                        }
                    }
                });
                while (!_ready) {
                    try {
                        Object obj = _readyLock;
                        synchronized (obj) {
                            obj.wait();
                        }
                    } catch (InterruptedException e) {
                        DeviceLog.debug("Couldn't synchronize thread");
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void request(String str, WebRequest.RequestType requestType, Map<String, List<String>> map, Integer num, Integer num2, IWebRequestListener iWebRequestListener) {
        synchronized (WebRequestThread.class) {
            try {
                request(str, requestType, map, null, num, num2, iWebRequestListener);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void request(String str, WebRequest.RequestType requestType, Map<String, List<String>> map, String str2, Integer num, Integer num2, IWebRequestListener iWebRequestListener) {
        synchronized (WebRequestThread.class) {
            try {
                if (!_ready) {
                    init();
                }
                if (str != null && str.length() >= 3) {
                    _queue.add(new WebRequestRunnable(str, requestType.name(), str2, num.intValue(), num2.intValue(), map, iWebRequestListener));
                    return;
                }
                iWebRequestListener.onFailed(str, "Request is NULL or too short");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void reset() {
        synchronized (WebRequestThread.class) {
            try {
                cancel();
                CancelableThreadPoolExecutor cancelableThreadPoolExecutor = _pool;
                if (cancelableThreadPoolExecutor != null) {
                    cancelableThreadPoolExecutor.shutdown();
                    try {
                        _pool.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    _queue.clear();
                    _pool = null;
                    _queue = null;
                    _ready = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean resolve(String str, IResolveHostListener iResolveHostListener) {
        synchronized (WebRequestThread.class) {
            if (str != null) {
                try {
                    if (str.length() >= 3) {
                        new Thread(new AnonymousClass2(str, iResolveHostListener)).start();
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            iResolveHostListener.onFailed(str, ResolveHostError.INVALID_HOST, "Host is NULL");
            return false;
        }
    }

    public static void setConcurrentRequestCount(int i) {
        synchronized (WebRequestThread.class) {
            try {
                _corePoolSize = i;
                _maximumPoolSize = i;
                CancelableThreadPoolExecutor cancelableThreadPoolExecutor = _pool;
                if (cancelableThreadPoolExecutor != null) {
                    cancelableThreadPoolExecutor.setCorePoolSize(i);
                    _pool.setMaximumPoolSize(_maximumPoolSize);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setKeepAliveTime(long j) {
        synchronized (WebRequestThread.class) {
            try {
                _keepAliveTime = j;
                CancelableThreadPoolExecutor cancelableThreadPoolExecutor = _pool;
                if (cancelableThreadPoolExecutor != null) {
                    cancelableThreadPoolExecutor.setKeepAliveTime(j, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setMaximumPoolSize(int i) {
        synchronized (WebRequestThread.class) {
            try {
                _maximumPoolSize = i;
                CancelableThreadPoolExecutor cancelableThreadPoolExecutor = _pool;
                if (cancelableThreadPoolExecutor != null) {
                    cancelableThreadPoolExecutor.setMaximumPoolSize(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

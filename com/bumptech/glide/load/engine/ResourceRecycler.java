package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: ResourceRecycler.class */
class ResourceRecycler {
    private final Handler handler = new Handler(Looper.getMainLooper(), new ResourceRecyclerCallback());
    private boolean isRecycling;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: ResourceRecycler$ResourceRecyclerCallback.class */
    public static final class ResourceRecyclerCallback implements Handler.Callback {
        ResourceRecyclerCallback() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((Resource) message.obj).recycle();
            return true;
        }
    }

    public void recycle(Resource resource) {
        synchronized (this) {
            if (this.isRecycling) {
                this.handler.obtainMessage(1, resource).sendToTarget();
            } else {
                this.isRecycling = true;
                resource.recycle();
                this.isRecycling = false;
            }
        }
    }
}

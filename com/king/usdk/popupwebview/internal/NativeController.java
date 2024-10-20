package com.king.usdk.popupwebview.internal;

import androidx.annotation.Keep;
import com.king.usdk.popupwebview.ILoadingListener;
import com.king.usdk.popupwebview.IMessageListener;
import com.king.usdk.popupwebview.IResponder;
import com.king.usdk.popupwebview.IResponseCallback;
import com.king.usdk.popupwebview.Result;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Keep
/* loaded from: NativeController.class */
final class NativeController extends Popup implements IMessageListener, ILoadingListener {
    private final Lock mNativeCallbackLock;
    private volatile long mNativeInstance;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NativeController(ActivityWrapper activityWrapper, boolean z) {
        super(activityWrapper, z);
        this.mNativeCallbackLock = new ReentrantLock();
        this.mNativeInstance = 0L;
        super.setMessageListener(this);
        super.setLoadingListener(this);
    }

    private native void onBackButtonPressed(long j);

    private native void onMessageReceived(long j, String str, String str2, NativeResponder nativeResponder);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onMessageResponse(long j, long j2, String str, int i, String str2);

    private native void onPageError(long j, String str);

    private native void onPageLoaded(long j, String str);

    public void disconnectFromNativeSide() {
        this.mNativeCallbackLock.lock();
        this.mNativeInstance = 0L;
        this.mNativeCallbackLock.unlock();
        dispose();
    }

    public void dispose() {
        recycleWebResources();
    }

    public int getPageStateAsInteger() {
        return getPageState().ordinal();
    }

    @Override // com.king.usdk.popupwebview.ILoadingListener
    public void onBackButtonPressed() {
        this.mNativeCallbackLock.lock();
        try {
            if (this.mNativeInstance != 0) {
                onBackButtonPressed(this.mNativeInstance);
            }
        } finally {
            this.mNativeCallbackLock.unlock();
        }
    }

    @Override // com.king.usdk.popupwebview.IMessageListener
    public void onMessageReceived(String str, String str2, IResponder iResponder) {
        NativeResponder nativeResponder = iResponder != null ? new NativeResponder(iResponder) : null;
        this.mNativeCallbackLock.lock();
        try {
            if (this.mNativeInstance != 0) {
                onMessageReceived(this.mNativeInstance, str, str2, nativeResponder);
            }
        } finally {
            this.mNativeCallbackLock.unlock();
        }
    }

    @Override // com.king.usdk.popupwebview.ILoadingListener
    public void onPageError(String str) {
        this.mNativeCallbackLock.lock();
        try {
            if (this.mNativeInstance != 0) {
                onPageError(this.mNativeInstance, str);
            }
        } finally {
            this.mNativeCallbackLock.unlock();
        }
    }

    @Override // com.king.usdk.popupwebview.ILoadingListener
    public void onPageLoaded(String str) {
        this.mNativeCallbackLock.lock();
        try {
            if (this.mNativeInstance != 0) {
                onPageLoaded(this.mNativeInstance, str);
            }
        } finally {
            this.mNativeCallbackLock.unlock();
        }
    }

    public void postMessage(String str, String str2, long j) {
        if (j != 0) {
            super.postMessage(str, str2, new IResponseCallback(this, j) { // from class: com.king.usdk.popupwebview.internal.NativeController.1
                final NativeController this$0;
                final long val$nativeResponseCB;

                {
                    this.this$0 = this;
                    this.val$nativeResponseCB = j;
                }

                @Override // com.king.usdk.popupwebview.IResponseCallback
                public void onMessageResponse(String str3, Result result, String str4) {
                    this.this$0.mNativeCallbackLock.lock();
                    try {
                        if (this.this$0.mNativeInstance != 0) {
                            NativeController nativeController = this.this$0;
                            nativeController.onMessageResponse(nativeController.mNativeInstance, this.val$nativeResponseCB, str3, result.ordinal(), str4);
                        }
                    } finally {
                        this.this$0.mNativeCallbackLock.unlock();
                    }
                }
            });
        } else {
            super.postMessage(str, str2, (IResponseCallback) null);
        }
    }

    @Override // com.king.usdk.popupwebview.internal.Popup, com.king.usdk.popupwebview.IPopup
    public void setLoadingListener(ILoadingListener iLoadingListener) {
    }

    @Override // com.king.usdk.popupwebview.internal.Popup, com.king.usdk.popupwebview.IPopup
    public void setMessageListener(IMessageListener iMessageListener) {
    }

    public void setNativeInstance(long j) {
        this.mNativeCallbackLock.lock();
        this.mNativeInstance = j;
        this.mNativeCallbackLock.unlock();
    }
}

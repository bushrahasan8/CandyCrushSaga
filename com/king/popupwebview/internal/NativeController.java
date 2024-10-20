package com.king.popupwebview.internal;

import androidx.annotation.Keep;
import com.king.popupwebview.ILoadingListener;
import com.king.popupwebview.IMessageListener;
import com.king.popupwebview.IResponder;
import com.king.popupwebview.IResponseCallback;
import com.king.popupwebview.Result;

@Keep
/* loaded from: NativeController.class */
final class NativeController extends Popup implements IMessageListener, ILoadingListener {
    private volatile long nativeInstance;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NativeController(ActivityWrapper activityWrapper, boolean z) {
        super(activityWrapper, z);
        this.nativeInstance = 0L;
        super.setMessageListener(this);
        super.setLoadingListener(this);
    }

    private native void onMessageReceived(String str, String str2, NativeResponder nativeResponder);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onMessageResponse(long j, String str, int i, String str2);

    public void dispose() {
        recycleWebResources();
    }

    public long getNativeInstance() {
        return this.nativeInstance;
    }

    public int getPageStateAsInteger() {
        return getPageState().ordinal();
    }

    @Override // com.king.popupwebview.IMessageListener
    public void onMessageReceived(String str, String str2, IResponder iResponder) {
        onMessageReceived(str, str2, iResponder != null ? new NativeResponder(iResponder) : null);
    }

    @Override // com.king.popupwebview.ILoadingListener
    public native void onPageError(String str);

    @Override // com.king.popupwebview.ILoadingListener
    public native void onPageLoaded();

    public void postMessage(String str, String str2, long j) {
        if (j != 0) {
            super.postMessage(str, str2, new IResponseCallback(this, j) { // from class: com.king.popupwebview.internal.NativeController.1
                final NativeController this$0;
                final long val$nativeResponseCB;

                {
                    this.this$0 = this;
                    this.val$nativeResponseCB = j;
                }

                @Override // com.king.popupwebview.IResponseCallback
                public void onMessageResponse(String str3, Result result, String str4) {
                    this.this$0.onMessageResponse(this.val$nativeResponseCB, str3, result.ordinal(), str4);
                }
            });
        } else {
            super.postMessage(str, str2, (IResponseCallback) null);
        }
    }

    @Override // com.king.popupwebview.internal.Popup, com.king.popupwebview.IPopup
    public void setLoadingListener(ILoadingListener iLoadingListener) {
    }

    @Override // com.king.popupwebview.internal.Popup, com.king.popupwebview.IPopup
    public void setMessageListener(IMessageListener iMessageListener) {
    }

    public void setNativeInstance(long j) {
        this.nativeInstance = j;
    }
}

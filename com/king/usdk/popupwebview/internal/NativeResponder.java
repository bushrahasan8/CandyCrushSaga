package com.king.usdk.popupwebview.internal;

import androidx.annotation.Keep;
import com.king.usdk.popupwebview.IResponder;
import com.king.usdk.popupwebview.Result;

@Keep
/* loaded from: NativeResponder.class */
final class NativeResponder {
    private final IResponder responder;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NativeResponder(IResponder iResponder) {
        this.responder = iResponder;
    }

    public void sendMessageResponse(int i, String str) {
        if (this.responder != null) {
            Result result = Result.FAILURE;
            Result result2 = Result.SUCCESS;
            if (i == result2.ordinal()) {
                result = result2;
            }
            this.responder.sendMessageResponse(result, str);
        }
    }
}

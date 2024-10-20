package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: BottomSheetDialogFragment.class */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    private boolean waitingForDismissAllowingStateLoss;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: BottomSheetDialogFragment$BottomSheetDismissCallback.class */
    public class BottomSheetDismissCallback extends BottomSheetBehavior.BottomSheetCallback {
        final BottomSheetDialogFragment this$0;

        private BottomSheetDismissCallback(BottomSheetDialogFragment bottomSheetDialogFragment) {
            this.this$0 = bottomSheetDialogFragment;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View view, int i) {
            if (i == 5) {
                this.this$0.dismissAfterAnimation();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissAfterAnimation() {
        if (this.waitingForDismissAllowingStateLoss) {
            super/*androidx.fragment.app.DialogFragment*/.dismissAllowingStateLoss();
        } else {
            super/*androidx.fragment.app.DialogFragment*/.dismiss();
        }
    }

    private void dismissWithAnimation(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.waitingForDismissAllowingStateLoss = z;
        if (bottomSheetBehavior.getState() == 5) {
            dismissAfterAnimation();
            return;
        }
        if (getDialog() instanceof BottomSheetDialog) {
            ((BottomSheetDialog) getDialog()).removeDefaultCallback();
        }
        bottomSheetBehavior.addBottomSheetCallback(new BottomSheetDismissCallback());
        bottomSheetBehavior.setState(5);
    }

    private boolean tryDismissWithAnimation(boolean z) {
        Object dialog = getDialog();
        if (!(dialog instanceof BottomSheetDialog)) {
            return false;
        }
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialog;
        BottomSheetBehavior behavior = bottomSheetDialog.getBehavior();
        if (!behavior.isHideable() || !bottomSheetDialog.getDismissWithAnimation()) {
            return false;
        }
        dismissWithAnimation(behavior, z);
        return true;
    }

    public void dismiss() {
        if (tryDismissWithAnimation(false)) {
            return;
        }
        super/*androidx.fragment.app.DialogFragment*/.dismiss();
    }

    public void dismissAllowingStateLoss() {
        if (tryDismissWithAnimation(true)) {
            return;
        }
        super/*androidx.fragment.app.DialogFragment*/.dismissAllowingStateLoss();
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return new BottomSheetDialog(getContext(), getTheme());
    }
}

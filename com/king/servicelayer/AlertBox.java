package com.king.servicelayer;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import androidx.annotation.Keep;

@Keep
/* loaded from: AlertBox.class */
public class AlertBox {
    private Activity mActivity;
    private AlertDialog mDialog;
    private AlertDialog.Builder mDialogBuilder;
    private long mUserData;

    /* renamed from: com.king.servicelayer.AlertBox$2, reason: invalid class name */
    /* loaded from: AlertBox$2.class */
    class AnonymousClass2 implements Runnable {
        final AlertBox this$0;

        AnonymousClass2(AlertBox alertBox) {
            this.this$0 = alertBox;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertBox alertBox = this.this$0;
            alertBox.mDialog = alertBox.mDialogBuilder.show();
            if (this.this$0.mDialog != null) {
                this.this$0.mDialog.setCanceledOnTouchOutside(false);
                this.this$0.mDialog.setOnCancelListener(new DialogInterface.OnCancelListener(this) { // from class: com.king.servicelayer.AlertBox.2.1
                    final AnonymousClass2 this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        AlertBox alertBox2 = this.this$1.this$0;
                        alertBox2.onDismissed(alertBox2.mUserData);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r11.isEmpty() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AlertBox(android.app.Activity r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, long r12) {
        /*
            r7 = this;
            r0 = r7
            r0.<init>()
            r0 = r7
            r1 = r8
            r0.mActivity = r1
            r0 = r7
            r1 = r12
            r0.mUserData = r1
            r0 = r11
            if (r0 == 0) goto L1f
            r0 = r11
            r8 = r0
            r0 = r11
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L29
        L1f:
            r0 = r7
            android.app.Activity r0 = r0.mActivity
            r1 = 17039370(0x104000a, float:2.42446E-38)
            java.lang.String r0 = r0.getString(r1)
            r8 = r0
        L29:
            r0 = r7
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r2 = r1
            r3 = r7
            android.app.Activity r3 = r3.mActivity
            r2.<init>(r3)
            r2 = r9
            android.app.AlertDialog$Builder r1 = r1.setTitle(r2)
            r2 = r10
            android.app.AlertDialog$Builder r1 = r1.setMessage(r2)
            r2 = r8
            com.king.servicelayer.AlertBox$1 r3 = new com.king.servicelayer.AlertBox$1
            r4 = r3
            r5 = r7
            r4.<init>(r5)
            android.app.AlertDialog$Builder r1 = r1.setNegativeButton(r2, r3)
            r0.mDialogBuilder = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.king.servicelayer.AlertBox.<init>(android.app.Activity, java.lang.String, java.lang.String, java.lang.String, long):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void onDismissed(long j);

    public void dismiss(int i) {
        AlertDialog alertDialog = this.mDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public void show() {
        this.mActivity.runOnUiThread(new AnonymousClass2(this));
    }
}

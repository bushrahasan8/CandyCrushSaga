package com.king.candycrushsaga.ccsm_platform.messagebox;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import androidx.annotation.Keep;
import com.king.core.activityhelper.ActivityHelper;

@Keep
/* loaded from: MessageBox.class */
public class MessageBox {
    private static int sDialogIndex;

    public static int show(String str, String str2, String[] strArr) {
        int i = sDialogIndex;
        sDialogIndex = i + 1;
        Activity activity = ActivityHelper.getInstance().getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(str + "\n" + str2).setItems(strArr, new DialogInterface.OnClickListener(i) { // from class: com.king.candycrushsaga.ccsm_platform.messagebox.MessageBox.2
            final int val$thisDialogId;

            {
                this.val$thisDialogId = i;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                MessageBox.userChoise(this.val$thisDialogId, i2);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener(i) { // from class: com.king.candycrushsaga.ccsm_platform.messagebox.MessageBox.1
            final int val$thisDialogId;

            {
                this.val$thisDialogId = i;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                MessageBox.userChoise(this.val$thisDialogId, -1);
            }
        });
        activity.runOnUiThread(new Runnable(builder) { // from class: com.king.candycrushsaga.ccsm_platform.messagebox.MessageBox.3
            final AlertDialog.Builder val$builder;

            {
                this.val$builder = builder;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.val$builder.show();
            }
        });
        return i;
    }

    public static native void userChoise(int i, int i2);
}

package com.king.core;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import androidx.annotation.Keep;
import com.king.core.activityhelper.ActivityHelper;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

@Keep
/* loaded from: Dialog.class */
public class Dialog {
    private AlertDialog mDialog;
    private AlertDialog.Builder mDialogBuilder;
    private Activity mMainActivity = ActivityHelper.getInstance().getActivity();
    private Queue<Runnable> mMainThreadCallbacks = new ConcurrentLinkedQueue();
    private long mNativeObject;

    /* renamed from: com.king.core.Dialog$1, reason: invalid class name */
    /* loaded from: Dialog$1.class */
    class AnonymousClass1 implements Runnable {
        final Dialog this$0;

        /* renamed from: com.king.core.Dialog$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: Dialog$1$1.class */
        class DialogInterfaceOnCancelListenerC00561 implements DialogInterface.OnCancelListener {
            final AnonymousClass1 this$1;

            DialogInterfaceOnCancelListenerC00561(AnonymousClass1 anonymousClass1) {
                this.this$1 = anonymousClass1;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                this.this$1.this$0.mMainThreadCallbacks.add(new Runnable(this) { // from class: com.king.core.Dialog.1.1.1
                    final DialogInterfaceOnCancelListenerC00561 this$2;

                    {
                        this.this$2 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.this$2.this$1.this$0.onButtonClicked(2);
                    }
                });
            }
        }

        AnonymousClass1(Dialog dialog) {
            this.this$0 = dialog;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialog = this.this$0;
            dialog.mDialog = dialog.mDialogBuilder.show();
            if (this.this$0.mDialog != null) {
                this.this$0.mDialog.setCanceledOnTouchOutside(false);
                this.this$0.mDialog.setOnCancelListener(new DialogInterfaceOnCancelListenerC00561(this));
            }
        }
    }

    /* renamed from: com.king.core.Dialog$2, reason: invalid class name */
    /* loaded from: Dialog$2.class */
    class AnonymousClass2 implements DialogInterface.OnClickListener {
        final Dialog this$0;

        AnonymousClass2(Dialog dialog) {
            this.this$0 = dialog;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.this$0.mMainThreadCallbacks.add(new Runnable(this) { // from class: com.king.core.Dialog.2.1
                final AnonymousClass2 this$1;

                {
                    this.this$1 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.this$1.this$0.onButtonClicked(0);
                }
            });
        }
    }

    /* renamed from: com.king.core.Dialog$3, reason: invalid class name */
    /* loaded from: Dialog$3.class */
    class AnonymousClass3 implements DialogInterface.OnClickListener {
        final Dialog this$0;

        AnonymousClass3(Dialog dialog) {
            this.this$0 = dialog;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.this$0.mMainThreadCallbacks.add(new Runnable(this) { // from class: com.king.core.Dialog.3.1
                final AnonymousClass3 this$1;

                {
                    this.this$1 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.this$1.this$0.onButtonClicked(1);
                }
            });
        }
    }

    /* renamed from: com.king.core.Dialog$4, reason: invalid class name */
    /* loaded from: Dialog$4.class */
    class AnonymousClass4 implements DialogInterface.OnClickListener {
        final Dialog this$0;

        AnonymousClass4(Dialog dialog) {
            this.this$0 = dialog;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.this$0.mMainThreadCallbacks.add(new Runnable(this) { // from class: com.king.core.Dialog.4.1
                final AnonymousClass4 this$1;

                {
                    this.this$1 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.this$1.this$0.onButtonClicked(2);
                }
            });
        }
    }

    public Dialog(long j, String str, String str2) {
        this.mNativeObject = j;
        this.mDialogBuilder = new AlertDialog.Builder(this.mMainActivity).setTitle(str).setMessage(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void onButtonClicked(int i);

    public void dismiss(int i) {
        AlertDialog alertDialog = this.mDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public void setNegativeButton(String str) {
        this.mDialogBuilder.setNegativeButton(str, new AnonymousClass4(this));
    }

    public void setNeutralButton(String str) {
        this.mDialogBuilder.setNeutralButton(str, new AnonymousClass3(this));
    }

    public void setPositiveButton(String str) {
        this.mDialogBuilder.setPositiveButton(str, new AnonymousClass2(this));
    }

    public void show() {
        this.mMainActivity.runOnUiThread(new AnonymousClass1(this));
    }

    public void update() {
        while (true) {
            Runnable poll = this.mMainThreadCallbacks.poll();
            if (poll == null) {
                return;
            } else {
                poll.run();
            }
        }
    }
}

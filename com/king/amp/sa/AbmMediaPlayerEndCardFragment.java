package com.king.amp.sa;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.king.abm.R$id;
import com.king.abm.R$layout;
import com.king.abm.R$style;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: AbmMediaPlayerEndCardFragment.class */
public class AbmMediaPlayerEndCardFragment extends DialogFragment {
    public static String TAG = "AbmMediaPlayerEndCardFragment";
    private ImageButton closeButton;
    private ImageView endCardImage;
    private AbmMediaPlayerLayoutConfig layoutConfig;
    private IAbmMediaPlayerEndCardListener listener;
    private Timer showCloseButtonDelayTimer;

    /* renamed from: com.king.amp.sa.AbmMediaPlayerEndCardFragment$5, reason: invalid class name */
    /* loaded from: AbmMediaPlayerEndCardFragment$5.class */
    class AnonymousClass5 extends TimerTask {
        final AbmMediaPlayerEndCardFragment this$0;

        AnonymousClass5(AbmMediaPlayerEndCardFragment abmMediaPlayerEndCardFragment) {
            this.this$0 = abmMediaPlayerEndCardFragment;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (this.this$0.getActivity() != null) {
                this.this$0.getActivity().runOnUiThread(new Runnable(this) { // from class: com.king.amp.sa.AbmMediaPlayerEndCardFragment.5.1
                    final AnonymousClass5 this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.this$1.this$0.closeButton.setVisibility(0);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.king.amp.sa.AbmMediaPlayerEndCardFragment$6, reason: invalid class name */
    /* loaded from: AbmMediaPlayerEndCardFragment$6.class */
    public class AnonymousClass6 extends TimerTask {
        final AbmMediaPlayerEndCardFragment this$0;

        AnonymousClass6(AbmMediaPlayerEndCardFragment abmMediaPlayerEndCardFragment) {
            this.this$0 = abmMediaPlayerEndCardFragment;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (this.this$0.getActivity() != null) {
                this.this$0.getActivity().runOnUiThread(new Runnable(this) { // from class: com.king.amp.sa.AbmMediaPlayerEndCardFragment.6.1
                    final AnonymousClass6 this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.this$1.this$0.closeButton.setClickable(true);
                        this.this$1.this$0.endCardImage.setClickable(true);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbmMediaPlayerEndCardFragment newInstance(AbmMediaPlayerLayoutConfig abmMediaPlayerLayoutConfig, IAbmMediaPlayerEndCardListener iAbmMediaPlayerEndCardListener) {
        AbmMediaPlayerEndCardFragment abmMediaPlayerEndCardFragment = new AbmMediaPlayerEndCardFragment();
        abmMediaPlayerEndCardFragment.setArgs(abmMediaPlayerLayoutConfig, iAbmMediaPlayerEndCardListener);
        return abmMediaPlayerEndCardFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startButtonClickCooldown() {
        if (isAdded()) {
            this.closeButton.setClickable(false);
            this.endCardImage.setClickable(false);
            new Timer().schedule(new AnonymousClass6(this), 500L);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getActivity().setRequestedOrientation(1);
        setStyle(0, R$style.MediaPlayerEndCard);
        if (getArguments() != null) {
            String string = getArguments().getString("layout_configuration");
            if (!TextUtils.isEmpty(string)) {
                this.layoutConfig = new AbmMediaPlayerLayoutConfig(string);
            }
        }
        this.showCloseButtonDelayTimer = new Timer();
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCancelable(false);
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setOnKeyListener(new DialogInterface.OnKeyListener(this) { // from class: com.king.amp.sa.AbmMediaPlayerEndCardFragment.1
            final AbmMediaPlayerEndCardFragment this$0;

            {
                this.this$0 = this;
            }

            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                this.this$0.dismiss();
                if (this.this$0.listener == null) {
                    return true;
                }
                this.this$0.closeButton.setVisibility(4);
                this.this$0.listener.onEndCardAction(AbmMediaPlayer.USER_ACTION_END_CARD_CLOSE);
                return true;
            }
        });
        return onCreateDialog;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R$layout.abm_media_player_end_card_view, viewGroup, false);
        this.closeButton = (ImageButton) inflate.findViewById(R$id.end_card_close_button);
        this.endCardImage = (ImageView) inflate.findViewById(R$id.end_card_image);
        AbmMediaPlayerLayoutConfig abmMediaPlayerLayoutConfig = this.layoutConfig;
        if (abmMediaPlayerLayoutConfig != null) {
            String str = abmMediaPlayerLayoutConfig.getLayoutConfigMap().get("end_card_image");
            if (!TextUtils.isEmpty(str)) {
                this.endCardImage.setImageDrawable(Drawable.createFromPath(str));
            }
        }
        this.closeButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.king.amp.sa.AbmMediaPlayerEndCardFragment.2
            final AbmMediaPlayerEndCardFragment this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.startButtonClickCooldown();
                if (this.this$0.listener != null) {
                    this.this$0.closeButton.setVisibility(4);
                    this.this$0.listener.onEndCardAction(AbmMediaPlayer.USER_ACTION_END_CARD_CLOSE);
                }
            }
        });
        this.endCardImage.setOnClickListener(new View.OnClickListener(this) { // from class: com.king.amp.sa.AbmMediaPlayerEndCardFragment.3
            final AbmMediaPlayerEndCardFragment this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.startButtonClickCooldown();
                if (this.this$0.listener != null) {
                    this.this$0.listener.onEndCardAction(AbmMediaPlayer.USER_ACTION_END_CARD_CTA);
                }
            }
        });
        inflate.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener(this) { // from class: com.king.amp.sa.AbmMediaPlayerEndCardFragment.4
            final AbmMediaPlayerEndCardFragment this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z) {
                FragmentActivity activity = this.this$0.getActivity();
                if (activity != null) {
                    activity.onWindowFocusChanged(z);
                }
            }
        });
        return inflate;
    }

    public void onResume() {
        super/*androidx.fragment.app.Fragment*/.onResume();
        this.showCloseButtonDelayTimer.schedule(new AnonymousClass5(this), 500L);
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || dialog.getWindow() == null) {
            return;
        }
        dialog.getWindow().setLayout(-1, -1);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        if (getDialog() == null || getDialog().getWindow() == null) {
            return;
        }
        getDialog().getWindow().getAttributes().windowAnimations = R$style.EndCardAnimation;
    }

    public void setArgs(AbmMediaPlayerLayoutConfig abmMediaPlayerLayoutConfig, IAbmMediaPlayerEndCardListener iAbmMediaPlayerEndCardListener) {
        this.layoutConfig = abmMediaPlayerLayoutConfig;
        this.listener = iAbmMediaPlayerEndCardListener;
    }
}

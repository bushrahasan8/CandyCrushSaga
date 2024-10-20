package com.king.amp.sa;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import com.king.abm.R$id;
import com.king.abm.R$layout;
import com.king.abm.R$style;
import java.util.Map;
import java.util.Optional;

/* loaded from: AbmMediaPlayerPromptDialogFragment.class */
public class AbmMediaPlayerPromptDialogFragment extends DialogFragment {
    public static String TAG = "AbmMediaPlayerPromptDialogFragment";
    private AbmMediaPlayer abmMediaPlayer;
    private Button closeButton;
    private Button continueButton;
    private ConstraintLayout dialogContainer;
    private AbmMediaPlayerLayoutConfig layoutConfig;
    private TextView messageText;
    private TextView titleText;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbmMediaPlayerPromptDialogFragment newInstance(Bundle bundle) {
        AbmMediaPlayerPromptDialogFragment abmMediaPlayerPromptDialogFragment = new AbmMediaPlayerPromptDialogFragment();
        abmMediaPlayerPromptDialogFragment.setArguments(bundle);
        return abmMediaPlayerPromptDialogFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getActivity().setRequestedOrientation(1);
        this.abmMediaPlayer = AbmMediaPlayer.getInstance();
        setStyle(0, R$style.MediaPlayerPromptDialog);
        if (getArguments() != null) {
            String string = getArguments().getString("layout_configuration");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.layoutConfig = new AbmMediaPlayerLayoutConfig(string);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCancelable(false);
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setOnKeyListener(new DialogInterface.OnKeyListener(this) { // from class: com.king.amp.sa.AbmMediaPlayerPromptDialogFragment.1
            final AbmMediaPlayerPromptDialogFragment this$0;

            {
                this.this$0 = this;
            }

            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                Optional<AdProviderNameValuePairs> empty;
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                this.this$0.dismiss();
                if (this.this$0.abmMediaPlayer == null) {
                    return true;
                }
                AbmMediaPlayer abmMediaPlayer = this.this$0.abmMediaPlayer;
                empty = Optional.empty();
                abmMediaPlayer.onPlayerEvent(AbmMediaPlayer.USER_ACTION_PROMPT_CONTINUE, empty);
                return true;
            }
        });
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setDimAmount(0.85f);
        }
        return onCreateDialog;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R$layout.prompt_dialog_view, viewGroup, false);
        this.dialogContainer = inflate.findViewById(R$id.dialog_bg);
        this.titleText = (TextView) inflate.findViewById(R$id.title_text);
        this.messageText = (TextView) inflate.findViewById(R$id.message_text);
        this.continueButton = (Button) inflate.findViewById(R$id.continue_button);
        this.closeButton = (Button) inflate.findViewById(R$id.close_button);
        AbmMediaPlayerLayoutConfig abmMediaPlayerLayoutConfig = this.layoutConfig;
        if (abmMediaPlayerLayoutConfig != null) {
            Map<String, String> layoutConfigMap = abmMediaPlayerLayoutConfig.getLayoutConfigMap();
            String str = layoutConfigMap.get("prompt_dialog_background");
            String str2 = layoutConfigMap.get("prompt_dialog_continue_button_image_default");
            String str3 = layoutConfigMap.get("prompt_dialog_continue_button_image_clicked");
            String str4 = layoutConfigMap.get("prompt_dialog_close_button_image_default");
            String str5 = layoutConfigMap.get("prompt_dialog_close_button_image_clicked");
            if (!TextUtils.isEmpty(str)) {
                this.dialogContainer.setBackground(Drawable.createFromPath(str));
            }
            if (!TextUtils.isEmpty(str2)) {
                Drawable createFromPath = Drawable.createFromPath(str2);
                this.continueButton.setBackground(createFromPath);
                if (!TextUtils.isEmpty(str3)) {
                    Drawable createFromPath2 = Drawable.createFromPath(str3);
                    StateListDrawable stateListDrawable = new StateListDrawable();
                    stateListDrawable.addState(new int[]{R.attr.state_pressed}, createFromPath2);
                    stateListDrawable.addState(new int[0], createFromPath);
                    this.continueButton.setBackground(stateListDrawable);
                }
            }
            if (!TextUtils.isEmpty(str4)) {
                Drawable createFromPath3 = Drawable.createFromPath(str4);
                this.continueButton.setBackground(createFromPath3);
                if (!TextUtils.isEmpty(str5)) {
                    Drawable createFromPath4 = Drawable.createFromPath(str5);
                    StateListDrawable stateListDrawable2 = new StateListDrawable();
                    stateListDrawable2.addState(new int[]{R.attr.state_pressed}, createFromPath4);
                    stateListDrawable2.addState(new int[0], createFromPath3);
                    this.continueButton.setBackground(stateListDrawable2);
                }
            }
        }
        this.continueButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.king.amp.sa.AbmMediaPlayerPromptDialogFragment.2
            final AbmMediaPlayerPromptDialogFragment this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Optional<AdProviderNameValuePairs> empty;
                if (this.this$0.abmMediaPlayer != null) {
                    AbmMediaPlayer abmMediaPlayer = this.this$0.abmMediaPlayer;
                    empty = Optional.empty();
                    abmMediaPlayer.onPlayerEvent(AbmMediaPlayer.USER_ACTION_PROMPT_CONTINUE, empty);
                }
            }
        });
        this.closeButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.king.amp.sa.AbmMediaPlayerPromptDialogFragment.3
            final AbmMediaPlayerPromptDialogFragment this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Optional<AdProviderNameValuePairs> empty;
                if (this.this$0.abmMediaPlayer != null) {
                    AbmMediaPlayer abmMediaPlayer = this.this$0.abmMediaPlayer;
                    empty = Optional.empty();
                    abmMediaPlayer.onPlayerEvent(AbmMediaPlayer.USER_ACTION_PROMPT_CLOSE, empty);
                }
            }
        });
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        if (getDialog() == null || getDialog().getWindow() == null) {
            return;
        }
        getDialog().getWindow().getAttributes().windowAnimations = R$style.PromptDialogAnimation;
    }
}

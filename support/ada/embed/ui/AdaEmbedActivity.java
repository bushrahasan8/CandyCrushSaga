package support.ada.embed.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import support.ada.embed.widget.AdaEmbedView;

/* loaded from: AdaEmbedActivity.class */
public class AdaEmbedActivity extends AppCompatActivity {
    public static final Companion Companion = new Companion(null);
    private AdaEmbedView adaView;
    private FilePickerHandler filePickerHandler;

    /* loaded from: AdaEmbedActivity$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(i, i2, intent);
        FilePickerHandler filePickerHandler = this.filePickerHandler;
        if (filePickerHandler != null) {
            filePickerHandler.handleResult(i, i2, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        AdaEmbedView.Settings settings = (AdaEmbedView.Settings) getIntent().getParcelableExtra("EXTRA_SETTINGS");
        if (settings == null) {
            throw new IllegalArgumentException("Settings must not be null!");
        }
        AdaEmbedView adaEmbedView = new AdaEmbedView(this, null, 2, null);
        adaEmbedView.initialize(settings);
        this.adaView = adaEmbedView;
        setContentView(adaEmbedView);
        AdaEmbedView adaEmbedView2 = this.adaView;
        if (adaEmbedView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adaView");
        }
        adaEmbedView2.setFilePickerCallback(new Function1(this) { // from class: support.ada.embed.ui.AdaEmbedActivity$onCreate$2
            final AdaEmbedActivity this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(invoke((AdaEmbedView.FilePickerCallback) obj));
            }

            public final boolean invoke(AdaEmbedView.FilePickerCallback filePickerCallback) {
                Intrinsics.checkParameterIsNotNull(filePickerCallback, "filePickerCallback");
                AdaEmbedActivity adaEmbedActivity = this.this$0;
                FilePickerHandler filePickerHandler = new FilePickerHandler(filePickerCallback);
                filePickerHandler.openFilePicker(this.this$0);
                adaEmbedActivity.filePickerHandler = filePickerHandler;
                return true;
            }
        });
    }

    protected void onDestroy() {
        super.onDestroy();
        FilePickerHandler filePickerHandler = this.filePickerHandler;
        if (filePickerHandler != null) {
            filePickerHandler.cancel();
        }
        this.filePickerHandler = null;
    }
}

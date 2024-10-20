package support.ada.embed.actions;

import android.webkit.WebView;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: SetLanguageAction.class */
public final class SetLanguageAction implements Action {
    public static final Companion Companion = new Companion(null);
    private final String language;
    private final WebView webView;

    /* loaded from: SetLanguageAction$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SetLanguageAction(WebView webView, String language) {
        Intrinsics.checkParameterIsNotNull(webView, "webView");
        Intrinsics.checkParameterIsNotNull(language, "language");
        this.webView = webView;
        this.language = language;
    }

    @Override // support.ada.embed.actions.Action
    public void execute() {
        WebView webView = this.webView;
        String format = String.format("setLanguage('%s')", Arrays.copyOf(new Object[]{this.language}, 1));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(this, *args)");
        webView.evaluateJavascript(format, null);
    }

    @Override // support.ada.embed.actions.Action
    public String key() {
        String simpleName = SetLanguageAction.class.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "SetLanguageAction::class.java.simpleName");
        return simpleName;
    }
}

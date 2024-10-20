package support.ada.embed.actions;

import android.webkit.WebView;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: SetDeviceTokenAction.class */
public final class SetDeviceTokenAction implements Action {
    public static final Companion Companion = new Companion(null);
    private final String token;
    private final WebView webView;

    /* loaded from: SetDeviceTokenAction$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SetDeviceTokenAction(WebView webView, String token) {
        Intrinsics.checkParameterIsNotNull(webView, "webView");
        Intrinsics.checkParameterIsNotNull(token, "token");
        this.webView = webView;
        this.token = token;
    }

    @Override // support.ada.embed.actions.Action
    public void execute() {
        WebView webView = this.webView;
        String format = String.format("setDeviceToken('%s')", Arrays.copyOf(new Object[]{this.token}, 1));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(this, *args)");
        webView.evaluateJavascript(format, null);
    }

    @Override // support.ada.embed.actions.Action
    public String key() {
        String simpleName = SetDeviceTokenAction.class.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "SetDeviceTokenAction::class.java.simpleName");
        return simpleName;
    }
}

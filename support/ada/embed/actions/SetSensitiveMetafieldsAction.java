package support.ada.embed.actions;

import android.webkit.WebView;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import support.ada.embed.common.UtilsKt;

/* loaded from: SetSensitiveMetafieldsAction.class */
public final class SetSensitiveMetafieldsAction implements Action {
    public static final Companion Companion = new Companion(null);
    private final Map metaFields;
    private final WebView webView;

    /* loaded from: SetSensitiveMetafieldsAction$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SetSensitiveMetafieldsAction(WebView webView, Map metaFields) {
        Intrinsics.checkParameterIsNotNull(webView, "webView");
        Intrinsics.checkParameterIsNotNull(metaFields, "metaFields");
        this.webView = webView;
        this.metaFields = metaFields;
    }

    @Override // support.ada.embed.actions.Action
    public void execute() {
        WebView webView = this.webView;
        String format = String.format("setSensitiveMetaFields(%s)", Arrays.copyOf(new Object[]{UtilsKt.mapToJson(this.metaFields)}, 1));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(this, *args)");
        webView.evaluateJavascript(format, null);
    }

    @Override // support.ada.embed.actions.Action
    public String key() {
        String simpleName = SetSensitiveMetafieldsAction.class.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "SetSensitiveMetafieldsAc…on::class.java.simpleName");
        return simpleName;
    }
}

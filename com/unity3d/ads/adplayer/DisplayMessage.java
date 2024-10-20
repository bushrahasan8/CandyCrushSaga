package com.unity3d.ads.adplayer;

import android.webkit.WebView;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: DisplayMessage.class */
public abstract class DisplayMessage {
    private final String opportunityId;

    /* loaded from: DisplayMessage$DisplayError.class */
    public static final class DisplayError extends DisplayMessage {
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayError(String opportunityId, String reason) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
        }

        public final String getReason() {
            return this.reason;
        }
    }

    /* loaded from: DisplayMessage$DisplayFinishRequest.class */
    public static final class DisplayFinishRequest extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayFinishRequest(String opportunityId) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        }
    }

    /* loaded from: DisplayMessage$DisplayReady.class */
    public static final class DisplayReady extends DisplayMessage {
        private final Map<String, Object> showOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayReady(String opportunityId, Map<String, ? extends Object> map) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            this.showOptions = map;
        }

        public /* synthetic */ DisplayReady(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : map);
        }

        public final Map<String, Object> getShowOptions() {
            return this.showOptions;
        }
    }

    /* loaded from: DisplayMessage$FocusChanged.class */
    public static final class FocusChanged extends DisplayMessage {
        private final boolean isFocused;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FocusChanged(String opportunityId, boolean z) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            this.isFocused = z;
        }

        public final boolean isFocused() {
            return this.isFocused;
        }
    }

    /* loaded from: DisplayMessage$VisibilityChanged.class */
    public static final class VisibilityChanged extends DisplayMessage {
        private final boolean isVisible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VisibilityChanged(String opportunityId, boolean z) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            this.isVisible = z;
        }

        public final boolean isVisible() {
            return this.isVisible;
        }
    }

    /* loaded from: DisplayMessage$WebViewInstanceRequest.class */
    public static final class WebViewInstanceRequest extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewInstanceRequest(String opportunityId) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        }
    }

    /* loaded from: DisplayMessage$WebViewInstanceResponse.class */
    public static final class WebViewInstanceResponse extends DisplayMessage {
        private final WebView webView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewInstanceResponse(String opportunityId, WebView webView) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            Intrinsics.checkNotNullParameter(webView, "webView");
            this.webView = webView;
        }

        public final WebView getWebView() {
            return this.webView;
        }
    }

    private DisplayMessage(String str) {
        this.opportunityId = str;
    }

    public /* synthetic */ DisplayMessage(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getOpportunityId() {
        return this.opportunityId;
    }
}

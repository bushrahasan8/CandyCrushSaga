package com.king.usdk.popupwebview.internal;

import android.annotation.SuppressLint;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.Keep;
import com.king.usdk.popupwebview.ILoadingListener;
import com.king.usdk.popupwebview.IMessageListener;
import com.king.usdk.popupwebview.IResponder;
import com.king.usdk.popupwebview.IResponseCallback;
import com.king.usdk.popupwebview.Result;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
@Keep
/* loaded from: MessageBus.class */
public final class MessageBus {
    private static final String ERROR_WEBPAGE_UNLOADED = "web page has been unloaded before sending responses to all messages";
    private static final String JAVASCRIPT_ON_MESSAGE_RECEIVED_FORMAT = "window._messageBus.onMessageReceived(%s, %s, %d);";
    private static final String JAVASCRIPT_ON_MESSAGE_RESPONSE_FORMAT = "window._messageBus.onMessageResponse(%d, %s, %d, %s);";
    private static final String MESSAGEBUS_JAVASCRIPT_NAME = "_messageBus";
    private final Popup popup;
    private final List<Responder> responders = new ArrayList();
    private volatile ILoadingListener loadingListener = null;
    private volatile IMessageListener messageListener = null;
    private final JavascriptMessageBusInterface javascriptInterface = new JavascriptMessageBusInterface();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: MessageBus$JavascriptMessageBusInterface.class */
    public final class JavascriptMessageBusInterface {
        final MessageBus this$0;

        /* renamed from: com.king.usdk.popupwebview.internal.MessageBus$JavascriptMessageBusInterface$1, reason: invalid class name */
        /* loaded from: MessageBus$JavascriptMessageBusInterface$1.class */
        class AnonymousClass1 implements Runnable {
            final JavascriptMessageBusInterface this$1;
            final String val$msgName;
            final String val$msgPayload;
            final int val$responseCallbackId;

            AnonymousClass1(JavascriptMessageBusInterface javascriptMessageBusInterface, int i, String str, String str2) {
                this.this$1 = javascriptMessageBusInterface;
                this.val$responseCallbackId = i;
                this.val$msgName = str;
                this.val$msgPayload = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                IMessageListener iMessageListener = this.this$1.this$0.messageListener;
                if (iMessageListener == null) {
                    if (this.val$responseCallbackId >= 0) {
                        this.this$1.this$0.popup.executeJavascript(String.format(Locale.ROOT, MessageBus.JAVASCRIPT_ON_MESSAGE_RESPONSE_FORMAT, Integer.valueOf(this.val$responseCallbackId), MessageBus.escapeJavascriptString(this.val$msgName), Integer.valueOf(Result.FAILURE.ordinal()), MessageBus.escapeJavascriptString("unknown message")), null);
                        return;
                    }
                    return;
                }
                try {
                    iMessageListener.onMessageReceived(this.val$msgName, this.val$msgPayload, this.val$responseCallbackId >= 0 ? new IResponder(this) { // from class: com.king.usdk.popupwebview.internal.MessageBus.JavascriptMessageBusInterface.1.1
                        final AnonymousClass1 this$2;
                        private final Object monitor = new Object();
                        private volatile boolean alreadyCalled = false;

                        {
                            this.this$2 = this;
                        }

                        @Override // com.king.usdk.popupwebview.IResponder
                        public void sendMessageResponse(Result result, String str) {
                            if (this.alreadyCalled) {
                                return;
                            }
                            synchronized (this.monitor) {
                                if (this.alreadyCalled) {
                                    return;
                                }
                                this.alreadyCalled = true;
                                this.this$2.this$1.this$0.popup.executeJavascriptOnUIThread(String.format(Locale.ROOT, MessageBus.JAVASCRIPT_ON_MESSAGE_RESPONSE_FORMAT, Integer.valueOf(this.this$2.val$responseCallbackId), MessageBus.escapeJavascriptString(this.this$2.val$msgName), Integer.valueOf(result.ordinal()), MessageBus.escapeJavascriptString(str)), null);
                            }
                        }
                    } : null);
                } catch (Throwable th) {
                    th.printStackTrace();
                    if (this.val$responseCallbackId >= 0) {
                        this.this$1.this$0.popup.executeJavascript(String.format(Locale.ROOT, MessageBus.JAVASCRIPT_ON_MESSAGE_RESPONSE_FORMAT, Integer.valueOf(this.val$responseCallbackId), MessageBus.escapeJavascriptString(this.val$msgName), Integer.valueOf(Result.FAILURE.ordinal()), MessageBus.escapeJavascriptString(th.getMessage())), null);
                    }
                }
            }
        }

        private JavascriptMessageBusInterface(MessageBus messageBus) {
            this.this$0 = messageBus;
        }

        @JavascriptInterface
        public void postMessage(String str, String str2, int i) {
            this.this$0.popup.getActivityWrapper().runOnUIThread(new AnonymousClass1(this, i, str, str2));
        }

        @JavascriptInterface
        public void sendMessageResponse(int i, int i2, String str) {
            this.this$0.popup.getActivityWrapper().runOnUIThread(new Runnable(this, i, i2, str) { // from class: com.king.usdk.popupwebview.internal.MessageBus.JavascriptMessageBusInterface.2
                final JavascriptMessageBusInterface this$1;
                final String val$respPayload;
                final int val$responseCallbackId;
                final int val$resultValue;

                {
                    this.this$1 = this;
                    this.val$responseCallbackId = i;
                    this.val$resultValue = i2;
                    this.val$respPayload = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    Responder responder;
                    int i3 = this.val$responseCallbackId;
                    if (i3 < 0 || i3 >= this.this$1.this$0.responders.size() || (responder = (Responder) this.this$1.this$0.responders.get(this.val$responseCallbackId)) == null) {
                        return;
                    }
                    this.this$1.this$0.responders.set(this.val$responseCallbackId, null);
                    Result result = Result.FAILURE;
                    int i4 = this.val$resultValue;
                    Result result2 = Result.SUCCESS;
                    if (i4 == result2.ordinal()) {
                        result = result2;
                    }
                    responder.sendMessageResponse(result, this.val$respPayload);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: MessageBus$Responder.class */
    public static final class Responder implements IResponder {
        private final String msgName;
        private final IResponseCallback responseCB;

        public Responder(String str, IResponseCallback iResponseCallback) {
            this.msgName = str;
            this.responseCB = iResponseCallback;
        }

        public void cancelMessageResponse() {
            try {
                this.responseCB.onMessageResponse(this.msgName, Result.FAILURE, MessageBus.ERROR_WEBPAGE_UNLOADED);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // com.king.usdk.popupwebview.IResponder
        public void sendMessageResponse(Result result, String str) {
            try {
                this.responseCB.onMessageResponse(this.msgName, result, str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageBus(Popup popup) {
        this.popup = popup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String escapeJavascriptString(String str) {
        if (str == null) {
            return "null";
        }
        if (str.isEmpty()) {
            return "''";
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 2);
        sb.append('\'');
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\'' || charAt == '\\') {
                sb.append('\\');
                sb.append(charAt);
            } else {
                sb.append(charAt);
            }
        }
        sb.append('\'');
        return sb.toString();
    }

    public void backButtonPressed() {
        ILoadingListener iLoadingListener = this.loadingListener;
        if (iLoadingListener != null) {
            try {
                iLoadingListener.onBackButtonPressed();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void cancelAllResponses() {
        int size = this.responders.size();
        for (int i = 0; i < size; i++) {
            Responder responder = this.responders.get(i);
            if (responder != null) {
                responder.cancelMessageResponse();
            }
        }
        this.responders.clear();
    }

    public void firePageError(String str) {
        ILoadingListener iLoadingListener = this.loadingListener;
        if (iLoadingListener != null) {
            try {
                iLoadingListener.onPageError(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void firePageLoaded(String str) {
        ILoadingListener iLoadingListener = this.loadingListener;
        if (iLoadingListener != null) {
            try {
                iLoadingListener.onPageLoaded(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void postMessage(String str, String str2, IResponseCallback iResponseCallback) {
        int i;
        int i2 = -1;
        if (iResponseCallback != null) {
            int size = this.responders.size();
            int i3 = 0;
            while (true) {
                i = -1;
                if (i3 >= size) {
                    break;
                }
                if (this.responders.get(i3) == null) {
                    this.responders.set(i3, new Responder(str, iResponseCallback));
                    i = i3;
                    break;
                }
                i3++;
            }
            i2 = i;
            if (i < 0) {
                this.responders.add(new Responder(str, iResponseCallback));
                i2 = size;
            }
        }
        this.popup.executeJavascript(String.format(Locale.ROOT, JAVASCRIPT_ON_MESSAGE_RECEIVED_FORMAT, escapeJavascriptString(str), escapeJavascriptString(str2), Integer.valueOf(i2)), new ValueCallback(this, i2) { // from class: com.king.usdk.popupwebview.internal.MessageBus.1
            final MessageBus this$0;
            final int val$cbIndex;

            {
                this.this$0 = this;
                this.val$cbIndex = i2;
            }

            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str3) {
                int i4;
                Responder responder;
                if (str3 == null || str3.isEmpty() || (i4 = this.val$cbIndex) < 0 || i4 >= this.this$0.responders.size() || (responder = (Responder) this.this$0.responders.get(this.val$cbIndex)) == null) {
                    return;
                }
                this.this$0.responders.set(this.val$cbIndex, null);
                responder.sendMessageResponse(Result.FAILURE, str3);
            }
        });
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void registerJavascriptInterface(WebView webView) {
        if (webView != null) {
            webView.getSettings().setJavaScriptEnabled(true);
            webView.addJavascriptInterface(this.javascriptInterface, MESSAGEBUS_JAVASCRIPT_NAME);
        }
    }

    public void setLoadingListener(ILoadingListener iLoadingListener) {
        this.loadingListener = iLoadingListener;
    }

    public void setMessageListener(IMessageListener iMessageListener) {
        this.messageListener = iMessageListener;
    }
}

package com.king.web;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import com.king.core.activityhelper.ActivityHelper;
import com.king.logging.Logging;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.vungle.ads.internal.model.AdPayload;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

@Keep
/* loaded from: WebViewHelper.class */
public class WebViewHelper {
    private static final String TAG = "WebViewHelper";
    private static WebView mEmbeddedWebView;
    private static float mHRel = 1.0f;
    private static String mMessageUrlScheme;
    private static float mWRel = 1.0f;
    private static WebViewListener mWebViewListener;
    private static float mXRel;
    private static float mYRel;

    private WebViewHelper() {
        throw new IllegalStateException("Utility class");
    }

    public static void RemoveEmbeddedView() {
        WebView webView = mEmbeddedWebView;
        if (webView != null) {
            webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
            ((ViewGroup) mEmbeddedWebView.getParent()).removeView(mEmbeddedWebView);
            setWebView(null);
        }
    }

    public static boolean canGoBack() {
        String str = TAG;
        Logging.logWarning(str, "WebViewHelper.canGoBack");
        if (mEmbeddedWebView == null) {
            Logging.logWarning(str, "can't know if webview can go back because it's not opened");
            return false;
        }
        FutureTask futureTask = new FutureTask(new Callable() { // from class: com.king.web.WebViewHelper.2
            @Override // java.util.concurrent.Callable
            public Boolean call() {
                Logging.logDebug(WebViewHelper.TAG, "Executing canGoBack on webView object");
                return Boolean.valueOf(WebViewHelper.mEmbeddedWebView.canGoBack());
            }
        });
        ActivityHelper.getInstance().getActivity().runOnUiThread(futureTask);
        try {
            return ((Boolean) futureTask.get(16L, TimeUnit.MILLISECONDS)).booleanValue();
        } catch (InterruptedException e) {
            Logging.logWarning(TAG, "Thread interrupted while waiting canGoBack on webView object");
            futureTask.cancel(true);
            Thread.currentThread().interrupt();
            return false;
        } catch (Exception e2) {
            Logging.logWarning(TAG, "Executing canGoBack on webView object taking too much");
            futureTask.cancel(true);
            return false;
        }
    }

    public static void closeEmbedded() {
        String str = TAG;
        Logging.logDebug(str, "WebViewHelper.closeEmbedded");
        if (mEmbeddedWebView != null) {
            ActivityHelper.getInstance().getActivity().runOnUiThread(new Runnable() { // from class: com.king.web.WebViewHelper.4
                @Override // java.lang.Runnable
                public void run() {
                    WebViewHelper.RemoveEmbeddedView();
                }
            });
        } else {
            Logging.logWarning(str, "not closing embedded view because it's not opened");
        }
    }

    public static void executeEmbeddedJavascript(String str) {
        if (mEmbeddedWebView != null) {
            ActivityHelper.getInstance().getActivity().runOnUiThread(new SendEmbeddedMessageUIThread(mEmbeddedWebView, str));
        } else {
            Logging.logWarning(TAG, "not executing javascript in embedded view because it's not opened");
        }
    }

    public static void goBack() {
        String str = TAG;
        Logging.logDebug(str, "WebViewHelper.goBack");
        if (mEmbeddedWebView != null) {
            ActivityHelper.getInstance().getActivity().runOnUiThread(new Runnable() { // from class: com.king.web.WebViewHelper.3
                @Override // java.lang.Runnable
                public void run() {
                    if (WebViewHelper.mEmbeddedWebView.canGoBack()) {
                        WebViewHelper.mEmbeddedWebView.goBack();
                    }
                }
            });
        } else {
            Logging.logWarning(str, "not going back on history because it's not opened");
        }
    }

    public static boolean hasWebViewListener() {
        return mWebViewListener != null;
    }

    public static void hideEmbedded() {
        String str = TAG;
        Logging.logDebug(str, "WebViewHelper.hideEmbedded");
        if (mEmbeddedWebView != null) {
            ActivityHelper.getInstance().getActivity().runOnUiThread(new HideEmbeddedWebViewUIThread());
        } else {
            Logging.logWarning(str, "not hiding embedded view because it's not opened");
        }
    }

    public static void launchHiddenWebView(String str, int i) {
        ActivityHelper.getInstance().getActivity().runOnUiThread(new LaunchHiddenWebViewUIThread(ActivityHelper.getInstance().getActivity(), mWebViewListener, i, str));
    }

    public static void openEmbedded(String str, float f, float f2, float f3, float f4, int i, int i2, boolean z) {
        String str2;
        String str3 = TAG;
        Logging.logWarning(str3, "WebViewHelper.openEmbedded");
        if (str.startsWith("http://") || str.startsWith("https://") || str.startsWith(AdPayload.FILE_SCHEME)) {
            str2 = str;
        } else {
            str2 = "file:///android_asset/res_output/" + str;
        }
        Logging.logDebug(str3, "openEmbedded: original url is: " + str);
        Logging.logDebug(str3, "openEmbedded: final url is:\t" + str2);
        mXRel = f;
        mYRel = f2;
        mWRel = f3;
        mHRel = f4;
        ActivityHelper.getInstance().getActivity().runOnUiThread(new OpenEmbeddedWebViewUIThread(mWebViewListener, str2, f, f2, f3, f4, i, i2, z, mMessageUrlScheme));
    }

    public static void reapplyPositionAndSize() {
        repositionEmbeddedWebView(mXRel, mYRel, mWRel, mHRel);
    }

    public static void removeAllViews() {
        ActivityHelper.getInstance().getActivity().runOnUiThread(new Runnable() { // from class: com.king.web.WebViewHelper.5
            @Override // java.lang.Runnable
            public void run() {
                WebViewHelper.RemoveEmbeddedView();
                ViewGroup viewGroup = (ViewGroup) ActivityHelper.getInstance().getActivity().findViewById(R.id.content);
                if (viewGroup != null) {
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof WebView) {
                            WebView webView = (WebView) childAt;
                            webView.setWebViewClient(null);
                            webView.stopLoading();
                        }
                    }
                    viewGroup.removeAllViews();
                    Logging.logDebug(WebViewHelper.TAG, "WebViewHelper cleaned all views");
                }
            }
        });
    }

    public static void repositionEmbedded(float f, float f2, float f3, float f4) {
        Logging.logDebug(TAG, "WebViewHelper.repositionEmbedded");
        mXRel = f;
        mYRel = f2;
        mWRel = f3;
        mHRel = f4;
        ActivityHelper.getInstance().getActivity().runOnUiThread(new RepositionEmbeddedWebViewUIThread(f, f2, f3, f4));
    }

    public static void repositionEmbeddedWebView(float f, float f2, float f3, float f4) {
        if (mEmbeddedWebView == null) {
            Logging.logWarning(TAG, "not repositioning embedded view because it's not opened");
            return;
        }
        Display defaultDisplay = ActivityHelper.getInstance().getActivity().getWindowManager().getDefaultDisplay();
        if (defaultDisplay == null) {
            Logging.logError(TAG, "Default display is null, can't read values for the webview");
            return;
        }
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i = point.x;
        int i2 = point.y;
        float f5 = i;
        int i3 = (int) (f3 * f5);
        float f6 = i2;
        int i4 = (int) (f4 * f6);
        int i5 = (int) (f5 * f);
        int i6 = (int) (f6 * f2);
        Logging.logDebug(TAG, "repositioning to " + i5 + "x" + i6 + ", size " + i3 + "x" + i4);
        mEmbeddedWebView.setX((float) i5);
        mEmbeddedWebView.setY((float) i6);
        mEmbeddedWebView.setLayoutParams(new FrameLayout.LayoutParams(i3, i4));
    }

    public static void setEmbeddedWebViewVisibility(int i) {
        mEmbeddedWebView.setVisibility(i);
    }

    public static void setMessageUrlScheme(String str) {
        mMessageUrlScheme = str;
    }

    public static void setWebView(WebView webView) {
        synchronized (WebViewHelper.class) {
            try {
                mEmbeddedWebView = webView;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setWebViewDebugEnabled() {
        ActivityHelper.getInstance().getActivity().runOnUiThread(new Runnable() { // from class: com.king.web.WebViewHelper.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Method method = WebView.class.getMethod("setWebContentsDebuggingEnabled", Boolean.TYPE);
                    if (method != null) {
                        method.invoke(null, Boolean.TRUE);
                        Logging.logDebug(WebViewHelper.TAG, "WebViewHelper.setWebViewDebugEnabled: enabled");
                    } else {
                        Logging.logWarning(WebViewHelper.TAG, "WebViewHelper.setWebViewDebugEnabled: doing nothing because null method was returned");
                    }
                } catch (IllegalAccessException e) {
                    Logging.logWarning(WebViewHelper.TAG, "WebViewHelper.setWebViewDebugEnabled: doing nothing because setWebContentsDebuggingEnabled method is not accessible");
                } catch (NoSuchMethodException e2) {
                    Logging.logWarning(WebViewHelper.TAG, "WebViewHelper.setWebViewDebugEnabled: doing nothing because setWebContentsDebuggingEnabled method is not available");
                } catch (InvocationTargetException e3) {
                    Logging.logWarning(WebViewHelper.TAG, "WebViewHelper.setWebViewDebugEnabled: doing nothing because setWebContentsDebuggingEnabled couldn't be called");
                }
            }
        });
    }

    public static void setWebViewListener(WebViewListener webViewListener) {
        mWebViewListener = webViewListener;
    }

    public static void showEmbedded() {
        String str = TAG;
        Logging.logDebug(str, "WebViewHelper.showEmbedded");
        if (mEmbeddedWebView != null) {
            ActivityHelper.getInstance().getActivity().runOnUiThread(new ShowEmbeddedWebViewUIThread());
        } else {
            Logging.logWarning(str, "not showing embedded view because it's not opened");
        }
    }

    public static void showWebView(String str) {
        String str2 = TAG;
        Logging.logInfo(str2, "showWebView " + str);
        Activity activity = ActivityHelper.getInstance().getActivity();
        if (activity != null && str != null) {
            activity.runOnUiThread(new Runnable(activity, new Intent("android.intent.action.VIEW", Uri.parse(str))) { // from class: com.king.web.WebViewHelper.1
                final Activity val$activity;
                final Intent val$browserIntent;

                {
                    this.val$activity = activity;
                    this.val$browserIntent = r5;
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        this.val$activity.startActivity(this.val$browserIntent);
                    } catch (ActivityNotFoundException e) {
                        Logging.logException("Failed to start activity for intent", e);
                    }
                }
            });
            return;
        }
        Logging.logInfo(str2, "Failed to start activity for intent, activity: " + activity + " uri:" + str);
    }
}

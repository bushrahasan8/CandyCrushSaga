package com.king.amp.sa;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.king.abm.R$color;
import com.king.abm.R$id;
import com.king.abm.R$layout;
import com.king.abm.R$raw;
import com.king.abm.R$string;
import com.king.amp.sa.AbmHtmlBridge;
import com.king.usdk.localnotification.NotificationSchedulerKeys;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.io.File;
import java.io.FileInputStream;
import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: InteractiveAdActivity.class */
public class InteractiveAdActivity extends AppCompatActivity implements IWebViewClientEventsListener {
    private static String TAG = "AbmInteractiveAdActivity";
    private boolean isAdStarted;
    private boolean isPageFinished;
    private boolean isViewOnTop;
    private AbmHtmlBridge mAbmHtmlBridge;
    private AbmWebViewClient mAbmWebViewClient;
    private ImageButton mCloseBtn;
    private long mCountdownTime;
    private Button mCtaBtn;
    private long mCurrentTime;
    private String mData;
    private InteractiveAd mInteractiveAd;
    private AbmMediaPlayerLayoutConfig mLayoutConfig;
    private long mLoadStartTime;
    private ProgressBar mLoadingSpinner;
    private String mMediaPath;
    private View mProgressBar;
    private ValueAnimator mProgressBarAnimator;
    private Timer mRewardTimer;
    private TextView mTimeLabel;
    private long mTimeUntilReward;
    private AbmWebView mWebView;
    private AbmMediaPlayerPromptDialogFragment promptDialogFragment;
    private boolean rewardGranted;

    /* renamed from: com.king.amp.sa.InteractiveAdActivity$1, reason: invalid class name */
    /* loaded from: InteractiveAdActivity$1.class */
    class AnonymousClass1 implements Runnable {
        final InteractiveAdActivity this$0;

        AnonymousClass1(InteractiveAdActivity interactiveAdActivity) {
            this.this$0 = interactiveAdActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(this.this$0.mMediaPath));
                byte[] bArr = new byte[fileInputStream.available()];
                if (fileInputStream.read(bArr) != -1) {
                    InteractiveAdActivity interactiveAdActivity = this.this$0;
                    interactiveAdActivity.mData = interactiveAdActivity.injectJsIntoAd(new String(bArr));
                }
                this.this$0.runOnUiThread(new Runnable(this) { // from class: com.king.amp.sa.InteractiveAdActivity.1.1
                    final AnonymousClass1 this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.this$1.this$0.mLoadStartTime = System.currentTimeMillis();
                        this.this$1.this$0.show();
                    }
                });
            } catch (Exception e) {
                Log.e(InteractiveAdActivity.TAG, "Unable to read resource", e);
                if (this.this$0.mInteractiveAd != null) {
                    this.this$0.mInteractiveAd.onError(3, "Interactive ad error: can't load media from device.");
                }
                this.this$0.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.king.amp.sa.InteractiveAdActivity$4, reason: invalid class name */
    /* loaded from: InteractiveAdActivity$4.class */
    public class AnonymousClass4 extends TimerTask {
        final InteractiveAdActivity this$0;

        AnonymousClass4(InteractiveAdActivity interactiveAdActivity) {
            this.this$0 = interactiveAdActivity;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.this$0.runOnUiThread(new Runnable(this) { // from class: com.king.amp.sa.InteractiveAdActivity.4.1
                final AnonymousClass4 this$1;

                {
                    this.this$1 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (this.this$1.this$0.mCurrentTime <= this.this$1.this$0.mTimeUntilReward) {
                        InteractiveAdActivity interactiveAdActivity = this.this$1.this$0;
                        String timeRemainingFormat = interactiveAdActivity.getTimeRemainingFormat(interactiveAdActivity.mCountdownTime);
                        if (!this.this$1.this$0.rewardGranted) {
                            this.this$1.this$0.mTimeLabel.setText("Reward in " + timeRemainingFormat);
                        }
                        double d = this.this$1.this$0.mCurrentTime / this.this$1.this$0.mTimeUntilReward;
                        if (this.this$1.this$0.mInteractiveAd != null) {
                            this.this$1.this$0.mInteractiveAd.playerProgress((int) (d * 100.0d), (float) this.this$1.this$0.mCurrentTime);
                        }
                    }
                    if (this.this$1.this$0.mCurrentTime == this.this$1.this$0.mTimeUntilReward) {
                        this.this$1.this$0.rewardGranted();
                        if (this.this$1.this$0.mInteractiveAd != null) {
                            this.this$1.this$0.mInteractiveAd.playerProgress(100, (float) this.this$1.this$0.mCurrentTime);
                        }
                    }
                }
            });
            this.this$0.mCurrentTime++;
            this.this$0.mCountdownTime--;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.king.amp.sa.InteractiveAdActivity$6, reason: invalid class name */
    /* loaded from: InteractiveAdActivity$6.class */
    public class AnonymousClass6 implements Runnable {
        final InteractiveAdActivity this$0;

        AnonymousClass6(InteractiveAdActivity interactiveAdActivity) {
            this.this$0 = interactiveAdActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.this$0.mTimeLabel.setText(this.this$0.getString(R$string.reward_granted));
            this.this$0.mTimeLabel.animate().alpha(1.0f).setDuration(500L).withEndAction(new Runnable(this) { // from class: com.king.amp.sa.InteractiveAdActivity.6.1
                final AnonymousClass6 this$1;

                {
                    this.this$1 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.this$1.this$0.mTimeLabel.setVisibility(0);
                }
            }).start();
        }
    }

    /* loaded from: InteractiveAdActivity$InternalWebChromeClient.class */
    private class InternalWebChromeClient extends WebChromeClient {
        final InteractiveAdActivity this$0;

        private InternalWebChromeClient(InteractiveAdActivity interactiveAdActivity) {
            this.this$0 = interactiveAdActivity;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Log.d(InteractiveAdActivity.TAG, "Console: " + consoleMessage.message());
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            Log.d(InteractiveAdActivity.TAG, "JsAlert: " + str2 + " result: " + jsResult.toString());
            return super.onJsAlert(webView, str, str2, jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            Log.d(InteractiveAdActivity.TAG, "received title: " + webView.getUrl());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void initializeProgressAnimation() {
        if (this.mProgressBarAnimator != null) {
            return;
        }
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        ValueAnimator duration = ValueAnimator.ofInt(1, point.x).setDuration(this.mTimeUntilReward * 1000);
        this.mProgressBarAnimator = duration;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.king.amp.sa.InteractiveAdActivity.5
            final InteractiveAdActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.this$0.mProgressBar.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.this$0.mProgressBar.requestLayout();
            }
        });
        this.mProgressBarAnimator.setInterpolator(new LinearInterpolator());
        this.mProgressBarAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public String injectJsIntoAd(String str) {
        String str2 = str;
        if (str != null) {
            str2 = str;
            if (str.length() != 0) {
                StringBuilder sb = new StringBuilder("<script>\n");
                try {
                    Scanner useDelimiter = new Scanner(getResources().openRawResource(R$raw.abm_mraid), "UTF-8").useDelimiter("\\A");
                    if (useDelimiter.hasNext()) {
                        sb.append(useDelimiter.next());
                    }
                    useDelimiter.close();
                } catch (Exception e) {
                    Utils.log(TAG, "Unable to read resource :" + e.toString());
                    InteractiveAd interactiveAd = this.mInteractiveAd;
                    if (interactiveAd != null) {
                        interactiveAd.onError(3, "Interactive ad error: can't load media from device.");
                    }
                    finish();
                }
                sb.append("\n</script>\n");
                str2 = sb.toString() + str;
            }
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rewardGranted() {
        stopRewardTimer();
        if (!this.rewardGranted) {
            startRewardGrantedAnimation();
        }
        this.rewardGranted = true;
    }

    private void setMraidProperties() {
        this.mAbmHtmlBridge.notifyPlacementType();
        this.mAbmHtmlBridge.notifySupports();
        setMraidScreenProperties();
        this.mAbmHtmlBridge.notifyViewState(AbmHtmlBridge.ViewState.DEFAULT);
        this.mAbmHtmlBridge.notifyViewability(true);
        this.mAbmHtmlBridge.fireReadyEvent();
    }

    private void setMraidScreenProperties() {
        float f = getResources().getDisplayMetrics().density;
        int i = (int) ((getResources().getDisplayMetrics().widthPixels / f) + 0.5f);
        int i2 = (int) ((getResources().getDisplayMetrics().heightPixels / f) + 0.5f);
        this.mAbmHtmlBridge.notifyScreenSize(i, i2);
        this.mAbmHtmlBridge.notifyMaxSize(i, i2);
        this.mWebView.getLocationOnScreen(new int[2]);
        int width = this.mWebView.getWidth();
        int height = this.mWebView.getHeight();
        Rect rect = new Rect();
        rect.set((int) ((r0[0] / f) + 0.5f), (int) ((r0[1] / f) + 0.5f), (int) ((width / f) + 0.5f), (int) ((height / f) + 0.5f));
        this.mAbmHtmlBridge.notifyCurrentPosition(rect);
        this.mAbmHtmlBridge.notifyDefaultPosition(rect);
        this.mAbmHtmlBridge.notifySizeChangeEvent(rect);
    }

    private void setup() {
        WebSettings settings = this.mWebView.getSettings();
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setBuiltInZoomControls(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(false);
        settings.setSaveFormData(false);
        settings.setDatabaseEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setCacheMode(-1);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setMixedContentMode(0);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        CookieManager cookieManager = CookieManager.getInstance();
        if (cookieManager != null) {
            cookieManager.acceptCookie();
            cookieManager.setAcceptThirdPartyCookies(this.mWebView, true);
        }
        this.mWebView.setScrollContainer(false);
        this.mWebView.setLayerType(2, null);
        this.mWebView.setHorizontalScrollBarEnabled(false);
        this.mWebView.setVerticalScrollBarEnabled(false);
        this.mWebView.setBackgroundColor(0);
        this.mWebView.setScrollBarStyle(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void show() {
        if (this.mData.startsWith("http")) {
            this.mWebView.loadUrl(this.mData);
        } else {
            this.mWebView.loadDataWithBaseURL(AndroidWebViewClient.BLANK_PAGE, this.mData, "text/html", "UTF-8", null);
        }
    }

    private void startAdDisplay() {
        synchronized (this) {
            if (!this.isAdStarted) {
                initializeProgressAnimation();
                startRewardTimer();
                setMraidProperties();
                this.isAdStarted = true;
                this.mInteractiveAd.onPlayerAppeared();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void startRewardGrantedAnimation() {
        this.mTimeLabel.animate().alpha(0.0f).setDuration(500L).withEndAction(new AnonymousClass6(this)).start();
        ValueAnimator ofInt = ValueAnimator.ofInt(ContextCompat.getColor(this, R$color.king_green), ContextCompat.getColor(this, R$color.king_orange_dark));
        ofInt.setDuration(500L);
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.king.amp.sa.InteractiveAdActivity.7
            final InteractiveAdActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.this$0.mProgressBar.setBackgroundTintList(ColorStateList.valueOf(((Integer) valueAnimator.getAnimatedValue()).intValue()));
            }
        });
        ofInt.start();
    }

    private void startRewardTimer() {
        if (this.mRewardTimer != null) {
            return;
        }
        Timer timer = new Timer();
        this.mRewardTimer = timer;
        timer.schedule(new AnonymousClass4(this), 0L, 1000L);
    }

    private void stopRewardTimer() {
        Timer timer = this.mRewardTimer;
        if (timer != null) {
            timer.cancel();
            this.mRewardTimer.purge();
            this.mRewardTimer = null;
        }
    }

    String getTimeRemainingFormat(long j) {
        long j2 = j % 3600;
        return String.format(Locale.getDefault(), "%02d:%02d", Integer.valueOf((int) Math.floor(j2 / 60)), Integer.valueOf((int) Math.floor(j2 % 60)));
    }

    public void onBackPressed() {
        Optional of;
        if (this.mInteractiveAd == null) {
            super/*androidx.activity.ComponentActivity*/.onBackPressed();
            return;
        }
        AdProviderNameValuePairs adProviderNameValuePairs = new AdProviderNameValuePairs();
        InteractiveAd interactiveAd = this.mInteractiveAd;
        of = Optional.of(adProviderNameValuePairs);
        interactiveAd.onPlayerEvent("close", of);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(Bundle bundle) {
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        this.isAdStarted = false;
        this.isPageFinished = false;
        this.isViewOnTop = false;
        InteractiveAd interactiveAd = InteractiveAd.getInstance();
        this.mInteractiveAd = interactiveAd;
        interactiveAd.setActivity(this);
        Bundle extras = getIntent().getExtras();
        this.mMediaPath = extras.getString(NotificationSchedulerKeys.KEY_MEDIA_PATH);
        this.mTimeUntilReward = extras.getLong("duration_sec");
        String string = extras.getString("layout_configuration");
        if (TextUtils.isEmpty(string)) {
            Log.e(TAG, "Interactive ad error: layout config is empty.");
            InteractiveAd interactiveAd2 = this.mInteractiveAd;
            if (interactiveAd2 != null) {
                interactiveAd2.onError(4, "Interactive ad error: layout config is empty.");
            }
            finish();
            return;
        }
        new Thread(new AnonymousClass1(this)).start();
        setRequestedOrientation(1);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R$layout.interactive_ad_web_view);
        this.mWebView = (AbmWebView) findViewById(R$id.webView);
        this.mAbmHtmlBridge = new AbmHtmlBridge(this, this.mWebView, this.mInteractiveAd);
        this.mProgressBar = findViewById(R$id.progress);
        this.mCloseBtn = (ImageButton) findViewById(R$id.closeBtn);
        this.mLoadingSpinner = (ProgressBar) findViewById(R$id.progress_loader);
        Button button = (Button) findViewById(R$id.ctaBtn);
        this.mCtaBtn = button;
        button.setVisibility(8);
        this.mTimeLabel = (TextView) findViewById(R$id.timeLabel);
        this.mLayoutConfig = new AbmMediaPlayerLayoutConfig(string);
        this.mCurrentTime = 0L;
        this.mLoadStartTime = 0L;
        long j = this.mTimeUntilReward;
        this.mCountdownTime = j;
        String timeRemainingFormat = getTimeRemainingFormat(j);
        this.mTimeLabel.setText("Reward in " + timeRemainingFormat);
        setup();
        AbmWebViewClient abmWebViewClient = new AbmWebViewClient(this);
        this.mAbmWebViewClient = abmWebViewClient;
        this.mWebView.setWebViewClient(abmWebViewClient);
        this.mWebView.setWebChromeClient(new InternalWebChromeClient());
        Bundle bundle2 = new Bundle();
        bundle2.putString("layout_configuration", string);
        this.promptDialogFragment = AbmMediaPlayerPromptDialogFragment.newInstance(bundle2);
        this.mCloseBtn.setOnClickListener(new View.OnClickListener(this) { // from class: com.king.amp.sa.InteractiveAdActivity.2
            final InteractiveAdActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Optional of;
                if (this.this$0.mInteractiveAd != null) {
                    AdProviderNameValuePairs adProviderNameValuePairs = new AdProviderNameValuePairs();
                    InteractiveAd interactiveAd3 = this.this$0.mInteractiveAd;
                    of = Optional.of(adProviderNameValuePairs);
                    interactiveAd3.onPlayerEvent("close", of);
                }
            }
        });
        this.mCtaBtn.setOnClickListener(new View.OnClickListener(this) { // from class: com.king.amp.sa.InteractiveAdActivity.3
            final InteractiveAdActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Optional empty;
                InteractiveAd interactiveAd3 = this.this$0.mInteractiveAd;
                empty = Optional.empty();
                interactiveAd3.onPlayerEvent("cta", empty);
            }
        });
        this.rewardGranted = false;
    }

    protected void onDestroy() {
        stopRewardTimer();
        this.mInteractiveAd = null;
        super.onDestroy();
    }

    public void onJsRewardGranted() {
        rewardGranted();
    }

    @Override // com.king.amp.sa.IWebViewClientEventsListener
    public void onPageFinished(String str) {
        Log.i(TAG, "Handle page finished event for " + str + ", in " + (System.currentTimeMillis() - this.mLoadStartTime) + " ms");
        this.mAbmHtmlBridge.handlePageFinished(str);
        if (this.mWebView.getProgress() == 100) {
            this.isPageFinished = true;
            if (this.isViewOnTop) {
                startAdDisplay();
            }
        }
    }

    @Override // com.king.amp.sa.IWebViewClientEventsListener
    public void onPageStarted(String str, Bitmap bitmap) {
        if (str == null || str.equals(AndroidWebViewClient.BLANK_PAGE)) {
            return;
        }
        Log.i(TAG, "Handle page started event for " + str + ", in " + (System.currentTimeMillis() - this.mLoadStartTime) + " ms");
    }

    protected void onPause() {
        super/*androidx.fragment.app.FragmentActivity*/.onPause();
    }

    @Override // com.king.amp.sa.IWebViewClientEventsListener
    public void onReceivedError(int i, String str, String str2) {
    }

    @Override // com.king.amp.sa.IWebViewClientEventsListener
    public void onReceivedError(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.king.amp.sa.IWebViewClientEventsListener
    public void onReceivedHttpError(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String str = "Http Error on interactive ad with code: " + webResourceResponse.getStatusCode();
        InteractiveAd interactiveAd = this.mInteractiveAd;
        if (interactiveAd != null) {
            interactiveAd.onError(6, str);
        }
        finish();
    }

    @Override // com.king.amp.sa.IWebViewClientEventsListener
    public void onReceivedSslError(SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    @Override // com.king.amp.sa.IWebViewClientEventsListener
    public boolean onRenderProcessGone(RenderProcessGoneDetail renderProcessGoneDetail) {
        return false;
    }

    protected void onResume() {
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
    }

    protected void onStart() {
        super.onStart();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onStop() {
        InteractiveAd interactiveAd;
        if (isFinishing() && (interactiveAd = this.mInteractiveAd) != null) {
            interactiveAd.onDismissed(0, "");
        }
        super.onStop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onWindowFocusChanged(boolean z) {
        Optional empty;
        Optional empty2;
        super/*android.app.Activity*/.onWindowFocusChanged(z);
        this.isViewOnTop = z;
        if (!z) {
            this.mAbmHtmlBridge.notifyViewability(false);
            stopRewardTimer();
            ValueAnimator valueAnimator = this.mProgressBarAnimator;
            if (valueAnimator != null) {
                valueAnimator.pause();
            }
            this.mWebView.onPause();
            if (this.isAdStarted) {
                InteractiveAd interactiveAd = this.mInteractiveAd;
                empty = Optional.empty();
                interactiveAd.onPlayerEvent(AbmMediaPlayer.PAUSE, empty);
                return;
            }
            return;
        }
        this.mWebView.onResume();
        if (!this.isPageFinished || this.isAdStarted) {
            this.mAbmHtmlBridge.notifyViewability(true);
            if (this.mProgressBarAnimator != null) {
                startRewardTimer();
                this.mProgressBarAnimator.resume();
            }
        } else {
            startAdDisplay();
        }
        if (this.isAdStarted) {
            InteractiveAd interactiveAd2 = this.mInteractiveAd;
            empty2 = Optional.empty();
            interactiveAd2.onPlayerEvent(AbmMediaPlayer.RESUME, empty2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void performAction(String str) {
        Log.d(TAG, "InteractiveActivty perform action called:" + str);
        str.hashCode();
        boolean z = -1;
        switch (str.hashCode()) {
            case -962882375:
                if (str.equals(AbmMediaPlayer.DISMISS_PROMPT)) {
                    z = false;
                    break;
                }
                break;
            case -43692629:
                if (str.equals(AbmMediaPlayer.REWARD_GRANTED)) {
                    z = true;
                    break;
                }
                break;
            case 452170982:
                if (str.equals(AbmMediaPlayer.SHOW_PROMPT)) {
                    z = 2;
                    break;
                }
                break;
            case 1671672458:
                if (str.equals(AbmMediaPlayer.DISMISS)) {
                    z = 3;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
                AbmMediaPlayerPromptDialogFragment abmMediaPlayerPromptDialogFragment = this.promptDialogFragment;
                if (abmMediaPlayerPromptDialogFragment != null) {
                    abmMediaPlayerPromptDialogFragment.dismiss();
                    return;
                }
                return;
            case true:
                rewardGranted();
                return;
            case true:
                AbmMediaPlayerPromptDialogFragment abmMediaPlayerPromptDialogFragment2 = this.promptDialogFragment;
                if (abmMediaPlayerPromptDialogFragment2 != null) {
                    abmMediaPlayerPromptDialogFragment2.show(getSupportFragmentManager(), AbmMediaPlayerPromptDialogFragment.TAG);
                    return;
                }
                return;
            case true:
                this.mAbmHtmlBridge.notifyViewState(AbmHtmlBridge.ViewState.HIDDEN);
                this.isAdStarted = false;
                finish();
                return;
            default:
                return;
        }
    }

    @Override // com.king.amp.sa.IWebViewClientEventsListener
    public WebResourceResponse shouldInterceptRequest(Uri uri) {
        return this.mAbmHtmlBridge.handleShouldInterceptRequest(uri);
    }

    @Override // com.king.amp.sa.IWebViewClientEventsListener
    public boolean shouldOverrideUrlLoading(Uri uri) {
        return this.mAbmHtmlBridge.handleShouldOverrideUrl(uri);
    }
}

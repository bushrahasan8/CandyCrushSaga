package com.king.amp.sa;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TouchDelegate;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.ui.PlayerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.common.collect.UnmodifiableIterator;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.t2;
import com.king.abm.R$color;
import com.king.abm.R$drawable;
import com.king.abm.R$id;
import com.king.abm.R$layout;
import com.king.abm.R$string;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: AbmMediaPlayerActivity.class */
public class AbmMediaPlayerActivity extends AppCompatActivity implements Player.Listener, IAbmMediaPlayerEndCardListener {
    private AbmMediaPlayer abmMediaPlayer;
    private ImageButton adChoicesIcon;
    private ImageButton advertiserIcon;
    private Timer autoScrollTimer;
    private AbmMediaPlayerChapterAdIndicatorView chapterAdIndicatorView;
    private AbmMediaPlayerChapterAdMediaAdapter chapterAdMediaAdapter;
    private Timer chapterAdProgressTimer;
    private ViewPager2 chapterView;
    private ImageButton closeButton;
    private Button ctaButton;
    private int currentPlayerVolume;
    private int currentSystemVolume;
    private TextView description;
    private View dimBackground;
    private AbmMediaPlayerEndCardFragment endCardFragment;
    private long lastPlaybackPosition;
    private AbmMediaPlayerLayoutConfig layoutConfig;
    private ExoPlayer player;
    private ConstraintLayout playerRootView;
    private TouchDelegateComposite playerRootViewTouchDelegateComposite;
    private PlayerView playerView;
    private View progressBar;
    private ValueAnimator progressBarAnimator;
    private AbmMediaPlayerPromptDialogFragment promptDialogFragment;
    private TextView timeRemaining;
    private TextView title;
    private final String TAG = "AbmMediaPlayerActivity";
    private String adType = "undefined";
    private long chapterAdCurrentProgressMilli = 0;
    private int currentPageIndex = 0;
    private int isManuallyScrolled = 1;
    private final long CHAPTER_AD_PROGRESS_INTERVAL = 100;
    private long AUTO_SCROLL_INTERVAL = UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS;
    private boolean isAutoScrollPaused = false;
    private int videoDuration = 0;
    private int closeButtonPlaybackPercentage = 0;
    private int rewardPlaybackPercentage = 100;
    private Timer progressTimer = null;
    private boolean isDestroyedByRotation = false;
    private State playerState = State.Idle;
    private BroadcastReceiver updatesReceiver = new BroadcastReceiver(this) { // from class: com.king.amp.sa.AbmMediaPlayerActivity.1
        final AbmMediaPlayerActivity this$0;

        {
            this.this$0 = this;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Log.i("AbmMediaPlayerActivity", "Update intent received");
            if (intent.getAction().equals("com.king.amp.sa.UPDATE_PLAYER_ACTIVITY")) {
                this.this$0.onNewIntent(intent);
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.king.amp.sa.AbmMediaPlayerActivity$11, reason: invalid class name */
    /* loaded from: AbmMediaPlayerActivity$11.class */
    public class AnonymousClass11 implements Runnable {
        final AbmMediaPlayerActivity this$0;

        AnonymousClass11(AbmMediaPlayerActivity abmMediaPlayerActivity) {
            this.this$0 = abmMediaPlayerActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.this$0.timeRemaining.setText(this.this$0.getString(R$string.reward_granted));
            this.this$0.timeRemaining.animate().alpha(1.0f).setDuration(500L).withEndAction(new Runnable(this) { // from class: com.king.amp.sa.AbmMediaPlayerActivity.11.1
                final AnonymousClass11 this$1;

                {
                    this.this$1 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.this$1.this$0.timeRemaining.setVisibility(0);
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.king.amp.sa.AbmMediaPlayerActivity$14, reason: invalid class name */
    /* loaded from: AbmMediaPlayerActivity$14.class */
    public class AnonymousClass14 extends TimerTask {
        final AbmMediaPlayerActivity this$0;

        AnonymousClass14(AbmMediaPlayerActivity abmMediaPlayerActivity) {
            this.this$0 = abmMediaPlayerActivity;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.this$0.runOnUiThread(new Runnable(this) { // from class: com.king.amp.sa.AbmMediaPlayerActivity.14.1
                final AnonymousClass14 this$1;

                {
                    this.this$1 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.this$1.this$0.sendChapterAdProgressEvent();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.king.amp.sa.AbmMediaPlayerActivity$15, reason: invalid class name */
    /* loaded from: AbmMediaPlayerActivity$15.class */
    public class AnonymousClass15 extends TimerTask {
        final AbmMediaPlayerActivity this$0;

        AnonymousClass15(AbmMediaPlayerActivity abmMediaPlayerActivity) {
            this.this$0 = abmMediaPlayerActivity;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.this$0.runOnUiThread(new Runnable(this) { // from class: com.king.amp.sa.AbmMediaPlayerActivity.15.1
                final AnonymousClass15 this$1;

                {
                    this.this$1 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.this$1.this$0.isManuallyScrolled = 0;
                    int itemCount = (this.this$1.this$0.currentPageIndex + 1) % this.this$1.this$0.chapterView.getAdapter().getItemCount();
                    this.this$1.this$0.chapterView.setCurrentItem(itemCount, true);
                    this.this$1.this$0.currentPageIndex = itemCount;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.king.amp.sa.AbmMediaPlayerActivity$16, reason: invalid class name */
    /* loaded from: AbmMediaPlayerActivity$16.class */
    public class AnonymousClass16 implements Runnable {
        final AbmMediaPlayerActivity this$0;
        final String val$nextTitle;

        AnonymousClass16(AbmMediaPlayerActivity abmMediaPlayerActivity, String str) {
            this.this$0 = abmMediaPlayerActivity;
            this.val$nextTitle = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.this$0.title.setText(this.val$nextTitle);
            this.this$0.title.animate().alpha(1.0f).setDuration(300L).withEndAction(new Runnable(this) { // from class: com.king.amp.sa.AbmMediaPlayerActivity.16.1
                final AnonymousClass16 this$1;

                {
                    this.this$1 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.this$1.this$0.title.setVisibility(0);
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.king.amp.sa.AbmMediaPlayerActivity$17, reason: invalid class name */
    /* loaded from: AbmMediaPlayerActivity$17.class */
    public class AnonymousClass17 implements Runnable {
        final AbmMediaPlayerActivity this$0;
        final String val$nextDescription;

        AnonymousClass17(AbmMediaPlayerActivity abmMediaPlayerActivity, String str) {
            this.this$0 = abmMediaPlayerActivity;
            this.val$nextDescription = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.this$0.description.setText(this.val$nextDescription);
            this.this$0.description.animate().alpha(1.0f).setDuration(300L).withEndAction(new Runnable(this) { // from class: com.king.amp.sa.AbmMediaPlayerActivity.17.1
                final AnonymousClass17 this$1;

                {
                    this.this$1 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.this$1.this$0.description.setVisibility(0);
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.king.amp.sa.AbmMediaPlayerActivity$7, reason: invalid class name */
    /* loaded from: AbmMediaPlayerActivity$7.class */
    public class AnonymousClass7 extends TimerTask {
        final AbmMediaPlayerActivity this$0;

        AnonymousClass7(AbmMediaPlayerActivity abmMediaPlayerActivity) {
            this.this$0 = abmMediaPlayerActivity;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.this$0.runOnUiThread(new Runnable(this) { // from class: com.king.amp.sa.AbmMediaPlayerActivity.7.1
                final AnonymousClass7 this$1;

                {
                    this.this$1 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.this$1.this$0.sendProgressEvent();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.king.amp.sa.AbmMediaPlayerActivity$9, reason: invalid class name */
    /* loaded from: AbmMediaPlayerActivity$9.class */
    public class AnonymousClass9 extends TimerTask {
        final AbmMediaPlayerActivity this$0;

        AnonymousClass9(AbmMediaPlayerActivity abmMediaPlayerActivity) {
            this.this$0 = abmMediaPlayerActivity;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.this$0.runOnUiThread(new Runnable(this) { // from class: com.king.amp.sa.AbmMediaPlayerActivity.9.1
                final AnonymousClass9 this$1;

                {
                    this.this$1 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.this$1.this$0.advertiserIcon.setClickable(true);
                    this.this$1.this$0.closeButton.setClickable(true);
                    this.this$1.this$0.ctaButton.setClickable(true);
                    this.this$1.this$0.adChoicesIcon.setClickable(true);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: AbmMediaPlayerActivity$State.class */
    public enum State {
        Idle,
        Initialized,
        Showing,
        Finished
    }

    /* loaded from: AbmMediaPlayerActivity$TouchDelegateComposite.class */
    private class TouchDelegateComposite extends TouchDelegate {
        private final List delegates;
        final AbmMediaPlayerActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TouchDelegateComposite(AbmMediaPlayerActivity abmMediaPlayerActivity, View view) {
            super(new Rect(), view);
            this.this$0 = abmMediaPlayerActivity;
            this.delegates = new ArrayList();
        }

        public void addDelegate(TouchDelegate touchDelegate) {
            if (touchDelegate != null) {
                this.delegates.add(touchDelegate);
            }
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            Iterator it = this.delegates.iterator();
            while (true) {
                while (true) {
                    boolean z2 = z;
                    if (!it.hasNext()) {
                        return z2;
                    }
                    TouchDelegate touchDelegate = (TouchDelegate) it.next();
                    motionEvent.setLocation(x, y);
                    z = touchDelegate.onTouchEvent(motionEvent) || z2;
                }
            }
        }
    }

    private String convertMillisecondsToMmSs(long j) {
        return String.format(Locale.getDefault(), "%02d:%02d", Integer.valueOf((int) ((j / 60000) % 60)), Integer.valueOf(((int) (j / 1000)) % 60));
    }

    private String getAssetValueFromConfig(String str) {
        return this.adType.equalsIgnoreCase(AbmMediaPlayer.REWARDED_CHAPTERS) ? this.layoutConfig.getChapterConfigMapList().get(0).get(str) : this.layoutConfig.getLayoutConfigMap().get(str);
    }

    private int getIntExtra(Bundle bundle, String str, int i) {
        String string = bundle.getString(str);
        int i2 = i;
        if (string != null) {
            try {
                i2 = Integer.parseInt(string);
            } catch (Exception e) {
                Log.e("AbmMediaPlayerActivity", "Unable to get " + str + ", " + e.getMessage());
                i2 = i;
            }
        }
        return i2;
    }

    private void increaseTouchableAreaForButton(View view, int i, int i2, int i3, int i4) {
        this.playerRootView.post(new Runnable(this, view, i, i2, i3, i4) { // from class: com.king.amp.sa.AbmMediaPlayerActivity.13
            final AbmMediaPlayerActivity this$0;
            final int val$bottomOffset;
            final int val$leftOffset;
            final int val$rightOffset;
            final View val$targetView;
            final int val$topOffset;

            {
                this.this$0 = this;
                this.val$targetView = view;
                this.val$topOffset = i;
                this.val$bottomOffset = i2;
                this.val$leftOffset = i3;
                this.val$rightOffset = i4;
            }

            @Override // java.lang.Runnable
            public void run() {
                Rect rect = new Rect();
                this.val$targetView.getHitRect(rect);
                rect.top -= this.val$topOffset;
                rect.bottom += this.val$bottomOffset;
                rect.left -= this.val$leftOffset;
                rect.right += this.val$rightOffset;
                this.this$0.playerRootViewTouchDelegateComposite.addDelegate(new TouchDelegate(rect, this.val$targetView));
                this.this$0.playerRootView.setTouchDelegate(this.this$0.playerRootViewTouchDelegateComposite);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void initializeProgressAnimation() {
        int i = this.videoDuration;
        long j = i * 1000;
        long j2 = j;
        if (i == 0) {
            j2 = j;
            if (this.player != null) {
                j2 = j;
                if (!this.adType.equalsIgnoreCase(AbmMediaPlayer.REWARDED_CHAPTERS)) {
                    j2 = this.player.getDuration();
                }
            }
        }
        if (j2 != -9223372036854775807L && this.progressBarAnimator == null) {
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            ValueAnimator duration = ValueAnimator.ofInt(1, Math.min(point.x, point.y)).setDuration(j2);
            this.progressBarAnimator = duration;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.king.amp.sa.AbmMediaPlayerActivity.10
                final AbmMediaPlayerActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.this$0.progressBar.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    this.this$0.progressBar.requestLayout();
                }
            });
            this.progressBarAnimator.setInterpolator(new LinearInterpolator());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void initializeUIWithLayoutConfig() {
        this.title.setText(getAssetValueFromConfig("ad_title_text"));
        this.description.setText(getAssetValueFromConfig("ad_description_text"));
        String assetValueFromConfig = getAssetValueFromConfig("cta_button_title");
        if (!TextUtils.isEmpty(assetValueFromConfig)) {
            this.ctaButton.setText(assetValueFromConfig);
        }
        String assetValueFromConfig2 = getAssetValueFromConfig("cta_button_image");
        if (!TextUtils.isEmpty(assetValueFromConfig2)) {
            this.ctaButton.setBackground(Drawable.createFromPath(assetValueFromConfig2));
        }
        increaseTouchableAreaForButton(this.ctaButton, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED);
        String assetValueFromConfig3 = getAssetValueFromConfig("advertiser_icon");
        if (!TextUtils.isEmpty(assetValueFromConfig3)) {
            this.advertiserIcon.setClipToOutline(true);
            this.advertiserIcon.setVisibility(0);
            this.advertiserIcon.setImageDrawable(Drawable.createFromPath(assetValueFromConfig3));
            increaseTouchableAreaForButton(this.advertiserIcon, 20, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 20, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED);
        }
        if (!TextUtils.isEmpty(getAssetValueFromConfig("adchoice_url"))) {
            this.adChoicesIcon.setVisibility(0);
            String assetValueFromConfig4 = getAssetValueFromConfig("adchoice_icon");
            if (TextUtils.isEmpty(assetValueFromConfig4)) {
                this.adChoicesIcon.setImageResource(R$drawable.ad_choices_icon);
            } else {
                this.adChoicesIcon.setImageDrawable(Drawable.createFromPath(assetValueFromConfig4));
            }
            increaseTouchableAreaForButton(this.adChoicesIcon, 50, 50, 50, 0);
        }
        if (this.adType.equalsIgnoreCase(AbmMediaPlayer.REWARDED_CHAPTERS)) {
            ArrayList arrayList = new ArrayList();
            Iterator<Map<String, String>> it = this.layoutConfig.getChapterConfigMapList().iterator();
            while (it.hasNext()) {
                arrayList.add(Drawable.createFromPath(it.next().get("ad_image")));
            }
            int i = this.videoDuration;
            this.AUTO_SCROLL_INTERVAL = i != 0 ? (i * 1000) / arrayList.size() : 5000L;
            AbmMediaPlayerChapterAdMediaAdapter abmMediaPlayerChapterAdMediaAdapter = new AbmMediaPlayerChapterAdMediaAdapter(arrayList, this);
            this.chapterAdMediaAdapter = abmMediaPlayerChapterAdMediaAdapter;
            this.chapterView.setAdapter(abmMediaPlayerChapterAdMediaAdapter);
            this.chapterAdIndicatorView.setupIndicators(this, arrayList.size());
            this.chapterView.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback(this) { // from class: com.king.amp.sa.AbmMediaPlayerActivity.6
                final AbmMediaPlayerActivity this$0;

                {
                    this.this$0 = this;
                }

                public void onPageSelected(int i2) {
                    Optional<AdProviderNameValuePairs> of;
                    super.onPageSelected(i2);
                    AdProviderNameValuePairs adProviderNameValuePairs = new AdProviderNameValuePairs();
                    adProviderNameValuePairs.add(AbmMediaPlayer.PREVIOUS_PAGE, Integer.valueOf(this.this$0.currentPageIndex + 1));
                    adProviderNameValuePairs.add(AbmMediaPlayer.CURRENT_PAGE, Integer.valueOf(i2 + 1));
                    adProviderNameValuePairs.add(AbmMediaPlayer.IS_MANUALLY_SCROLLED, Integer.valueOf(this.this$0.isManuallyScrolled));
                    if (this.this$0.abmMediaPlayer != null) {
                        AbmMediaPlayer abmMediaPlayer = this.this$0.abmMediaPlayer;
                        of = Optional.of(adProviderNameValuePairs);
                        abmMediaPlayer.onPlayerEvent(AbmMediaPlayer.USER_ACTION_PAGE_CHANGED, of);
                    }
                    this.this$0.chapterAdIndicatorView.updateIndicator(i2);
                    AbmMediaPlayerActivity abmMediaPlayerActivity = this.this$0;
                    abmMediaPlayerActivity.updateChapterText(abmMediaPlayerActivity.currentPageIndex, i2);
                    this.this$0.currentPageIndex = i2;
                    this.this$0.startAutoScroll();
                    this.this$0.isManuallyScrolled = 1;
                }
            });
            startAutoScroll();
            this.chapterView.setVisibility(0);
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(this.playerRootView);
            constraintSet.connect(this.adChoicesIcon.getId(), 4, this.chapterView.getId(), 4, 0);
            constraintSet.connect(this.adChoicesIcon.getId(), 7, this.chapterView.getId(), 7, 0);
            constraintSet.applyTo(this.playerRootView);
            initializeProgressAnimation();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean performAction(Bundle bundle) {
        Optional<AdProviderNameValuePairs> empty;
        AbmMediaPlayerPromptDialogFragment abmMediaPlayerPromptDialogFragment;
        AbmMediaPlayerPromptDialogFragment abmMediaPlayerPromptDialogFragment2;
        if (bundle.containsKey(AbmMediaPlayer.PAUSE)) {
            Log.i("AbmMediaPlayerActivity", "Pause action received");
            ExoPlayer exoPlayer = this.player;
            if (exoPlayer == null || !exoPlayer.isPlaying()) {
                return true;
            }
            Log.i("AbmMediaPlayerActivity", "Pausing player");
            this.player.pause();
            return true;
        }
        if (bundle.containsKey(AbmMediaPlayer.RESUME)) {
            Log.i("AbmMediaPlayerActivity", "Resume action received");
            ExoPlayer exoPlayer2 = this.player;
            if (exoPlayer2 == null || exoPlayer2.isPlaying()) {
                return true;
            }
            Log.i("AbmMediaPlayerActivity", "Resuming player");
            this.player.play();
            return true;
        }
        if (bundle.containsKey(AbmMediaPlayer.DISMISS)) {
            releasePlayer();
            finish();
            return true;
        }
        if (bundle.containsKey(AbmMediaPlayer.REWARD_GRANTED)) {
            startRewardGrantedAnimation();
            return true;
        }
        if (bundle.containsKey(AbmMediaPlayer.SHOW_PROMPT) && (abmMediaPlayerPromptDialogFragment2 = this.promptDialogFragment) != null && !abmMediaPlayerPromptDialogFragment2.isAdded()) {
            this.promptDialogFragment.show(getSupportFragmentManager(), AbmMediaPlayerPromptDialogFragment.TAG);
            return true;
        }
        if (bundle.containsKey(AbmMediaPlayer.DISMISS_PROMPT) && (abmMediaPlayerPromptDialogFragment = this.promptDialogFragment) != null) {
            abmMediaPlayerPromptDialogFragment.dismiss();
            return true;
        }
        if (bundle.containsKey(AbmMediaPlayer.SHOW_END_CARD)) {
            this.closeButton.bringToFront();
            this.dimBackground.animate().alpha(0.85f).setDuration(300L).start();
            this.endCardFragment.show(getSupportFragmentManager(), AbmMediaPlayerEndCardFragment.TAG);
            this.ctaButton.setVisibility(4);
            AbmMediaPlayer abmMediaPlayer = this.abmMediaPlayer;
            if (abmMediaPlayer == null) {
                return true;
            }
            empty = Optional.empty();
            abmMediaPlayer.onPlayerEvent(AbmMediaPlayer.USER_ACTION_END_CARD_SHOWN, empty);
            return true;
        }
        if (bundle.containsKey(AbmMediaPlayer.DISMISS_END_CARD)) {
            this.dimBackground.animate().alpha(0.0f).setDuration(300L).start();
            this.endCardFragment.dismiss();
            return true;
        }
        if (!bundle.containsKey(AbmMediaPlayer.OPEN_URL)) {
            return false;
        }
        String string = bundle.getString(AbmMediaPlayer.OPEN_URL);
        Log.i("AbmMediaPlayerActivity", "Open URL: " + string);
        startActivity(BrowserComponent.getStartIntent(this, string));
        return true;
    }

    private void releasePlayer() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.stop();
            this.player.setVideoSurface((Surface) null);
            this.player.setVideoSurfaceView((SurfaceView) null);
            this.player.release();
        }
        this.player = null;
    }

    private void resumeChapterScroll() {
        if (this.autoScrollTimer == null) {
            Log.d("AbmMediaPlayerActivity", "resumeChapterScroll");
            startAutoScroll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void sendChapterAdProgressEvent() {
        long j = this.videoDuration * 1000;
        long j2 = this.chapterAdCurrentProgressMilli;
        if (j2 >= j) {
            stopChapterAdProgressTimer();
            AbmMediaPlayer abmMediaPlayer = this.abmMediaPlayer;
            if (abmMediaPlayer != null) {
                abmMediaPlayer.onPlayerProgress(100, ((float) this.chapterAdCurrentProgressMilli) / 1000.0f);
            }
            this.playerState = State.Finished;
            return;
        }
        if (j2 % 1000 == 0) {
            double d = j2 / j;
            AbmMediaPlayer abmMediaPlayer2 = this.abmMediaPlayer;
            if (abmMediaPlayer2 != null) {
                abmMediaPlayer2.onPlayerProgress((int) (d * 100.0d), ((float) j2) / 1000.0f);
            }
            if (d * 100.0d >= this.closeButtonPlaybackPercentage && this.closeButton.getVisibility() == 8) {
                this.closeButton.setVisibility(0);
                increaseTouchableAreaForButton(this.closeButton, 20, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 20);
            }
            long j3 = (((j * this.rewardPlaybackPercentage) / 100) - this.chapterAdCurrentProgressMilli) - 100;
            if (j3 > 0) {
                this.timeRemaining.setText(getString(R$string.reward_in) + convertMillisecondsToMmSs(j3));
            }
        }
        this.chapterAdCurrentProgressMilli += 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void sendProgressEvent() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            int i = this.videoDuration;
            long duration = i != 0 ? i * 1000 : exoPlayer.getDuration();
            if (duration == -9223372036854775807L) {
                return;
            }
            long currentPosition = this.player.getCurrentPosition();
            double d = currentPosition / duration;
            AbmMediaPlayer abmMediaPlayer = this.abmMediaPlayer;
            if (abmMediaPlayer != null) {
                abmMediaPlayer.onPlayerProgress((int) (d * 100.0d), ((float) currentPosition) / 1000.0f);
            }
            if (100.0d * d >= this.closeButtonPlaybackPercentage && this.closeButton.getVisibility() == 8) {
                this.closeButton.setVisibility(0);
                increaseTouchableAreaForButton(this.closeButton, 20, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 20);
            }
            if (d >= 1.0d) {
                stopProgressTimer();
            }
            long j = ((duration * this.rewardPlaybackPercentage) / 100) - currentPosition;
            if (j > 0) {
                this.timeRemaining.setText(getString(R$string.reward_in) + convertMillisecondsToMmSs(j));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startAutoScroll() {
        if (this.adType.equalsIgnoreCase(AbmMediaPlayer.REWARDED_CHAPTERS)) {
            stopAutoScroll();
            Timer timer = new Timer();
            this.autoScrollTimer = timer;
            AnonymousClass15 anonymousClass15 = new AnonymousClass15(this);
            long j = this.AUTO_SCROLL_INTERVAL;
            timer.schedule(anonymousClass15, j, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startButtonClickCooldown() {
        this.advertiserIcon.setClickable(false);
        this.closeButton.setClickable(false);
        this.ctaButton.setClickable(false);
        this.adChoicesIcon.setClickable(false);
        new Timer().schedule(new AnonymousClass9(this), 500L);
    }

    private void startChapterAdProgressTimer() {
        stopChapterAdProgressTimer();
        Timer timer = new Timer();
        this.chapterAdProgressTimer = timer;
        timer.schedule(new AnonymousClass14(this), 0L, 100L);
    }

    private void startProgressTimer() {
        if (this.progressTimer != null) {
            return;
        }
        Timer timer = new Timer();
        this.progressTimer = timer;
        timer.schedule(new AnonymousClass7(this), 100L, 1000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void startRewardGrantedAnimation() {
        TextView textView = this.timeRemaining;
        if (textView == null) {
            return;
        }
        textView.animate().alpha(0.0f).setDuration(500L).withEndAction(new AnonymousClass11(this)).start();
        ValueAnimator ofInt = ValueAnimator.ofInt(ContextCompat.getColor(this, R$color.king_green), ContextCompat.getColor(this, R$color.king_orange_dark));
        ofInt.setDuration(500L);
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.king.amp.sa.AbmMediaPlayerActivity.12
            final AbmMediaPlayerActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.this$0.progressBar.setBackgroundTintList(ColorStateList.valueOf(((Integer) valueAnimator.getAnimatedValue()).intValue()));
            }
        });
        ofInt.start();
    }

    private void stopAutoScroll() {
        Timer timer;
        if (this.adType.equalsIgnoreCase(AbmMediaPlayer.REWARDED_CHAPTERS) && (timer = this.autoScrollTimer) != null) {
            timer.cancel();
            this.autoScrollTimer = null;
        }
    }

    private void stopChapterAdProgressTimer() {
        Timer timer = this.chapterAdProgressTimer;
        if (timer != null) {
            timer.cancel();
        }
    }

    private void stopProgressTimer() {
        Timer timer = this.progressTimer;
        if (timer != null) {
            timer.cancel();
            this.progressTimer.purge();
            this.progressTimer = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateChapterText(int i, int i2) {
        List<Map<String, String>> chapterConfigMapList = this.layoutConfig.getChapterConfigMapList();
        String str = chapterConfigMapList.get(i).get("ad_title_text");
        String str2 = chapterConfigMapList.get(i).get("ad_description_text");
        String str3 = chapterConfigMapList.get(i2).get("ad_title_text");
        String str4 = chapterConfigMapList.get(i2).get("ad_description_text");
        if (str != null && str3 != null && !str.equals(str3)) {
            this.title.animate().alpha(0.0f).setDuration(300L).withEndAction(new AnonymousClass16(this, str3)).start();
        }
        if (str2 == null || str4 == null || str2.equals(str4)) {
            return;
        }
        this.description.animate().alpha(0.0f).setDuration(300L).withEndAction(new AnonymousClass17(this, str4)).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.adType.equalsIgnoreCase(AbmMediaPlayer.REWARDED_CHAPTERS)) {
            resumeChapterScroll();
        }
        return super/*android.app.Activity*/.dispatchTouchEvent(motionEvent);
    }

    public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
        Player.Listener._CC.$default$onAvailableCommandsChanged(this, commands);
    }

    public void onBackPressed() {
        Optional<AdProviderNameValuePairs> empty;
        AbmMediaPlayer abmMediaPlayer = this.abmMediaPlayer;
        if (abmMediaPlayer == null) {
            super/*androidx.activity.ComponentActivity*/.onBackPressed();
        } else {
            empty = Optional.empty();
            abmMediaPlayer.onPlayerEvent("close", empty);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (configuration.orientation == 1) {
            this.isDestroyedByRotation = true;
        }
        super.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(Bundle bundle) {
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        setRequestedOrientation(1);
        Bundle extras = getIntent().getExtras();
        setContentView(R$layout.abm_media_player_view);
        setVolumeControlStream(3);
        this.currentPlayerVolume = 0;
        this.lastPlaybackPosition = 0L;
        if (extras == null || extras.isEmpty()) {
            Log.e("AbmMediaPlayerActivity", "Media playback error: Required config is missing.");
            this.playerState = State.Finished;
            AbmMediaPlayer abmMediaPlayer = this.abmMediaPlayer;
            if (abmMediaPlayer != null) {
                abmMediaPlayer.onPlayerDismissed(2, "Media playback error: Required config is missing.");
            }
            finish();
            return;
        }
        String string = extras.getString("ad_type");
        this.adType = string;
        if (string == null) {
            this.adType = "undefined";
        }
        String string2 = extras.getString("layout_configuration");
        if (TextUtils.isEmpty(string2)) {
            Log.e("AbmMediaPlayerActivity", "Media playback error: layout config is empty.");
            this.playerState = State.Finished;
            AbmMediaPlayer abmMediaPlayer2 = this.abmMediaPlayer;
            if (abmMediaPlayer2 != null) {
                abmMediaPlayer2.onPlayerDismissed(4, "Media playback error: layout config is empty.");
            }
            finish();
            return;
        }
        this.layoutConfig = new AbmMediaPlayerLayoutConfig(string2);
        this.abmMediaPlayer = AbmMediaPlayer.getInstance();
        if (this.adType.equalsIgnoreCase(AbmMediaPlayer.REWARDED_SHORT_RV) || this.adType.equalsIgnoreCase(AbmMediaPlayer.REWARDED_LONG_RV)) {
            this.playerView = findViewById(R$id.player_view);
            DefaultRenderersFactory defaultRenderersFactory = new DefaultRenderersFactory(this);
            defaultRenderersFactory.setExtensionRendererMode(2);
            defaultRenderersFactory.setEnableDecoderFallback(true);
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                if (!mediaCodecInfo.isEncoder()) {
                    for (String str : mediaCodecInfo.getSupportedTypes()) {
                        Log.i("AbmMediaPlayerActivity", ">>> Codec: " + mediaCodecInfo.getName() + ", Type: " + str);
                    }
                }
            }
            ExoPlayer build = new ExoPlayer.Builder(this).setRenderersFactory(defaultRenderersFactory).build();
            this.player = build;
            build.addListener(this);
            this.player.setVideoSurface((Surface) null);
            this.player.setVideoSurfaceView((SurfaceView) null);
            this.playerView.setPlayer(this.player);
            this.playerView.setUseController(false);
        } else if (this.adType.equalsIgnoreCase(AbmMediaPlayer.REWARDED_CHAPTERS)) {
            this.chapterView = findViewById(R$id.chapter_view);
            this.chapterAdIndicatorView = (AbmMediaPlayerChapterAdIndicatorView) findViewById(R$id.chapter_indicator_view);
            this.chapterView.setOrientation(1);
        }
        this.playerRootView = findViewById(R$id.player_root_view);
        this.progressBar = findViewById(R$id.progress);
        this.timeRemaining = (TextView) findViewById(R$id.time_remaining);
        this.advertiserIcon = (ImageButton) findViewById(R$id.advertiser_icon);
        this.title = (TextView) findViewById(R$id.title);
        this.description = (TextView) findViewById(R$id.description);
        ImageButton imageButton = (ImageButton) findViewById(R$id.skip_button);
        this.closeButton = imageButton;
        imageButton.setVisibility(0);
        this.closeButton.setClickable(true);
        this.adChoicesIcon = (ImageButton) findViewById(R$id.ad_choices_icon);
        this.ctaButton = (Button) findViewById(R$id.cta_button);
        this.dimBackground = findViewById(R$id.dim_background);
        AbmMediaPlayer abmMediaPlayer3 = this.abmMediaPlayer;
        if (abmMediaPlayer3 != null) {
            abmMediaPlayer3.setRewardGranted(false);
        }
        this.ctaButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.king.amp.sa.AbmMediaPlayerActivity.2
            final AbmMediaPlayerActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Optional<AdProviderNameValuePairs> empty;
                this.this$0.startButtonClickCooldown();
                if (this.this$0.abmMediaPlayer != null) {
                    AbmMediaPlayer abmMediaPlayer4 = this.this$0.abmMediaPlayer;
                    empty = Optional.empty();
                    abmMediaPlayer4.onPlayerEvent("cta", empty);
                }
            }
        });
        this.advertiserIcon.setOnClickListener(new View.OnClickListener(this) { // from class: com.king.amp.sa.AbmMediaPlayerActivity.3
            final AbmMediaPlayerActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Optional<AdProviderNameValuePairs> empty;
                this.this$0.startButtonClickCooldown();
                if (this.this$0.abmMediaPlayer != null) {
                    AbmMediaPlayer abmMediaPlayer4 = this.this$0.abmMediaPlayer;
                    empty = Optional.empty();
                    abmMediaPlayer4.onPlayerEvent(AbmMediaPlayer.USER_ACTION_ADVERTISER_ICON, empty);
                }
            }
        });
        this.adChoicesIcon.setOnClickListener(new View.OnClickListener(this) { // from class: com.king.amp.sa.AbmMediaPlayerActivity.4
            final AbmMediaPlayerActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Optional<AdProviderNameValuePairs> empty;
                this.this$0.startButtonClickCooldown();
                if (this.this$0.abmMediaPlayer != null) {
                    AbmMediaPlayer abmMediaPlayer4 = this.this$0.abmMediaPlayer;
                    empty = Optional.empty();
                    abmMediaPlayer4.onPlayerEvent(AbmMediaPlayer.USER_ACTION_AD_CHOICES_ICON, empty);
                }
            }
        });
        this.closeButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.king.amp.sa.AbmMediaPlayerActivity.5
            final AbmMediaPlayerActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Optional<AdProviderNameValuePairs> empty;
                this.this$0.startButtonClickCooldown();
                if (this.this$0.abmMediaPlayer != null) {
                    AbmMediaPlayer abmMediaPlayer4 = this.this$0.abmMediaPlayer;
                    empty = Optional.empty();
                    abmMediaPlayer4.onPlayerEvent("close", empty);
                }
            }
        });
        this.videoDuration = getIntExtra(extras, "video_duration", 0);
        this.closeButtonPlaybackPercentage = getIntExtra(extras, "close_button_playback_percentage", 0);
        this.rewardPlaybackPercentage = getIntExtra(extras, "reward_playback_percentage", 100);
        if (this.adType.equalsIgnoreCase(AbmMediaPlayer.REWARDED_CHAPTERS)) {
            String string3 = extras.getString("Chapter_configuration");
            if (TextUtils.isEmpty(string3)) {
                Log.e("AbmMediaPlayerActivity", "Media playback error: chapter ad config is empty.");
                this.playerState = State.Finished;
                AbmMediaPlayer abmMediaPlayer4 = this.abmMediaPlayer;
                if (abmMediaPlayer4 != null) {
                    abmMediaPlayer4.onPlayerDismissed(4, "Media playback error: chapter ad config is empty.");
                }
                finish();
                return;
            }
            this.layoutConfig.setChapterConfig(string3);
        } else if (this.adType.equalsIgnoreCase(AbmMediaPlayer.REWARDED_SHORT_RV) || this.adType.equalsIgnoreCase(AbmMediaPlayer.REWARDED_LONG_RV)) {
            String string4 = extras.getString("ad_media");
            if (TextUtils.isEmpty(string4)) {
                Log.e("AbmMediaPlayerActivity", "Media playback error: media path is empty.");
                this.playerState = State.Finished;
                AbmMediaPlayer abmMediaPlayer5 = this.abmMediaPlayer;
                if (abmMediaPlayer5 != null) {
                    abmMediaPlayer5.onPlayerDismissed(2, "Media playback error: media path is empty.");
                }
                finish();
                return;
            }
            MediaItem build2 = new MediaItem.Builder().setUri(Uri.parse(string4)).build();
            ProgressiveMediaSource createMediaSource = new ProgressiveMediaSource.Factory(new DefaultDataSource.Factory(this)).createMediaSource(build2);
            ExoPlayer exoPlayer = this.player;
            if (exoPlayer != null) {
                exoPlayer.addMediaSource(createMediaSource);
                this.player.setMediaItem(build2);
            }
        }
        this.playerRootViewTouchDelegateComposite = new TouchDelegateComposite(this, this.playerRootView);
        initializeUIWithLayoutConfig();
        Bundle bundle2 = new Bundle();
        bundle2.putString("layout_configuration", string2);
        this.promptDialogFragment = AbmMediaPlayerPromptDialogFragment.newInstance(bundle2);
        this.endCardFragment = AbmMediaPlayerEndCardFragment.newInstance(this.layoutConfig, this);
        this.playerState = State.Initialized;
    }

    public /* synthetic */ void onCues(CueGroup cueGroup) {
        Player.Listener._CC.$default$onCues(this, cueGroup);
    }

    public /* synthetic */ void onCues(List list) {
        Player.Listener._CC.$default$onCues(this, list);
    }

    protected void onDestroy() {
        Log.i("AbmMediaPlayerActivity", "onDestroy");
        if (this.isDestroyedByRotation) {
            super.onDestroy();
            return;
        }
        releasePlayer();
        AbmMediaPlayer abmMediaPlayer = this.abmMediaPlayer;
        if (abmMediaPlayer != null) {
            abmMediaPlayer.onPlayerDismissed(0, "Player dismissed in onDestroy().");
        }
        AbmMediaPlayer.resetPlayerAddress();
        this.abmMediaPlayer = null;
        super.onDestroy();
    }

    public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        Player.Listener._CC.$default$onDeviceInfoChanged(this, deviceInfo);
    }

    public /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
        Player.Listener._CC.$default$onDeviceVolumeChanged(this, i, z);
    }

    @Override // com.king.amp.sa.IAbmMediaPlayerEndCardListener
    public void onEndCardAction(String str) {
        Optional<AdProviderNameValuePairs> empty;
        AbmMediaPlayer abmMediaPlayer = this.abmMediaPlayer;
        if (abmMediaPlayer != null) {
            empty = Optional.empty();
            abmMediaPlayer.onPlayerEvent(str, empty);
        }
    }

    public /* synthetic */ void onEvents(Player player, Player.Events events) {
        Player.Listener._CC.$default$onEvents(this, player, events);
    }

    public /* synthetic */ void onIsLoadingChanged(boolean z) {
        Player.Listener._CC.$default$onIsLoadingChanged(this, z);
    }

    public void onIsPlayingChanged(boolean z) {
        if (this.playerState == State.Finished) {
            return;
        }
        if (!z) {
            if (this.progressBarAnimator != null) {
                stopProgressTimer();
                this.progressBarAnimator.pause();
                return;
            }
            return;
        }
        if (this.progressBarAnimator != null) {
            startProgressTimer();
            if (this.progressBarAnimator.isStarted()) {
                this.progressBarAnimator.resume();
            } else {
                this.progressBarAnimator.start();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 24 || i == 25) {
            new Timer().schedule(new TimerTask(this) { // from class: com.king.amp.sa.AbmMediaPlayerActivity.8
                final AbmMediaPlayerActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    Optional<AdProviderNameValuePairs> empty;
                    Optional<AdProviderNameValuePairs> empty2;
                    AudioManager audioManager = (AudioManager) this.this$0.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                    if (audioManager == null) {
                        Log.w("AbmMediaPlayerActivity", "Failed to get AudioManager service.");
                        return;
                    }
                    if (this.this$0.abmMediaPlayer != null) {
                        if (this.this$0.currentSystemVolume == 0 && audioManager.getStreamVolume(3) > 0) {
                            AbmMediaPlayer abmMediaPlayer = this.this$0.abmMediaPlayer;
                            empty2 = Optional.empty();
                            abmMediaPlayer.onPlayerEvent(AbmMediaPlayer.USER_ACTION_UNMUTE, empty2);
                        }
                        if (this.this$0.currentSystemVolume > 0 && audioManager.getStreamVolume(3) == 0) {
                            AbmMediaPlayer abmMediaPlayer2 = this.this$0.abmMediaPlayer;
                            empty = Optional.empty();
                            abmMediaPlayer2.onPlayerEvent(AbmMediaPlayer.USER_ACTION_MUTE, empty);
                        }
                    } else {
                        Log.w("AbmMediaPlayerActivity", "ABM Player is null.");
                    }
                    this.this$0.currentSystemVolume = audioManager.getStreamVolume(3);
                }
            }, 500L);
        }
        return super/*android.app.Activity*/.onKeyUp(i, keyEvent);
    }

    public /* synthetic */ void onLoadingChanged(boolean z) {
        Player.Listener._CC.$default$onLoadingChanged(this, z);
    }

    public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
        Player.Listener._CC.$default$onMediaItemTransition(this, mediaItem, i);
    }

    public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        Player.Listener._CC.$default$onMediaMetadataChanged(this, mediaMetadata);
    }

    public /* synthetic */ void onMetadata(Metadata metadata) {
        Player.Listener._CC.$default$onMetadata(this, metadata);
    }

    protected void onNewIntent(Intent intent) {
        performAction(intent.getExtras());
        super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onPause() {
        Log.i("AbmMediaPlayerActivity", t2.h.t0);
        stopAutoScroll();
        this.isAutoScrollPaused = true;
        super/*androidx.fragment.app.FragmentActivity*/.onPause();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.updatesReceiver);
    }

    public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
        Player.Listener._CC.$default$onPlayWhenReadyChanged(this, z, i);
    }

    public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        Player.Listener._CC.$default$onPlaybackParametersChanged(this, playbackParameters);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPlaybackStateChanged(int i) {
        Optional<AdProviderNameValuePairs> empty;
        Optional<AdProviderNameValuePairs> empty2;
        if (this.adType.equalsIgnoreCase(AbmMediaPlayer.REWARDED_CHAPTERS)) {
            return;
        }
        if (i == 3) {
            AudioManager audioManager = (AudioManager) getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            if (audioManager != null) {
                int streamVolume = audioManager.getStreamVolume(3);
                this.currentSystemVolume = streamVolume;
                AbmMediaPlayer abmMediaPlayer = this.abmMediaPlayer;
                if (abmMediaPlayer != null) {
                    if (streamVolume == 0) {
                        empty2 = Optional.empty();
                        abmMediaPlayer.onPlayerEvent(AbmMediaPlayer.USER_ACTION_MUTE, empty2);
                    } else {
                        empty = Optional.empty();
                        abmMediaPlayer.onPlayerEvent(AbmMediaPlayer.USER_ACTION_UNMUTE, empty);
                    }
                }
            }
            initializeProgressAnimation();
            return;
        }
        if (i != 4) {
            return;
        }
        State state = this.playerState;
        State state2 = State.Finished;
        if (state != state2) {
            this.playerState = state2;
            ExoPlayer exoPlayer = this.player;
            if (exoPlayer != null) {
                this.lastPlaybackPosition = exoPlayer.getCurrentPosition();
                AbmMediaPlayer abmMediaPlayer2 = this.abmMediaPlayer;
                if (abmMediaPlayer2 != null) {
                    abmMediaPlayer2.onPlayerProgress(100, ((float) this.player.getCurrentPosition()) / 1000.0f);
                }
            }
        }
    }

    public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        Player.Listener._CC.$default$onPlaybackSuppressionReasonChanged(this, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPlayerError(PlaybackException playbackException) {
        AbmMediaPlayer abmMediaPlayer = this.abmMediaPlayer;
        if (abmMediaPlayer != null) {
            abmMediaPlayer.onPlayerDismissed(6, "Player error=" + playbackException.errorCode + ", " + PlaybackException.getErrorCodeName(playbackException.errorCode) + ", " + playbackException.getMessage());
        }
        finish();
    }

    public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        Player.Listener._CC.$default$onPlayerErrorChanged(this, playbackException);
    }

    public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
        Player.Listener._CC.$default$onPlayerStateChanged(this, z, i);
    }

    public /* synthetic */ void onPositionDiscontinuity(int i) {
        Player.Listener._CC.$default$onPositionDiscontinuity(this, i);
    }

    public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        Player.Listener._CC.$default$onPositionDiscontinuity(this, positionInfo, positionInfo2, i);
    }

    public /* synthetic */ void onRenderedFirstFrame() {
        Player.Listener._CC.$default$onRenderedFirstFrame(this);
    }

    public /* synthetic */ void onRepeatModeChanged(int i) {
        Player.Listener._CC.$default$onRepeatModeChanged(this, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onResume() {
        Log.i("AbmMediaPlayerActivity", t2.h.u0);
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        LocalBroadcastManager.getInstance(this).registerReceiver(this.updatesReceiver, new IntentFilter("com.king.amp.sa.UPDATE_PLAYER_ACTIVITY"));
        if (this.isAutoScrollPaused) {
            startAutoScroll();
            this.isAutoScrollPaused = false;
        }
    }

    public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        Player.Listener._CC.$default$onShuffleModeEnabledChanged(this, z);
    }

    public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
        Player.Listener._CC.$default$onSkipSilenceEnabledChanged(this, z);
    }

    protected void onStart() {
        ExoPlayer exoPlayer;
        if (this.playerState == State.Initialized && (exoPlayer = this.player) != null) {
            this.playerState = State.Showing;
            exoPlayer.prepare();
            this.currentPlayerVolume = (int) (this.player.getVolume() * 100.0f);
        }
        super.onStart();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onStop() {
        Log.i("AbmMediaPlayerActivity", "onStop");
        if (isFinishing()) {
            Log.i("AbmMediaPlayerActivity", "onStop::finishing");
            releasePlayer();
            AbmMediaPlayer abmMediaPlayer = this.abmMediaPlayer;
            if (abmMediaPlayer != null) {
                abmMediaPlayer.onPlayerDismissed(0, "");
            }
        }
        stopAutoScroll();
        stopChapterAdProgressTimer();
        super.onStop();
    }

    public /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
        Player.Listener._CC.$default$onSurfaceSizeChanged(this, i, i2);
    }

    public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
        Player.Listener._CC.$default$onTimelineChanged(this, timeline, i);
    }

    public /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
        Player.Listener._CC.$default$onTrackSelectionParametersChanged(this, trackSelectionParameters);
    }

    public void onTracksChanged(Tracks tracks) {
        UnmodifiableIterator it = tracks.getGroups().iterator();
        while (it.hasNext()) {
            TrackGroup mediaTrackGroup = ((Tracks.Group) it.next()).getMediaTrackGroup();
            for (int i = 0; i < mediaTrackGroup.length; i++) {
                Log.i("AbmMediaPlayerActivity", "Track Info: " + mediaTrackGroup.getFormat(i).toString());
            }
        }
    }

    public void onVideoSizeChanged(VideoSize videoSize) {
        Player.Listener._CC.$default$onVideoSizeChanged(this, videoSize);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onWindowFocusChanged(boolean z) {
        Optional<AdProviderNameValuePairs> empty;
        Optional<AdProviderNameValuePairs> empty2;
        super/*android.app.Activity*/.onWindowFocusChanged(z);
        if (!z) {
            if (this.playerState == State.Finished) {
                return;
            }
            ExoPlayer exoPlayer = this.player;
            if (exoPlayer != null && exoPlayer.isPlaying()) {
                this.player.pause();
            }
            if (this.adType.equalsIgnoreCase(AbmMediaPlayer.REWARDED_CHAPTERS)) {
                stopAutoScroll();
                this.progressBarAnimator.pause();
                stopChapterAdProgressTimer();
            }
            AbmMediaPlayer abmMediaPlayer = this.abmMediaPlayer;
            if (abmMediaPlayer != null) {
                empty = Optional.empty();
                abmMediaPlayer.onPlayerEvent(AbmMediaPlayer.PAUSE, empty);
                return;
            }
            return;
        }
        if (this.playerState == State.Finished) {
            ExoPlayer exoPlayer2 = this.player;
            if (exoPlayer2 != null) {
                exoPlayer2.seekTo(this.lastPlaybackPosition);
            }
            AbmMediaPlayer abmMediaPlayer2 = this.abmMediaPlayer;
            if (abmMediaPlayer2 != null) {
                empty2 = Optional.empty();
                abmMediaPlayer2.onPlayerEvent(AbmMediaPlayer.RESUME, empty2);
                return;
            }
            return;
        }
        ExoPlayer exoPlayer3 = this.player;
        if (exoPlayer3 != null && !exoPlayer3.isPlaying()) {
            this.player.play();
        }
        if (this.adType.equalsIgnoreCase(AbmMediaPlayer.REWARDED_CHAPTERS)) {
            startAutoScroll();
            if (this.progressBarAnimator.isStarted()) {
                this.progressBarAnimator.resume();
            } else {
                this.progressBarAnimator.start();
            }
            startChapterAdProgressTimer();
        }
    }

    public void pauseChapterScroll() {
        Log.d("AbmMediaPlayerActivity", "pauseChapterScroll");
        stopAutoScroll();
    }
}

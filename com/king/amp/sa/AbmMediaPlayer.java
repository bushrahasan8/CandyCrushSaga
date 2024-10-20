package com.king.amp.sa;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.drive.DriveFile;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Keep
/* loaded from: AbmMediaPlayer.class */
public class AbmMediaPlayer {
    public static final int BrowserError = 9;
    public static final String CURRENT_PAGE = "current_page";
    public static final String DISMISS = "dismiss";
    public static final String DISMISS_END_CARD = "dismiss_end_card";
    public static final String DISMISS_PROMPT = "dismiss_prompt";
    public static final int FileError = 3;
    public static final String INTERACTIVE_AD = "interactive";
    public static final String IS_MANUALLY_SCROLLED = "is_manually_scrolled";
    public static final int InvalidParameter = 2;
    public static final int LayoutError = 4;
    public static final int NoError = 0;
    public static final int NotInitialized = 1;
    public static final String OPEN_URL = "open_url";
    public static final String PAUSE = "pause";
    public static final String PREVIOUS_PAGE = "previous_page";
    public static final int PlaybackError = 6;
    public static final String RESUME = "resume";
    public static final String REWARDED_CHAPTERS = "chapters";
    public static final String REWARDED_LONG_RV = "rv_trueview";
    public static final String REWARDED_SHORT_RV = "rv_shortform";
    public static final String REWARD_GRANTED = "reward_granted";
    public static final String SHOW_END_CARD = "show_end_card";
    public static final String SHOW_PROMPT = "show_prompt";
    private static String TAG = "AbmMediaPlayer";
    public static final String UNDEFINED = "undefined";
    public static final String USER_ACTION_ADVERTISER_ICON = "ad_icon";
    public static final String USER_ACTION_AD_CHOICES_ICON = "ad_choices_icon";
    public static final String USER_ACTION_CLOSE = "close";
    public static final String USER_ACTION_CTA = "cta";
    public static final String USER_ACTION_END_CARD_CLOSE = "end_card_close";
    public static final String USER_ACTION_END_CARD_CTA = "end_card_cta";
    public static final String USER_ACTION_END_CARD_SHOWN = "end_card_shown";
    public static final String USER_ACTION_MUTE = "mute";
    public static final String USER_ACTION_NAVIGATE = "navigate";
    public static final String USER_ACTION_PAGE_CHANGED = "page_changed";
    public static final String USER_ACTION_PROMPT_CLOSE = "prompt_close";
    public static final String USER_ACTION_PROMPT_CONTINUE = "prompt_continue";
    public static final String USER_ACTION_UNMUTE = "unmute";
    public static final int Undefined = 8;
    private static String sAdType;
    private static Context sContext;
    private static AbmMediaPlayer sInstance;
    private static InteractiveAd sInteractiveAd;
    private boolean mRewardGranted = false;
    private AtomicLong mPlayerObjAddress = new AtomicLong(0);

    public static boolean action(String str) {
        AbmMediaPlayer abmMediaPlayer = sInstance;
        if (abmMediaPlayer == null || abmMediaPlayer.mPlayerObjAddress.get() == 0) {
            return false;
        }
        if (sAdType.equals(INTERACTIVE_AD)) {
            sInteractiveAd.action(str);
            return true;
        }
        sInstance.actionIntent(str);
        return true;
    }

    public static void dismiss() {
        action(DISMISS);
    }

    public static AbmMediaPlayer getInstance() {
        AbmMediaPlayer abmMediaPlayer;
        synchronized (AbmMediaPlayer.class) {
            try {
                if (sInstance == null) {
                    sInstance = new AbmMediaPlayer();
                }
                abmMediaPlayer = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return abmMediaPlayer;
    }

    public static boolean isActivityRunningInForeground(Context context, Class<? extends AppCompatActivity> cls) {
        ComponentName componentName;
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) context.getSystemService("activity")).getAppTasks();
        if (appTasks.isEmpty()) {
            return false;
        }
        Iterator<ActivityManager.AppTask> it = appTasks.iterator();
        while (it.hasNext()) {
            componentName = it.next().getTaskInfo().topActivity;
            if (componentName.getClassName().equals(cls.getName())) {
                Log.i(TAG, "Activity " + cls.getName() + " is running");
                return true;
            }
        }
        return false;
    }

    public static void pause() {
        action(PAUSE);
    }

    public static void play(Map<String, String> map, String str, String str2) {
        Intent intent = new Intent(sContext, (Class<?>) AbmMediaPlayerActivity.class);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            intent.putExtra(entry.getKey(), entry.getValue());
        }
        intent.putExtra("layout_configuration", str);
        intent.putExtra("Chapter_configuration", str2);
        intent.setFlags(DriveFile.MODE_READ_ONLY);
        sContext.startActivity(intent);
        sInstance.onPlayerAppeared();
    }

    public static native void playerAppeared(long j);

    public static native void playerDismissed(long j, int i, String str);

    public static native void playerEvent(long j, String str, AdProviderNameValuePairs adProviderNameValuePairs);

    public static native void playerProgress(long j, int i, float f);

    public static void resetPlayerAddress() {
        AbmMediaPlayer abmMediaPlayer = sInstance;
        if (abmMediaPlayer != null) {
            abmMediaPlayer.mPlayerObjAddress.set(0L);
        }
    }

    public static void resume() {
        action(RESUME);
    }

    public static void rewardGranted() {
        AbmMediaPlayer abmMediaPlayer = sInstance;
        if (abmMediaPlayer != null) {
            abmMediaPlayer.setRewardGranted(true);
        }
        action(REWARD_GRANTED);
    }

    public static void setContext(Activity activity) {
        sContext = activity.getApplicationContext();
    }

    public static void show(long j, String[] strArr, String str, String str2) {
        if (sContext == null) {
            Utils.log("AbmMediaPlayer", "Context to launch AbmMediaPlayer is null.");
            return;
        }
        if (sInstance == null) {
            getInstance();
        }
        sInstance.mPlayerObjAddress = new AtomicLong(j);
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= strArr.length) {
                break;
            }
            if (i2 < strArr.length) {
                hashMap.put(strArr[i], strArr[i2]);
            }
            i += 2;
        }
        String str3 = (String) hashMap.get("ad_type");
        sAdType = str3;
        if (str3.equals(INTERACTIVE_AD)) {
            showInteractiveAd(hashMap, str);
            return;
        }
        if (sAdType.equals(REWARDED_LONG_RV) || sAdType.equals(REWARDED_SHORT_RV) || sAdType.equals(REWARDED_CHAPTERS)) {
            play(hashMap, str, str2);
            return;
        }
        Utils.log("AbmMediaPlayer", "Config ad type " + sAdType + " is not supported.");
        playerDismissed(sInstance.mPlayerObjAddress.get(), 6, "Invalid ad type " + sAdType);
    }

    public static void showInteractiveAd(Map<String, String> map, String str) {
        sInteractiveAd = new InteractiveAd();
        String str2 = map.get("ad_media");
        String str3 = map.get("video_duration");
        long parseLong = str3 != null ? Long.parseLong(str3) : 30L;
        InteractiveAd.setContext(sContext);
        sInteractiveAd.show(str2, parseLong, str);
    }

    public void actionIntent(String str) {
        if (isActivityRunningInForeground(sContext, AbmMediaPlayerActivity.class)) {
            Intent intent = new Intent();
            intent.setAction("com.king.amp.sa.UPDATE_PLAYER_ACTIVITY");
            intent.putExtra(str, true);
            LocalBroadcastManager.getInstance(sContext).sendBroadcast(intent);
            return;
        }
        Intent intent2 = new Intent(sContext, (Class<?>) AbmMediaPlayerActivity.class);
        intent2.setFlags(DriveFile.MODE_READ_ONLY);
        intent2.putExtra(str, true);
        sContext.startActivity(intent2);
    }

    public boolean isRewardGranted() {
        return this.mRewardGranted;
    }

    public void onPlayerAppeared() {
        playerAppeared(this.mPlayerObjAddress.get());
    }

    public void onPlayerDismissed(int i, String str) {
        playerDismissed(this.mPlayerObjAddress.get(), i, str);
    }

    public void onPlayerEvent(String str, Optional<AdProviderNameValuePairs> optional) {
        boolean isPresent;
        AdProviderNameValuePairs adProviderNameValuePairs;
        Object obj;
        isPresent = optional.isPresent();
        if (isPresent) {
            obj = optional.get();
            adProviderNameValuePairs = (AdProviderNameValuePairs) obj;
        } else {
            adProviderNameValuePairs = null;
        }
        playerEvent(this.mPlayerObjAddress.get(), str, adProviderNameValuePairs);
    }

    public void onPlayerProgress(int i, float f) {
        playerProgress(this.mPlayerObjAddress.get(), i, f);
    }

    public void setRewardGranted(boolean z) {
        this.mRewardGranted = z;
    }
}

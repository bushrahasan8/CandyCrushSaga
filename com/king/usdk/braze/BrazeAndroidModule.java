package com.king.usdk.braze;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.annotation.Keep;
import com.braze.Braze;
import com.braze.BrazeActivityLifecycleCallbackListener;
import com.braze.configuration.BrazeConfig;
import com.braze.enums.inappmessage.Orientation;
import com.braze.events.IEventSubscriber;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.models.inappmessage.MessageButton;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.InAppMessageCloser;
import com.braze.ui.inappmessage.InAppMessageOperation;
import com.braze.ui.inappmessage.listeners.IHtmlInAppMessageActionListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener;
import com.ironsource.t2;
import com.king.usdk.logger.Logger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Keep
/* loaded from: BrazeAndroidModule.class */
public class BrazeAndroidModule implements IInAppMessageManagerListener, IHtmlInAppMessageActionListener, IEventSubscriber<NoMatchingTriggerEvent> {
    private Activity mActivity;
    private long mBrazeAndroidPointer;
    private Context mContext;
    private Boolean mEnableAnimation;
    private String mExternalUserId;
    private ForcedIGPOrientation mForcedIGPOrientation;
    private final Logger mLogger;
    private Handler mMainHandler;
    private final Lock mNativeCallbackLock = new ReentrantLock();
    private String noShowCampaignKey = "NoShowCampaign";
    private AtomicBoolean mAllowInAppMessages = new AtomicBoolean(true);
    private AtomicBoolean mInitialised = new AtomicBoolean(false);

    /* loaded from: BrazeAndroidModule$ForcedIGPOrientation.class */
    public enum ForcedIGPOrientation {
        NONE,
        PORTRAIT,
        LANDSCAPE
    }

    /* loaded from: BrazeAndroidModule$ReasonType.class */
    public enum ReasonType {
        NOTHING_TO_SHOW,
        IGPS_DISABLED,
        LOAD_NOT_ON_TIME,
        TIMEOUT
    }

    public BrazeAndroidModule(Activity activity, long j, long j2, boolean z, ForcedIGPOrientation forcedIGPOrientation, boolean z2) {
        this.mForcedIGPOrientation = ForcedIGPOrientation.NONE;
        this.mEnableAnimation = Boolean.TRUE;
        this.mActivity = activity;
        this.mContext = activity.getApplicationContext();
        this.mLogger = new Logger(j, z);
        this.mBrazeAndroidPointer = j2;
        this.mForcedIGPOrientation = forcedIGPOrientation;
        this.mEnableAnimation = Boolean.valueOf(z2);
        this.mMainHandler = new Handler(this.mActivity.getApplicationContext().getMainLooper());
    }

    private boolean callNativeIsInAppMessageOnTime() {
        boolean z;
        this.mNativeCallbackLock.lock();
        try {
            long j = this.mBrazeAndroidPointer;
            z = false;
            if (j != 0) {
                z = isInAppMessageOnTime(j);
            }
        } catch (Throwable th) {
            z = false;
        }
        this.mNativeCallbackLock.unlock();
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void configureBraze(Activity activity, String str, String str2, String str3, int i, String str4, String str5, int i2, boolean z, int i3) {
        BrazeConfig.Builder triggerActionMinimumTimeIntervalSeconds = new BrazeConfig.Builder().setApiKey(str).setCustomEndpoint(str2).setIsFirebaseCloudMessagingRegistrationEnabled(true).setFirebaseCloudMessagingSenderIdKey(str3).setDefaultNotificationAccentColor(i).setHandlePushDeepLinksAutomatically(true).setSessionTimeout(i2).setTriggerActionMinimumTimeIntervalSeconds(i3);
        if (!str4.isEmpty()) {
            triggerActionMinimumTimeIntervalSeconds.setSmallNotificationIcon(str4);
        }
        if (!str5.isEmpty()) {
            triggerActionMinimumTimeIntervalSeconds.setLargeNotificationIcon(str5);
        }
        Braze.configure(activity, triggerActionMinimumTimeIntervalSeconds.build());
        BrazeLogger.setLogLevel(z ? 2 : Integer.MAX_VALUE);
        BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener = new BrazeActivityLifecycleCallbackListener();
        activity.getApplication().registerActivityLifecycleCallbacks(brazeActivityLifecycleCallbackListener);
        brazeActivityLifecycleCallbackListener.onActivityCreated(activity, new Bundle());
        brazeActivityLifecycleCallbackListener.onActivityStarted(activity);
        brazeActivityLifecycleCallbackListener.onActivityResumed(activity);
    }

    private static native boolean isInAppMessageOnTime(long j);

    private boolean isTestMessage(IInAppMessage iInAppMessage) {
        String triggerId;
        return !(iInAppMessage instanceof InAppMessageBase) || (triggerId = ((InAppMessageBase) iInAppMessage).getTriggerId()) == null || triggerId.isEmpty();
    }

    private void notifyOnMessageInteract(int i, String str, String str2, String[] strArr, String[] strArr2) {
        this.mNativeCallbackLock.lock();
        try {
            long j = this.mBrazeAndroidPointer;
            if (j != 0) {
                onMessageInteract(j, i, str, str2, strArr, strArr2);
            }
        } finally {
            this.mNativeCallbackLock.unlock();
        }
    }

    private void notifyOnMessageShow(int i, String[] strArr, String[] strArr2) {
        this.mNativeCallbackLock.lock();
        try {
            long j = this.mBrazeAndroidPointer;
            if (j != 0) {
                onMessageShow(j, i, strArr, strArr2);
            }
        } finally {
            this.mNativeCallbackLock.unlock();
        }
    }

    private void notifyOnMessageWillNotShow(ReasonType reasonType, String str, String[] strArr, String[] strArr2) {
        this.mNativeCallbackLock.lock();
        try {
            long j = this.mBrazeAndroidPointer;
            if (j != 0) {
                onMessageWillNotShow(j, reasonType.ordinal(), str, strArr, strArr2);
            }
        } finally {
            this.mNativeCallbackLock.unlock();
        }
    }

    private void notifyOnMessageWillShow(int i, String[] strArr, String[] strArr2) {
        this.mNativeCallbackLock.lock();
        try {
            long j = this.mBrazeAndroidPointer;
            if (j != 0) {
                onMessageWillShow(j, i, strArr, strArr2);
            }
        } finally {
            this.mNativeCallbackLock.unlock();
        }
    }

    private static native void onMessageInteract(long j, int i, String str, String str2, String[] strArr, String[] strArr2);

    private static native void onMessageShow(long j, int i, String[] strArr, String[] strArr2);

    private static native void onMessageWillNotShow(long j, int i, String str, String[] strArr, String[] strArr2);

    private static native void onMessageWillShow(long j, int i, String[] strArr, String[] strArr2);

    public void afterInAppMessageViewClosed(IInAppMessage iInAppMessage) {
    }

    public void afterInAppMessageViewOpened(View view, IInAppMessage iInAppMessage) {
        Map extras = iInAppMessage.getExtras();
        notifyOnMessageShow(iInAppMessage.getMessageType().ordinal(), (String[]) extras.keySet().toArray(new String[0]), (String[]) extras.values().toArray(new String[0]));
    }

    public InAppMessageOperation beforeInAppMessageDisplayed(IInAppMessage iInAppMessage) {
        if (!this.mAllowInAppMessages.get()) {
            notifyOnMessageWillNotShow(ReasonType.IGPS_DISABLED, "", null, null);
            this.mLogger.d("Discarding in app message as promotions are disabled");
            return InAppMessageOperation.DISCARD;
        }
        this.mLogger.d("processing in app message now");
        Map extras = iInAppMessage.getExtras();
        String[] strArr = (String[]) extras.keySet().toArray(new String[0]);
        String[] strArr2 = (String[]) extras.values().toArray(new String[0]);
        if (isTestMessage(iInAppMessage)) {
            this.mLogger.d("Test campaign. Display right away");
            return InAppMessageOperation.DISPLAY_NOW;
        }
        if (extras.containsKey(this.noShowCampaignKey)) {
            this.mLogger.d("Not displaying. It's a NO SHOW In App Message");
            notifyOnMessageWillNotShow(ReasonType.NOTHING_TO_SHOW, "", strArr, strArr2);
            return InAppMessageOperation.REENQUEUE;
        }
        if (!callNativeIsInAppMessageOnTime()) {
            notifyOnMessageWillNotShow(ReasonType.LOAD_NOT_ON_TIME, "", strArr, strArr2);
            this.mLogger.d("Not displaying. In App Message is NOT ON TIME");
            return InAppMessageOperation.REENQUEUE;
        }
        ForcedIGPOrientation forcedIGPOrientation = this.mForcedIGPOrientation;
        if (forcedIGPOrientation == ForcedIGPOrientation.PORTRAIT) {
            iInAppMessage.setOrientation(Orientation.PORTRAIT);
        } else if (forcedIGPOrientation == ForcedIGPOrientation.LANDSCAPE) {
            iInAppMessage.setOrientation(Orientation.LANDSCAPE);
        }
        iInAppMessage.setAnimateIn(this.mEnableAnimation.booleanValue());
        iInAppMessage.setAnimateOut(this.mEnableAnimation.booleanValue());
        notifyOnMessageWillShow(iInAppMessage.getMessageType().ordinal(), strArr, strArr2);
        return InAppMessageOperation.DISPLAY_NOW;
    }

    public void beforeInAppMessageViewClosed(View view, IInAppMessage iInAppMessage) {
    }

    public void beforeInAppMessageViewOpened(View view, IInAppMessage iInAppMessage) {
    }

    public void configure(String str, String str2, String str3, int i, String str4, String str5, int i2, boolean z, int i3) {
        this.mMainHandler.post(new Runnable(this, str, str2, str3, i, str4, str5, i2, z, i3) { // from class: com.king.usdk.braze.BrazeAndroidModule.1
            final BrazeAndroidModule this$0;
            final int val$accentColor;
            final String val$apiKey;
            final String val$bigIcon;
            final boolean val$enableLog;
            final String val$endPoint;
            final int val$minTriggerTime;
            final String val$senderId;
            final int val$sessionTimeout;
            final String val$smallIcon;

            {
                this.this$0 = this;
                this.val$apiKey = str;
                this.val$endPoint = str2;
                this.val$senderId = str3;
                this.val$accentColor = i;
                this.val$smallIcon = str4;
                this.val$bigIcon = str5;
                this.val$sessionTimeout = i2;
                this.val$enableLog = z;
                this.val$minTriggerTime = i3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.this$0.mInitialised.get()) {
                    return;
                }
                BrazeAndroidModule.configureBraze(this.this$0.mActivity, this.val$apiKey, this.val$endPoint, this.val$senderId, this.val$accentColor, this.val$smallIcon, this.val$bigIcon, this.val$sessionTimeout, this.val$enableLog, this.val$minTriggerTime);
                BrazeInAppMessageManager.getInstance().setCustomInAppMessageManagerListener(this.this$0);
                BrazeInAppMessageManager.getInstance().setCustomHtmlInAppMessageActionListener(this.this$0);
                Braze.getInstance(this.this$0.mContext).subscribeToNoMatchingTriggerForEvent(this.this$0);
                this.this$0.mInitialised.set(true);
                if (this.this$0.mExternalUserId != null) {
                    this.this$0.mLogger.i("setting cached externalUserId [" + this.this$0.mExternalUserId + t2.i.e);
                    BrazeAndroidModule brazeAndroidModule = this.this$0;
                    brazeAndroidModule.setExternalUserId(brazeAndroidModule.mExternalUserId);
                }
            }
        });
    }

    public void disable() {
        this.mAllowInAppMessages.set(false);
    }

    public void disconnectFromNativeSide() {
        this.mNativeCallbackLock.lock();
        try {
            this.mBrazeAndroidPointer = 0L;
            Braze.getInstance(this.mContext).removeSingleSubscription(this, NoMatchingTriggerEvent.class);
            BrazeInAppMessageManager.getInstance().setCustomHtmlInAppMessageActionListener((IHtmlInAppMessageActionListener) null);
            BrazeInAppMessageManager.getInstance().setCustomInAppMessageManagerListener((IInAppMessageManagerListener) null);
        } finally {
            this.mNativeCallbackLock.unlock();
        }
    }

    public void enable() {
        this.mAllowInAppMessages.set(true);
    }

    public boolean isEnabled() {
        return this.mAllowInAppMessages.get();
    }

    public void onCloseClicked(IInAppMessage iInAppMessage, String str, Bundle bundle) {
        Map extras = iInAppMessage.getExtras();
        notifyOnMessageInteract(0, "", str, (String[]) extras.keySet().toArray(new String[0]), (String[]) extras.values().toArray(new String[0]));
    }

    public boolean onCustomEventFired(IInAppMessage iInAppMessage, String str, Bundle bundle) {
        return false;
    }

    public /* bridge */ /* synthetic */ boolean onInAppMessageButtonClicked(IInAppMessage iInAppMessage, MessageButton messageButton) {
        return IInAppMessageManagerListener._CC.$default$onInAppMessageButtonClicked(this, iInAppMessage, messageButton);
    }

    public boolean onInAppMessageButtonClicked(IInAppMessage iInAppMessage, MessageButton messageButton, InAppMessageCloser inAppMessageCloser) {
        Map extras = iInAppMessage.getExtras();
        notifyOnMessageInteract(1, messageButton.getStringId(), messageButton.getUri() != null ? messageButton.getUri().toString().toString() : "", (String[]) extras.keySet().toArray(new String[0]), (String[]) extras.values().toArray(new String[0]));
        return false;
    }

    public /* bridge */ /* synthetic */ boolean onInAppMessageClicked(IInAppMessage iInAppMessage) {
        return IInAppMessageManagerListener._CC.$default$onInAppMessageClicked(this, iInAppMessage);
    }

    public boolean onInAppMessageClicked(IInAppMessage iInAppMessage, InAppMessageCloser inAppMessageCloser) {
        Map extras = iInAppMessage.getExtras();
        notifyOnMessageInteract(1, "", "", (String[]) extras.keySet().toArray(new String[0]), (String[]) extras.values().toArray(new String[0]));
        return false;
    }

    public void onInAppMessageDismissed(IInAppMessage iInAppMessage) {
        Map extras = iInAppMessage.getExtras();
        notifyOnMessageInteract(0, "", "", (String[]) extras.keySet().toArray(new String[0]), (String[]) extras.values().toArray(new String[0]));
    }

    public boolean onNewsfeedClicked(IInAppMessage iInAppMessage, String str, Bundle bundle) {
        return false;
    }

    public boolean onOtherUrlAction(IInAppMessage iInAppMessage, String str, Bundle bundle) {
        Map extras = iInAppMessage.getExtras();
        String[] strArr = (String[]) extras.keySet().toArray(new String[0]);
        String[] strArr2 = (String[]) extras.values().toArray(new String[0]);
        String str2 = new String("");
        if (bundle.containsKey("abButtonId")) {
            str2 = bundle.getString("abButtonId");
        }
        notifyOnMessageInteract(1, str2, str, strArr, strArr2);
        return false;
    }

    public void setExternalUserId(String str) {
        this.mMainHandler.post(new Runnable(this, str) { // from class: com.king.usdk.braze.BrazeAndroidModule.3
            final BrazeAndroidModule this$0;
            final String val$externalUserId;

            {
                this.this$0 = this;
                this.val$externalUserId = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.mLogger.d("setExternalUserId [" + this.val$externalUserId + t2.i.e);
                if (this.this$0.mInitialised.get()) {
                    Braze.getInstance(this.this$0.mActivity).changeUser(this.val$externalUserId);
                } else {
                    this.this$0.mLogger.i("CACHED setExternalUserId [" + this.val$externalUserId + "] received before initialisation");
                }
                this.this$0.mExternalUserId = this.val$externalUserId;
            }
        });
    }

    public void trigger(NoMatchingTriggerEvent noMatchingTriggerEvent) {
        if (noMatchingTriggerEvent.getSourceEventType() == "custom_event") {
            notifyOnMessageWillNotShow(ReasonType.NOTHING_TO_SHOW, "", null, null);
        }
    }

    public void triggerCustomEvent(String str, HashMap<String, Object> hashMap) {
        BrazeProperties brazeProperties = new BrazeProperties();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            brazeProperties.addProperty(entry.getKey(), entry.getValue());
        }
        this.mMainHandler.post(new Runnable(this, str, brazeProperties) { // from class: com.king.usdk.braze.BrazeAndroidModule.2
            final BrazeAndroidModule this$0;
            final String val$eventName;
            final BrazeProperties val$eventProperties;

            {
                this.this$0 = this;
                this.val$eventName = str;
                this.val$eventProperties = brazeProperties;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.mLogger.d("triggerPlacement [" + this.val$eventName + t2.i.e);
                if (this.this$0.mInitialised.get()) {
                    Braze.getInstance(this.this$0.mActivity).logCustomEvent(this.val$eventName, this.val$eventProperties);
                    return;
                }
                this.this$0.mLogger.i("DROPPED triggerPlacement [" + this.val$eventName + "] happening before initialisation");
            }
        });
    }
}

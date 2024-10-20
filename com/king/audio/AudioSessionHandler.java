package com.king.audio;

import android.app.Activity;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.Keep;
import com.unity3d.services.core.device.MimeTypes;
import java.lang.reflect.Method;

@Keep
/* loaded from: AudioSessionHandler.class */
public class AudioSessionHandler implements AudioManager.OnAudioFocusChangeListener {
    private static final String TAG = "AudioSessionHandler";
    private Activity mActivity;
    private AudioAttributesBuilder mAudioAttributesBuilder;
    private AudioDeviceCallback mAudioDeviceCallback;
    private final AudioManager mAudioManager;
    private Method mAudioManagerAbandonAudioFocusRequest;
    private Method mAudioManagerRequestAudioFocus;
    private boolean mIsUsingDeviceSpeaker;
    private long mNativeAudioSessionPtr;
    private final Object mAudioSessionSynchronize = new Object();
    private Object mAudioFocusRequest = null;
    private Object mPlaybackAttributes = null;
    private boolean mPlaybackNowAuthorized = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.king.audio.AudioSessionHandler$4, reason: invalid class name */
    /* loaded from: AudioSessionHandler$4.class */
    public static abstract /* synthetic */ class AnonymousClass4 {
        static final int[] $SwitchMap$com$king$audio$AudioSessionHandler$AudioFocusChangeType;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x002f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                com.king.audio.AudioSessionHandler$AudioFocusChangeType[] r0 = com.king.audio.AudioSessionHandler.AudioFocusChangeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.king.audio.AudioSessionHandler.AnonymousClass4.$SwitchMap$com$king$audio$AudioSessionHandler$AudioFocusChangeType = r0
                r0 = r4
                com.king.audio.AudioSessionHandler$AudioFocusChangeType r1 = com.king.audio.AudioSessionHandler.AudioFocusChangeType.gain     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L14:
                int[] r0 = com.king.audio.AudioSessionHandler.AnonymousClass4.$SwitchMap$com$king$audio$AudioSessionHandler$AudioFocusChangeType     // Catch: java.lang.NoSuchFieldError -> L2b java.lang.NoSuchFieldError -> L2f
                com.king.audio.AudioSessionHandler$AudioFocusChangeType r1 = com.king.audio.AudioSessionHandler.AudioFocusChangeType.loss     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
            L1f:
                int[] r0 = com.king.audio.AudioSessionHandler.AnonymousClass4.$SwitchMap$com$king$audio$AudioSessionHandler$AudioFocusChangeType     // Catch: java.lang.NoSuchFieldError -> L2f java.lang.NoSuchFieldError -> L33
                com.king.audio.AudioSessionHandler$AudioFocusChangeType r1 = com.king.audio.AudioSessionHandler.AudioFocusChangeType.none     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L2a:
                return
            L2b:
                r4 = move-exception
                goto L14
            L2f:
                r4 = move-exception
                goto L1f
            L33:
                r4 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.king.audio.AudioSessionHandler.AnonymousClass4.m6131clinit():void");
        }
    }

    /* loaded from: AudioSessionHandler$AudioAttributesBuilder.class */
    private abstract class AudioAttributesBuilder {
    }

    /* loaded from: AudioSessionHandler$AudioFocusChangeType.class */
    private enum AudioFocusChangeType {
        none,
        gain,
        loss;

        int toInt() {
            int i = AnonymousClass4.$SwitchMap$com$king$audio$AudioSessionHandler$AudioFocusChangeType[ordinal()];
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    return 0;
                }
            }
            return i2;
        }
    }

    /* loaded from: AudioSessionHandler$AudioFocusRequestBuilder.class */
    private class AudioFocusRequestBuilder {
        private Object mAudioFocusRequestBuilder;
        private Method mAudioFocusRequestBuilderBuild;
        private Method mAudioFocusRequestBuilderSetAcceptsDelayedFocusGain;
        private Method mAudioFocusRequestBuilderSetAudioAttributes;
        private Method mAudioFocusRequestBuilderSetOnAudioFocusChangeListener;
        final AudioSessionHandler this$0;

        public AudioFocusRequestBuilder(AudioSessionHandler audioSessionHandler, int i) {
            this.this$0 = audioSessionHandler;
            this.mAudioFocusRequestBuilderSetAudioAttributes = null;
            this.mAudioFocusRequestBuilderSetAcceptsDelayedFocusGain = null;
            this.mAudioFocusRequestBuilderSetOnAudioFocusChangeListener = null;
            this.mAudioFocusRequestBuilderBuild = null;
            this.mAudioFocusRequestBuilder = null;
            try {
                Class<?> cls = Class.forName("android.media.AudioAttributes");
                Class<?> cls2 = Class.forName("android.media.AudioFocusRequest$Builder");
                this.mAudioFocusRequestBuilderSetAudioAttributes = cls2.getDeclaredMethod("setAudioAttributes", cls);
                this.mAudioFocusRequestBuilderSetAcceptsDelayedFocusGain = cls2.getDeclaredMethod("setAcceptsDelayedFocusGain", Boolean.TYPE);
                this.mAudioFocusRequestBuilderSetOnAudioFocusChangeListener = cls2.getDeclaredMethod("setOnAudioFocusChangeListener", AudioManager.OnAudioFocusChangeListener.class, Handler.class);
                this.mAudioFocusRequestBuilderBuild = cls2.getDeclaredMethod("build", null);
                this.mAudioFocusRequestBuilder = cls2.getDeclaredConstructor(Integer.TYPE).newInstance(Integer.valueOf(i));
            } catch (Exception e) {
                throw new AudioSessionException(audioSessionHandler, e.getMessage());
            }
        }
    }

    /* loaded from: AudioSessionHandler$AudioSessionException.class */
    public class AudioSessionException extends Exception {
        final AudioSessionHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioSessionException(AudioSessionHandler audioSessionHandler, String str) {
            super(str);
            this.this$0 = audioSessionHandler;
        }
    }

    public AudioSessionHandler(long j, Activity activity) {
        this.mAudioManagerRequestAudioFocus = null;
        this.mAudioManagerAbandonAudioFocusRequest = null;
        this.mAudioDeviceCallback = null;
        this.mNativeAudioSessionPtr = 0L;
        this.mIsUsingDeviceSpeaker = false;
        this.mActivity = activity;
        this.mAudioManager = (AudioManager) activity.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.mNativeAudioSessionPtr = j;
        try {
            Class<?> cls = Class.forName("android.media.AudioFocusRequest");
            this.mAudioManagerRequestAudioFocus = AudioManager.class.getDeclaredMethod("requestAudioFocus", cls);
            this.mAudioManagerAbandonAudioFocusRequest = AudioManager.class.getDeclaredMethod("abandonAudioFocusRequest", cls);
            new AudioFocusRequestBuilder(this, 1);
        } catch (Exception e) {
            Log.e(TAG, "AudioSessionHandler audioFocusRequest: " + e.toString());
        }
        this.mIsUsingDeviceSpeaker = IsUsingDeviceSpeakerInternal();
        AudioDeviceCallback audioDeviceCallback = new AudioDeviceCallback(this) { // from class: com.king.audio.AudioSessionHandler.1
            final AudioSessionHandler this$0;

            {
                this.this$0 = this;
            }

            private void onAudioDevicesChanged() {
                AudioSessionHandler audioSessionHandler = this.this$0;
                audioSessionHandler.mIsUsingDeviceSpeaker = audioSessionHandler.IsUsingDeviceSpeakerInternal();
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                onAudioDevicesChanged();
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                onAudioDevicesChanged();
            }
        };
        this.mAudioDeviceCallback = audioDeviceCallback;
        this.mAudioManager.registerAudioDeviceCallback(audioDeviceCallback, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AbandonAudioFocusOnUiThread() {
        synchronized (this.mAudioSessionSynchronize) {
            Log.i(TAG, "abandonAudioFocus");
            Object obj = this.mAudioFocusRequest;
            if (obj != null) {
                try {
                    this.mAudioManagerAbandonAudioFocusRequest.invoke(this.mAudioManager, obj);
                } catch (Exception e) {
                    Log.w(TAG, "AudioSession AbandonAudioFocus(): " + e.toString());
                }
            } else {
                AbandonAudioFocusOnUiThreadDeprecated();
            }
            this.mPlaybackNowAuthorized = false;
        }
    }

    private void AbandonAudioFocusOnUiThreadDeprecated() {
        this.mAudioManager.abandonAudioFocus(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean IsUsingDeviceSpeakerInternal() {
        synchronized (this.mAudioSessionSynchronize) {
            try {
                for (AudioDeviceInfo audioDeviceInfo : this.mAudioManager.getDevices(2)) {
                    int type = audioDeviceInfo.getType();
                    if (type == 3 || type == 4 || type == 8 || type == 7 || type == 22) {
                        return false;
                    }
                }
            } catch (Exception e) {
            }
            return true;
        }
    }

    private boolean IsUsingDeviceSpeakerInternalDeprecated() {
        return (this.mAudioManager.isWiredHeadsetOn() || this.mAudioManager.isBluetoothA2dpOn()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RequestAudioFocusOnUiThread() {
        int i;
        synchronized (this.mAudioSessionSynchronize) {
            Log.i(TAG, "requestAudioFocus");
            if (this.mPlaybackNowAuthorized) {
                return;
            }
            Object obj = this.mAudioFocusRequest;
            if (obj != null) {
                try {
                    i = ((Integer) this.mAudioManagerRequestAudioFocus.invoke(this.mAudioManager, obj)).intValue();
                } catch (Exception e) {
                    Log.w(TAG, "AudioSession RequestAudioFocus(): " + e.toString());
                    i = 0;
                }
            } else {
                i = RequestAudioFocusOnUiThreadDeprecated();
            }
            if (i != 1) {
                this.mPlaybackNowAuthorized = false;
            } else {
                this.mPlaybackNowAuthorized = true;
            }
        }
    }

    private int RequestAudioFocusOnUiThreadDeprecated() {
        return this.mAudioManager.requestAudioFocus(this, 3, 1);
    }

    private native void onAudioFocusChangeCallback(long j, int i);

    private void runOnUiThread(Runnable runnable) {
        Activity activity = this.mActivity;
        if (activity != null) {
            activity.runOnUiThread(runnable);
        }
    }

    public void AbandonAudioFocus() {
        runOnUiThread(new Runnable(this) { // from class: com.king.audio.AudioSessionHandler.3
            final AudioSessionHandler this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (this.this$0.mAudioSessionSynchronize) {
                    this.this$0.AbandonAudioFocusOnUiThread();
                }
            }
        });
    }

    public float GetHardwareOutputVolume() {
        float streamVolume;
        synchronized (this.mAudioSessionSynchronize) {
            streamVolume = this.mAudioManager.getStreamVolume(3) / this.mAudioManager.getStreamMaxVolume(3);
        }
        return streamVolume;
    }

    public boolean IsExternalMusicPlaying() {
        synchronized (this.mAudioSessionSynchronize) {
        }
        return false;
    }

    public boolean IsUsingDeviceSpeaker() {
        return this.mAudioDeviceCallback == null ? IsUsingDeviceSpeakerInternal() : this.mIsUsingDeviceSpeaker;
    }

    public void RequestAudioFocus() {
        runOnUiThread(new Runnable(this) { // from class: com.king.audio.AudioSessionHandler.2
            final AudioSessionHandler this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (this.this$0.mAudioSessionSynchronize) {
                    this.this$0.RequestAudioFocusOnUiThread();
                }
            }
        });
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        synchronized (this.mAudioSessionSynchronize) {
            AudioFocusChangeType audioFocusChangeType = AudioFocusChangeType.none;
            if (i == -3) {
                Log.i(TAG, "Lost audio focus temporarily, reducing volume!");
            } else if (i == -2) {
                Log.i(TAG, "Lost audio focus temporarily, silencing music!");
            } else if (i == -1) {
                Log.i(TAG, "Lost audio focus!");
                this.mPlaybackNowAuthorized = false;
                audioFocusChangeType = AudioFocusChangeType.loss;
            } else if (i != 1) {
                Log.i(TAG, "Unknown audio focus change event!");
            } else {
                Log.i(TAG, "Gained audio focus!");
                this.mPlaybackNowAuthorized = true;
                audioFocusChangeType = AudioFocusChangeType.gain;
            }
            onAudioFocusChangeCallback(this.mNativeAudioSessionPtr, audioFocusChangeType.toInt());
        }
    }
}

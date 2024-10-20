package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: AudioBecomingNoisyManager.class */
public final class AudioBecomingNoisyManager {
    private final Context context;
    private final AudioBecomingNoisyReceiver receiver;
    private boolean receiverRegistered;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: AudioBecomingNoisyManager$AudioBecomingNoisyReceiver.class */
    public final class AudioBecomingNoisyReceiver extends BroadcastReceiver implements Runnable {
        private final Handler eventHandler;
        private final EventListener listener;
        final AudioBecomingNoisyManager this$0;

        public AudioBecomingNoisyReceiver(AudioBecomingNoisyManager audioBecomingNoisyManager, Handler handler, EventListener eventListener) {
            this.this$0 = audioBecomingNoisyManager;
            this.eventHandler = handler;
            this.listener = eventListener;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.eventHandler.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.this$0.receiverRegistered) {
                this.listener.onAudioBecomingNoisy();
            }
        }
    }

    /* loaded from: AudioBecomingNoisyManager$EventListener.class */
    public interface EventListener {
        void onAudioBecomingNoisy();
    }

    public AudioBecomingNoisyManager(Context context, Handler handler, EventListener eventListener) {
        this.context = context.getApplicationContext();
        this.receiver = new AudioBecomingNoisyReceiver(this, handler, eventListener);
    }

    public void setEnabled(boolean z) {
        if (z && !this.receiverRegistered) {
            this.context.registerReceiver(this.receiver, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.receiverRegistered = true;
        } else {
            if (z || !this.receiverRegistered) {
                return;
            }
            this.context.unregisterReceiver(this.receiver);
            this.receiverRegistered = false;
        }
    }
}

package com.applovin.mediation;

import android.os.Bundle;

/* loaded from: AppLovinExtras.class */
public class AppLovinExtras {

    /* loaded from: AppLovinExtras$Builder.class */
    public static class Builder {
        private boolean muteAudio;

        public Bundle build() {
            Bundle bundle = new Bundle(1);
            bundle.putBoolean(Keys.MUTE_AUDIO, this.muteAudio);
            return bundle;
        }

        public Builder setMuteAudio(boolean z) {
            this.muteAudio = z;
            return this;
        }
    }

    /* loaded from: AppLovinExtras$Keys.class */
    public static class Keys {
        public static final String KEY_WATERMARK = "google_watermark";
        public static final String MUTE_AUDIO = "mute_audio";

        private Keys() {
        }
    }
}

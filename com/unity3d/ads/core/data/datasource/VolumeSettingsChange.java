package com.unity3d.ads.core.data.datasource;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: VolumeSettingsChange.class */
public abstract class VolumeSettingsChange {

    /* loaded from: VolumeSettingsChange$MuteChange.class */
    public static final class MuteChange extends VolumeSettingsChange {
        private final boolean isMuted;

        public MuteChange(boolean z) {
            super(null);
            this.isMuted = z;
        }

        public static /* synthetic */ MuteChange copy$default(MuteChange muteChange, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = muteChange.isMuted;
            }
            return muteChange.copy(z);
        }

        public final boolean component1() {
            return this.isMuted;
        }

        public final MuteChange copy(boolean z) {
            return new MuteChange(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MuteChange) && this.isMuted == ((MuteChange) obj).isMuted;
        }

        public int hashCode() {
            boolean z = this.isMuted;
            boolean z2 = z;
            if (z) {
                z2 = true;
            }
            return z2 ? 1 : 0;
        }

        public final boolean isMuted() {
            return this.isMuted;
        }

        public String toString() {
            return "MuteChange(isMuted=" + this.isMuted + ')';
        }
    }

    /* loaded from: VolumeSettingsChange$VolumeChange.class */
    public static final class VolumeChange extends VolumeSettingsChange {
        private final double volume;

        public VolumeChange(double d) {
            super(null);
            this.volume = d;
        }

        public static /* synthetic */ VolumeChange copy$default(VolumeChange volumeChange, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                d = volumeChange.volume;
            }
            return volumeChange.copy(d);
        }

        public final double component1() {
            return this.volume;
        }

        public final VolumeChange copy(double d) {
            return new VolumeChange(d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VolumeChange) && Double.compare(this.volume, ((VolumeChange) obj).volume) == 0;
        }

        public final double getVolume() {
            return this.volume;
        }

        public int hashCode() {
            return VolumeSettingsChange$VolumeChange$$ExternalSyntheticBackport0.m(this.volume);
        }

        public String toString() {
            return "VolumeChange(volume=" + this.volume + ')';
        }
    }

    private VolumeSettingsChange() {
    }

    public /* synthetic */ VolumeSettingsChange(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

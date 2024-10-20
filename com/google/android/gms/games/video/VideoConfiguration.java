package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class(creator = "VideoConfigurationCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: VideoConfiguration.class */
public final class VideoConfiguration extends AbstractSafeParcelable {
    public static final int CAPTURE_MODE_FILE = 0;
    public static final int CAPTURE_MODE_STREAM = 1;
    public static final int CAPTURE_MODE_UNKNOWN = -1;
    public static final Parcelable.Creator<VideoConfiguration> CREATOR = new zzb();
    public static final int NUM_CAPTURE_MODE = 2;
    public static final int NUM_QUALITY_LEVEL = 4;
    public static final int QUALITY_LEVEL_FULLHD = 3;
    public static final int QUALITY_LEVEL_HD = 1;
    public static final int QUALITY_LEVEL_SD = 0;
    public static final int QUALITY_LEVEL_UNKNOWN = -1;
    public static final int QUALITY_LEVEL_XHD = 2;

    @SafeParcelable.Field(getter = "getQualityLevel", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getCaptureMode", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "shouldShowToastAfterRecording", id = 7)
    private final boolean zzc;

    @SafeParcelable.Field(getter = "getCameraEnabled", id = 8)
    private final boolean zzd;

    @SafeParcelable.Field(getter = "getMicEnabled", id = 9)
    private final boolean zze;

    /* loaded from: VideoConfiguration$Builder.class */
    public static final class Builder {
        private int zza;
        private int zzb;
        private boolean zzd = true;
        private boolean zze = true;
        private boolean zzc = true;

        public Builder(int i, int i2) {
            this.zza = i;
            this.zzb = i2;
        }

        public VideoConfiguration build() {
            return new VideoConfiguration(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }

        public Builder setCameraEnabled(boolean z) {
            this.zzd = z;
            return this;
        }

        public Builder setCaptureMode(int i) {
            this.zzb = i;
            return this;
        }

        public Builder setMicEnabled(boolean z) {
            this.zze = z;
            return this;
        }

        public Builder setQualityLevel(int i) {
            this.zza = i;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: VideoConfiguration$ValidCaptureModes.class */
    public @interface ValidCaptureModes {
    }

    @SafeParcelable.Constructor
    public VideoConfiguration(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 7) boolean z, @SafeParcelable.Param(id = 8) boolean z2, @SafeParcelable.Param(id = 9) boolean z3) {
        Preconditions.checkArgument(isValidQualityLevel(i, false));
        Preconditions.checkArgument(isValidCaptureMode(i2, false));
        this.zza = i;
        this.zzb = i2;
        this.zzc = z;
        this.zzd = z2;
        this.zze = z3;
    }

    public static boolean isValidCaptureMode(int i, boolean z) {
        if (i != -1) {
            z = true;
            if (i != 0) {
                z = true;
                if (i != 1) {
                    return false;
                }
            }
        }
        return z;
    }

    public static boolean isValidQualityLevel(int i, boolean z) {
        if (i != -1) {
            z = true;
            if (i != 0) {
                z = true;
                if (i != 1) {
                    z = true;
                    if (i != 2) {
                        z = true;
                        if (i != 3) {
                            return false;
                        }
                    }
                }
            }
        }
        return z;
    }

    public boolean getCameraEnabled() {
        return this.zzd;
    }

    public int getCaptureMode() {
        return this.zzb;
    }

    public boolean getMicEnabled() {
        return this.zze;
    }

    public int getQualityLevel() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getQualityLevel());
        SafeParcelWriter.writeInt(parcel, 2, getCaptureMode());
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 8, getCameraEnabled());
        SafeParcelWriter.writeBoolean(parcel, 9, getMicEnabled());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

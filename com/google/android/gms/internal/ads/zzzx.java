package com.google.android.gms.internal.ads;

/* loaded from: zzzx.class */
final class zzzx implements zzdm {
    private static final zzfxu zza = zzfxx.zza(new zzfxu() { // from class: com.google.android.gms.internal.ads.zzzv
        @Override // com.google.android.gms.internal.ads.zzfxu
        public final Object zza() {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                Object invoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                invoke.getClass();
                return (zzdm) invoke;
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    });

    private zzzx() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzzx(zzzw zzzwVar) {
    }
}

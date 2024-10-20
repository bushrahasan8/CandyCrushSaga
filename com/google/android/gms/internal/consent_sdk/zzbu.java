package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Objects;

/* loaded from: zzbu.class */
public final class zzbu extends WebView {
    private final Handler zza;
    private final zzca zzb;
    private boolean zzc;

    public zzbu(zzbw zzbwVar, Handler handler, zzca zzcaVar) {
        super(zzbwVar);
        this.zzc = false;
        this.zza = handler;
        this.zzb = zzcaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zzf(zzbu zzbuVar, String str) {
        return str != null && str.startsWith("consent://");
    }

    public final void zzc() {
        final zzca zzcaVar = this.zzb;
        Objects.requireNonNull(zzcaVar);
        this.zza.post(new Runnable(zzcaVar) { // from class: com.google.android.gms.internal.consent_sdk.zzbr
            public final zzca zza;

            {
                this.zza = zzcaVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc();
            }
        });
    }

    public final void zzd(String str, String str2) {
        final String str3 = str + "(" + str2 + ");";
        this.zza.post(new Runnable(this, str3) { // from class: com.google.android.gms.internal.consent_sdk.zzbq
            public final zzbu zza;
            public final String zzb;

            {
                this.zza = this;
                this.zzb = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzcs.zza(this.zza, this.zzb);
            }
        });
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: zzctl.class */
public final class zzctl implements zzayq {
    private zzcjk zza;
    private final Executor zzb;
    private final zzcsx zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcta zzg = new zzcta();

    public zzctl(Executor executor, zzcsx zzcsxVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcsxVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final JSONObject zzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable(this, zzb) { // from class: com.google.android.gms.internal.ads.zzctk
                    public final zzctl zza;
                    public final JSONObject zzb;

                    {
                        this.zza = this;
                        this.zzb = zzb;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzd(this.zzb);
                    }
                });
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e);
        }
    }

    public final void zza() {
        this.zze = false;
    }

    public final void zzb() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzayq
    public final void zzby(zzayp zzaypVar) {
        boolean z = this.zzf ? false : zzaypVar.zzj;
        zzcta zzctaVar = this.zzg;
        zzctaVar.zza = z;
        zzctaVar.zzd = this.zzd.elapsedRealtime();
        this.zzg.zzf = zzaypVar;
        if (this.zze) {
            zzg();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(JSONObject jSONObject) {
        this.zza.zzl("AFMA_updateActiveView", jSONObject);
    }

    public final void zze(boolean z) {
        this.zzf = z;
    }

    public final void zzf(zzcjk zzcjkVar) {
        this.zza = zzcjkVar;
    }
}

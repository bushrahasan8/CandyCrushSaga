package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: zzbsj.class */
public final class zzbsj implements zzgdu {
    private final zzbrp zza;
    private final zzbrq zzb;
    private final String zzc = "google.afma.activeView.handleUpdate";
    private final ListenableFuture zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbsj(ListenableFuture listenableFuture, String str, zzbrq zzbrqVar, zzbrp zzbrpVar) {
        this.zzd = listenableFuture;
        this.zzb = zzbrqVar;
        this.zza = zzbrpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final ListenableFuture zzb(final Object obj) {
        return zzgen.zzn(this.zzd, new zzgdu(this, obj) { // from class: com.google.android.gms.internal.ads.zzbsh
            public final zzbsj zza;
            public final Object zzb;

            {
                this.zza = this;
                this.zzb = obj;
            }

            @Override // com.google.android.gms.internal.ads.zzgdu
            public final ListenableFuture zza(Object obj2) {
                return this.zza.zzc(this.zzb, (zzbrk) obj2);
            }
        }, zzcep.zzf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzc(Object obj, zzbrk zzbrkVar) throws Exception {
        zzceu zzceuVar = new zzceu();
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzbnf.zzo.zzc(uuid, new zzbsi(this, zzceuVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbrkVar.zzl(this.zzc, jSONObject);
        return zzceuVar;
    }
}

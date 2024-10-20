package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* loaded from: zzfqf.class */
public abstract class zzfqf extends AsyncTask {
    private zzfqg zza;
    protected final zzfpx zzd;

    public zzfqf(zzfpx zzfpxVar) {
        this.zzd = zzfpxVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfqg zzfqgVar = this.zza;
        if (zzfqgVar != null) {
            zzfqgVar.zza(this);
        }
    }

    public final void zzb(zzfqg zzfqgVar) {
        this.zza = zzfqgVar;
    }
}

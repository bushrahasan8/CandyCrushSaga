package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* loaded from: zzbvm.class */
final class zzbvm implements DialogInterface.OnClickListener {
    final zzbvn zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvm(zzbvn zzbvnVar) {
        this.zza = zzbvnVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzh("Operation denied by user.");
    }
}

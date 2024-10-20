package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* loaded from: zzbvs.class */
final class zzbvs implements DialogInterface.OnClickListener {
    final zzbvt zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvs(zzbvt zzbvtVar) {
        this.zza = zzbvtVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzh("User canceled the download.");
    }
}

package com.google.android.gms.internal.play_games_inputmapping;

import java.util.logging.Level;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: zzcq.class */
final class zzcq extends zzcg {
    private final String zza;
    private final Level zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcq(String str, @NullableDecl String str2, boolean z, boolean z2, Level level, boolean z3) {
        super(str2);
        this.zza = "";
        this.zzb = level;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbc
    public final boolean zzb(Level level) {
        return true;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbc
    public final void zzc(zzba zzbaVar) {
        String str = (String) zzbaVar.zzl().zzd(zzau.zza);
        String str2 = str;
        if (str == null) {
            str2 = zza();
        }
        String str3 = str2;
        if (str2 == null) {
            String zza = zzbaVar.zzg().zza();
            int indexOf = zza.indexOf(36, zza.lastIndexOf(46));
            str3 = zza;
            if (indexOf >= 0) {
                str3 = zza.substring(0, indexOf);
            }
        }
        zzcr.zzf(zzbaVar, zzck.zza(this.zza, str3, true), false, this.zzb);
    }
}

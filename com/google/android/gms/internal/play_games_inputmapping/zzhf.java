package com.google.android.gms.internal.play_games_inputmapping;

import java.io.IOException;

/* loaded from: zzhf.class */
final class zzhf extends zzhd {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhd
    public final /* synthetic */ void zza(Object obj, Object obj2) {
        ((zzfc) obj).zzc = (zzhe) obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhd
    public final /* synthetic */ Object zzb(Object obj) {
        return ((zzfc) obj).zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhd
    public final void zzc(Object obj) {
        zzhe zzheVar = ((zzfc) obj).zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhd
    public final /* synthetic */ void zzd(Object obj, zzhu zzhuVar) throws IOException {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhd
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        zzhe zzheVar = (zzhe) obj2;
        return zzheVar.equals(zzhe.zza()) ? obj : zzhe.zzb((zzhe) obj, zzheVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhd
    public final /* synthetic */ int zzf(Object obj) {
        return ((zzhe) obj).zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhd
    public final /* synthetic */ int zzg(Object obj) {
        return ((zzhe) obj).zzd();
    }
}

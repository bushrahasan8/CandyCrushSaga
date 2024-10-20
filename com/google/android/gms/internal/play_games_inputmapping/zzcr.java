package com.google.android.gms.internal.play_games_inputmapping;

import android.util.Log;
import com.onetrust.otpublishers.headless.Public.OTCCPAGeolocationConstants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* loaded from: zzcr.class */
public final class zzcr extends zzcg {
    private static final Set zza;
    private static final zzbo zzb;
    private final String zzc;
    private final Level zzd;

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zzaa.zza, zzau.zza)));
        zza = unmodifiableSet;
        zzb = zzbr.zza(unmodifiableSet).zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcr(String str, String str2, boolean z, boolean z2, Level level, byte[] bArr) {
        super(str2);
        this.zzc = zzck.zza("", str2, true);
        this.zzd = level;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzf(zzba zzbaVar, String str, boolean z, Level level) {
        String sb;
        zzby zzh = zzby.zzh(zzbg.zzg(), zzbaVar.zzl());
        int intValue = zzbaVar.zze().intValue();
        int intValue2 = level.intValue();
        if (intValue < intValue2 || zzce.zzc(zzbaVar, zzh, zza)) {
            StringBuilder sb2 = new StringBuilder();
            if (intValue >= intValue2 || zzbaVar.zzh() == null) {
                zzav.zza(zzbaVar, sb2);
                zzce.zza(zzh, zzb, sb2);
            } else {
                sb2.append("(REDACTED) ");
                sb2.append(zzbaVar.zzh().zzb());
            }
            sb = sb2.toString();
        } else {
            sb = zzce.zzb(zzbaVar);
        }
        Throwable th = (Throwable) zzbaVar.zzl().zzd(zzaa.zza);
        int zzb2 = zzck.zzb(zzbaVar.zze());
        if (zzb2 == 2) {
            Log.v(str, sb, th);
            return;
        }
        if (zzb2 == 3) {
            Log.d(str, sb, th);
            return;
        }
        if (zzb2 == 4) {
            Log.i(str, sb, th);
        } else if (zzb2 != 5) {
            Log.e(str, sb, th);
        } else {
            Log.w(str, sb, th);
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbc
    public final boolean zzb(Level level) {
        int zzb2 = zzck.zzb(level);
        return Log.isLoggable(this.zzc, zzb2) || Log.isLoggable(OTCCPAGeolocationConstants.ALL, zzb2);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbc
    public final void zzc(zzba zzbaVar) {
        zzf(zzbaVar, this.zzc, false, this.zzd);
    }
}

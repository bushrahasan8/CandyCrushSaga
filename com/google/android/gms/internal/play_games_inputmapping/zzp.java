package com.google.android.gms.internal.play_games_inputmapping;

import com.google.android.gms.internal.play_games_inputmapping.zzao;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: zzp.class */
public abstract class zzp<API extends zzao<API>> {
    private final zzbc zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzp(zzbc zzbcVar) {
        this.zza = zzbcVar;
    }

    private static void zzg(String str, zzba zzbaVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(TimeUnit.NANOSECONDS.toMillis(zzbaVar.zzf()))));
        sb.append(": logging error [");
        zzaf zzg = zzbaVar.zzg();
        if (zzg != zzaf.zza) {
            sb.append(zzg.zza());
            sb.append('.');
            sb.append(zzg.zzb());
            sb.append(':');
            sb.append(zzg.zzc());
        }
        sb.append("]: ");
        sb.append(str);
        PrintStream printStream = System.err;
        printStream.println(sb);
        printStream.flush();
    }

    public abstract zzao zza(Level level);

    public final zzao zzb() {
        return zza(Level.WARNING);
    }

    public final zzao zzc() {
        return zza(Level.INFO);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzd() {
        return this.zza.zza();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zze(Level level) {
        return this.zza.zzb(level);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf(zzba zzbaVar) {
        try {
            zzdu zzc = zzdu.zzc();
            try {
                if (zzc.zzb() <= 100) {
                    this.zza.zzc(zzbaVar);
                } else {
                    zzg("unbounded recursion in log statement", zzbaVar);
                }
                zzc.close();
            } finally {
            }
        } catch (RuntimeException e) {
            try {
                this.zza.zzd(e, zzbaVar);
            } catch (zzbd e2) {
                throw e2;
            } catch (RuntimeException e3) {
                String name = e3.getClass().getName();
                String message = e3.getMessage();
                StringBuilder sb = new StringBuilder(name.length() + 2 + String.valueOf(message).length());
                sb.append(name);
                sb.append(": ");
                sb.append(message);
                zzg(sb.toString(), zzbaVar);
                try {
                    e3.printStackTrace(System.err);
                } catch (RuntimeException e4) {
                }
            }
        }
    }
}

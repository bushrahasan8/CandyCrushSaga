package com.google.android.gms.internal.ads;

import com.ironsource.m4;
import com.ironsource.t2;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* loaded from: zzare.class */
public class zzare extends zzaqa {
    private final Object zza;
    private final zzaqf zzb;

    public zzare(int i, String str, zzaqf zzaqfVar, zzaqe zzaqeVar) {
        super(i, str, zzaqeVar);
        this.zza = new Object();
        this.zzb = zzaqfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaqa
    public final zzaqg zzh(zzapw zzapwVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzapwVar.zzb;
            Map map = zzapwVar.zzc;
            if (map == null) {
                str2 = "ISO-8859-1";
            } else {
                String str3 = (String) map.get(m4.J);
                str2 = "ISO-8859-1";
                if (str3 != null) {
                    String[] split = str3.split(";", 0);
                    int i = 1;
                    while (true) {
                        str2 = "ISO-8859-1";
                        if (i >= split.length) {
                            break;
                        }
                        String[] split2 = split[i].trim().split(t2.i.b, 0);
                        if (split2.length == 2 && split2[0].equals(m4.L)) {
                            str2 = split2[1];
                            break;
                        }
                        i++;
                    }
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException e) {
            str = new String(zzapwVar.zzb);
        }
        return zzaqg.zzb(str, zzaqx.zzb(zzapwVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaqa
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzo(String str) {
        zzaqf zzaqfVar;
        synchronized (this.zza) {
            zzaqfVar = this.zzb;
        }
        zzaqfVar.zza(str);
    }
}

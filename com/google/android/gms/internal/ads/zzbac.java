package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: zzbac.class */
public final class zzbac {
    private final zzazr zza;
    private final int zzb;
    private String zzc;
    private final int zzd;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r7 < 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbac(int r6, int r7, int r8) {
        /*
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            r1 = r6
            r0.zzb = r1
            r0 = r7
            r1 = 64
            if (r0 > r1) goto L15
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 >= 0) goto L18
        L15:
            r0 = 64
            r6 = r0
        L18:
            r0 = r8
            if (r0 > 0) goto L24
            r0 = r5
            r1 = 1
            r0.zzd = r1
            goto L29
        L24:
            r0 = r5
            r1 = r8
            r0.zzd = r1
        L29:
            r0 = r5
            com.google.android.gms.internal.ads.zzbaa r1 = new com.google.android.gms.internal.ads.zzbaa
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.zza = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbac.<init>(int, int, int):void");
    }

    public final String zza(ArrayList arrayList, ArrayList arrayList2) {
        Collections.sort(arrayList2, new zzbab(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i = 0; i < arrayList2.size(); i++) {
            String[] split = Normalizer.normalize((CharSequence) arrayList.get(((zzazq) arrayList2.get(i)).zze()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                for (String str : split) {
                    String str2 = str;
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        int i2 = 1;
                        boolean z = false;
                        while (true) {
                            int i3 = i2 + 2;
                            if (i3 > sb.length()) {
                                break;
                            }
                            int i4 = i2;
                            if (sb.charAt(i2) == '\'') {
                                if (sb.charAt(i2 - 1) != ' ') {
                                    int i5 = i2 + 1;
                                    if ((sb.charAt(i5) == 's' || sb.charAt(i5) == 'S') && (i3 == sb.length() || sb.charAt(i3) == ' ')) {
                                        sb.insert(i2, ' ');
                                        i2 = i3;
                                        z = true;
                                        i4 = i2;
                                    }
                                }
                                sb.setCharAt(i2, ' ');
                                z = true;
                                i4 = i2;
                            }
                            i2 = i4 + 1;
                        }
                        String sb2 = z ? sb.toString() : null;
                        str2 = str;
                        if (sb2 != null) {
                            this.zzc = sb2;
                            str2 = sb2;
                        }
                    }
                    String[] zzb = zzazv.zzb(str2, true);
                    if (zzb.length >= this.zzd) {
                        for (int i6 = 0; i6 < zzb.length; i6++) {
                            String str3 = "";
                            for (int i7 = 0; i7 < this.zzd; i7++) {
                                int i8 = i6 + i7;
                                if (i8 >= zzb.length) {
                                    break;
                                }
                                String str4 = str3;
                                if (i7 > 0) {
                                    str4 = str3.concat(" ");
                                }
                                str3 = str4.concat(String.valueOf(zzb[i8]));
                            }
                            hashSet.add(str3);
                            if (hashSet.size() >= this.zzb) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.zzb) {
                            break loop0;
                        }
                    }
                }
            }
        }
        zzazt zzaztVar = new zzazt();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzaztVar.zzb.write(this.zza.zzb((String) it.next()));
            } catch (IOException e) {
                zzcec.zzh("Error while writing hash to byteStream", e);
            }
        }
        return zzaztVar.toString();
    }
}

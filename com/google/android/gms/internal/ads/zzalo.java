package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.ironsource.td;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: zzalo.class */
final class zzalo {
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    public final zzalu zzf;
    public final String zzg;
    public final String zzh;
    public final zzalo zzi;
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    private zzalo(String str, String str2, long j, long j2, zzalu zzaluVar, String[] strArr, String str3, String str4, zzalo zzaloVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzaluVar;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j;
        this.zze = j2;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzaloVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }

    public static zzalo zzb(String str, long j, long j2, zzalu zzaluVar, String[] strArr, String str2, String str3, zzalo zzaloVar) {
        return new zzalo(str, null, j, j2, zzaluVar, strArr, str2, str3, zzaloVar);
    }

    public static zzalo zzc(String str) {
        return new zzalo(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static SpannableStringBuilder zzi(String str, Map map) {
        if (!map.containsKey(str)) {
            zzea zzeaVar = new zzea();
            zzeaVar.zzl(new SpannableStringBuilder());
            map.put(str, zzeaVar);
        }
        CharSequence zzq = ((zzea) map.get(str)).zzq();
        zzq.getClass();
        return (SpannableStringBuilder) zzq;
    }

    private final void zzj(TreeSet treeSet, boolean z) {
        String str = this.zza;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && this.zzh != null)) {
            long j = this.zzd;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.zze;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.zzm != null) {
            for (int i = 0; i < this.zzm.size(); i++) {
                zzalo zzaloVar = (zzalo) this.zzm.get(i);
                boolean z2 = true;
                if (!z) {
                    z2 = equals;
                }
                zzaloVar.zzj(treeSet, z2);
            }
        }
    }

    private final void zzk(long j, String str, List list) {
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        int i = 0;
        if (zzg(j)) {
            i = 0;
            if ("div".equals(this.zza)) {
                String str2 = this.zzh;
                if (str2 != null) {
                    list.add(new Pair(str, str2));
                    return;
                }
                i = 0;
            }
        }
        while (i < zza()) {
            zzd(i).zzk(j, str, list);
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0440 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x041b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzl(long r9, java.util.Map r11, java.util.Map r12, java.lang.String r13, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 1199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalo.zzl(long, java.util.Map, java.util.Map, java.lang.String, java.util.Map):void");
    }

    private final void zzm(long j, boolean z, String str, Map map) {
        this.zzk.clear();
        this.zzl.clear();
        if (td.l1.equals(this.zza)) {
            return;
        }
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (this.zzc && z) {
            SpannableStringBuilder zzi = zzi(str, map);
            String str2 = this.zzb;
            str2.getClass();
            zzi.append((CharSequence) str2);
            return;
        }
        if ("br".equals(this.zza) && z) {
            zzi(str, map).append('\n');
            return;
        }
        if (zzg(j)) {
            for (Map.Entry entry : map.entrySet()) {
                HashMap hashMap = this.zzk;
                String str3 = (String) entry.getKey();
                CharSequence zzq = ((zzea) entry.getValue()).zzq();
                zzq.getClass();
                hashMap.put(str3, Integer.valueOf(zzq.length()));
            }
            boolean equals = "p".equals(this.zza);
            for (int i = 0; i < zza(); i++) {
                zzd(i).zzm(j, z || equals, str, map);
            }
            if (equals) {
                SpannableStringBuilder zzi2 = zzi(str, map);
                int length = zzi2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (zzi2.charAt(length) == ' ');
                if (length >= 0 && zzi2.charAt(length) != '\n') {
                    zzi2.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                HashMap hashMap2 = this.zzl;
                String str4 = (String) entry2.getKey();
                CharSequence zzq2 = ((zzea) entry2.getValue()).zzq();
                zzq2.getClass();
                hashMap2.put(str4, Integer.valueOf(zzq2.length()));
            }
        }
    }

    public final int zza() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final zzalo zzd(int i) {
        List list = this.zzm;
        if (list != null) {
            return (zzalo) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List zze(long j, Map map, Map map2, Map map3) {
        List arrayList = new ArrayList();
        zzk(j, this.zzg, arrayList);
        TreeMap treeMap = new TreeMap();
        zzm(j, false, this.zzg, treeMap);
        zzl(j, map, map2, this.zzg, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                zzals zzalsVar = (zzals) map2.get(pair.first);
                zzalsVar.getClass();
                zzea zzeaVar = new zzea();
                zzeaVar.zzc(decodeByteArray);
                zzeaVar.zzh(zzalsVar.zzb);
                zzeaVar.zzi(0);
                zzeaVar.zze(zzalsVar.zzc, 0);
                zzeaVar.zzf(zzalsVar.zze);
                zzeaVar.zzk(zzalsVar.zzf);
                zzeaVar.zzd(zzalsVar.zzg);
                zzeaVar.zzo(zzalsVar.zzj);
                arrayList2.add(zzeaVar.zzp());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzals zzalsVar2 = (zzals) map2.get(entry.getKey());
            zzalsVar2.getClass();
            zzea zzeaVar2 = (zzea) entry.getValue();
            CharSequence zzq = zzeaVar2.zzq();
            zzq.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzq;
            for (zzalm zzalmVar : (zzalm[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzalm.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzalmVar), spannableStringBuilder.getSpanEnd(zzalmVar), (CharSequence) "");
            }
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= spannableStringBuilder.length()) {
                    break;
                }
                int i4 = i3 + 1;
                if (spannableStringBuilder.charAt(i3) == ' ') {
                    int i5 = i4;
                    while (i5 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i5) == ' ') {
                        i5++;
                    }
                    int i6 = i5 - i4;
                    if (i6 > 0) {
                        spannableStringBuilder.delete(i3, i6 + i3);
                    }
                }
                i2 = i4;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i7 = 0;
            while (true) {
                int i8 = i7;
                if (i8 >= spannableStringBuilder.length() - 1) {
                    break;
                }
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == '\n' && spannableStringBuilder.charAt(i9) == ' ') {
                    spannableStringBuilder.delete(i9, i8 + 2);
                }
                i7 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i10 = 0;
            while (true) {
                int i11 = i10;
                if (i11 >= spannableStringBuilder.length() - 1) {
                    break;
                }
                int i12 = i11 + 1;
                if (spannableStringBuilder.charAt(i11) == ' ' && spannableStringBuilder.charAt(i12) == '\n') {
                    spannableStringBuilder.delete(i11, i12);
                }
                i10 = i12;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzeaVar2.zze(zzalsVar2.zzc, zzalsVar2.zzd);
            zzeaVar2.zzf(zzalsVar2.zze);
            zzeaVar2.zzh(zzalsVar2.zzb);
            zzeaVar2.zzk(zzalsVar2.zzf);
            zzeaVar2.zzn(zzalsVar2.zzi, zzalsVar2.zzh);
            zzeaVar2.zzo(zzalsVar2.zzj);
            arrayList2.add(zzeaVar2.zzp());
        }
        return arrayList2;
    }

    public final void zzf(zzalo zzaloVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzaloVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r5.zze != (-9223372036854775807L)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r6 >= r5.zze) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzg(long r6) {
        /*
            r5 = this;
            r0 = r5
            long r0 = r0.zzd
            r13 = r0
            r0 = 1
            r10 = r0
            r0 = r13
            r11 = r0
            r0 = r13
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L2a
            r0 = r10
            r9 = r0
            r0 = r5
            long r0 = r0.zze
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L71
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11 = r0
        L2a:
            r0 = r11
            r1 = r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r8 = r0
            r0 = r8
            if (r0 > 0) goto L42
            r0 = r10
            r9 = r0
            r0 = r5
            long r0 = r0.zze
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L71
        L42:
            r0 = r11
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L58
            r0 = r10
            r9 = r0
            r0 = r6
            r1 = r5
            long r1 = r1.zze
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L71
        L58:
            r0 = r8
            if (r0 > 0) goto L6e
            r0 = r6
            r1 = r5
            long r1 = r1.zze
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L6c
            r0 = r10
            r9 = r0
            goto L71
        L6c:
            r0 = 0
            return r0
        L6e:
            r0 = 0
            r9 = r0
        L71:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalo.zzg(long):boolean");
    }

    public final long[] zzh() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        zzj(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }
}

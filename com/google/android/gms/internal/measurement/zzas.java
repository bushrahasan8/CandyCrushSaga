package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: zzas.class */
public final class zzas implements zzaq, Iterable<zzaq> {
    private final String zza;

    public zzas(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.zza.equals(((zzas) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzaq> iterator() {
        return new zzau(this);
    }

    public final String toString() {
        return "\"" + this.zza + "\"";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [int] */
    /* JADX WARN: Type inference failed for: r18v3, types: [int] */
    /* JADX WARN: Type inference failed for: r18v4 */
    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        boolean z;
        int i;
        boolean z2;
        if (!"charAt".equals(str) && !"concat".equals(str) && !"hasOwnProperty".equals(str) && !"indexOf".equals(str) && !"lastIndexOf".equals(str) && !"match".equals(str) && !"replace".equals(str) && !"search".equals(str) && !"slice".equals(str) && !"split".equals(str) && !"substring".equals(str) && !"toLowerCase".equals(str) && !"toLocaleLowerCase".equals(str) && !"toString".equals(str) && !"toUpperCase".equals(str) && !"toLocaleUpperCase".equals(str) && !"trim".equals(str)) {
            throw new IllegalArgumentException(String.format("%s is not a String function", str));
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1789698943:
                if (str.equals("hasOwnProperty")) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case -1776922004:
                if (str.equals("toString")) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            case -1361633751:
                if (str.equals("charAt")) {
                    z = 3;
                    break;
                }
                z = -1;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    z = 4;
                    break;
                }
                z = -1;
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    z = 5;
                    break;
                }
                z = -1;
                break;
            case -906336856:
                if (str.equals("search")) {
                    z = 6;
                    break;
                }
                z = -1;
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    z = 7;
                    break;
                }
                z = -1;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    z = 8;
                    break;
                }
                z = -1;
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    z = 9;
                    break;
                }
                z = -1;
                break;
            case 3568674:
                if (str.equals("trim")) {
                    z = 10;
                    break;
                }
                z = -1;
                break;
            case 103668165:
                if (str.equals("match")) {
                    z = 11;
                    break;
                }
                z = -1;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    z = 12;
                    break;
                }
                z = -1;
                break;
            case 109648666:
                if (str.equals("split")) {
                    z = 13;
                    break;
                }
                z = -1;
                break;
            case 530542161:
                if (str.equals("substring")) {
                    z = 14;
                    break;
                }
                z = -1;
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    z = 15;
                    break;
                }
                z = -1;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    z = 16;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        switch (z) {
            case false:
                zzg.zza("hasOwnProperty", 1, list);
                String str2 = this.zza;
                zzaq zza = zzhVar.zza(list.get(0));
                if ("length".equals(zza.zzf())) {
                    return zzaq.zzh;
                }
                double doubleValue = zza.zze().doubleValue();
                return (doubleValue != Math.floor(doubleValue) || (i = (int) doubleValue) < 0 || i >= str2.length()) ? zzaq.zzi : zzaq.zzh;
            case true:
                zzg.zza("toString", 0, list);
                return this;
            case true:
                zzg.zza("toLocaleLowerCase", 0, list);
                return new zzas(this.zza.toLowerCase());
            case true:
                zzg.zzc("charAt", 1, list);
                int zza2 = !list.isEmpty() ? (int) zzg.zza(zzhVar.zza(list.get(0)).zze().doubleValue()) : 0;
                String str3 = this.zza;
                return (zza2 < 0 || zza2 >= str3.length()) ? zzaq.zzj : new zzas(String.valueOf(str3.charAt(zza2)));
            case true:
                if (list.isEmpty()) {
                    return this;
                }
                StringBuilder sb = new StringBuilder(this.zza);
                for (int i2 = 0; i2 < list.size(); i2++) {
                    sb.append(zzhVar.zza(list.get(i2)).zzf());
                }
                return new zzas(sb.toString());
            case true:
                zzg.zza("toLowerCase", 0, list);
                return new zzas(this.zza.toLowerCase(Locale.ENGLISH));
            case true:
                zzg.zzc("search", 1, list);
                return Pattern.compile(!list.isEmpty() ? zzhVar.zza(list.get(0)).zzf() : zzaq.zzc.zzf()).matcher(this.zza).find() ? new zzai(Double.valueOf(r0.start())) : new zzai(Double.valueOf(-1.0d));
            case true:
                zzg.zza("toLocaleUpperCase", 0, list);
                return new zzas(this.zza.toUpperCase());
            case true:
                zzg.zzc("lastIndexOf", 2, list);
                String str4 = this.zza;
                String zzf = list.size() <= 0 ? zzaq.zzc.zzf() : zzhVar.zza(list.get(0)).zzf();
                return new zzai(Double.valueOf(str4.lastIndexOf(zzf, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : zzhVar.zza(list.get(1)).zze().doubleValue()) ? Double.POSITIVE_INFINITY : zzg.zza(r14)))));
            case true:
                zzg.zza("toUpperCase", 0, list);
                return new zzas(this.zza.toUpperCase(Locale.ENGLISH));
            case true:
                zzg.zza("toUpperCase", 0, list);
                return new zzas(this.zza.trim());
            case true:
                zzg.zzc("match", 1, list);
                Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : zzhVar.zza(list.get(0)).zzf()).matcher(this.zza);
                return matcher.find() ? new zzaf(new zzas(matcher.group())) : zzaq.zzd;
            case true:
                zzg.zzc("slice", 2, list);
                String str5 = this.zza;
                double zza3 = zzg.zza(!list.isEmpty() ? zzhVar.zza(list.get(0)).zze().doubleValue() : 0.0d);
                int max = (int) (zza3 < 0.0d ? Math.max(str5.length() + zza3, 0.0d) : Math.min(zza3, str5.length()));
                double zza4 = zzg.zza(list.size() > 1 ? zzhVar.zza(list.get(1)).zze().doubleValue() : str5.length());
                return new zzas(str5.substring(max, Math.max(0, ((int) (zza4 < 0.0d ? Math.max(str5.length() + zza4, 0.0d) : Math.min(zza4, str5.length()))) - max) + max));
            case true:
                zzg.zzc("split", 2, list);
                String str6 = this.zza;
                if (str6.length() == 0) {
                    return new zzaf(this);
                }
                ArrayList arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    String zzf2 = zzhVar.zza(list.get(0)).zzf();
                    long zzc = list.size() > 1 ? zzg.zzc(zzhVar.zza(list.get(1)).zze().doubleValue()) : 2147483647L;
                    if (zzc == 0) {
                        return new zzaf();
                    }
                    String[] split = str6.split(Pattern.quote(zzf2), ((int) zzc) + 1);
                    int length = split.length;
                    if (!zzf2.isEmpty() || split.length <= 0) {
                        z2 = false;
                    } else {
                        boolean isEmpty = split[0].isEmpty();
                        z2 = isEmpty;
                        if (split[split.length - 1].isEmpty()) {
                            length = split.length - 1;
                            z2 = isEmpty;
                        }
                    }
                    int i3 = length;
                    int i4 = z2;
                    if (split.length > zzc) {
                        i3 = length - 1;
                        i4 = z2;
                    }
                    while (i4 < i3) {
                        arrayList.add(new zzas(split[i4]));
                        i4++;
                    }
                }
                return new zzaf(arrayList);
            case true:
                zzg.zzc("substring", 2, list);
                String str7 = this.zza;
                int zza5 = !list.isEmpty() ? (int) zzg.zza(zzhVar.zza(list.get(0)).zze().doubleValue()) : 0;
                int zza6 = list.size() > 1 ? (int) zzg.zza(zzhVar.zza(list.get(1)).zze().doubleValue()) : str7.length();
                int min = Math.min(Math.max(zza5, 0), str7.length());
                int min2 = Math.min(Math.max(zza6, 0), str7.length());
                return new zzas(str7.substring(Math.min(min, min2), Math.max(min, min2)));
            case true:
                zzg.zzc("replace", 2, list);
                zzaq zzaqVar = zzaq.zzc;
                String zzf3 = zzaqVar.zzf();
                zzaq zzaqVar2 = zzaqVar;
                if (!list.isEmpty()) {
                    String zzf4 = zzhVar.zza(list.get(0)).zzf();
                    zzaqVar2 = zzaqVar;
                    zzf3 = zzf4;
                    if (list.size() > 1) {
                        zzaqVar2 = zzhVar.zza(list.get(1));
                        zzf3 = zzf4;
                    }
                }
                String str8 = this.zza;
                int indexOf = str8.indexOf(zzf3);
                if (indexOf < 0) {
                    return this;
                }
                if (zzaqVar2 instanceof zzal) {
                    zzaqVar2 = ((zzal) zzaqVar2).zza(zzhVar, Arrays.asList(new zzas(zzf3), new zzai(Double.valueOf(indexOf)), this));
                }
                return new zzas(str8.substring(0, indexOf) + zzaqVar2.zzf() + str8.substring(indexOf + zzf3.length()));
            case true:
                zzg.zzc("indexOf", 2, list);
                return new zzai(Double.valueOf(this.zza.indexOf(list.size() <= 0 ? zzaq.zzc.zzf() : zzhVar.zza(list.get(0)).zzf(), (int) zzg.zza(list.size() < 2 ? 0.0d : zzhVar.zza(list.get(1)).zze().doubleValue()))));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return new zzas(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException e) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return new zzav(this);
    }
}

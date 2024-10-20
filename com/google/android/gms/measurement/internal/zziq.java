package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.ironsource.t2;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: zziq.class */
public final class zziq {
    public static final zziq zza = new zziq(null, null, 100);
    private final EnumMap<zza, zzip> zzb;
    private final int zzc;

    /* loaded from: zziq$zza.class */
    public enum zza {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");

        public final String zze;

        zza(String str) {
            this.zze = str;
        }
    }

    public zziq(Boolean bool, Boolean bool2, int i) {
        EnumMap<zza, zzip> enumMap = new EnumMap<>((Class<zza>) zza.class);
        this.zzb = enumMap;
        enumMap.put((EnumMap<zza, zzip>) zza.AD_STORAGE, (zza) zza(bool));
        enumMap.put((EnumMap<zza, zzip>) zza.ANALYTICS_STORAGE, (zza) zza(bool2));
        this.zzc = i;
    }

    private zziq(EnumMap<zza, zzip> enumMap, int i) {
        EnumMap<zza, zzip> enumMap2 = new EnumMap<>((Class<zza>) zza.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzc = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static char zza(zzip zzipVar) {
        if (zzipVar == null) {
            return '-';
        }
        int ordinal = zzipVar.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzip zza(char c) {
        return c != '+' ? c != '0' ? c != '1' ? zzip.UNINITIALIZED : zzip.GRANTED : zzip.DENIED : zzip.DEFAULT;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzip zza(Boolean bool) {
        return bool == null ? zzip.UNINITIALIZED : bool.booleanValue() ? zzip.GRANTED : zzip.DENIED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzip zza(String str) {
        return str == null ? zzip.UNINITIALIZED : str.equals("granted") ? zzip.GRANTED : str.equals("denied") ? zzip.DENIED : zzip.UNINITIALIZED;
    }

    public static zziq zza(Bundle bundle, int i) {
        zza[] zzaVarArr;
        if (bundle == null) {
            return new zziq(null, null, i);
        }
        EnumMap enumMap = new EnumMap(zza.class);
        zzaVarArr = zzir.STORAGE.zzd;
        for (zza zzaVar : zzaVarArr) {
            enumMap.put((EnumMap) zzaVar, (zza) zza(bundle.getString(zzaVar.zze)));
        }
        return new zziq(enumMap, i);
    }

    public static zziq zza(zzip zzipVar, zzip zzipVar2, int i) {
        EnumMap enumMap = new EnumMap(zza.class);
        enumMap.put((EnumMap) zza.AD_STORAGE, (zza) zzipVar);
        enumMap.put((EnumMap) zza.ANALYTICS_STORAGE, (zza) zzipVar2);
        return new zziq(enumMap, -10);
    }

    public static zziq zza(String str, int i) {
        EnumMap enumMap = new EnumMap(zza.class);
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        zza[] zza2 = zzir.STORAGE.zza();
        for (int i2 = 0; i2 < zza2.length; i2++) {
            zza zzaVar = zza2[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put((EnumMap) zzaVar, (zza) zza(str2.charAt(i3)));
            } else {
                enumMap.put((EnumMap) zzaVar, (zza) zzip.UNINITIALIZED);
            }
        }
        return new zziq(enumMap, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(int i) {
        return i != -30 ? i != -20 ? i != -10 ? i != 0 ? i != 30 ? i != 90 ? i != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static String zza(Bundle bundle) {
        zza[] zzaVarArr;
        String string;
        zzaVarArr = zzir.STORAGE.zzd;
        int length = zzaVarArr.length;
        int i = 0;
        while (true) {
            Boolean bool = null;
            if (i >= length) {
                return null;
            }
            zza zzaVar = zzaVarArr[i];
            if (bundle.containsKey(zzaVar.zze) && (string = bundle.getString(zzaVar.zze)) != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
                if (bool == null) {
                    return string;
                }
            }
            i++;
        }
    }

    public static boolean zza(int i, int i2) {
        if (i == -20 && i2 == -30) {
            return true;
        }
        return (i == -30 && i2 == -20) || i == i2 || i < i2;
    }

    public static zziq zzb(String str) {
        return zza(str, 100);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzb(zzip zzipVar) {
        int ordinal = zzipVar.ordinal();
        if (ordinal == 2) {
            return "denied";
        }
        if (ordinal != 3) {
            return null;
        }
        return "granted";
    }

    public final boolean equals(Object obj) {
        zza[] zzaVarArr;
        if (!(obj instanceof zziq)) {
            return false;
        }
        zziq zziqVar = (zziq) obj;
        zzaVarArr = zzir.STORAGE.zzd;
        for (zza zzaVar : zzaVarArr) {
            if (this.zzb.get(zzaVar) != zziqVar.zzb.get(zzaVar)) {
                return false;
            }
        }
        return this.zzc == zziqVar.zzc;
    }

    public final int hashCode() {
        int i = this.zzc * 17;
        Iterator<zzip> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            i = (i * 31) + it.next().hashCode();
        }
        return i;
    }

    public final String toString() {
        zza[] zzaVarArr;
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zza(this.zzc));
        zzaVarArr = zzir.STORAGE.zzd;
        for (zza zzaVar : zzaVarArr) {
            sb.append(",");
            sb.append(zzaVar.zze);
            sb.append(t2.i.b);
            zzip zzipVar = this.zzb.get(zzaVar);
            if (zzipVar == null) {
                sb.append("uninitialized");
            } else {
                int ordinal = zzipVar.ordinal();
                if (ordinal == 0) {
                    sb.append("uninitialized");
                } else if (ordinal == 1) {
                    sb.append("default");
                } else if (ordinal == 2) {
                    sb.append("denied");
                } else if (ordinal == 3) {
                    sb.append("granted");
                }
            }
        }
        return sb.toString();
    }

    public final int zza() {
        return this.zzc;
    }

    public final zziq zza(zziq zziqVar) {
        zza[] zzaVarArr;
        EnumMap enumMap = new EnumMap(zza.class);
        zzaVarArr = zzir.STORAGE.zzd;
        for (zza zzaVar : zzaVarArr) {
            zzip zzipVar = this.zzb.get(zzaVar);
            zzip zzipVar2 = zziqVar.zzb.get(zzaVar);
            if (zzipVar != null) {
                if (zzipVar2 == null) {
                    zzipVar2 = zzipVar;
                } else {
                    zzip zzipVar3 = zzip.UNINITIALIZED;
                    if (zzipVar != zzipVar3) {
                        if (zzipVar2 == zzipVar3) {
                            zzipVar2 = zzipVar;
                        } else {
                            zzip zzipVar4 = zzip.DEFAULT;
                            if (zzipVar != zzipVar4) {
                                if (zzipVar2 == zzipVar4) {
                                    zzipVar2 = zzipVar;
                                } else {
                                    zzip zzipVar5 = zzip.DENIED;
                                    zzipVar2 = (zzipVar == zzipVar5 || zzipVar2 == zzipVar5) ? zzipVar5 : zzip.GRANTED;
                                }
                            }
                        }
                    }
                }
            }
            if (zzipVar2 != null) {
                enumMap.put((EnumMap) zzaVar, (zza) zzipVar2);
            }
        }
        return new zziq(enumMap, 100);
    }

    public final boolean zza(zza zzaVar) {
        return this.zzb.get(zzaVar) != zzip.DENIED;
    }

    public final boolean zza(zziq zziqVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            if (!zziqVar.zza(zzaVar) && zza(zzaVar)) {
                return true;
            }
        }
        return false;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        for (Map.Entry<zza, zzip> entry : this.zzb.entrySet()) {
            String zzb = zzb(entry.getValue());
            if (zzb != null) {
                bundle.putString(entry.getKey().zze, zzb);
            }
        }
        return bundle;
    }

    public final zziq zzb(zziq zziqVar) {
        zza[] zzaVarArr;
        EnumMap enumMap = new EnumMap(zza.class);
        zzaVarArr = zzir.STORAGE.zzd;
        for (zza zzaVar : zzaVarArr) {
            zzip zzipVar = this.zzb.get(zzaVar);
            zzip zzipVar2 = zzipVar;
            if (zzipVar == zzip.UNINITIALIZED) {
                zzipVar2 = zziqVar.zzb.get(zzaVar);
            }
            if (zzipVar2 != null) {
                enumMap.put((EnumMap) zzaVar, (zza) zzipVar2);
            }
        }
        return new zziq(enumMap, this.zzc);
    }

    public final boolean zzb(zziq zziqVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            zzip zzipVar = this.zzb.get(zzaVar);
            zzip zzipVar2 = zziqVar.zzb.get(zzaVar);
            zzip zzipVar3 = zzip.DENIED;
            if (zzipVar == zzipVar3 && zzipVar2 != zzipVar3) {
                return true;
            }
        }
        return false;
    }

    public final zzip zzc() {
        zzip zzipVar = this.zzb.get(zza.AD_STORAGE);
        zzip zzipVar2 = zzipVar;
        if (zzipVar == null) {
            zzipVar2 = zzip.UNINITIALIZED;
        }
        return zzipVar2;
    }

    public final boolean zzc(zziq zziqVar) {
        return zzb(zziqVar, (zza[]) this.zzb.keySet().toArray(new zza[0]));
    }

    public final zzip zzd() {
        zzip zzipVar = this.zzb.get(zza.ANALYTICS_STORAGE);
        zzip zzipVar2 = zzipVar;
        if (zzipVar == null) {
            zzipVar2 = zzip.UNINITIALIZED;
        }
        return zzipVar2;
    }

    public final Boolean zze() {
        zzip zzipVar = this.zzb.get(zza.AD_STORAGE);
        if (zzipVar == null) {
            return null;
        }
        int ordinal = zzipVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return Boolean.FALSE;
            }
            if (ordinal != 3) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    public final Boolean zzf() {
        zzip zzipVar = this.zzb.get(zza.ANALYTICS_STORAGE);
        if (zzipVar == null) {
            return null;
        }
        int ordinal = zzipVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return Boolean.FALSE;
            }
            if (ordinal != 3) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    public final String zzg() {
        StringBuilder sb = new StringBuilder("G1");
        for (zza zzaVar : zzir.STORAGE.zza()) {
            zzip zzipVar = this.zzb.get(zzaVar);
            char c = '-';
            if (zzipVar != null) {
                int ordinal = zzipVar.ordinal();
                c = '-';
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            c = '0';
                        } else if (ordinal != 3) {
                            c = '-';
                        }
                    }
                    c = '1';
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public final String zzh() {
        StringBuilder sb = new StringBuilder("G1");
        for (zza zzaVar : zzir.STORAGE.zza()) {
            sb.append(zza(this.zzb.get(zzaVar)));
        }
        return sb.toString();
    }

    public final boolean zzi() {
        return zza(zza.AD_STORAGE);
    }

    public final boolean zzj() {
        return zza(zza.ANALYTICS_STORAGE);
    }

    public final boolean zzk() {
        Iterator<zzip> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            if (it.next() != zzip.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }
}

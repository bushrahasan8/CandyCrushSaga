package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zziq;
import com.ironsource.t2;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: zzax.class */
public final class zzax {
    public static final zzax zza = new zzax(null, 100);
    private final int zzb;
    private final String zzc;
    private final Boolean zzd;
    private final String zze;
    private final EnumMap<zziq.zza, zzip> zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzax(Boolean bool, int i) {
        this(bool, i, (Boolean) null, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzax(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap<zziq.zza, zzip> enumMap = new EnumMap<>((Class<zziq.zza>) zziq.zza.class);
        this.zzf = enumMap;
        enumMap.put((EnumMap<zziq.zza, zzip>) zziq.zza.AD_USER_DATA, (zziq.zza) zziq.zza(bool));
        this.zzb = i;
        this.zzc = zzh();
        this.zzd = bool2;
        this.zze = str;
    }

    private zzax(EnumMap<zziq.zza, zzip> enumMap, int i, Boolean bool, String str) {
        EnumMap<zziq.zza, zzip> enumMap2 = new EnumMap<>((Class<zziq.zza>) zziq.zza.class);
        this.zzf = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzb = i;
        this.zzc = zzh();
        this.zzd = bool;
        this.zze = str;
    }

    public static zzax zza(Bundle bundle, int i) {
        if (bundle == null) {
            return new zzax(null, i);
        }
        EnumMap enumMap = new EnumMap(zziq.zza.class);
        for (zziq.zza zzaVar : zzir.DMA.zza()) {
            enumMap.put((EnumMap) zzaVar, (zziq.zza) zziq.zza(bundle.getString(zzaVar.zze)));
        }
        return new zzax((EnumMap<zziq.zza, zzip>) enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzax zza(zzip zzipVar, int i) {
        EnumMap enumMap = new EnumMap(zziq.zza.class);
        enumMap.put((EnumMap) zziq.zza.AD_USER_DATA, (zziq.zza) zzipVar);
        return new zzax((EnumMap<zziq.zza, zzip>) enumMap, -10, (Boolean) null, (String) null);
    }

    public static zzax zza(String str) {
        if (str == null || str.length() <= 0) {
            return zza;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(zziq.zza.class);
        zziq.zza[] zza2 = zzir.DMA.zza();
        int length = zza2.length;
        int i = 1;
        int i2 = 0;
        while (i2 < length) {
            enumMap.put((EnumMap) zza2[i2], (zziq.zza) zziq.zza(split[i].charAt(0)));
            i2++;
            i++;
        }
        return new zzax((EnumMap<zziq.zza, zzip>) enumMap, parseInt, (Boolean) null, (String) null);
    }

    public static Boolean zza(Bundle bundle) {
        zzip zza2;
        if (bundle == null || (zza2 = zziq.zza(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int i = zzaw.zza[zza2.ordinal()];
        if (i == 3) {
            return Boolean.FALSE;
        }
        if (i != 4) {
            return null;
        }
        return Boolean.TRUE;
    }

    private final String zzh() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzb);
        for (zziq.zza zzaVar : zzir.DMA.zza()) {
            sb.append(":");
            sb.append(zziq.zza(this.zzf.get(zzaVar)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzax)) {
            return false;
        }
        zzax zzaxVar = (zzax) obj;
        if (this.zzc.equalsIgnoreCase(zzaxVar.zzc) && Objects.equals(this.zzd, zzaxVar.zzd)) {
            return Objects.equals(this.zze, zzaxVar.zze);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.zzd;
        int i = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.zze;
        return this.zzc.hashCode() + (i * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zziq.zza(this.zzb));
        for (zziq.zza zzaVar : zzir.DMA.zza()) {
            sb.append(",");
            sb.append(zzaVar.zze);
            sb.append(t2.i.b);
            zzip zzipVar = this.zzf.get(zzaVar);
            if (zzipVar == null) {
                sb.append("uninitialized");
            } else {
                int i = zzaw.zza[zzipVar.ordinal()];
                if (i == 1) {
                    sb.append("uninitialized");
                } else if (i == 2) {
                    sb.append("default");
                } else if (i == 3) {
                    sb.append("denied");
                } else if (i == 4) {
                    sb.append("granted");
                }
            }
        }
        if (this.zzd != null) {
            sb.append(",isDmaRegion=");
            sb.append(this.zzd);
        }
        if (this.zze != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(this.zze);
        }
        return sb.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        for (Map.Entry<zziq.zza, zzip> entry : this.zzf.entrySet()) {
            String zzb = zziq.zzb(entry.getValue());
            if (zzb != null) {
                bundle.putString(entry.getKey().zze, zzb);
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.zze;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final zzip zzc() {
        zzip zzipVar = this.zzf.get(zziq.zza.AD_USER_DATA);
        zzip zzipVar2 = zzipVar;
        if (zzipVar == null) {
            zzipVar2 = zzip.UNINITIALIZED;
        }
        return zzipVar2;
    }

    public final Boolean zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        Iterator<zzip> it = this.zzf.values().iterator();
        while (it.hasNext()) {
            if (it.next() != zzip.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }
}

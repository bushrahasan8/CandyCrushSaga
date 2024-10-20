package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: zzfpw.class */
public final class zzfpw {
    private final HashMap zza = new HashMap();
    private final HashMap zzb = new HashMap();
    private final HashMap zzc = new HashMap();
    private final HashSet zzd = new HashSet();
    private final HashSet zze = new HashSet();
    private final HashSet zzf = new HashSet();
    private final HashMap zzg = new HashMap();
    private final Map zzh = new WeakHashMap();
    private boolean zzi;

    public final View zza(String str) {
        return (View) this.zzc.get(str);
    }

    public final zzfpv zzb(View view) {
        zzfpv zzfpvVar = (zzfpv) this.zzb.get(view);
        if (zzfpvVar != null) {
            this.zzb.remove(view);
        }
        return zzfpvVar;
    }

    public final String zzc(String str) {
        return (String) this.zzg.get(str);
    }

    public final String zzd(View view) {
        if (this.zza.size() == 0) {
            return null;
        }
        String str = (String) this.zza.get(view);
        if (str != null) {
            this.zza.remove(view);
        }
        return str;
    }

    public final HashSet zze() {
        return this.zzf;
    }

    public final HashSet zzf() {
        return this.zze;
    }

    public final void zzg() {
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
        this.zzi = false;
    }

    public final void zzh() {
        this.zzi = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzi() {
        Boolean bool;
        String str;
        zzfov zza = zzfov.zza();
        if (zza != null) {
            for (zzfoh zzfohVar : zza.zzb()) {
                View zzf = zzfohVar.zzf();
                if (zzfohVar.zzj()) {
                    String zzh = zzfohVar.zzh();
                    if (zzf != null) {
                        if (zzf.isAttachedToWindow()) {
                            if (zzf.hasWindowFocus()) {
                                this.zzh.remove(zzf);
                                bool = Boolean.FALSE;
                            } else if (this.zzh.containsKey(zzf)) {
                                bool = (Boolean) this.zzh.get(zzf);
                            } else {
                                Map map = this.zzh;
                                bool = Boolean.FALSE;
                                map.put(zzf, bool);
                            }
                            if (!bool.booleanValue()) {
                                HashSet hashSet = new HashSet();
                                View view = zzf;
                                while (true) {
                                    View view2 = view;
                                    if (view2 == null) {
                                        this.zzd.addAll(hashSet);
                                        str = null;
                                        break;
                                    }
                                    String zza2 = zzfpu.zza(view2);
                                    if (zza2 != null) {
                                        str = zza2;
                                        break;
                                    } else {
                                        hashSet.add(view2);
                                        Object parent = view2.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.zze.add(zzh);
                            this.zza.put(zzf, zzh);
                            for (zzfoy zzfoyVar : zzfohVar.zzi()) {
                                View view3 = (View) zzfoyVar.zzb().get();
                                if (view3 != null) {
                                    zzfpv zzfpvVar = (zzfpv) this.zzb.get(view3);
                                    if (zzfpvVar != null) {
                                        zzfpvVar.zzc(zzfohVar.zzh());
                                    } else {
                                        this.zzb.put(view3, new zzfpv(zzfoyVar, zzfohVar.zzh()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.zzf.add(zzh);
                            this.zzc.put(zzh, zzf);
                            this.zzg.put(zzh, str);
                        }
                    } else {
                        this.zzf.add(zzh);
                        this.zzg.put(zzh, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean zzj(View view) {
        if (!this.zzh.containsKey(view)) {
            return true;
        }
        this.zzh.put(view, Boolean.TRUE);
        return false;
    }

    public final int zzk(View view) {
        if (this.zzd.contains(view)) {
            return 1;
        }
        return this.zzi ? 2 : 3;
    }
}

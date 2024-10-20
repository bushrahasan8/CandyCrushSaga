package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.t2;
import java.util.Collections;
import java.util.List;

/* loaded from: zzdna.class */
public final class zzdna {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzdq zzb;
    private zzbjf zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzel zzg;
    private Bundle zzh;
    private zzcjk zzi;
    private zzcjk zzj;
    private zzcjk zzk;
    private zzfod zzl;
    private ListenableFuture zzm;
    private zzceu zzn;
    private View zzo;
    private View zzp;
    private IObjectWrapper zzq;
    private double zzr;
    private zzbjm zzs;
    private zzbjm zzt;
    private String zzu;
    private float zzx;
    private String zzy;
    private final SimpleArrayMap zzv = new SimpleArrayMap();
    private final SimpleArrayMap zzw = new SimpleArrayMap();
    private List zzf = Collections.emptyList();

    public static zzdna zzag(zzbtg zzbtgVar) {
        try {
            zzdmz zzak = zzak(zzbtgVar.zzg(), null);
            zzbjf zzh = zzbtgVar.zzh();
            View view = (View) zzam(zzbtgVar.zzj());
            String zzo = zzbtgVar.zzo();
            List zzr = zzbtgVar.zzr();
            String zzm = zzbtgVar.zzm();
            Bundle zzf = zzbtgVar.zzf();
            String zzn = zzbtgVar.zzn();
            View view2 = (View) zzam(zzbtgVar.zzk());
            IObjectWrapper zzl = zzbtgVar.zzl();
            String zzq = zzbtgVar.zzq();
            String zzp = zzbtgVar.zzp();
            double zze = zzbtgVar.zze();
            zzbjm zzi = zzbtgVar.zzi();
            zzdna zzdnaVar = new zzdna();
            zzdnaVar.zza = 2;
            zzdnaVar.zzb = zzak;
            zzdnaVar.zzc = zzh;
            zzdnaVar.zzd = view;
            zzdnaVar.zzZ("headline", zzo);
            zzdnaVar.zze = zzr;
            zzdnaVar.zzZ(t2.h.E0, zzm);
            zzdnaVar.zzh = zzf;
            zzdnaVar.zzZ("call_to_action", zzn);
            zzdnaVar.zzo = view2;
            zzdnaVar.zzq = zzl;
            zzdnaVar.zzZ(t2.h.U, zzq);
            zzdnaVar.zzZ("price", zzp);
            zzdnaVar.zzr = zze;
            zzdnaVar.zzs = zzi;
            return zzdnaVar;
        } catch (RemoteException e) {
            zzcec.zzk("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static zzdna zzah(zzbth zzbthVar) {
        try {
            zzdmz zzak = zzak(zzbthVar.zzf(), null);
            zzbjf zzg = zzbthVar.zzg();
            View view = (View) zzam(zzbthVar.zzi());
            String zzo = zzbthVar.zzo();
            List zzp = zzbthVar.zzp();
            String zzm = zzbthVar.zzm();
            Bundle zze = zzbthVar.zze();
            String zzn = zzbthVar.zzn();
            View view2 = (View) zzam(zzbthVar.zzj());
            IObjectWrapper zzk = zzbthVar.zzk();
            String zzl = zzbthVar.zzl();
            zzbjm zzh = zzbthVar.zzh();
            zzdna zzdnaVar = new zzdna();
            zzdnaVar.zza = 1;
            zzdnaVar.zzb = zzak;
            zzdnaVar.zzc = zzg;
            zzdnaVar.zzd = view;
            zzdnaVar.zzZ("headline", zzo);
            zzdnaVar.zze = zzp;
            zzdnaVar.zzZ(t2.h.E0, zzm);
            zzdnaVar.zzh = zze;
            zzdnaVar.zzZ("call_to_action", zzn);
            zzdnaVar.zzo = view2;
            zzdnaVar.zzq = zzk;
            zzdnaVar.zzZ(t2.h.F0, zzl);
            zzdnaVar.zzt = zzh;
            return zzdnaVar;
        } catch (RemoteException e) {
            zzcec.zzk("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzdna zzai(zzbtg zzbtgVar) {
        try {
            return zzal(zzak(zzbtgVar.zzg(), null), zzbtgVar.zzh(), (View) zzam(zzbtgVar.zzj()), zzbtgVar.zzo(), zzbtgVar.zzr(), zzbtgVar.zzm(), zzbtgVar.zzf(), zzbtgVar.zzn(), (View) zzam(zzbtgVar.zzk()), zzbtgVar.zzl(), zzbtgVar.zzq(), zzbtgVar.zzp(), zzbtgVar.zze(), zzbtgVar.zzi(), null, 0.0f);
        } catch (RemoteException e) {
            zzcec.zzk("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzdna zzaj(zzbth zzbthVar) {
        try {
            return zzal(zzak(zzbthVar.zzf(), null), zzbthVar.zzg(), (View) zzam(zzbthVar.zzi()), zzbthVar.zzo(), zzbthVar.zzp(), zzbthVar.zzm(), zzbthVar.zze(), zzbthVar.zzn(), (View) zzam(zzbthVar.zzj()), zzbthVar.zzk(), null, null, -1.0d, zzbthVar.zzh(), zzbthVar.zzl(), 0.0f);
        } catch (RemoteException e) {
            zzcec.zzk("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzdmz zzak(com.google.android.gms.ads.internal.client.zzdq zzdqVar, zzbtk zzbtkVar) {
        if (zzdqVar == null) {
            return null;
        }
        return new zzdmz(zzdqVar, zzbtkVar);
    }

    private static zzdna zzal(com.google.android.gms.ads.internal.client.zzdq zzdqVar, zzbjf zzbjfVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbjm zzbjmVar, String str6, float f) {
        zzdna zzdnaVar = new zzdna();
        zzdnaVar.zza = 6;
        zzdnaVar.zzb = zzdqVar;
        zzdnaVar.zzc = zzbjfVar;
        zzdnaVar.zzd = view;
        zzdnaVar.zzZ("headline", str);
        zzdnaVar.zze = list;
        zzdnaVar.zzZ(t2.h.E0, str2);
        zzdnaVar.zzh = bundle;
        zzdnaVar.zzZ("call_to_action", str3);
        zzdnaVar.zzo = view2;
        zzdnaVar.zzq = iObjectWrapper;
        zzdnaVar.zzZ(t2.h.U, str4);
        zzdnaVar.zzZ("price", str5);
        zzdnaVar.zzr = d;
        zzdnaVar.zzs = zzbjmVar;
        zzdnaVar.zzZ(t2.h.F0, str6);
        zzdnaVar.zzR(f);
        return zzdnaVar;
    }

    private static Object zzam(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    public static zzdna zzt(zzbtk zzbtkVar) {
        try {
            return zzal(zzak(zzbtkVar.zzj(), zzbtkVar), zzbtkVar.zzk(), (View) zzam(zzbtkVar.zzm()), zzbtkVar.zzs(), zzbtkVar.zzv(), zzbtkVar.zzq(), zzbtkVar.zzi(), zzbtkVar.zzr(), (View) zzam(zzbtkVar.zzn()), zzbtkVar.zzo(), zzbtkVar.zzu(), zzbtkVar.zzt(), zzbtkVar.zze(), zzbtkVar.zzl(), zzbtkVar.zzp(), zzbtkVar.zzf());
        } catch (RemoteException e) {
            zzcec.zzk("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public final String zzA() {
        String str;
        synchronized (this) {
            str = this.zzu;
        }
        return str;
    }

    public final String zzB() {
        String zzF;
        synchronized (this) {
            zzF = zzF("headline");
        }
        return zzF;
    }

    public final String zzC() {
        String str;
        synchronized (this) {
            str = this.zzy;
        }
        return str;
    }

    public final String zzD() {
        String zzF;
        synchronized (this) {
            zzF = zzF("price");
        }
        return zzF;
    }

    public final String zzE() {
        String zzF;
        synchronized (this) {
            zzF = zzF(t2.h.U);
        }
        return zzF;
    }

    public final String zzF(String str) {
        String str2;
        synchronized (this) {
            str2 = (String) this.zzw.get(str);
        }
        return str2;
    }

    public final List zzG() {
        List list;
        synchronized (this) {
            list = this.zze;
        }
        return list;
    }

    public final List zzH() {
        List list;
        synchronized (this) {
            list = this.zzf;
        }
        return list;
    }

    public final void zzI() {
        synchronized (this) {
            zzcjk zzcjkVar = this.zzi;
            if (zzcjkVar != null) {
                zzcjkVar.destroy();
                this.zzi = null;
            }
            zzcjk zzcjkVar2 = this.zzj;
            if (zzcjkVar2 != null) {
                zzcjkVar2.destroy();
                this.zzj = null;
            }
            zzcjk zzcjkVar3 = this.zzk;
            if (zzcjkVar3 != null) {
                zzcjkVar3.destroy();
                this.zzk = null;
            }
            ListenableFuture listenableFuture = this.zzm;
            if (listenableFuture != null) {
                listenableFuture.cancel(false);
                this.zzm = null;
            }
            zzceu zzceuVar = this.zzn;
            if (zzceuVar != null) {
                zzceuVar.cancel(false);
                this.zzn = null;
            }
            this.zzl = null;
            this.zzv.clear();
            this.zzw.clear();
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzh = null;
            this.zzo = null;
            this.zzp = null;
            this.zzq = null;
            this.zzs = null;
            this.zzt = null;
            this.zzu = null;
        }
    }

    public final void zzJ(zzbjf zzbjfVar) {
        synchronized (this) {
            this.zzc = zzbjfVar;
        }
    }

    public final void zzK(String str) {
        synchronized (this) {
            this.zzu = str;
        }
    }

    public final void zzL(com.google.android.gms.ads.internal.client.zzel zzelVar) {
        synchronized (this) {
            this.zzg = zzelVar;
        }
    }

    public final void zzM(zzbjm zzbjmVar) {
        synchronized (this) {
            this.zzs = zzbjmVar;
        }
    }

    public final void zzN(String str, zzbiz zzbizVar) {
        synchronized (this) {
            if (zzbizVar == null) {
                this.zzv.remove(str);
            } else {
                this.zzv.put(str, zzbizVar);
            }
        }
    }

    public final void zzO(zzcjk zzcjkVar) {
        synchronized (this) {
            this.zzj = zzcjkVar;
        }
    }

    public final void zzP(List list) {
        synchronized (this) {
            this.zze = list;
        }
    }

    public final void zzQ(zzbjm zzbjmVar) {
        synchronized (this) {
            this.zzt = zzbjmVar;
        }
    }

    public final void zzR(float f) {
        synchronized (this) {
            this.zzx = f;
        }
    }

    public final void zzS(List list) {
        synchronized (this) {
            this.zzf = list;
        }
    }

    public final void zzT(zzcjk zzcjkVar) {
        synchronized (this) {
            this.zzk = zzcjkVar;
        }
    }

    public final void zzU(ListenableFuture listenableFuture) {
        synchronized (this) {
            this.zzm = listenableFuture;
        }
    }

    public final void zzV(String str) {
        synchronized (this) {
            this.zzy = str;
        }
    }

    public final void zzW(zzfod zzfodVar) {
        synchronized (this) {
            this.zzl = zzfodVar;
        }
    }

    public final void zzX(zzceu zzceuVar) {
        synchronized (this) {
            this.zzn = zzceuVar;
        }
    }

    public final void zzY(double d) {
        synchronized (this) {
            this.zzr = d;
        }
    }

    public final void zzZ(String str, String str2) {
        synchronized (this) {
            if (str2 == null) {
                this.zzw.remove(str);
            } else {
                this.zzw.put(str, str2);
            }
        }
    }

    public final double zza() {
        double d;
        synchronized (this) {
            d = this.zzr;
        }
        return d;
    }

    public final void zzaa(int i) {
        synchronized (this) {
            this.zza = i;
        }
    }

    public final void zzab(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        synchronized (this) {
            this.zzb = zzdqVar;
        }
    }

    public final void zzac(View view) {
        synchronized (this) {
            this.zzo = view;
        }
    }

    public final void zzad(zzcjk zzcjkVar) {
        synchronized (this) {
            this.zzi = zzcjkVar;
        }
    }

    public final void zzae(View view) {
        synchronized (this) {
            this.zzp = view;
        }
    }

    public final boolean zzaf() {
        zzcjk zzcjkVar;
        synchronized (this) {
            zzcjkVar = this.zzj;
        }
        return zzcjkVar != null;
    }

    public final float zzb() {
        float f;
        synchronized (this) {
            f = this.zzx;
        }
        return f;
    }

    public final int zzc() {
        int i;
        synchronized (this) {
            i = this.zza;
        }
        return i;
    }

    public final Bundle zzd() {
        Bundle bundle;
        synchronized (this) {
            if (this.zzh == null) {
                this.zzh = new Bundle();
            }
            bundle = this.zzh;
        }
        return bundle;
    }

    public final View zze() {
        View view;
        synchronized (this) {
            view = this.zzd;
        }
        return view;
    }

    public final View zzf() {
        View view;
        synchronized (this) {
            view = this.zzo;
        }
        return view;
    }

    public final View zzg() {
        View view;
        synchronized (this) {
            view = this.zzp;
        }
        return view;
    }

    public final SimpleArrayMap zzh() {
        SimpleArrayMap simpleArrayMap;
        synchronized (this) {
            simpleArrayMap = this.zzv;
        }
        return simpleArrayMap;
    }

    public final SimpleArrayMap zzi() {
        SimpleArrayMap simpleArrayMap;
        synchronized (this) {
            simpleArrayMap = this.zzw;
        }
        return simpleArrayMap;
    }

    public final com.google.android.gms.ads.internal.client.zzdq zzj() {
        com.google.android.gms.ads.internal.client.zzdq zzdqVar;
        synchronized (this) {
            zzdqVar = this.zzb;
        }
        return zzdqVar;
    }

    public final com.google.android.gms.ads.internal.client.zzel zzk() {
        com.google.android.gms.ads.internal.client.zzel zzelVar;
        synchronized (this) {
            zzelVar = this.zzg;
        }
        return zzelVar;
    }

    public final zzbjf zzl() {
        zzbjf zzbjfVar;
        synchronized (this) {
            zzbjfVar = this.zzc;
        }
        return zzbjfVar;
    }

    public final zzbjm zzm() {
        List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.zze.get(0);
        if (obj instanceof IBinder) {
            return zzbjl.zzg((IBinder) obj);
        }
        return null;
    }

    public final zzbjm zzn() {
        zzbjm zzbjmVar;
        synchronized (this) {
            zzbjmVar = this.zzs;
        }
        return zzbjmVar;
    }

    public final zzbjm zzo() {
        zzbjm zzbjmVar;
        synchronized (this) {
            zzbjmVar = this.zzt;
        }
        return zzbjmVar;
    }

    public final zzceu zzp() {
        zzceu zzceuVar;
        synchronized (this) {
            zzceuVar = this.zzn;
        }
        return zzceuVar;
    }

    public final zzcjk zzq() {
        zzcjk zzcjkVar;
        synchronized (this) {
            zzcjkVar = this.zzj;
        }
        return zzcjkVar;
    }

    public final zzcjk zzr() {
        zzcjk zzcjkVar;
        synchronized (this) {
            zzcjkVar = this.zzk;
        }
        return zzcjkVar;
    }

    public final zzcjk zzs() {
        zzcjk zzcjkVar;
        synchronized (this) {
            zzcjkVar = this.zzi;
        }
        return zzcjkVar;
    }

    public final zzfod zzu() {
        zzfod zzfodVar;
        synchronized (this) {
            zzfodVar = this.zzl;
        }
        return zzfodVar;
    }

    public final IObjectWrapper zzv() {
        IObjectWrapper iObjectWrapper;
        synchronized (this) {
            iObjectWrapper = this.zzq;
        }
        return iObjectWrapper;
    }

    public final ListenableFuture zzw() {
        ListenableFuture listenableFuture;
        synchronized (this) {
            listenableFuture = this.zzm;
        }
        return listenableFuture;
    }

    public final String zzx() {
        String zzF;
        synchronized (this) {
            zzF = zzF(t2.h.F0);
        }
        return zzF;
    }

    public final String zzy() {
        String zzF;
        synchronized (this) {
            zzF = zzF(t2.h.E0);
        }
        return zzF;
    }

    public final String zzz() {
        String zzF;
        synchronized (this) {
            zzF = zzF("call_to_action");
        }
        return zzF;
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import com.ironsource.t2;
import java.util.Set;

/* loaded from: zzbvq.class */
public final class zzbvq extends zzbvw {
    static final Set zza = CollectionUtils.setOf(t2.e.c, t2.e.b, "top-center", "center", t2.e.e, t2.e.d, "bottom-center");
    private String zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private final Object zzj;
    private final zzcjk zzk;
    private final Activity zzl;
    private zzcla zzm;
    private ImageView zzn;
    private LinearLayout zzo;
    private final zzbvx zzp;
    private PopupWindow zzq;
    private RelativeLayout zzr;
    private ViewGroup zzs;

    public zzbvq(zzcjk zzcjkVar, zzbvx zzbvxVar) {
        super(zzcjkVar, "resize");
        this.zzb = t2.e.b;
        this.zzc = true;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = -1;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = -1;
        this.zzj = new Object();
        this.zzk = zzcjkVar;
        this.zzl = zzcjkVar.zzi();
        this.zzp = zzbvxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzc(boolean z) {
        this.zzq.dismiss();
        this.zzr.removeView((View) this.zzk);
        ViewGroup viewGroup = this.zzs;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzn);
            this.zzs.addView((View) this.zzk);
            this.zzk.zzah(this.zzm);
        }
        if (z) {
            zzl("default");
            zzbvx zzbvxVar = this.zzp;
            if (zzbvxVar != null) {
                zzbvxVar.zzb();
            }
        }
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzo = null;
    }

    public final void zza(final boolean z) {
        synchronized (this.zzj) {
            if (this.zzq != null) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzkp)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    zzc(z);
                } else {
                    zzcep.zze.zza(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.zzbvo
                        public final zzbvq zza;
                        public final boolean zzb;

                        {
                            this.zza = this;
                            this.zzb = z;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzc(this.zzb);
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0436 A[Catch: all -> 0x001a, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x0010, B:7:0x0018, B:10:0x001e, B:12:0x002a, B:13:0x0032, B:15:0x0034, B:17:0x0043, B:18:0x004b, B:20:0x004d, B:22:0x0059, B:23:0x0061, B:25:0x0063, B:27:0x0074, B:29:0x008b, B:31:0x009b, B:33:0x00b2, B:35:0x00c2, B:37:0x00d9, B:39:0x00ea, B:41:0x0102, B:43:0x0113, B:45:0x0127, B:47:0x013a, B:49:0x0140, B:51:0x0146, B:53:0x014d, B:55:0x015b, B:58:0x0166, B:60:0x018a, B:65:0x019e, B:74:0x01c0, B:79:0x0436, B:80:0x043f, B:82:0x0441, B:84:0x0473, B:86:0x047b, B:88:0x0499, B:89:0x0503, B:90:0x0506, B:107:0x0680, B:109:0x06ee, B:112:0x071d, B:114:0x0758, B:116:0x0763, B:118:0x0776, B:120:0x078c, B:121:0x07b1, B:125:0x07b4, B:127:0x07f3, B:129:0x0818, B:131:0x0691, B:132:0x06a2, B:133:0x06b3, B:134:0x06c4, B:135:0x06ce, B:136:0x06df, B:153:0x04fe, B:154:0x081a, B:155:0x0823, B:157:0x01cb, B:159:0x01d2, B:176:0x0294, B:178:0x02a9, B:187:0x0373, B:188:0x02b2, B:190:0x02c7, B:191:0x02d6, B:192:0x02ef, B:193:0x0301, B:194:0x0327, B:195:0x0340, B:212:0x0392, B:214:0x03b1, B:219:0x03f3, B:223:0x0411, B:224:0x03cf, B:228:0x0420, B:229:0x0429, B:230:0x0825, B:231:0x082e, B:233:0x0830, B:234:0x0839), top: B:3:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0441 A[Catch: all -> 0x001a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x0010, B:7:0x0018, B:10:0x001e, B:12:0x002a, B:13:0x0032, B:15:0x0034, B:17:0x0043, B:18:0x004b, B:20:0x004d, B:22:0x0059, B:23:0x0061, B:25:0x0063, B:27:0x0074, B:29:0x008b, B:31:0x009b, B:33:0x00b2, B:35:0x00c2, B:37:0x00d9, B:39:0x00ea, B:41:0x0102, B:43:0x0113, B:45:0x0127, B:47:0x013a, B:49:0x0140, B:51:0x0146, B:53:0x014d, B:55:0x015b, B:58:0x0166, B:60:0x018a, B:65:0x019e, B:74:0x01c0, B:79:0x0436, B:80:0x043f, B:82:0x0441, B:84:0x0473, B:86:0x047b, B:88:0x0499, B:89:0x0503, B:90:0x0506, B:107:0x0680, B:109:0x06ee, B:112:0x071d, B:114:0x0758, B:116:0x0763, B:118:0x0776, B:120:0x078c, B:121:0x07b1, B:125:0x07b4, B:127:0x07f3, B:129:0x0818, B:131:0x0691, B:132:0x06a2, B:133:0x06b3, B:134:0x06c4, B:135:0x06ce, B:136:0x06df, B:153:0x04fe, B:154:0x081a, B:155:0x0823, B:157:0x01cb, B:159:0x01d2, B:176:0x0294, B:178:0x02a9, B:187:0x0373, B:188:0x02b2, B:190:0x02c7, B:191:0x02d6, B:192:0x02ef, B:193:0x0301, B:194:0x0327, B:195:0x0340, B:212:0x0392, B:214:0x03b1, B:219:0x03f3, B:223:0x0411, B:224:0x03cf, B:228:0x0420, B:229:0x0429, B:230:0x0825, B:231:0x082e, B:233:0x0830, B:234:0x0839), top: B:3:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(java.util.Map r9) {
        /*
            Method dump skipped, instructions count: 2112
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvq.zzb(java.util.Map):void");
    }

    public final void zzd(int i, int i2, boolean z) {
        synchronized (this.zzj) {
            this.zzd = i;
            this.zze = i2;
        }
    }

    public final void zze(int i, int i2) {
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean zzf() {
        boolean z;
        synchronized (this.zzj) {
            z = this.zzq != null;
        }
        return z;
    }
}

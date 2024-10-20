package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat$Impl28$;
import bo.app.k0$;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: zzn.class */
public final class zzn {
    private final zzl zza;
    private final Activity zzb;
    private final ConsentDebugSettings zzc;
    private final ConsentRequestParameters zzd;

    public /* synthetic */ zzn(zzl zzlVar, Activity activity, ConsentDebugSettings consentDebugSettings, ConsentRequestParameters consentRequestParameters, zzm zzmVar) {
        this.zza = zzlVar;
        this.zzb = activity;
        this.zzc = consentDebugSettings;
        this.zzd = consentRequestParameters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v138, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v139, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v97, types: [java.util.List] */
    public static /* bridge */ /* synthetic */ zzci zza(zzn zznVar) {
        Bundle bundle;
        Application application;
        Application application2;
        ArrayList arrayList;
        zzap zzapVar;
        Application application3;
        Application application4;
        Application application5;
        List<Rect> boundingRects;
        ArrayList arrayList2;
        Application application6;
        PackageInfo packageInfo;
        Application application7;
        Application application8;
        Application application9;
        zzci zzciVar = new zzci();
        String zza = zznVar.zzd.zza();
        if (TextUtils.isEmpty(zza)) {
            try {
                application = zznVar.zza.zza;
                PackageManager packageManager = application.getPackageManager();
                application2 = zznVar.zza.zza;
                bundle = packageManager.getApplicationInfo(application2.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e) {
                bundle = null;
            }
            if (bundle != null) {
                zza = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(zza)) {
                throw new zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        zzciVar.zza = zza;
        if (zznVar.zzc.isTestDevice()) {
            arrayList = new ArrayList();
            int debugGeography = zznVar.zzc.getDebugGeography();
            if (debugGeography == 1) {
                arrayList.add(zzcd.GEO_OVERRIDE_EEA);
            } else if (debugGeography == 2) {
                arrayList.add(zzcd.GEO_OVERRIDE_NON_EEA);
            }
            arrayList.add(zzcd.PREVIEWING_DEBUG_MESSAGES);
        } else {
            arrayList = Collections.emptyList();
        }
        zzciVar.zzi = arrayList;
        zzapVar = zznVar.zza.zzb;
        zzciVar.zze = zzapVar.zzc();
        zzciVar.zzd = Boolean.valueOf(zznVar.zzd.isTagForUnderAgeOfConsent());
        int i = Build.VERSION.SDK_INT;
        zzciVar.zzc = Locale.getDefault().toLanguageTag();
        zzce zzceVar = new zzce();
        zzceVar.zzb = Integer.valueOf(i);
        zzceVar.zza = Build.MODEL;
        zzceVar.zzc = 2;
        zzciVar.zzb = zzceVar;
        application3 = zznVar.zza.zza;
        Configuration configuration = application3.getResources().getConfiguration();
        application4 = zznVar.zza.zza;
        application4.getResources().getConfiguration();
        zzcg zzcgVar = new zzcg();
        zzcgVar.zza = Integer.valueOf(configuration.screenWidthDp);
        zzcgVar.zzb = Integer.valueOf(configuration.screenHeightDp);
        application5 = zznVar.zza.zza;
        zzcgVar.zzc = Double.valueOf(application5.getResources().getDisplayMetrics().density);
        if (i < 28) {
            arrayList2 = Collections.emptyList();
        } else {
            Activity activity = zznVar.zzb;
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout m = rootWindowInsets == null ? null : WindowInsetsCompat$Impl28$.ExternalSyntheticApiModelOutline0.m(rootWindowInsets);
            if (m == null) {
                arrayList2 = Collections.emptyList();
            } else {
                m.getSafeInsetBottom();
                ArrayList arrayList3 = new ArrayList();
                boundingRects = m.getBoundingRects();
                for (Rect rect : boundingRects) {
                    if (rect != null) {
                        zzcf zzcfVar = new zzcf();
                        zzcfVar.zzb = Integer.valueOf(rect.left);
                        zzcfVar.zzc = Integer.valueOf(rect.right);
                        zzcfVar.zza = Integer.valueOf(rect.top);
                        zzcfVar.zzd = Integer.valueOf(rect.bottom);
                        arrayList3.add(zzcfVar);
                    }
                }
                arrayList2 = arrayList3;
            }
        }
        zzcgVar.zzd = arrayList2;
        zzciVar.zzf = zzcgVar;
        zzl zzlVar = zznVar.zza;
        application6 = zzlVar.zza;
        try {
            application9 = zzlVar.zza;
            packageInfo = application9.getPackageManager().getPackageInfo(application6.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e2) {
            packageInfo = null;
        }
        zzcc zzccVar = new zzcc();
        zzccVar.zza = application6.getPackageName();
        application7 = zznVar.zza.zza;
        PackageManager packageManager2 = application7.getPackageManager();
        application8 = zznVar.zza.zza;
        CharSequence applicationLabel = packageManager2.getApplicationLabel(application8.getApplicationInfo());
        zzccVar.zzb = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            zzccVar.zzc = Long.toString(Build.VERSION.SDK_INT >= 28 ? k0$.ExternalSyntheticApiModelOutline1.m(packageInfo) : packageInfo.versionCode);
        }
        zzciVar.zzg = zzccVar;
        zzch zzchVar = new zzch();
        zzchVar.zza = "2.2.0";
        zzciVar.zzh = zzchVar;
        return zzciVar;
    }
}

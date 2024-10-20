package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.common.base.Preconditions;
import com.ironsource.t2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: zzgr.class */
public final class zzgr implements zzgy {
    private static final Map<Uri, zzgr> zza = new ArrayMap();
    private static final String[] zzb = {t2.h.W, "value"};
    private final ContentResolver zzc;
    private final Uri zzd;
    private final Runnable zze;
    private final ContentObserver zzf;
    private final Object zzg;
    private volatile Map<String, String> zzh;
    private final List<zzgw> zzi;

    private zzgr(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzgt zzgtVar = new zzgt(this, null);
        this.zzf = zzgtVar;
        this.zzg = new Object();
        this.zzi = new ArrayList();
        Preconditions.checkNotNull(contentResolver);
        Preconditions.checkNotNull(uri);
        this.zzc = contentResolver;
        this.zzd = uri;
        this.zze = runnable;
        contentResolver.registerContentObserver(uri, false, zzgtVar);
    }

    public static zzgr zza(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzgr zzgrVar;
        synchronized (zzgr.class) {
            try {
                Map<Uri, zzgr> map = zza;
                zzgr zzgrVar2 = map.get(uri);
                zzgrVar = zzgrVar2;
                if (zzgrVar2 == null) {
                    try {
                        zzgrVar = new zzgr(contentResolver, uri, runnable);
                        try {
                            map.put(uri, zzgrVar);
                        } catch (SecurityException e) {
                        }
                    } catch (SecurityException e2) {
                        zzgrVar = zzgrVar2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzc() {
        synchronized (zzgr.class) {
            try {
                for (zzgr zzgrVar : zza.values()) {
                    zzgrVar.zzc.unregisterContentObserver(zzgrVar.zzf);
                }
                zza.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final Map<String, String> zze() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                return (Map) zzgx.zza(new zzha(this) { // from class: com.google.android.gms.internal.measurement.zzgu
                    private zzgr zza;

                    {
                        this.zza = this;
                    }

                    @Override // com.google.android.gms.internal.measurement.zzha
                    public final Object zza() {
                        return this.zza.zzb();
                    }
                });
            } catch (SQLiteException | IllegalStateException | SecurityException e) {
                Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return null;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final /* synthetic */ Object zza(String str) {
        return zza().get(str);
    }

    public final Map<String, String> zza() {
        Map<String, String> map = this.zzh;
        Map<String, String> map2 = map;
        if (map == null) {
            synchronized (this.zzg) {
                Map<String, String> map3 = this.zzh;
                map2 = map3;
                if (map3 == null) {
                    map2 = zze();
                    this.zzh = map2;
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Map zzb() {
        Cursor query = this.zzc.query(this.zzd, zzb, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            ArrayMap arrayMap = count <= 256 ? new ArrayMap(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                arrayMap.put(query.getString(0), query.getString(1));
            }
            query.close();
            return arrayMap;
        } finally {
            query.close();
        }
    }

    public final void zzd() {
        synchronized (this.zzg) {
            this.zzh = null;
            this.zze.run();
        }
        synchronized (this) {
            Iterator<zzgw> it = this.zzi.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Callable;

/* loaded from: zzehh.class */
public final class zzehh extends SQLiteOpenHelper {
    private final Context zza;
    private final zzgey zzb;

    public zzehh(Context context, zzgey zzgeyVar) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzik)).intValue());
        this.zza = context;
        this.zzb = zzgeyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Void zzb(zzceh zzcehVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        zzj(sQLiteDatabase, zzcehVar);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(SQLiteDatabase sQLiteDatabase, String str, zzceh zzcehVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzcehVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, zzceh zzcehVar) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i] = query.getString(columnIndex);
                }
                i++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            for (int i2 = 0; i2 < count; i2++) {
                zzcehVar.zza(strArr[i2]);
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Void zza(zzehj zzehjVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzehjVar.zza));
        contentValues.put("gws_query_id", zzehjVar.zzb);
        contentValues.put("url", zzehjVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzehjVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.util.zzbt zzy = com.google.android.gms.ads.internal.util.zzt.zzy(this.zza);
        if (zzy == null) {
            return null;
        }
        try {
            zzy.zze(ObjectWrapper.wrap(this.zza));
            return null;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e);
            return null;
        }
    }

    public final void zzc(final String str) {
        zze(new zzfkp(this, str) { // from class: com.google.android.gms.internal.ads.zzehf
            public final zzehh zza;
            public final String zzb;

            {
                this.zza = this;
                this.zzb = str;
            }

            @Override // com.google.android.gms.internal.ads.zzfkp
            public final Object zza(Object obj) {
                zzehh.zzi((SQLiteDatabase) obj, this.zzb);
                return null;
            }
        });
    }

    public final void zzd(final zzehj zzehjVar) {
        zze(new zzfkp(this, zzehjVar) { // from class: com.google.android.gms.internal.ads.zzehb
            public final zzehh zza;
            public final zzehj zzb;

            {
                this.zza = this;
                this.zzb = zzehjVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfkp
            public final Object zza(Object obj) {
                this.zza.zza(this.zzb, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(zzfkp zzfkpVar) {
        zzgen.zzr(this.zzb.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzehd
            public final zzehh zza;

            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.getWritableDatabase();
            }
        }), new zzehg(this, zzfkpVar), this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzg(final SQLiteDatabase sQLiteDatabase, final zzceh zzcehVar, final String str) {
        this.zzb.execute(new Runnable(sQLiteDatabase, str, zzcehVar) { // from class: com.google.android.gms.internal.ads.zzehe
            public final SQLiteDatabase zza;
            public final String zzb;
            public final zzceh zzc;

            {
                this.zza = sQLiteDatabase;
                this.zzb = str;
                this.zzc = zzcehVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzehh.zzf(this.zza, this.zzb, this.zzc);
            }
        });
    }

    public final void zzh(final zzceh zzcehVar, final String str) {
        zze(new zzfkp(this, zzcehVar, str) { // from class: com.google.android.gms.internal.ads.zzehc
            public final zzehh zza;
            public final zzceh zzb;
            public final String zzc;

            {
                this.zza = this;
                this.zzb = zzcehVar;
                this.zzc = str;
            }

            @Override // com.google.android.gms.internal.ads.zzfkp
            public final Object zza(Object obj) {
                this.zza.zzg((SQLiteDatabase) obj, this.zzb, this.zzc);
                return null;
            }
        });
    }
}

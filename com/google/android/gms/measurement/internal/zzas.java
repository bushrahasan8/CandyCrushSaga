package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: zzas.class */
public final class zzas {
    private static Set<String> zza(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(zzgb zzgbVar, SQLiteDatabase sQLiteDatabase) {
        if (zzgbVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(com.google.android.gms.internal.measurement.zzci.zza().zza(sQLiteDatabase.getPath()));
        if (!file.setReadable(false, false)) {
            zzgbVar.zzu().zza("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            zzgbVar.zzu().zza("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            zzgbVar.zzu().zza("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        zzgbVar.zzu().zza("Failed to turn on database write permission for owner");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(zzgb zzgbVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLiteException {
        if (zzgbVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        if (!zza(zzgbVar, sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            Set<String> zza = zza(sQLiteDatabase, str);
            for (String str4 : str3.split(",")) {
                if (!zza.remove(str4)) {
                    throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                }
            }
            if (strArr != null) {
                for (int i = 0; i < strArr.length; i += 2) {
                    if (!zza.remove(strArr[i])) {
                        sQLiteDatabase.execSQL(strArr[i + 1]);
                    }
                }
            }
            if (zza.isEmpty()) {
                return;
            }
            zzgbVar.zzu().zza("Table has extra columns. table, columns", str, TextUtils.join(", ", zza));
        } catch (SQLiteException e) {
            zzgbVar.zzg().zza("Failed to verify columns on table that was just created", str);
            throw e;
        }
    }

    private static boolean zza(zzgb zzgbVar, SQLiteDatabase sQLiteDatabase, String str) {
        if (zzgbVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursor = null;
        Cursor cursor2 = null;
        try {
            try {
                Cursor query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                cursor2 = query;
                cursor = query;
                boolean moveToFirst = query.moveToFirst();
                query.close();
                return moveToFirst;
            } catch (SQLiteException e) {
                cursor2 = cursor;
                zzgbVar.zzu().zza("Error querying for table", str, e);
                if (cursor == null) {
                    return false;
                }
                cursor.close();
                return false;
            }
        } catch (Throwable th) {
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }
}

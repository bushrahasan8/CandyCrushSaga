package com.ironsource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;

/* loaded from: l3.class */
public class l3 extends SQLiteOpenHelper {
    public l3(Context context) {
        super(context, "reports", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static Cursor a(int i) {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = new l3(e3.d().a()).getReadableDatabase();
            try {
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM REPORTSWHERE id= " + i + ";", null);
                sQLiteDatabase.close();
                return rawQuery;
            } catch (Throwable th) {
                th = th;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
        }
    }

    public static void a() {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = new l3(e3.d().a()).getWritableDatabase();
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase = null;
        }
        try {
            sQLiteDatabase.execSQL("DELETE FROM REPORTS WHERE id >= 0;");
            sQLiteDatabase.close();
        } catch (Throwable th2) {
            th = th2;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    public static void a(u4 u4Var) {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = new l3(e3.d().a()).getWritableDatabase();
            try {
                sQLiteDatabase.beginTransaction();
                ContentValues contentValues = new ContentValues();
                String e = u4Var.e();
                String b = u4Var.b();
                String d = u4Var.d();
                contentValues.put("stack_trace", e);
                contentValues.put("crash_date", b);
                contentValues.put("crashType", d);
                sQLiteDatabase.insert("REPORTS", null, contentValues);
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                sQLiteDatabase.close();
            } catch (Throwable th) {
                th = th;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
        }
    }

    public static u4 b(int i) {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = new l3(e3.d().a()).getReadableDatabase();
            try {
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM REPORTSWHERE id= " + i + ";", null);
                int i2 = rawQuery.getInt(0);
                String string = rawQuery.getString(1);
                String string2 = rawQuery.getString(2);
                String string3 = rawQuery.getString(3);
                rawQuery.close();
                u4 u4Var = new u4(i2, string, string2, string3);
                sQLiteDatabase.close();
                return u4Var;
            } catch (Throwable th) {
                th = th;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0076, code lost:
    
        if (r0.moveToNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0088, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        if (r0.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        r0.add(new com.ironsource.u4(r0.getInt(0), r0.getString(1), r0.getString(2), r0.getString(3)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<com.ironsource.u4> b() {
        /*
            com.ironsource.l3 r0 = new com.ironsource.l3
            r1 = r0
            com.ironsource.e3 r2 = com.ironsource.e3.d()
            android.content.Context r2 = r2.a()
            r1.<init>(r2)
            r7 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r7
            android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()     // Catch: java.lang.Throwable -> L8d
            r7 = r0
            r0 = r7
            java.lang.String r1 = "SELECT * FROM REPORTS ;"
            r2 = 0
            android.database.Cursor r0 = r0.rawQuery(r1, r2)     // Catch: java.lang.Throwable -> L7c
            r12 = r0
            r0 = r12
            boolean r0 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L80
        L30:
            r0 = r12
            r1 = 0
            int r0 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L7c
            r6 = r0
            r0 = r12
            r1 = 1
            java.lang.String r0 = r0.getString(r1)     // Catch: java.lang.Throwable -> L7c
            r11 = r0
            r0 = r12
            r1 = 2
            java.lang.String r0 = r0.getString(r1)     // Catch: java.lang.Throwable -> L7c
            r9 = r0
            r0 = r12
            r1 = 3
            java.lang.String r0 = r0.getString(r1)     // Catch: java.lang.Throwable -> L7c
            r10 = r0
            com.ironsource.u4 r0 = new com.ironsource.u4     // Catch: java.lang.Throwable -> L7c
            r13 = r0
            r0 = r13
            r1 = r6
            r2 = r11
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L7c
            r0 = r8
            r1 = r13
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L7c
            r0 = r12
            boolean r0 = r0.moveToNext()     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L30
            goto L80
        L7c:
            r8 = move-exception
            goto L90
        L80:
            r0 = r12
            r0.close()     // Catch: java.lang.Throwable -> L7c
            r0 = r7
            r0.close()
            r0 = r8
            return r0
        L8d:
            r8 = move-exception
            r0 = r9
            r7 = r0
        L90:
            r0 = r7
            if (r0 == 0) goto L98
            r0 = r7
            r0.close()
        L98:
            r0 = r8
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.l3.b():java.util.List");
    }

    public static Cursor c() {
        Throwable th;
        SQLiteDatabase readableDatabase;
        l3 l3Var = new l3(e3.d().a());
        new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            readableDatabase = l3Var.getReadableDatabase();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Cursor rawQuery = readableDatabase.rawQuery("SELECT * FROM REPORTS;", null);
            readableDatabase.close();
            return rawQuery;
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = readableDatabase;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS REPORTS(id INTEGER PRIMARY KEY AUTOINCREMENT , stack_trace TEXT NOT NULL, crash_date TEXT NOT NULL,crashType TEXT NOT NULL );");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}

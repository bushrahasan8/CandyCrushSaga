package com.ironsource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: k3.class */
public class k3 extends SQLiteOpenHelper implements g6 {
    private static k3 e;
    private final int a;
    private final int b;
    private final String c;
    private final String d;

    public k3(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.a = 4;
        this.b = 400;
        this.c = "DROP TABLE IF EXISTS events";
        this.d = "CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )";
    }

    private ContentValues a(l4 l4Var, String str) {
        ContentValues contentValues;
        if (l4Var != null) {
            ContentValues contentValues2 = new ContentValues(4);
            contentValues2.put(m4.t, Integer.valueOf(l4Var.c()));
            contentValues2.put("timestamp", Long.valueOf(l4Var.d()));
            contentValues2.put("type", str);
            contentValues2.put("data", l4Var.a());
            contentValues = contentValues2;
        } else {
            contentValues = null;
        }
        return contentValues;
    }

    private SQLiteDatabase a(boolean z) {
        synchronized (this) {
            int i = 0;
            while (true) {
                try {
                    if (z) {
                        return getWritableDatabase();
                    }
                    return getReadableDatabase();
                } finally {
                }
            }
        }
    }

    public static k3 a(Context context, String str, int i) {
        k3 k3Var;
        synchronized (k3.class) {
            try {
                if (e == null) {
                    e = new k3(context, str, i);
                }
                k3Var = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return k3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0156, code lost:
    
        if (r10.isOpen() != false) goto L74;
     */
    @Override // com.ironsource.g6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList<com.ironsource.l4> a(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.k3.a(java.lang.String):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
    
        if (r9.isOpen() != false) goto L38;
     */
    @Override // com.ironsource.g6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.util.List<com.ironsource.l4> r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = r5
            monitor-enter(r0)
            r0 = r6
            if (r0 == 0) goto Lac
            r0 = r6
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6f
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L14
            goto Lac
        L14:
            r0 = 0
            r10 = r0
            r0 = r5
            r1 = 1
            android.database.sqlite.SQLiteDatabase r0 = r0.a(r1)     // Catch: java.lang.Throwable -> L73
            r9 = r0
            r0 = r6
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L56
            r10 = r0
        L26:
            r0 = r10
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L5d
            r0 = r5
            r1 = r10
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L56
            com.ironsource.l4 r1 = (com.ironsource.l4) r1     // Catch: java.lang.Throwable -> L56
            r2 = r7
            android.content.ContentValues r0 = r0.a(r1, r2)     // Catch: java.lang.Throwable -> L56
            r6 = r0
            r0 = r9
            if (r0 == 0) goto L26
            r0 = r6
            if (r0 == 0) goto L26
            r0 = r9
            java.lang.String r1 = "events"
            r2 = 0
            r3 = r6
            long r0 = r0.insert(r1, r2, r3)     // Catch: java.lang.Throwable -> L56
            goto L26
        L56:
            r7 = move-exception
            r0 = r9
            r6 = r0
            goto L77
        L5d:
            r0 = r9
            if (r0 == 0) goto L93
            r0 = r9
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L6f
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L93
            goto L8e
        L6f:
            r6 = move-exception
            goto La8
        L73:
            r7 = move-exception
            r0 = r10
            r6 = r0
        L77:
            java.lang.String r0 = "IronSource"
            java.lang.String r1 = "Exception while saving events: "
            r2 = r7
            int r0 = android.util.Log.e(r0, r1, r2)     // Catch: java.lang.Throwable -> L96
            r0 = r6
            if (r0 == 0) goto L93
            r0 = r6
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L93
            r0 = r6
            r9 = r0
        L8e:
            r0 = r9
            r0.close()     // Catch: java.lang.Throwable -> L6f
        L93:
            r0 = r5
            monitor-exit(r0)
            return
        L96:
            r7 = move-exception
            r0 = r6
            if (r0 == 0) goto La6
            r0 = r6
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto La6
            r0 = r6
            r0.close()     // Catch: java.lang.Throwable -> L6f
        La6:
            r0 = r7
            throw r0     // Catch: java.lang.Throwable -> L6f
        La8:
            r0 = r5
            monitor-exit(r0)
            r0 = r6
            throw r0
        Lac:
            r0 = r5
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.k3.a(java.util.List, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r9.isOpen() != false) goto L21;
     */
    @Override // com.ironsource.g6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.lang.String r9) {
        /*
            r8 = this;
            r0 = r8
            monitor-enter(r0)
            r0 = r8
            r1 = 1
            android.database.sqlite.SQLiteDatabase r0 = r0.a(r1)     // Catch: java.lang.Throwable -> L32
            r11 = r0
            r0 = r11
            java.lang.String r1 = "events"
            java.lang.String r2 = "type = ?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L2b
            r4 = r3
            r5 = 0
            r6 = r9
            r4[r5] = r6     // Catch: java.lang.Throwable -> L2b
            int r0 = r0.delete(r1, r2, r3)     // Catch: java.lang.Throwable -> L2b
            r0 = r11
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L27
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L4f
            r0 = r11
            r9 = r0
            goto L4b
        L27:
            r9 = move-exception
            goto L64
        L2b:
            r12 = move-exception
            r0 = r11
            r9 = r0
            goto L36
        L32:
            r12 = move-exception
            r0 = 0
            r9 = r0
        L36:
            java.lang.String r0 = "IronSource"
            java.lang.String r1 = "Exception while clearing events: "
            r2 = r12
            int r0 = android.util.Log.e(r0, r1, r2)     // Catch: java.lang.Throwable -> L52
            r0 = r9
            if (r0 == 0) goto L4f
            r0 = r9
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L4f
        L4b:
            r0 = r9
            r0.close()     // Catch: java.lang.Throwable -> L27
        L4f:
            r0 = r8
            monitor-exit(r0)
            return
        L52:
            r11 = move-exception
            r0 = r9
            if (r0 == 0) goto L62
            r0 = r9
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L62
            r0 = r9
            r0.close()     // Catch: java.lang.Throwable -> L27
        L62:
            r0 = r11
            throw r0     // Catch: java.lang.Throwable -> L27
        L64:
            r0 = r8
            monitor-exit(r0)
            r0 = r9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.k3.b(java.lang.String):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sQLiteDatabase);
    }
}

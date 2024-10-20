package androidx.sqlite.db;

/* loaded from: SupportSQLiteStatement.class */
public interface SupportSQLiteStatement extends SupportSQLiteProgram {
    long executeInsert();

    int executeUpdateDelete();
}

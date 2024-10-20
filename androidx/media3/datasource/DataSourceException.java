package androidx.media3.datasource;

import java.io.IOException;

/* loaded from: DataSourceException.class */
public class DataSourceException extends IOException {
    public final int reason;

    public DataSourceException(int i) {
        this.reason = i;
    }

    public DataSourceException(String str, int i) {
        super(str);
        this.reason = i;
    }

    public DataSourceException(String str, Throwable th, int i) {
        super(str, th);
        this.reason = i;
    }

    public DataSourceException(Throwable th, int i) {
        super(th);
        this.reason = i;
    }

    public static boolean isCausedByPositionOutOfRange(IOException iOException) {
        while (iOException != null) {
            if ((iOException instanceof DataSourceException) && ((DataSourceException) iOException).reason == 2008) {
                return true;
            }
            iOException = iOException.getCause();
        }
        return false;
    }
}

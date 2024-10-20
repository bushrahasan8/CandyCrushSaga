package com.king.amp.sa;

/* loaded from: LogImpl.class */
public class LogImpl implements ALog {
    @Override // com.king.amp.sa.ALog
    public void log(String str, String str2) {
        Logging.logDebug(str, str2);
    }

    @Override // com.king.amp.sa.ALog
    public void warning(String str, String str2) {
        Logging.logWarning(str, str2);
    }
}

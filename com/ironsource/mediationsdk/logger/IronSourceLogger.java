package com.ironsource.mediationsdk.logger;

/* loaded from: IronSourceLogger.class */
public abstract class IronSourceLogger {
    int a;
    private String b;

    /* loaded from: IronSourceLogger$IronSourceLogLevel.class */
    public class IronSourceLogLevel {
        public static final int ERROR = 3;
        public static final int INFO = 1;
        public static final int VERBOSE = 0;
        public static final int WARNING = 2;
        final IronSourceLogger a;

        public IronSourceLogLevel(IronSourceLogger ironSourceLogger) {
            this.a = ironSourceLogger;
        }
    }

    /* loaded from: IronSourceLogger$IronSourceTag.class */
    public enum IronSourceTag {
        API,
        ADAPTER_API,
        CALLBACK,
        ADAPTER_CALLBACK,
        NETWORK,
        INTERNAL,
        NATIVE,
        EVENT
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IronSourceLogger(String str) {
        this.b = str;
        this.a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IronSourceLogger(String str, int i) {
        this.b = str;
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null) {
            z = false;
            if (obj instanceof IronSourceLogger) {
                IronSourceLogger ironSourceLogger = (IronSourceLogger) obj;
                String str = this.b;
                z = false;
                if (str != null) {
                    z = false;
                    if (str.equals(ironSourceLogger.b)) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public abstract void log(IronSourceTag ironSourceTag, String str, int i);

    public abstract void logException(IronSourceTag ironSourceTag, String str, Throwable th);

    public void setDebugLevel(int i) {
        this.a = i;
    }
}

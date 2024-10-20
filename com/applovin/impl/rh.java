package com.applovin.impl;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import com.applovin.impl.r2;
import com.facebook.ads.AdError;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: rh.class */
public class rh extends Exception implements r2 {
    public static final r2.a c = new r2.a() { // from class: com.applovin.impl.rh$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.r2.a
        public final r2 a(Bundle bundle) {
            return new rh(bundle);
        }
    };
    public final int a;
    public final long b;

    public rh(Bundle bundle) {
        this(bundle.getString(b(2)), a(bundle), bundle.getInt(b(0), 1000), bundle.getLong(b(1), SystemClock.elapsedRealtime()));
    }

    public rh(String str, Throwable th, int i, long j) {
        super(str, th);
        this.a = i;
        this.b = j;
    }

    private static RemoteException a(String str) {
        return new RemoteException(str);
    }

    public static String a(int i) {
        if (i == 5001) {
            return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
        }
        if (i == 5002) {
            return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
        }
        switch (i) {
            case 1000:
                return "ERROR_CODE_UNSPECIFIED";
            case 1001:
                return "ERROR_CODE_REMOTE_ERROR";
            case 1002:
                return "ERROR_CODE_BEHIND_LIVE_WINDOW";
            case 1003:
                return "ERROR_CODE_TIMEOUT";
            case 1004:
                return "ERROR_CODE_FAILED_RUNTIME_CHECK";
            default:
                switch (i) {
                    case 2000:
                        return "ERROR_CODE_IO_UNSPECIFIED";
                    case 2001:
                        return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                    case 2002:
                        return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                    case 2003:
                        return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                    case 2004:
                        return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                    case 2005:
                        return "ERROR_CODE_IO_FILE_NOT_FOUND";
                    case 2006:
                        return "ERROR_CODE_IO_NO_PERMISSION";
                    case 2007:
                        return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                    case 2008:
                        return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                    default:
                        switch (i) {
                            case 3001:
                                return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                            case 3002:
                                return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                            case AuthApiStatusCodes.AUTH_API_SERVER_ERROR /* 3003 */:
                                return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                            case AuthApiStatusCodes.AUTH_TOKEN_ERROR /* 3004 */:
                                return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                            default:
                                switch (i) {
                                    case IronSourceConstants.NT_LOAD /* 4001 */:
                                        return "ERROR_CODE_DECODER_INIT_FAILED";
                                    case IronSourceConstants.NT_INSTANCE_LOAD /* 4002 */:
                                        return "ERROR_CODE_DECODER_QUERY_FAILED";
                                    case 4003:
                                        return "ERROR_CODE_DECODING_FAILED";
                                    case 4004:
                                        return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                    case IronSourceConstants.NT_INSTANCE_LOAD_SUCCESS /* 4005 */:
                                        return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                    default:
                                        switch (i) {
                                            case 6000:
                                                return "ERROR_CODE_DRM_UNSPECIFIED";
                                            case AdError.MEDIAVIEW_MISSING_ERROR_CODE /* 6001 */:
                                                return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                                                return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                                                return "ERROR_CODE_DRM_CONTENT_ERROR";
                                            case 6004:
                                                return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                            case 6005:
                                                return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                            case 6006:
                                                return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                            case 6007:
                                                return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                            case 6008:
                                                return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                            default:
                                                return i >= 1000000 ? "custom error code" : "invalid error code";
                                        }
                                }
                        }
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r6 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Throwable a(android.os.Bundle r4) {
        /*
            r0 = r4
            r1 = 3
            java.lang.String r1 = b(r1)
            java.lang.String r0 = r0.getString(r1)
            r8 = r0
            r0 = r4
            r1 = 4
            java.lang.String r1 = b(r1)
            java.lang.String r0 = r0.getString(r1)
            r7 = r0
            r0 = r8
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r5 = r0
            r0 = 0
            r4 = r0
            r0 = 0
            r6 = r0
            r0 = r5
            if (r0 != 0) goto L47
            r0 = r8
            r1 = 1
            java.lang.Class<com.applovin.impl.rh> r2 = com.applovin.impl.rh.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L49
            java.lang.Class r0 = java.lang.Class.forName(r0, r1, r2)     // Catch: java.lang.Throwable -> L49
            r4 = r0
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            r1 = r4
            boolean r0 = r0.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L3c
            r0 = r4
            r1 = r7
            java.lang.Throwable r0 = a(r0, r1)     // Catch: java.lang.Throwable -> L49
            r6 = r0
        L3c:
            r0 = r6
            r4 = r0
            r0 = r6
            if (r0 != 0) goto L47
        L42:
            r0 = r7
            android.os.RemoteException r0 = a(r0)
            r4 = r0
        L47:
            r0 = r4
            return r0
        L49:
            r4 = move-exception
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.rh.a(android.os.Bundle):java.lang.Throwable");
    }

    private static Throwable a(Class cls, String str) {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    public static String b(int i) {
        return Integer.toString(i, 36);
    }

    public final String a() {
        return a(this.a);
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.ironsource.t2;

/* loaded from: zzavi.class */
public final class zzavi {
    private static final String[] zza = {"/aclk", "/pcs/click", "/dbm/clk"};
    private final String zzb = "ad.doubleclick.net";
    private final String[] zzc = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private final zzave zzd;

    @Deprecated
    public zzavi(zzave zzaveVar) {
        this.zzd = zzaveVar;
    }

    private final Uri zzg(Uri uri, String str) throws zzavj {
        Uri build;
        uri.getClass();
        try {
            try {
            } catch (UnsupportedOperationException e) {
                throw new zzavj("Provided Uri is not in a valid state");
            }
        } catch (NullPointerException e2) {
        }
        if (uri.getHost().equals(this.zzb)) {
            if (uri.getPath().contains(";")) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new zzavj("Parameter already exists: dc_ms");
                }
                String uri2 = uri.toString();
                int indexOf = uri2.indexOf(";adurl");
                if (indexOf != -1) {
                    int i = indexOf + 1;
                    build = Uri.parse(uri2.substring(0, i) + "dc_ms" + t2.i.b + str + ";" + uri2.substring(i));
                } else {
                    String encodedPath = uri.getEncodedPath();
                    int indexOf2 = uri2.indexOf(encodedPath);
                    build = Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms" + t2.i.b + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
                }
                return build;
            }
        }
        if (uri.getQueryParameter("ms") != null) {
            throw new zzavj("Query parameter already exists: ms");
        }
        String uri3 = uri.toString();
        int indexOf3 = uri3.indexOf("&adurl");
        int i2 = indexOf3;
        if (indexOf3 == -1) {
            i2 = uri3.indexOf("?adurl");
        }
        if (i2 != -1) {
            int i3 = i2 + 1;
            build = Uri.parse(uri3.substring(0, i3) + "ms" + t2.i.b + str + t2.i.c + uri3.substring(i3));
        } else {
            build = uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        return build;
    }

    @Deprecated
    public final Uri zza(Uri uri, Context context, View view, Activity activity) throws zzavj {
        try {
            return zzg(uri, this.zzd.zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException e) {
            throw new zzavj("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    public final Uri zzb(Uri uri, Context context) throws zzavj {
        return zzg(uri, this.zzd.zzg(context));
    }

    @Deprecated
    public final zzave zzc() {
        return this.zzd;
    }

    @Deprecated
    public final void zzd(MotionEvent motionEvent) {
        this.zzd.zzk(motionEvent);
    }

    public final boolean zze(Uri uri) {
        if (!zzf(uri)) {
            return false;
        }
        String[] strArr = zza;
        for (int i = 0; i < 3; i++) {
            if (uri.getPath().endsWith(strArr[i])) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzf(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.zzc;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }
}

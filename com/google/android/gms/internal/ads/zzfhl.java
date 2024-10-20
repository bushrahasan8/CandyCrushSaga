package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.ironsource.t2;

/* loaded from: zzfhl.class */
public final class zzfhl {
    private final zzavi zza;

    public zzfhl(zzavi zzaviVar) {
        this.zza = zzaviVar;
    }

    private static final Uri zzb(Uri uri, String str) throws zzavj {
        String host;
        String path;
        Uri parse;
        if (uri != null) {
            try {
                try {
                    host = uri.getHost();
                    path = uri.getPath();
                } catch (NullPointerException e) {
                }
                if (host != null && host.equals("ad.doubleclick.net") && path != null) {
                    if (path.contains(";")) {
                        if (uri.toString().contains("dc_ms=")) {
                            throw new zzavj("Parameter already exists: dc_ms");
                        }
                        String uri2 = uri.toString();
                        int indexOf = uri2.indexOf(";adurl");
                        if (indexOf != -1) {
                            int i = indexOf + 1;
                            StringBuilder sb = new StringBuilder(uri2.substring(0, i));
                            sb.append("dc_ms");
                            sb.append(t2.i.b);
                            sb.append(str);
                            sb.append(";");
                            sb.append((CharSequence) uri2, i, uri2.length());
                            parse = Uri.parse(sb.toString());
                        } else {
                            String encodedPath = uri.getEncodedPath();
                            if (encodedPath == null) {
                                throw new UnsupportedOperationException();
                            }
                            int indexOf2 = uri2.indexOf(encodedPath);
                            StringBuilder sb2 = new StringBuilder(uri2.substring(0, encodedPath.length() + indexOf2));
                            sb2.append(";");
                            sb2.append("dc_ms");
                            sb2.append(t2.i.b);
                            sb2.append(str);
                            sb2.append(";");
                            sb2.append((CharSequence) uri2, indexOf2 + encodedPath.length(), uri2.length());
                            parse = Uri.parse(sb2.toString());
                        }
                        return parse;
                    }
                }
            } catch (UnsupportedOperationException e2) {
                throw new zzavj("Provided Uri is not in a valid state");
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
            StringBuilder sb3 = new StringBuilder(uri3.substring(0, i3));
            sb3.append("ms");
            sb3.append(t2.i.b);
            sb3.append(str);
            sb3.append(t2.i.c);
            sb3.append((CharSequence) uri3, i3, uri3.length());
            parse = Uri.parse(sb3.toString());
        } else {
            parse = uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        return parse;
    }

    public final Uri zza(Uri uri, Context context, View view, Activity activity) throws zzavj {
        try {
            return zzb(uri, this.zza.zzc().zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException e) {
            throw new zzavj("Provided Uri is not in a valid state");
        }
    }
}

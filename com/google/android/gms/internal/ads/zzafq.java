package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: zzafq.class */
final class zzafq {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
    
        if (r0 == (-1)) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzafm zza(java.lang.String r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafq.zza(java.lang.String):com.google.android.gms.internal.ads.zzafm");
    }

    private static zzgaa zzb(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        zzfzx zzfzxVar = new zzfzx();
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (zzfz.zzc(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String zza2 = zzfz.zza(xmlPullParser, concat2);
                String zza3 = zzfz.zza(xmlPullParser, concat3);
                String zza4 = zzfz.zza(xmlPullParser, concat4);
                String zza5 = zzfz.zza(xmlPullParser, concat5);
                if (zza2 == null || zza3 == null) {
                    return zzgaa.zzl();
                }
                zzfzxVar.zzf(new zzafl(zza2, zza3, zza4 != null ? Long.parseLong(zza4) : 0L, zza5 != null ? Long.parseLong(zza5) : 0L));
            }
        } while (!zzfz.zzb(xmlPullParser, str.concat(":Directory")));
        return zzfzxVar.zzi();
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLU;

/* loaded from: zzeu.class */
public final class zzeu {
    public static void zza() throws zzet {
        boolean z;
        StringBuilder sb = new StringBuilder();
        boolean z2 = false;
        while (true) {
            z = z2;
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            String str = gluErrorString;
            if (gluErrorString == null) {
                str = "error code: 0x".concat(String.valueOf(Integer.toHexString(glGetError)));
            }
            sb.append("glError: ");
            sb.append(str);
            z2 = true;
        }
        if (z) {
            throw new zzet(sb.toString());
        }
    }

    public static void zzb(boolean z, String str) throws zzet {
        if (!z) {
            throw new zzet(str);
        }
    }

    public static boolean zzc(Context context) {
        int i = zzfy.zza;
        if (i < 24) {
            return false;
        }
        if (i < 26 && ("samsung".equals(zzfy.zzc) || "XT1650".equals(zzfy.zzd))) {
            return false;
        }
        if (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return zzes.zzk("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean zzd() {
        int i = zzfy.zza;
        return zzes.zzk("EGL_KHR_surfaceless_context");
    }
}

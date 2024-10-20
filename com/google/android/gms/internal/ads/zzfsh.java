package com.google.android.gms.internal.ads;

import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: zzfsh.class */
public final class zzfsh {
    public static File zza(File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File zzb(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(zzc(str, file), str2);
    }

    public static File zzc(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        zza(file2, false);
        return file2;
    }

    public static boolean zzd(File file) {
        boolean z;
        if (!file.exists()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            boolean z2 = true;
            int i = 0;
            while (true) {
                z = z2;
                if (i >= listFiles.length) {
                    break;
                }
                File file2 = listFiles[i];
                z2 = file2 != null && zzd(file2) && z2;
                i++;
            }
        } else {
            z = true;
        }
        return file.delete() && z;
    }

    public static boolean zze(File file, byte[] bArr) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        try {
            FileOutputStream fileOutputStream3 = new FileOutputStream(file);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                fileOutputStream3.write(bArr);
                fileOutputStream3.flush();
                IOUtils.closeQuietly(fileOutputStream3);
                return true;
            } catch (IOException e) {
                fileOutputStream2 = fileOutputStream3;
                IOUtils.closeQuietly(fileOutputStream2);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream3;
                IOUtils.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (IOException e2) {
            fileOutputStream2 = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }
}

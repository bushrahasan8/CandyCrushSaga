package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@KeepForSdk
/* loaded from: ProcessUtils.class */
public class ProcessUtils {
    private static String zza;
    private static int zzb;

    private ProcessUtils() {
    }

    @KeepForSdk
    public static String getMyProcessName() {
        BufferedReader bufferedReader;
        String processName;
        if (zza == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                zza = processName;
            } else {
                int i = zzb;
                int i2 = i;
                if (i == 0) {
                    i2 = Process.myPid();
                    zzb = i2;
                }
                String str = null;
                if (i2 <= 0) {
                    str = null;
                } else {
                    try {
                        String str2 = "/proc/" + i2 + "/cmdline";
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str2));
                            try {
                                String readLine = bufferedReader.readLine();
                                Preconditions.checkNotNull(readLine);
                                str = readLine.trim();
                            } catch (IOException e) {
                            } catch (Throwable th) {
                                th = th;
                                IOUtils.closeQuietly(bufferedReader);
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException e2) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = null;
                    }
                    IOUtils.closeQuietly(bufferedReader);
                }
                zza = str;
            }
        }
        return zza;
    }
}

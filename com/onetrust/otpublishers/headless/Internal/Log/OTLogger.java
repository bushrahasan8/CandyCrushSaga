package com.onetrust.otpublishers.headless.Internal.Log;

import android.util.Log;
import androidx.annotation.Keep;
import com.onetrust.otpublishers.headless.Internal.c;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: OTLogger.class */
public class OTLogger {
    public static int a = 4;
    public static String b;
    public static File c;
    public static BufferedWriter d;
    public static int e;
    public static int f;
    public static boolean g;
    public static boolean h;

    public static int a(String str, int i, String str2) {
        int i2 = a;
        int i3 = -1;
        if (i2 != -1) {
            i3 = -1;
            if (i2 <= i) {
                switch (i) {
                    case 2:
                        i3 = Log.v(str, str2);
                        break;
                    case 3:
                        i3 = Log.d(str, str2);
                        break;
                    case 4:
                        i3 = Log.i(str, str2);
                        break;
                    case 5:
                        i3 = Log.w(str, str2);
                        break;
                    case 6:
                        i3 = Log.e(str, str2);
                        break;
                    case 7:
                        i3 = Log.wtf(str, str2);
                        break;
                    default:
                        i3 = -1;
                        break;
                }
            }
        }
        if ((h && g) || (g && i > 3)) {
            a(i, str, str2);
        }
        return i3;
    }

    public static String a(String str, String str2, String str3) {
        String str4;
        try {
            str4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(new Date());
        } catch (Exception e2) {
            Log.e("OTLogger", "Error : " + e2.getMessage());
            str4 = null;
        }
        return String.format("%s: /%s %s - %s", str4, str, str2, str3);
    }

    public static void a(int i, String str, String str2) {
        if (i >= e && d != null) {
            try {
                if (a()) {
                    d = new BufferedWriter(new FileWriter(c, true));
                }
                d.write(a(i == 2 ? "V" : i == 3 ? "D" : i == 4 ? "I" : i == 5 ? "W" : i == 6 ? "E" : i == 7 ? "A" : "", str, str2));
                d.newLine();
                d.flush();
            } catch (IOException e2) {
                Log.e("OTLogger", "Error : " + e2.getMessage());
            }
        }
        if (d == null) {
            Log.e("OTLogger", "You have to call OTLogger.open(...) before starting to log");
        }
    }

    public static void a(String str) {
        a("OTSDKListFragment", 3, str);
    }

    public static void a(String str, String str2) {
        if (!c.b(str2)) {
            a("OTLogger", 4, "device : " + str + " - " + str2);
        }
        a(4, str, str2);
        Log.v(str, str2);
    }

    public static boolean a() {
        boolean z;
        try {
        } catch (IOException e2) {
            Log.e("OTLogger", "Error : " + e2.getMessage());
        }
        if (c.length() > f) {
            File file = new File(b + ".old");
            if (file.exists()) {
                Log.v("OTLogger", "file deleted : " + file.delete());
            }
            Log.v("OTLogger", "file renamed : " + c.renameTo(file));
            File file2 = new File(b);
            c = file2;
            Log.v("OTLogger", "file created  : " + file2.createNewFile());
            z = true;
            return z;
        }
        z = false;
        return z;
    }

    public static void b() {
        a("CPWorker", 4, "Consent logging");
    }

    public static void b(String str) {
        a("OneTrust", 6, str);
    }

    @Keep
    public static void open(String str, int i, int i2) {
        b = str;
        e = i;
        f = i2;
        File file = new File(b);
        c = file;
        if (!file.exists()) {
            try {
                Log.v("OTLogger", "file deleted in open method : " + c.createNewFile());
                d = new BufferedWriter(new FileWriter(c, true));
                a.a();
            } catch (IOException e2) {
                Log.e("OTLogger", "Error : " + e2.getMessage());
            }
        }
        a();
        try {
            d = new BufferedWriter(new FileWriter(c, true));
        } catch (IOException e3) {
            Log.e("OTLogger", Log.getStackTraceString(e3));
        }
    }
}

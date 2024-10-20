package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.File;

/* loaded from: HardwareConfigState.class */
public final class HardwareConfigState {
    private static volatile HardwareConfigState instance;
    private int decodesSinceLastFdCheck;
    private boolean isFdSizeBelowHardwareLimit = true;
    private final boolean isHardwareConfigAllowedByDeviceModel = isHardwareConfigAllowedByDeviceModel();
    private static final File FD_SIZE_LIST = new File("/proc/self/fd");
    private static volatile int fdSizeLimit = IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
    private static volatile int minHardwareDimension = 128;

    HardwareConfigState() {
    }

    public static HardwareConfigState getInstance() {
        if (instance == null) {
            synchronized (HardwareConfigState.class) {
                try {
                    if (instance == null) {
                        instance = new HardwareConfigState();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    private boolean isFdSizeBelowHardwareLimit() {
        boolean z;
        synchronized (this) {
            boolean z2 = true;
            int i = this.decodesSinceLastFdCheck + 1;
            this.decodesSinceLastFdCheck = i;
            if (i >= 50) {
                this.decodesSinceLastFdCheck = 0;
                int length = FD_SIZE_LIST.list().length;
                if (length >= fdSizeLimit) {
                    z2 = false;
                }
                this.isFdSizeBelowHardwareLimit = z2;
                if (!z2 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + fdSizeLimit);
                }
            }
            z = this.isFdSizeBelowHardwareLimit;
        }
        return z;
    }

    private static boolean isHardwareConfigAllowedByDeviceModel() {
        boolean z = false;
        String str = Build.MODEL;
        if (str == null || str.length() < 7) {
            return true;
        }
        String substring = str.substring(0, 7);
        substring.hashCode();
        boolean z2 = -1;
        switch (substring.hashCode()) {
            case -1398613787:
                if (substring.equals("SM-A520")) {
                    z2 = false;
                    break;
                }
                break;
            case -1398431166:
                if (substring.equals("SM-G930")) {
                    z2 = true;
                    break;
                }
                break;
            case -1398431161:
                if (substring.equals("SM-G935")) {
                    z2 = 2;
                    break;
                }
                break;
            case -1398431073:
                if (substring.equals("SM-G960")) {
                    z2 = 3;
                    break;
                }
                break;
            case -1398431068:
                if (substring.equals("SM-G965")) {
                    z2 = 4;
                    break;
                }
                break;
            case -1398343746:
                if (substring.equals("SM-J720")) {
                    z2 = 5;
                    break;
                }
                break;
            case -1398222624:
                if (substring.equals("SM-N935")) {
                    z2 = 6;
                    break;
                }
                break;
        }
        switch (z2) {
            case false:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
                if (Build.VERSION.SDK_INT != 26) {
                    z = true;
                }
                return z;
            default:
                return true;
        }
    }

    public boolean isHardwareConfigAllowed(int i, int i2, boolean z, boolean z2) {
        boolean z3 = false;
        if (z) {
            z3 = false;
            if (this.isHardwareConfigAllowedByDeviceModel) {
                z3 = false;
                if (Build.VERSION.SDK_INT >= 26) {
                    if (z2) {
                        z3 = false;
                    } else {
                        z3 = false;
                        if (i >= minHardwareDimension) {
                            z3 = false;
                            if (i2 >= minHardwareDimension) {
                                z3 = false;
                                if (isFdSizeBelowHardwareLimit()) {
                                    z3 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return z3;
    }

    public boolean setHardwareConfigIfAllowed(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        Bitmap.Config config;
        boolean isHardwareConfigAllowed = isHardwareConfigAllowed(i, i2, z, z2);
        if (isHardwareConfigAllowed) {
            config = Bitmap.Config.HARDWARE;
            options.inPreferredConfig = config;
            options.inMutable = false;
        }
        return isHardwareConfigAllowed;
    }
}

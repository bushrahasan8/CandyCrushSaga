package com.google.android.gms.internal.play_games_inputmapping;

import com.google.common.flogger.backend.google.GooglePlatform;
import com.google.common.flogger.backend.system.DefaultPlatform;
import java.lang.reflect.InvocationTargetException;

/* loaded from: zzcc.class */
public final class zzcc {
    public static zzcb zza() {
        try {
            return (zzcb) zzcj.class.getDeclaredConstructor(null).newInstance(null);
        } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException e) {
            try {
                return (zzcb) GooglePlatform.class.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException e2) {
                try {
                    return (zzcb) DefaultPlatform.class.getDeclaredConstructor(null).newInstance(null);
                } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException e3) {
                    return null;
                }
            }
        }
    }
}

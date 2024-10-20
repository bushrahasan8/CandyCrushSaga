package com.google.android.gms.internal.ads;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* loaded from: zzfua.class */
public abstract class zzfua implements SensorEventListener {
    final zzftu zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzfua(String str, String str2) {
        zzftz.zza();
        zzftw.zza();
        this.zza = zzftw.zza;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        zza(sensorEvent);
    }

    public abstract void zza(SensorEvent sensorEvent);
}

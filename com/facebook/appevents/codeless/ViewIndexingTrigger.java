package com.facebook.appevents.codeless;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: ViewIndexingTrigger.class */
public final class ViewIndexingTrigger implements SensorEventListener {
    public static final Companion Companion = new Companion(null);
    private OnShakeListener onShakeListener;

    /* loaded from: ViewIndexingTrigger$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: ViewIndexingTrigger$OnShakeListener.class */
    public interface OnShakeListener {
        void onShake();
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        Intrinsics.checkNotNullParameter(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        OnShakeListener onShakeListener = this.onShakeListener;
        if (onShakeListener != null) {
            float[] fArr = event.values;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            double d = f / 9.80665f;
            double d2 = f2 / 9.80665f;
            double d3 = f3 / 9.80665f;
            if (Math.sqrt((d * d) + (d2 * d2) + (d3 * d3)) > 2.3d) {
                onShakeListener.onShake();
            }
        }
    }

    public final void setOnShakeListener(OnShakeListener onShakeListener) {
        this.onShakeListener = onShakeListener;
    }
}

package com.king.core;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.util.DisplayMetrics;
import android.view.Display;
import androidx.annotation.Keep;

@Keep
/* loaded from: RotationCompensatedListener.class */
public class RotationCompensatedListener implements SensorEventListener {
    private Display mDisplay;
    private boolean mLandscapeDisplay;
    private SensorEventListener mListener;

    public RotationCompensatedListener(SensorEventListener sensorEventListener, Display display) {
        this.mDisplay = display;
        this.mListener = sensorEventListener;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.mDisplay.getMetrics(displayMetrics);
        this.mLandscapeDisplay = displayMetrics.widthPixels > displayMetrics.heightPixels;
        if (this.mDisplay.getRotation() == 1 || this.mDisplay.getRotation() == 3) {
            this.mLandscapeDisplay = !this.mLandscapeDisplay;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        this.mListener.onAccuracyChanged(sensor, i);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        int i = (this.mDisplay.getRotation() == 1 || this.mDisplay.getRotation() == 2) ? -1 : 1;
        if (this.mLandscapeDisplay) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            fArr[0] = -fArr[1];
            fArr[1] = f;
        }
        float[] fArr2 = sensorEvent.values;
        float f2 = fArr2[0];
        float f3 = i;
        fArr2[0] = f2 * f3;
        fArr2[1] = fArr2[1] * f3;
        fArr2[2] = -fArr2[2];
        this.mListener.onSensorChanged(sensorEvent);
    }
}

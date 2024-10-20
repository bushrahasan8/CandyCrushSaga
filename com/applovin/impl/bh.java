package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* loaded from: bh.class */
final class bh implements SensorEventListener {
    private final float[] a = new float[16];
    private final float[] b = new float[16];
    private final float[] c = new float[16];
    private final float[] d = new float[3];
    private final Display f;
    private final a[] g;
    private boolean h;

    /* loaded from: bh$a.class */
    public interface a {
        void a(float[] fArr, float f);
    }

    public bh(Display display, a... aVarArr) {
        this.f = display;
        this.g = aVarArr;
    }

    private float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.b);
        SensorManager.getOrientation(this.b, this.d);
        return this.d[2];
    }

    private void a(float[] fArr, float f) {
        for (a aVar : this.g) {
            aVar.a(fArr, f);
        }
    }

    private void a(float[] fArr, int i) {
        int i2;
        if (i != 0) {
            int i3 = 1;
            if (i == 1) {
                i3 = 129;
                i2 = 2;
            } else if (i == 2) {
                i3 = 130;
                i2 = 129;
            } else {
                if (i != 3) {
                    throw new IllegalStateException();
                }
                i2 = 130;
            }
            float[] fArr2 = this.b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.b, i2, i3, fArr);
        }
    }

    private void b(float[] fArr) {
        if (!this.h) {
            p9.a(this.c, fArr);
            this.h = true;
        }
        float[] fArr2 = this.b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.b, 0, this.c, 0);
    }

    private static void c(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.a, sensorEvent.values);
        a(this.a, this.f.getRotation());
        float a2 = a(this.a);
        c(this.a);
        b(this.a);
        a(this.a, a2);
    }
}

package com.king.amp.sa;

import android.app.Activity;
import android.app.Application;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;

/* loaded from: AttitudeManager.class */
public class AttitudeManager implements SensorEventListener, Application.ActivityLifecycleCallbacks {
    private final Sensor mAccelerometer;
    private Activity mActivity;
    private float[] mAttitude = new float[3];
    private float[] mGeomagnetic;
    private float[] mGravity;
    private final Sensor mMagnetometer;
    private final SensorManager mSensorManager;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AttitudeManager(Activity activity) {
        SensorManager sensorManager = (SensorManager) activity.getSystemService("sensor");
        this.mSensorManager = sensorManager;
        this.mAccelerometer = sensorManager.getDefaultSensor(1);
        this.mMagnetometer = sensorManager.getDefaultSensor(2);
        this.mActivity = activity;
        activity.getApplication().registerActivityLifecycleCallbacks(this);
        onActivityResumed(this.mActivity);
    }

    private void Unbind() {
        Activity activity = this.mActivity;
        if (activity != null) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
            this.mActivity = null;
        }
    }

    protected void finalize() {
        Unbind();
        super.finalize();
    }

    public float[] getAttitude() {
        float[] fArr;
        synchronized (this.mAttitude) {
            fArr = (float[]) this.mAttitude.clone();
        }
        return fArr;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Unbind();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (activity == this.mActivity) {
            this.mSensorManager.unregisterListener(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (activity == this.mActivity) {
            this.mSensorManager.registerListener(this, this.mAccelerometer, 2);
            this.mSensorManager.registerListener(this, this.mMagnetometer, 2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Unbind();
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        if (sensorEvent.sensor.getType() == 1) {
            this.mGravity = (float[]) sensorEvent.values.clone();
        } else if (sensorEvent.sensor.getType() != 2) {
            return;
        } else {
            this.mGeomagnetic = (float[]) sensorEvent.values.clone();
        }
        float[] fArr2 = this.mGravity;
        if (fArr2 == null || (fArr = this.mGeomagnetic) == null) {
            return;
        }
        float[] fArr3 = new float[9];
        if (SensorManager.getRotationMatrix(fArr3, new float[9], fArr2, fArr)) {
            synchronized (this.mAttitude) {
                SensorManager.getOrientation(fArr3, this.mAttitude);
            }
        }
    }
}

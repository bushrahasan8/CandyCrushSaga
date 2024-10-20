package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import org.json.JSONException;

/* loaded from: ExperimentsReader.class */
public class ExperimentsReader {
    private IExperiments _localExperiments;
    private IExperiments _remoteExperiments;

    public IExperiments getCurrentlyActiveExperiments() {
        synchronized (this) {
            IExperiments iExperiments = this._remoteExperiments;
            if (iExperiments == null && this._localExperiments == null) {
                return new Experiments();
            }
            if (iExperiments == null) {
                return this._localExperiments;
            }
            if (this._localExperiments == null) {
                this._localExperiments = new Experiments();
            }
            try {
                return new Experiments(Utilities.mergeJsonObjects(this._localExperiments.getNextSessionExperiments(), this._remoteExperiments.getCurrentSessionExperiments()));
            } catch (JSONException e) {
                DeviceLog.error("Couldn't get active experiments, reverting to default experiments");
                return new Experiments();
            }
        }
    }

    public void updateLocalExperiments(IExperiments iExperiments) {
        synchronized (this) {
            this._localExperiments = iExperiments;
        }
    }

    public void updateRemoteExperiments(IExperiments iExperiments) {
        synchronized (this) {
            this._remoteExperiments = iExperiments;
        }
    }
}

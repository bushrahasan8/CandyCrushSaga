package com.king.amp.sa.google;

import android.app.Activity;
import android.os.AsyncTask;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.king.amp.sa.DefaultAdvertisingIdSource;

/* loaded from: GoogleAdvertisingIdSource.class */
public class GoogleAdvertisingIdSource extends DefaultAdvertisingIdSource {
    LoadTask mLoadTask;

    /* loaded from: GoogleAdvertisingIdSource$LoadTask.class */
    static class LoadTask extends AsyncTask {
        Activity mActivity;
        AdvertisingIdClient.Info mInfo;
        boolean mIsLoaded = false;

        public LoadTask(Activity activity) {
            this.mActivity = activity;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public AdvertisingIdClient.Info doInBackground(Void... voidArr) {
            AdvertisingIdClient.Info info;
            try {
                info = AdvertisingIdClient.getAdvertisingIdInfo(this.mActivity.getApplicationContext());
            } catch (Exception e) {
                info = null;
            }
            return info;
        }

        public AdvertisingIdClient.Info getInfo() {
            return this.mInfo;
        }

        public boolean isLoaded() {
            return this.mIsLoaded;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(AdvertisingIdClient.Info info) {
            this.mInfo = info;
            this.mIsLoaded = true;
        }
    }

    @Override // com.king.amp.sa.DefaultAdvertisingIdSource, com.king.amp.sa.AdvertisingIdSource
    public String getAdvertisingIdentifier() {
        LoadTask loadTask = this.mLoadTask;
        return (loadTask == null || loadTask.getInfo() == null) ? super.getAdvertisingIdentifier() : this.mLoadTask.getInfo().getId();
    }

    @Override // com.king.amp.sa.DefaultAdvertisingIdSource, com.king.amp.sa.AdvertisingIdSource
    public boolean isAdvertisingTrackingEnabled() {
        LoadTask loadTask = this.mLoadTask;
        if (loadTask == null || loadTask.getInfo() == null) {
            return false;
        }
        return !this.mLoadTask.getInfo().isLimitAdTrackingEnabled();
    }

    @Override // com.king.amp.sa.DefaultAdvertisingIdSource, com.king.amp.sa.AdvertisingIdSource
    public boolean isLoaded() {
        LoadTask loadTask = this.mLoadTask;
        return loadTask != null && loadTask.isLoaded();
    }

    @Override // com.king.amp.sa.DefaultAdvertisingIdSource, com.king.amp.sa.AdvertisingIdSource
    public void load(Activity activity) {
        if (this.mLoadTask == null) {
            LoadTask loadTask = new LoadTask(activity);
            this.mLoadTask = loadTask;
            loadTask.execute(new Void[0]);
        }
    }
}

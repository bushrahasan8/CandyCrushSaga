package com.king.usdk.cloudstorage;

import android.app.Activity;
import android.app.backup.BackupManager;
import android.content.SharedPreferences;
import androidx.annotation.Keep;
import java.util.Map;

@Keep
/* loaded from: CloudStorage.class */
public class CloudStorage {
    static final String PREFS = "CloudStorage";
    static final String PREFS_BACKUP_KEY = "couldStorageKey";
    BackupManager bm;
    SharedPreferences prefs;

    public CloudStorage(Activity activity) {
        this.prefs = activity.getSharedPreferences(PREFS, 0);
        this.bm = new BackupManager(activity);
    }

    private void RequestBackup() {
        this.bm.dataChanged();
    }

    public void ClearData() {
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.clear();
        edit.commit();
        RequestBackup();
    }

    public void ClearKey(String str) {
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.remove(str);
        edit.commit();
        RequestBackup();
    }

    public String Load(String str) {
        return this.prefs.getString(str, "");
    }

    public String[] LoadAll() {
        Map<String, ?> all = this.prefs.getAll();
        String[] strArr = new String[all.size() * 2];
        int i = 0;
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            strArr[i] = entry.getKey();
            strArr[i + 1] = entry.getValue().toString();
            i += 2;
        }
        return strArr;
    }

    public void Save(String str, String str2) {
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.putString(str, str2);
        edit.commit();
        RequestBackup();
    }
}

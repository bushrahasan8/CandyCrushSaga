package com.king.usdk.cloudstorage;

import android.app.backup.BackupAgentHelper;
import android.app.backup.SharedPreferencesBackupHelper;
import androidx.annotation.Keep;

@Keep
/* loaded from: KingBackupAgentHelper.class */
public class KingBackupAgentHelper extends BackupAgentHelper {
    static final String PREFS = "CloudStorage";
    static final String PREFS_BACKUP_KEY = "couldStorageKey";

    @Override // android.app.backup.BackupAgent
    public void onCreate() {
        addHelper(PREFS_BACKUP_KEY, new SharedPreferencesBackupHelper(this, PREFS));
    }
}

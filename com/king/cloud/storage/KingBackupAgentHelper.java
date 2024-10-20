package com.king.cloud.storage;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.SharedPreferencesBackupHelper;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Keep;
import com.king.logging.Logging;
import java.io.IOException;

@Keep
/* loaded from: KingBackupAgentHelper.class */
public class KingBackupAgentHelper extends BackupAgentHelper {
    static final String PREFS = "CloudStorage";
    static final String PREFS_BACKUP_KEY = "couldStorageKey";
    private static final String TAG = "KingBackupAgentHelper";

    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) throws IOException {
        Logging.logDebug(TAG, "KingBackupAgentHelper onBackup");
        super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
    }

    @Override // android.app.backup.BackupAgent
    public void onCreate() {
        addHelper(PREFS_BACKUP_KEY, new SharedPreferencesBackupHelper(this, PREFS));
    }

    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        Logging.logDebug(TAG, "KingBackupAgentHelper onRestore appVersionCode:" + i);
        super.onRestore(backupDataInput, i, parcelFileDescriptor);
    }
}

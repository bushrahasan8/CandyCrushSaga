package com.google.android.gms.internal.drive;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.drive.DriveFile;

/* loaded from: zzbq.class */
final class zzbq implements ListenerHolder.Notifier<DriveFile.DownloadProgressListener> {
    private final long zzfb;
    private final long zzfc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbq(zzbp zzbpVar, long j, long j2) {
        this.zzfb = j;
        this.zzfc = j2;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(DriveFile.DownloadProgressListener downloadProgressListener) {
        downloadProgressListener.onProgress(this.zzfb, this.zzfc);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}

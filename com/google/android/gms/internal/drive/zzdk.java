package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.drive.events.ListenerToken;
import com.google.android.gms.drive.events.OpenFileCallback;

/* loaded from: zzdk.class */
final class zzdk extends zzl {
    private final zzch zzfw;
    private final ListenerToken zzgj;
    private final ListenerHolder<OpenFileCallback> zzgk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdk(zzch zzchVar, ListenerToken listenerToken, ListenerHolder<OpenFileCallback> listenerHolder) {
        this.zzfw = zzchVar;
        this.zzgj = listenerToken;
        this.zzgk = listenerHolder;
    }

    private final void zza(zzdg<OpenFileCallback> zzdgVar) {
        this.zzgk.notifyListener(new zzdo(this, zzdgVar));
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(final Status status) throws RemoteException {
        zza(new zzdg(this, status) { // from class: com.google.android.gms.internal.drive.zzdl
            private final zzdk zzgl;
            private final Status zzgm;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgl = this;
                this.zzgm = status;
            }

            @Override // com.google.android.gms.internal.drive.zzdg
            public final void accept(Object obj) {
                this.zzgl.zza(this.zzgm, (OpenFileCallback) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Status status, OpenFileCallback openFileCallback) {
        openFileCallback.onError(ApiExceptionUtil.fromStatus(status));
        this.zzfw.cancelOpenFileCallback(this.zzgj);
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(final zzfh zzfhVar) throws RemoteException {
        zza(new zzdg(this, zzfhVar) { // from class: com.google.android.gms.internal.drive.zzdn
            private final zzdk zzgl;
            private final zzfh zzgo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgl = this;
                this.zzgo = zzfhVar;
            }

            @Override // com.google.android.gms.internal.drive.zzdg
            public final void accept(Object obj) {
                this.zzgl.zza(this.zzgo, (OpenFileCallback) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzfh zzfhVar, OpenFileCallback openFileCallback) {
        openFileCallback.onContents(new zzbi(zzfhVar.zzes));
        this.zzfw.cancelOpenFileCallback(this.zzgj);
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(final zzfl zzflVar) throws RemoteException {
        zza(new zzdg(zzflVar) { // from class: com.google.android.gms.internal.drive.zzdm
            private final zzfl zzgn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgn = zzflVar;
            }

            @Override // com.google.android.gms.internal.drive.zzdg
            public final void accept(Object obj) {
                zzfl zzflVar2 = this.zzgn;
                ((OpenFileCallback) obj).onProgress(zzflVar2.zzhy, zzflVar2.zzhz);
            }
        });
    }
}

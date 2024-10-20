package com.google.android.gms.drive.events;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.drive.zzet;
import com.google.android.gms.internal.drive.zzfp;
import com.google.android.gms.internal.drive.zzir;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: DriveEventService.class */
public class DriveEventService extends Service implements ChangeListener, CompletionListener, zzd, zzi {
    public static final String ACTION_HANDLE_EVENT = "com.google.android.gms.drive.events.HANDLE_EVENT";
    private static final GmsLogger zzbz = new GmsLogger("DriveEventService", "");
    private final String name;
    private CountDownLatch zzcj;

    @VisibleForTesting
    zza zzck;
    boolean zzcl;

    @VisibleForTesting
    private int zzcm;

    /* loaded from: DriveEventService$zza.class */
    static final class zza extends zzir {
        private final WeakReference<DriveEventService> zzcp;

        private zza(DriveEventService driveEventService) {
            this.zzcp = new WeakReference<>(driveEventService);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ zza(DriveEventService driveEventService, zzh zzhVar) {
            this(driveEventService);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Message zzb(zzfp zzfpVar) {
            return obtainMessage(1, zzfpVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Message zzy() {
            return obtainMessage(2);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    DriveEventService.zzbz.wfmt("DriveEventService", "Unexpected message type: %s", Integer.valueOf(message.what));
                    return;
                } else {
                    getLooper().quit();
                    return;
                }
            }
            DriveEventService driveEventService = this.zzcp.get();
            if (driveEventService != null) {
                driveEventService.zza((zzfp) message.obj);
            } else {
                getLooper().quit();
            }
        }
    }

    @VisibleForTesting
    /* loaded from: DriveEventService$zzb.class */
    final class zzb extends zzet {
        private final DriveEventService zzco;

        private zzb(DriveEventService driveEventService) {
            this.zzco = driveEventService;
        }

        /* synthetic */ zzb(DriveEventService driveEventService, zzh zzhVar) {
            this(driveEventService);
        }

        @Override // com.google.android.gms.internal.drive.zzes
        public final void zzc(zzfp zzfpVar) throws RemoteException {
            synchronized (this.zzco) {
                this.zzco.zzw();
                zza zzaVar = this.zzco.zzck;
                if (zzaVar != null) {
                    this.zzco.zzck.sendMessage(zzaVar.zzb(zzfpVar));
                } else {
                    DriveEventService.zzbz.e("DriveEventService", "Receiving event before initialize is completed.");
                }
            }
        }
    }

    protected DriveEventService() {
        this("DriveEventService");
    }

    protected DriveEventService(String str) {
        this.zzcl = false;
        this.zzcm = -1;
        this.name = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzfp zzfpVar) {
        DriveEvent zzat = zzfpVar.zzat();
        try {
            int type = zzat.getType();
            if (type == 1) {
                onChange((ChangeEvent) zzat);
                return;
            }
            if (type == 2) {
                onCompletion((CompletionEvent) zzat);
                return;
            }
            if (type == 4) {
                zza((com.google.android.gms.drive.events.zzb) zzat);
            } else if (type != 7) {
                zzbz.wfmt("DriveEventService", "Unhandled event: %s", zzat);
            } else {
                zzbz.wfmt("DriveEventService", "Unhandled transfer state event in %s: %s", this.name, (zzv) zzat);
            }
        } catch (Exception e) {
            zzbz.e("DriveEventService", String.format("Error handling event in %s", this.name), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzw() throws SecurityException {
        int callingUid = getCallingUid();
        if (callingUid == this.zzcm) {
            return;
        }
        if (!UidVerifier.isGooglePlayServicesUid(this, callingUid)) {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
        this.zzcm = callingUid;
    }

    @VisibleForTesting
    protected int getCallingUid() {
        return Binder.getCallingUid();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        synchronized (this) {
            if (!ACTION_HANDLE_EVENT.equals(intent.getAction())) {
                return null;
            }
            if (this.zzck == null && !this.zzcl) {
                this.zzcl = true;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                this.zzcj = new CountDownLatch(1);
                new zzh(this, countDownLatch).start();
                try {
                    if (!countDownLatch.await(UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS, TimeUnit.MILLISECONDS)) {
                        zzbz.e("DriveEventService", "Failed to synchronously initialize event handler.");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException("Unable to start event handler", e);
                }
            }
            return new zzb(this, null).asBinder();
        }
    }

    @Override // com.google.android.gms.drive.events.ChangeListener
    public void onChange(ChangeEvent changeEvent) {
        zzbz.wfmt("DriveEventService", "Unhandled change event in %s: %s", this.name, changeEvent);
    }

    @Override // com.google.android.gms.drive.events.CompletionListener
    public void onCompletion(CompletionEvent completionEvent) {
        zzbz.wfmt("DriveEventService", "Unhandled completion event in %s: %s", this.name, completionEvent);
    }

    @Override // android.app.Service
    public void onDestroy() {
        synchronized (this) {
            zza zzaVar = this.zzck;
            if (zzaVar != null) {
                this.zzck.sendMessage(zzaVar.zzy());
                this.zzck = null;
                try {
                    if (!this.zzcj.await(UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS, TimeUnit.MILLISECONDS)) {
                        zzbz.w("DriveEventService", "Failed to synchronously quit event handler. Will quit itself");
                    }
                } catch (InterruptedException e) {
                }
                this.zzcj = null;
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return true;
    }

    @Override // com.google.android.gms.drive.events.zzd
    @ShowFirstParty
    public final void zza(com.google.android.gms.drive.events.zzb zzbVar) {
        zzbz.wfmt("DriveEventService", "Unhandled changes available event in %s: %s", this.name, zzbVar);
    }
}

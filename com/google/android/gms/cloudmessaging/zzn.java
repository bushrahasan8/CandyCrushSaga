package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzn.class */
public final class zzn implements ServiceConnection {
    zzp zzc;
    final zzu zzf;
    int zza = 0;
    final Messenger zzb = new Messenger(new com.google.android.gms.internal.cloudmessaging.zzf(Looper.getMainLooper(), new Handler.Callback(this) { // from class: com.google.android.gms.cloudmessaging.zzk
        public final zzn zza;

        {
            this.zza = this;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Received response to request: " + i);
            }
            zzn zznVar = this.zza;
            synchronized (zznVar) {
                zzr zzrVar = (zzr) zznVar.zze.get(i);
                if (zzrVar == null) {
                    Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                    return true;
                }
                zznVar.zze.remove(i);
                zznVar.zzf();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    zzrVar.zzc(new zzs(4, "Not supported by GmsCore", null));
                    return true;
                }
                zzrVar.zza(data);
                return true;
            }
        }
    }));
    final Queue zzd = new ArrayDeque();
    final SparseArray zze = new SparseArray();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzn(zzu zzuVar, zzm zzmVar) {
        this.zzf = zzuVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        zzu.zze(this.zzf).execute(new Runnable(this, iBinder) { // from class: com.google.android.gms.cloudmessaging.zzg
            public final zzn zza;
            public final IBinder zzb;

            {
                this.zza = this;
                this.zzb = iBinder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzn zznVar = this.zza;
                IBinder iBinder2 = this.zzb;
                synchronized (zznVar) {
                    if (iBinder2 == null) {
                        zznVar.zza(0, "Null service connection");
                        return;
                    }
                    try {
                        zznVar.zzc = new zzp(iBinder2);
                        zznVar.zza = 2;
                        zznVar.zzc();
                    } catch (RemoteException e) {
                        zznVar.zza(0, e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        zzu.zze(this.zzf).execute(new Runnable(this) { // from class: com.google.android.gms.cloudmessaging.zzj
            public final zzn zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(2, "Service disconnected");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(int i, String str) {
        synchronized (this) {
            zzb(i, str, null);
        }
    }

    final void zzb(int i, String str, Throwable th) {
        synchronized (this) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i2 = this.zza;
            if (i2 == 0) {
                throw new IllegalStateException();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.zza = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.zza = 4;
            ConnectionTracker.getInstance().unbindService(zzu.zza(this.zzf), this);
            zzs zzsVar = new zzs(i, str, th);
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                ((zzr) it.next()).zzc(zzsVar);
            }
            this.zzd.clear();
            for (int i3 = 0; i3 < this.zze.size(); i3++) {
                ((zzr) this.zze.valueAt(i3)).zzc(zzsVar);
            }
            this.zze.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc() {
        zzu.zze(this.zzf).execute(new Runnable(this) { // from class: com.google.android.gms.cloudmessaging.zzh
            public final zzn zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final zzr zzrVar;
                while (true) {
                    final zzn zznVar = this.zza;
                    synchronized (zznVar) {
                        if (zznVar.zza != 2) {
                            return;
                        }
                        if (zznVar.zzd.isEmpty()) {
                            zznVar.zzf();
                            return;
                        } else {
                            zzrVar = (zzr) zznVar.zzd.poll();
                            zznVar.zze.put(zzrVar.zza, zzrVar);
                            zzu.zze(zznVar.zzf).schedule(new Runnable(zznVar, zzrVar) { // from class: com.google.android.gms.cloudmessaging.zzl
                                public final zzn zza;
                                public final zzr zzb;

                                {
                                    this.zza = zznVar;
                                    this.zzb = zzrVar;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.zza.zze(this.zzb.zza);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(zzrVar)));
                    }
                    zzu zzuVar = zznVar.zzf;
                    Messenger messenger = zznVar.zzb;
                    int i = zzrVar.zzc;
                    Context zza = zzu.zza(zzuVar);
                    Message obtain = Message.obtain();
                    obtain.what = i;
                    obtain.arg1 = zzrVar.zza;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", zzrVar.zzb());
                    bundle.putString("pkg", zza.getPackageName());
                    bundle.putBundle("data", zzrVar.zzd);
                    obtain.setData(bundle);
                    try {
                        zznVar.zzc.zza(obtain);
                    } catch (RemoteException e) {
                        zznVar.zza(2, e.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd() {
        synchronized (this) {
            if (this.zza == 1) {
                zza(1, "Timed out while binding");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(int i) {
        synchronized (this) {
            zzr zzrVar = (zzr) this.zze.get(i);
            if (zzrVar != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i);
                this.zze.remove(i);
                zzrVar.zzc(new zzs(3, "Timed out waiting for response", null));
                zzf();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf() {
        synchronized (this) {
            if (this.zza == 2 && this.zzd.isEmpty() && this.zze.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.zza = 3;
                ConnectionTracker.getInstance().unbindService(zzu.zza(this.zzf), this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzg(zzr zzrVar) {
        synchronized (this) {
            int i = this.zza;
            if (i != 0) {
                if (i == 1) {
                    this.zzd.add(zzrVar);
                    return true;
                }
                if (i != 2) {
                    return false;
                }
                this.zzd.add(zzrVar);
                zzc();
                return true;
            }
            this.zzd.add(zzrVar);
            Preconditions.checkState(this.zza == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.zza = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (ConnectionTracker.getInstance().bindService(zzu.zza(this.zzf), intent, this, 1)) {
                    zzu.zze(this.zzf).schedule(new Runnable(this) { // from class: com.google.android.gms.cloudmessaging.zzi
                        public final zzn zza;

                        {
                            this.zza = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzd();
                        }
                    }, 30L, TimeUnit.SECONDS);
                } else {
                    zza(0, "Unable to bind to service");
                }
            } catch (SecurityException e) {
                zzb(0, "Unable to bind to service", e);
            }
            return true;
        }
    }
}

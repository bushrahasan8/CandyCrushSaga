package com.google.android.gms.tasks;

/* loaded from: zzm.class */
final class zzm implements Runnable {
    final Task zza;
    final zzn zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzm(zzn zznVar, Task task) {
        this.zzb = zznVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnSuccessListener onSuccessListener;
        OnSuccessListener onSuccessListener2;
        obj = this.zzb.zzb;
        synchronized (obj) {
            zzn zznVar = this.zzb;
            onSuccessListener = zznVar.zzc;
            if (onSuccessListener != null) {
                onSuccessListener2 = zznVar.zzc;
                onSuccessListener2.onSuccess(this.zza.getResult());
            }
        }
    }
}

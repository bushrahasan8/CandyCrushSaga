package com.google.android.gms.internal.consent_sdk;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: zze.class */
public final class zze {
    private final Executor zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zze(Executor executor) {
        this.zza = executor;
    }

    public final Executor zza() {
        return this.zza;
    }

    public final void zzb(final String str, final String str2, final zzd... zzdVarArr) {
        this.zza.execute(new Runnable(str, str2, zzdVarArr) { // from class: com.google.android.gms.internal.consent_sdk.zzc
            public final String zza;
            public final String zzb;
            public final zzd[] zzc;

            {
                this.zza = str;
                this.zzb = str2;
                this.zzc = zzdVarArr;
            }

            @Override // java.lang.Runnable
            public final void run() {
                JSONObject jSONObject;
                String str3 = this.zza;
                if (TextUtils.isEmpty(str3)) {
                    Log.d("UserMessagingPlatform", "Error on action: empty action name");
                    return;
                }
                String str4 = this.zzb;
                String lowerCase = str3.toLowerCase();
                if (TextUtils.isEmpty(str4)) {
                    jSONObject = new JSONObject();
                } else {
                    try {
                        jSONObject = new JSONObject(str4);
                    } catch (JSONException e) {
                        Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: failed to parse args: " + str4);
                        return;
                    }
                }
                zzd[] zzdVarArr2 = this.zzc;
                Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: " + jSONObject.toString());
                for (int i = 0; i < zzdVarArr2.length; i++) {
                    zzd zzdVar = zzdVarArr2[i];
                    FutureTask futureTask = new FutureTask(new Callable(zzdVar, lowerCase, jSONObject) { // from class: com.google.android.gms.internal.consent_sdk.zzb
                        public final zzd zza;
                        public final String zzb;
                        public final JSONObject zzc;

                        {
                            this.zza = zzdVar;
                            this.zzb = lowerCase;
                            this.zzc = jSONObject;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(this.zza.zzb(this.zzb, this.zzc));
                        }
                    });
                    zzdVar.zza().execute(futureTask);
                    try {
                    } catch (InterruptedException e2) {
                        Log.d("UserMessagingPlatform", "Thread interrupted for Action[" + lowerCase + "]: ", e2);
                    } catch (ExecutionException e3) {
                        Log.d("UserMessagingPlatform", "Failed to run Action[" + lowerCase + "]: ", e3.getCause());
                    }
                    if (((Boolean) futureTask.get()).booleanValue()) {
                        return;
                    }
                }
            }
        });
    }
}

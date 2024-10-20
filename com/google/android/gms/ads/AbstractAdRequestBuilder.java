package com.google.android.gms.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzcec;
import java.util.List;

/* loaded from: AbstractAdRequestBuilder.class */
public abstract class AbstractAdRequestBuilder<T extends AbstractAdRequestBuilder<T>> {
    protected final zzdw zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractAdRequestBuilder() {
        zzdw zzdwVar = new zzdw();
        this.zza = zzdwVar;
        zzdwVar.zzt("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    @Deprecated
    public T addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
        this.zza.zzo(cls, bundle);
        return self();
    }

    public T addKeyword(String str) {
        this.zza.zzq(str);
        return self();
    }

    public T addNetworkExtrasBundle(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
        this.zza.zzr(cls, bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            this.zza.zzu("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return self();
    }

    protected abstract T self();

    public T setAdString(String str) {
        this.zza.zzv(str);
        return self();
    }

    public T setContentUrl(String str) {
        Preconditions.checkNotNull(str, "Content URL must be non-null.");
        Preconditions.checkNotEmpty(str, "Content URL must be non-empty.");
        int length = str.length();
        int length2 = str.length();
        boolean z = false;
        if (length <= 512) {
            z = true;
        }
        Preconditions.checkArgument(z, "Content URL must not exceed %d in length.  Provided length was %d.", Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH), Integer.valueOf(length2));
        this.zza.zzw(str);
        return self();
    }

    public T setHttpTimeoutMillis(int i) {
        this.zza.zzx(i);
        return self();
    }

    public T setNeighboringContentUrls(List<String> list) {
        if (list == null) {
            zzcec.zzj("neighboring content URLs list should not be null");
            return self();
        }
        this.zza.zzz(list);
        return self();
    }

    public T setRequestAgent(String str) {
        this.zza.zzB(str);
        return self();
    }

    @Deprecated
    public final AbstractAdRequestBuilder zza(String str) {
        this.zza.zzt(str);
        return self();
    }

    @Deprecated
    public final AbstractAdRequestBuilder zzb(boolean z) {
        this.zza.zzy(z);
        return self();
    }

    @Deprecated
    public final AbstractAdRequestBuilder zzc(boolean z) {
        this.zza.zzC(z);
        return self();
    }
}

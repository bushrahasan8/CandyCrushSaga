package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ServiceInfo;
import android.os.Build;
import com.google.android.gms.ads.AdRequest;

/* loaded from: AppLocalesMetadataHolderService.class */
public abstract class AppLocalesMetadataHolderService extends Service {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: AppLocalesMetadataHolderService$Api24Impl.class */
    public static abstract class Api24Impl {
        static int getDisabledComponentFlag() {
            return AdRequest.MAX_CONTENT_URL_LENGTH;
        }
    }

    public static ServiceInfo getServiceInfo(Context context) {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), Build.VERSION.SDK_INT >= 24 ? Api24Impl.getDisabledComponentFlag() | 128 : 640);
    }
}

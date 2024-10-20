package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import bo.app.k0$;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: AndroidStoreDataSource.class */
public final class AndroidStoreDataSource implements StoreDataSource {
    private final Context context;

    public AndroidStoreDataSource(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.unity3d.ads.core.data.datasource.StoreDataSource
    public List<String> fetchStores(List<String> additionalStores) {
        Intrinsics.checkNotNullParameter(additionalStores, "additionalStores");
        AndroidKnownStore[] values = AndroidKnownStore.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (AndroidKnownStore androidKnownStore : values) {
            arrayList.add(androidKnownStore.getPackageName());
        }
        List distinct = CollectionsKt.distinct(CollectionsKt.plus((Collection) arrayList, (Iterable) additionalStores));
        PackageManager packageManager = this.context.getPackageManager();
        List list = distinct;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            String str = (String) obj;
            try {
                if ((Build.VERSION.SDK_INT >= 33 ? k0$.ExternalSyntheticApiModelOutline4.m(packageManager, str, k0$.ExternalSyntheticApiModelOutline3.m(0L)) : packageManager.getPackageInfo(str, 0)) != null) {
                    arrayList2.add(obj);
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return arrayList2;
    }
}

package com.unity3d.ads.core.domain;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.drive.DriveFile;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: AndroidHandleOpenUrl.class */
public final class AndroidHandleOpenUrl implements HandleOpenUrl {
    private final Context context;

    public AndroidHandleOpenUrl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.unity3d.ads.core.domain.HandleOpenUrl
    public void invoke(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intent intent = new Intent();
        if (str == null || str.length() <= 0) {
            str = null;
        }
        intent.setPackage(str);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(url));
        intent.setFlags(DriveFile.MODE_READ_ONLY);
        this.context.startActivity(intent);
    }
}

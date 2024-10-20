package com.vungle.ads.internal.omsdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.iab.omid.library.vungle.Omid;
import com.vungle.ads.internal.util.FileUtility;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: OMInjector.class */
public final class OMInjector {
    public static final Companion Companion = new Companion(null);
    private static final String OM_SDK_JS = "omsdk.js";
    private static final String OM_SESSION_JS = "omsdk-session.js";
    private final AtomicReference<Context> contextRef;
    private final Handler uiHandler;

    /* loaded from: OMInjector$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public OMInjector(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.uiHandler = new Handler(Looper.getMainLooper());
        this.contextRef = new AtomicReference<>(context.getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-0, reason: not valid java name */
    public static final void m6882init$lambda0(OMInjector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (Omid.isActive()) {
                return;
            }
            Omid.activate(this$0.contextRef.get());
        } catch (NoClassDefFoundError e) {
            Log.e("OMSDK", "error: " + e.getLocalizedMessage());
        }
    }

    private final File writeToFile(String str, File file) throws IOException {
        FileWriter fileWriter;
        try {
            FileWriter fileWriter2 = new FileWriter(file);
            try {
                fileWriter2.write(str);
                fileWriter2.flush();
                FileUtility.INSTANCE.closeQuietly(fileWriter2);
                return file;
            } catch (Throwable th) {
                th = th;
                fileWriter = fileWriter2;
                FileUtility.INSTANCE.closeQuietly(fileWriter);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileWriter = null;
        }
    }

    public final void init() {
        this.uiHandler.post(new Runnable(this) { // from class: com.vungle.ads.internal.omsdk.OMInjector$$ExternalSyntheticLambda0
            public final OMInjector f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OMInjector.m6882init$lambda0(this.f$0);
            }
        });
    }

    public final List<File> injectJsFiles(File dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        ArrayList arrayList = new ArrayList();
        Res res = Res.INSTANCE;
        arrayList.add(writeToFile(res.getOM_JS$vungle_ads_release(), new File(dir, OM_SDK_JS)));
        arrayList.add(writeToFile(res.getOM_SESSION_JS$vungle_ads_release(), new File(dir, OM_SESSION_JS)));
        return arrayList;
    }
}

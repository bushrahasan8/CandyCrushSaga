package com.vungle.ads.internal.ui;

import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.util.PathProvider;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: HackMraid.class */
public final class HackMraid {
    public static final HackMraid INSTANCE = new HackMraid();

    private HackMraid() {
    }

    public final void apply(PathProvider pathProvider, PrintWriter out) {
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        Intrinsics.checkNotNullParameter(out, "out");
        File file = new File(pathProvider.getJsAssetDir(ConfigManager.INSTANCE.getMraidJsVersion()), "mraid.min.js");
        if (file.exists()) {
            out.println(TextStreamsKt.readText(new BufferedReader(new InputStreamReader(new FileInputStream(file), Charsets.UTF_8), 8192)));
        }
    }
}

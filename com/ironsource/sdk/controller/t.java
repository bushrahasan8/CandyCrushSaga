package com.ironsource.sdk.controller;

import android.app.Activity;
import android.media.AudioManager;
import com.ironsource.o6;
import com.unity3d.services.core.device.MimeTypes;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: t.class */
public abstract class t {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: t$a.class */
    public class a implements Runnable {
        final AudioManager a;

        a(AudioManager audioManager) {
            this.a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.a(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: t$b.class */
    public class b implements Runnable {
        final AudioManager a;

        b(AudioManager audioManager) {
            this.a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.d(this.a);
        }
    }

    public static void a(Activity activity) {
        o6.a.a(new a((AudioManager) activity.getSystemService(MimeTypes.BASE_TYPE_AUDIO)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(AudioManager audioManager) {
        try {
            audioManager.abandonAudioFocus(null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void b(Activity activity) {
        o6.a.a(new b((AudioManager) activity.getSystemService(MimeTypes.BASE_TYPE_AUDIO)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(AudioManager audioManager) {
        try {
            audioManager.requestAudioFocus(null, 3, 2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

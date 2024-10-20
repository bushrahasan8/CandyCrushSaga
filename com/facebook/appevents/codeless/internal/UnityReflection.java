package com.facebook.appevents.codeless.internal;

import android.util.Log;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: UnityReflection.class */
public final class UnityReflection {
    public static final UnityReflection INSTANCE = new UnityReflection();
    private static final String TAG = UnityReflection.class.getCanonicalName();
    private static Class unityPlayer;

    private UnityReflection() {
    }

    public static final void captureViewHierarchy() {
        sendMessage("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    private final Class getUnityPlayerClass() {
        Class<?> cls = Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
        Intrinsics.checkNotNullExpressionValue(cls, "forName(UNITY_PLAYER_CLASS)");
        return cls;
    }

    public static final void sendEventMapping(String str) {
        sendMessage("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    public static final void sendMessage(String str, String str2, String str3) {
        try {
            if (unityPlayer == null) {
                unityPlayer = INSTANCE.getUnityPlayerClass();
            }
            Class cls = unityPlayer;
            Class cls2 = cls;
            if (cls == null) {
                Intrinsics.throwUninitializedPropertyAccessException("unityPlayer");
                cls2 = null;
            }
            Method method = cls2.getMethod("UnitySendMessage", String.class, String.class, String.class);
            Class cls3 = unityPlayer;
            if (cls3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("unityPlayer");
                cls3 = null;
            }
            method.invoke(cls3, str, str2, str3);
        } catch (Exception e) {
            Log.e(TAG, "Failed to send message to Unity", e);
        }
    }
}

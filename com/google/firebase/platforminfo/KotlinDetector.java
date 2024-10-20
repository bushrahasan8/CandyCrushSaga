package com.google.firebase.platforminfo;

import kotlin.KotlinVersion;

/* loaded from: KotlinDetector.class */
public abstract class KotlinDetector {
    public static String detectVersion() {
        try {
            return KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError e) {
            return null;
        }
    }
}

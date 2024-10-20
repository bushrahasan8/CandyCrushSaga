package com.vungle.ads.internal.persistence;

import com.vungle.ads.internal.util.CollectionsConcurrencyUtil;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.PathProvider;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: FilePreferences.class */
public final class FilePreferences {
    public static final Companion Companion = new Companion(null);
    private static final String FILENAME = "settings_vungle";
    private final File file;
    private final Executor ioExecutor;
    private final ConcurrentHashMap<String, Object> values;

    /* loaded from: FilePreferences$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getFILENAME$annotations() {
        }

        public final String getFILENAME() {
            return FilePreferences.FILENAME;
        }
    }

    public FilePreferences(Executor ioExecutor, PathProvider pathProvider, String filename) {
        Intrinsics.checkNotNullParameter(ioExecutor, "ioExecutor");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        Intrinsics.checkNotNullParameter(filename, "filename");
        this.ioExecutor = ioExecutor;
        File file = new File(pathProvider.getSharedPrefsDir(), filename);
        this.file = file;
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        this.values = concurrentHashMap;
        Object readSerializable = FileUtility.readSerializable(file);
        if (readSerializable instanceof HashMap) {
            concurrentHashMap.putAll((HashMap) readSerializable);
        }
    }

    public /* synthetic */ FilePreferences(Executor executor, PathProvider pathProvider, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(executor, pathProvider, (i & 4) != 0 ? FILENAME : str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: apply$lambda-0, reason: not valid java name */
    public static final void m6887apply$lambda0(FilePreferences this$0, Serializable serializable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(serializable, "$serializable");
        FileUtility.writeSerializable(this$0.file, serializable);
    }

    public final void apply() {
        final HashMap hashMap = new HashMap(this.values);
        this.ioExecutor.execute(new Runnable(this, hashMap) { // from class: com.vungle.ads.internal.persistence.FilePreferences$$ExternalSyntheticLambda0
            public final FilePreferences f$0;
            public final Serializable f$1;

            {
                this.f$0 = this;
                this.f$1 = hashMap;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FilePreferences.m6887apply$lambda0(this.f$0, this.f$1);
            }
        });
    }

    public final Boolean getBoolean(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        return obj instanceof Boolean ? (Boolean) obj : null;
    }

    public final boolean getBoolean(String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof Boolean) {
            z = ((Boolean) obj).booleanValue();
        }
        return z;
    }

    public final int getInt(String key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof Integer) {
            i = ((Number) obj).intValue();
        }
        return i;
    }

    public final long getLong(String key, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof Long) {
            j = ((Number) obj).longValue();
        }
        return j;
    }

    public final String getString(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        return obj instanceof String ? (String) obj : null;
    }

    public final String getString(String key, String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object obj = this.values.get(key);
        if (obj instanceof String) {
            defaultValue = (String) obj;
        }
        return defaultValue;
    }

    public final HashSet<String> getStringSet(String key, HashSet<String> defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object obj = this.values.get(key);
        if (obj instanceof HashSet) {
            defaultValue = CollectionsConcurrencyUtil.getNewHashSet((HashSet) obj);
        }
        return defaultValue;
    }

    public final FilePreferences put(String key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.values.put(key, Integer.valueOf(i));
        return this;
    }

    public final FilePreferences put(String key, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.values.put(key, Long.valueOf(j));
        return this;
    }

    public final FilePreferences put(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.values.put(key, value);
        return this;
    }

    public final FilePreferences put(String key, HashSet<String> hashSet) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.values.put(key, CollectionsConcurrencyUtil.getNewHashSet(hashSet));
        return this;
    }

    public final FilePreferences put(String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.values.put(key, Boolean.valueOf(z));
        return this;
    }

    public final FilePreferences remove(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.values.containsKey(key)) {
            this.values.remove(key);
        }
        return this;
    }
}

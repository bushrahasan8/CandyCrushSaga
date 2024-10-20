package com.google.firebase.components;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.inject.Provider;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: ComponentDiscovery.class */
public final class ComponentDiscovery {
    private final Object context;
    private final RegistrarNameRetriever retriever;

    /* loaded from: ComponentDiscovery$MetadataRegistrarNameRetriever.class */
    private static class MetadataRegistrarNameRetriever implements RegistrarNameRetriever {
        private final Class discoveryService;

        private MetadataRegistrarNameRetriever(Class cls) {
            this.discoveryService = cls;
        }

        private Bundle getMetadata(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) this.discoveryService), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.discoveryService + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever
        public List retrieve(Context context) {
            Bundle metadata = getMetadata(context);
            if (metadata == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : metadata.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(metadata.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    /* loaded from: ComponentDiscovery$RegistrarNameRetriever.class */
    interface RegistrarNameRetriever {
        List retrieve(Object obj);
    }

    ComponentDiscovery(Object obj, RegistrarNameRetriever registrarNameRetriever) {
        this.context = obj;
        this.retriever = registrarNameRetriever;
    }

    public static ComponentDiscovery forContext(Context context, Class cls) {
        return new ComponentDiscovery(context, new MetadataRegistrarNameRetriever(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ComponentRegistrar instantiate(String str) {
        try {
            try {
                Class<?> cls = Class.forName(str);
                if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                    return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                }
                throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
            } catch (InvocationTargetException e) {
                throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e);
            }
        } catch (ClassNotFoundException e2) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e3);
        } catch (InstantiationException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e4);
        } catch (NoSuchMethodException e5) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e5);
        }
    }

    public List discoverLazy() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.retriever.retrieve(this.context)) {
            arrayList.add(new Provider(str) { // from class: com.google.firebase.components.ComponentDiscovery$$ExternalSyntheticLambda0
                public final String f$0;

                {
                    this.f$0 = str;
                }

                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    ComponentRegistrar instantiate;
                    instantiate = ComponentDiscovery.instantiate(this.f$0);
                    return instantiate;
                }
            });
        }
        return arrayList;
    }
}

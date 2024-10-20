package com.google.android.libraries.play.hpe;

import android.content.Context;

/* loaded from: InputMappingManager.class */
public class InputMappingManager {

    /* loaded from: InputMappingManager$MappingProvider.class */
    public interface MappingProvider {
        byte[] getInputMap();
    }

    public InputMappingManager(Context context) {
        throw new RuntimeException("Stub!");
    }

    public void register(MappingProvider mappingProvider) {
        throw null;
    }

    public void unregister(MappingProvider mappingProvider) {
        throw null;
    }
}

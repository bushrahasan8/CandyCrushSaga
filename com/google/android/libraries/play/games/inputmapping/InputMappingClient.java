package com.google.android.libraries.play.games.inputmapping;

import androidx.annotation.Keep;

@Keep
/* loaded from: InputMappingClient.class */
public interface InputMappingClient {
    @Keep
    void clearInputMappingProvider();

    @Keep
    void setInputMappingProvider(InputMappingProvider inputMappingProvider);
}

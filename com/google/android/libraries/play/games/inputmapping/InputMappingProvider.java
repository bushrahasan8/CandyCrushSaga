package com.google.android.libraries.play.games.inputmapping;

import androidx.annotation.Keep;
import com.google.android.libraries.play.games.inputmapping.datamodel.InputMap;

@Keep
/* loaded from: InputMappingProvider.class */
public interface InputMappingProvider {
    @Keep
    InputMap onProvideInputMap();
}

package androidx.transition;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* loaded from: PropertyValuesHolderUtils.class */
abstract class PropertyValuesHolderUtils {
    public static PropertyValuesHolder ofPointF(Property property, Path path) {
        return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
    }
}

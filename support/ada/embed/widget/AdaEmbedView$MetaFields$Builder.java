package support.ada.embed.widget;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: AdaEmbedView$MetaFields$Builder.class */
public final class AdaEmbedView$MetaFields$Builder {
    private Map metaFields = new LinkedHashMap();

    public final Map build$ada_embed_release() {
        return this.metaFields;
    }

    public final AdaEmbedView$MetaFields$Builder setField(String key, String value) {
        Intrinsics.checkParameterIsNotNull(key, "key");
        Intrinsics.checkParameterIsNotNull(value, "value");
        this.metaFields.put(key, value);
        return this;
    }
}

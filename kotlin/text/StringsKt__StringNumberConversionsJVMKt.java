package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: StringsKt__StringNumberConversionsJVMKt.class */
public abstract class StringsKt__StringNumberConversionsJVMKt extends StringsKt__StringBuilderKt {
    public static Double toDoubleOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Double d = null;
        try {
            if (ScreenFloatValueRegEx.value.matches(str)) {
                d = Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException e) {
            d = null;
        }
        return d;
    }
}

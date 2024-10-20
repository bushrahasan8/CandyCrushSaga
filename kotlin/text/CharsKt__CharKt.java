package kotlin.text;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: CharsKt__CharKt.class */
public abstract class CharsKt__CharKt extends CharsKt__CharJVMKt {
    public static int digitToInt(char c) {
        int digitOf = CharsKt__CharJVMKt.digitOf(c, 10);
        if (digitOf >= 0) {
            return digitOf;
        }
        throw new IllegalArgumentException("Char " + c + " is not a decimal digit");
    }

    public static final boolean equals(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        boolean z2 = true;
        if (upperCase != upperCase2) {
            z2 = Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
        }
        return z2;
    }

    public static String titlecase(char c) {
        return _OneToManyTitlecaseMappingsKt.titlecaseImpl(c);
    }
}

package kotlin.text;

import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: CharsKt__CharJVMKt.class */
public abstract class CharsKt__CharJVMKt {
    public static int checkRadix(int i) {
        if (new IntRange(2, 36).contains(i)) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new IntRange(2, 36));
    }

    public static final int digitOf(char c, int i) {
        return Character.digit((int) c, i);
    }

    public static final boolean isWhitespace(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}

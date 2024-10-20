package com.google.common.base;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: Joiner.class */
public class Joiner {
    private final String separator;

    private Joiner(String str) {
        this.separator = (String) Preconditions.checkNotNull(str);
    }

    public static Joiner on(char c) {
        return new Joiner(String.valueOf(c));
    }

    public Appendable appendTo(Appendable appendable, Iterator it) {
        Preconditions.checkNotNull(appendable);
        if (it.hasNext()) {
            appendable.append(toString(it.next()));
            while (it.hasNext()) {
                appendable.append(this.separator);
                appendable.append(toString(it.next()));
            }
        }
        return appendable;
    }

    public final StringBuilder appendTo(StringBuilder sb, Iterable iterable) {
        return appendTo(sb, iterable.iterator());
    }

    public final StringBuilder appendTo(StringBuilder sb, Iterator it) {
        try {
            appendTo((Appendable) sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.CharSequence] */
    CharSequence toString(Object obj) {
        java.util.Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}

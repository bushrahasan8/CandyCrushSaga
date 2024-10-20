package com.google.common.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: Splitter.class */
public final class Splitter {
    private final int limit;
    private final boolean omitEmptyStrings;
    private final Strategy strategy;
    private final CharMatcher trimmer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.base.Splitter$1, reason: invalid class name */
    /* loaded from: Splitter$1.class */
    public class AnonymousClass1 implements Strategy {
        final CharMatcher val$separatorMatcher;

        AnonymousClass1(CharMatcher charMatcher) {
            this.val$separatorMatcher = charMatcher;
        }

        @Override // com.google.common.base.Splitter.Strategy
        public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
            return new SplittingIterator(this, splitter, charSequence) { // from class: com.google.common.base.Splitter.1.1
                final AnonymousClass1 this$0;

                {
                    this.this$0 = this;
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                int separatorEnd(int i) {
                    return i + 1;
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                int separatorStart(int i) {
                    return this.this$0.val$separatorMatcher.indexIn(this.toSplit, i);
                }
            };
        }
    }

    /* loaded from: Splitter$SplittingIterator.class */
    private static abstract class SplittingIterator extends AbstractIterator {
        int limit;
        int offset = 0;
        final boolean omitEmptyStrings;
        final CharSequence toSplit;
        final CharMatcher trimmer;

        protected SplittingIterator(Splitter splitter, CharSequence charSequence) {
            this.trimmer = splitter.trimmer;
            this.omitEmptyStrings = splitter.omitEmptyStrings;
            this.limit = splitter.limit;
            this.toSplit = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.AbstractIterator
        public String computeNext() {
            int i;
            int i2;
            int i3;
            int i4 = this.offset;
            while (true) {
                int i5 = this.offset;
                if (i5 == -1) {
                    return (String) endOfData();
                }
                int separatorStart = separatorStart(i5);
                if (separatorStart == -1) {
                    separatorStart = this.toSplit.length();
                    this.offset = -1;
                } else {
                    this.offset = separatorEnd(separatorStart);
                }
                int i6 = this.offset;
                i = i4;
                if (i6 == i4) {
                    int i7 = i6 + 1;
                    this.offset = i7;
                    if (i7 > this.toSplit.length()) {
                        this.offset = -1;
                    }
                } else {
                    while (true) {
                        i2 = separatorStart;
                        if (i >= separatorStart) {
                            break;
                        }
                        i2 = separatorStart;
                        if (!this.trimmer.matches(this.toSplit.charAt(i))) {
                            break;
                        }
                        i++;
                    }
                    while (i2 > i && this.trimmer.matches(this.toSplit.charAt(i2 - 1))) {
                        i2--;
                    }
                    if (!this.omitEmptyStrings || i != i2) {
                        break;
                    }
                    i4 = this.offset;
                }
            }
            int i8 = this.limit;
            if (i8 == 1) {
                int length = this.toSplit.length();
                this.offset = -1;
                while (true) {
                    i3 = length;
                    if (length <= i) {
                        break;
                    }
                    i3 = length;
                    if (!this.trimmer.matches(this.toSplit.charAt(length - 1))) {
                        break;
                    }
                    length--;
                }
            } else {
                this.limit = i8 - 1;
                i3 = i2;
            }
            return this.toSplit.subSequence(i, i3).toString();
        }

        abstract int separatorEnd(int i);

        abstract int separatorStart(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: Splitter$Strategy.class */
    public interface Strategy {
        Iterator iterator(Splitter splitter, CharSequence charSequence);
    }

    private Splitter(Strategy strategy) {
        this(strategy, false, CharMatcher.none(), Integer.MAX_VALUE);
    }

    private Splitter(Strategy strategy, boolean z, CharMatcher charMatcher, int i) {
        this.strategy = strategy;
        this.omitEmptyStrings = z;
        this.trimmer = charMatcher;
        this.limit = i;
    }

    public static Splitter on(char c) {
        return on(CharMatcher.is(c));
    }

    public static Splitter on(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(new AnonymousClass1(charMatcher));
    }

    private Iterator splittingIterator(CharSequence charSequence) {
        return this.strategy.iterator(this, charSequence);
    }

    public List splitToList(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        Iterator splittingIterator = splittingIterator(charSequence);
        ArrayList arrayList = new ArrayList();
        while (splittingIterator.hasNext()) {
            arrayList.add((String) splittingIterator.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}

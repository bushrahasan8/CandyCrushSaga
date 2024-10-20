package kotlin.sequences;

import java.util.Iterator;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: SequencesKt__SequenceBuilderKt.class */
abstract class SequencesKt__SequenceBuilderKt {
    public static final Iterator iterator(Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        SequenceBuilderIterator sequenceBuilderIterator = new SequenceBuilderIterator();
        sequenceBuilderIterator.setNextStep(IntrinsicsKt.createCoroutineUnintercepted(block, sequenceBuilderIterator, sequenceBuilderIterator));
        return sequenceBuilderIterator;
    }

    public static Sequence sequence(final Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new Sequence(block) { // from class: kotlin.sequences.SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1
            final Function2 $block$inlined;

            {
                this.$block$inlined = block;
            }

            @Override // kotlin.sequences.Sequence
            public Iterator iterator() {
                return SequencesKt__SequenceBuilderKt.iterator(this.$block$inlined);
            }
        };
    }
}

package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: SequencesKt__SequencesKt.class */
public abstract class SequencesKt__SequencesKt extends SequencesKt__SequencesJVMKt {
    public static Sequence asSequence(final Iterator it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return SequencesKt.constrainOnce(new Sequence(it) { // from class: kotlin.sequences.SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1
            final Iterator $this_asSequence$inlined;

            {
                this.$this_asSequence$inlined = it;
            }

            @Override // kotlin.sequences.Sequence
            public Iterator iterator() {
                return this.$this_asSequence$inlined;
            }
        });
    }

    public static Sequence constrainOnce(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (!(sequence instanceof ConstrainedOnceSequence)) {
            sequence = new ConstrainedOnceSequence(sequence);
        }
        return sequence;
    }
}

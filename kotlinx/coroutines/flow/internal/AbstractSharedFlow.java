package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: AbstractSharedFlow.class */
public abstract class AbstractSharedFlow {
    private SubscriptionCountStateFlow _subscriptionCount;
    private int nCollectors;
    private int nextIndex;
    private AbstractSharedFlowSlot[] slots;

    public static final /* synthetic */ int access$getNCollectors(AbstractSharedFlow abstractSharedFlow) {
        return abstractSharedFlow.nCollectors;
    }

    public static final /* synthetic */ AbstractSharedFlowSlot[] access$getSlots(AbstractSharedFlow abstractSharedFlow) {
        return abstractSharedFlow.slots;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AbstractSharedFlowSlot allocateSlot() {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        AbstractSharedFlowSlot abstractSharedFlowSlot;
        int i;
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        synchronized (this) {
            AbstractSharedFlowSlot[] abstractSharedFlowSlotArr2 = this.slots;
            if (abstractSharedFlowSlotArr2 == null) {
                abstractSharedFlowSlotArr = createSlotArray(2);
                this.slots = abstractSharedFlowSlotArr;
            } else {
                abstractSharedFlowSlotArr = abstractSharedFlowSlotArr2;
                if (this.nCollectors >= abstractSharedFlowSlotArr2.length) {
                    Object[] copyOf = Arrays.copyOf(abstractSharedFlowSlotArr2, abstractSharedFlowSlotArr2.length * 2);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                    this.slots = (AbstractSharedFlowSlot[]) copyOf;
                    abstractSharedFlowSlotArr = (AbstractSharedFlowSlot[]) copyOf;
                }
            }
            int i2 = this.nextIndex;
            do {
                AbstractSharedFlowSlot abstractSharedFlowSlot2 = abstractSharedFlowSlotArr[i2];
                abstractSharedFlowSlot = abstractSharedFlowSlot2;
                if (abstractSharedFlowSlot2 == null) {
                    abstractSharedFlowSlot = createSlot();
                    abstractSharedFlowSlotArr[i2] = abstractSharedFlowSlot;
                }
                int i3 = i2 + 1;
                i = i3;
                if (i3 >= abstractSharedFlowSlotArr.length) {
                    i = 0;
                }
                Intrinsics.checkNotNull(abstractSharedFlowSlot, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                i2 = i;
            } while (!abstractSharedFlowSlot.allocateLocked(this));
            this.nextIndex = i;
            this.nCollectors++;
            subscriptionCountStateFlow = this._subscriptionCount;
        }
        if (subscriptionCountStateFlow != null) {
            subscriptionCountStateFlow.increment(1);
        }
        return abstractSharedFlowSlot;
    }

    protected abstract AbstractSharedFlowSlot createSlot();

    protected abstract AbstractSharedFlowSlot[] createSlotArray(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void freeSlot(AbstractSharedFlowSlot abstractSharedFlowSlot) {
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        int i;
        Continuation[] freeLocked;
        synchronized (this) {
            int i2 = this.nCollectors - 1;
            this.nCollectors = i2;
            subscriptionCountStateFlow = this._subscriptionCount;
            if (i2 == 0) {
                this.nextIndex = 0;
            }
            Intrinsics.checkNotNull(abstractSharedFlowSlot, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            freeLocked = abstractSharedFlowSlot.freeLocked(this);
        }
        for (Continuation continuation : freeLocked) {
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m7129constructorimpl(Unit.INSTANCE));
            }
        }
        if (subscriptionCountStateFlow != null) {
            subscriptionCountStateFlow.increment(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getNCollectors() {
        return this.nCollectors;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AbstractSharedFlowSlot[] getSlots() {
        return this.slots;
    }

    public final StateFlow getSubscriptionCount() {
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        synchronized (this) {
            SubscriptionCountStateFlow subscriptionCountStateFlow2 = this._subscriptionCount;
            subscriptionCountStateFlow = subscriptionCountStateFlow2;
            if (subscriptionCountStateFlow2 == null) {
                subscriptionCountStateFlow = new SubscriptionCountStateFlow(this.nCollectors);
                this._subscriptionCount = subscriptionCountStateFlow;
            }
        }
        return subscriptionCountStateFlow;
    }
}

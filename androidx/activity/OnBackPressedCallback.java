package androidx.activity;

import androidx.core.util.Consumer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: OnBackPressedCallback.class */
public abstract class OnBackPressedCallback {
    private CopyOnWriteArrayList mCancellables = new CopyOnWriteArrayList();
    private boolean mEnabled;
    private Consumer mEnabledConsumer;

    public OnBackPressedCallback(boolean z) {
        this.mEnabled = z;
    }

    public void addCancellable(Cancellable cancellable) {
        this.mCancellables.add(cancellable);
    }

    public abstract void handleOnBackPressed();

    public final boolean isEnabled() {
        return this.mEnabled;
    }

    public final void remove() {
        Iterator it = this.mCancellables.iterator();
        while (it.hasNext()) {
            ((Cancellable) it.next()).cancel();
        }
    }

    public void removeCancellable(Cancellable cancellable) {
        this.mCancellables.remove(cancellable);
    }

    public final void setEnabled(boolean z) {
        this.mEnabled = z;
        Consumer consumer = this.mEnabledConsumer;
        if (consumer != null) {
            consumer.accept(Boolean.valueOf(z));
        }
    }

    public void setIsEnabledConsumer(Consumer consumer) {
        this.mEnabledConsumer = consumer;
    }
}

package com.onetrust.otpublishers.headless.UI.mobiledatautils;

import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

/* loaded from: b.class */
public final class b implements LifecycleEventObserver {
    public final AppCompatDialogFragment a;
    public final FragmentActivity b;
    public final String c;

    public b(BottomSheetDialogFragment bottomSheetDialogFragment, FragmentActivity fragmentActivity, String str) {
        this.a = bottomSheetDialogFragment;
        this.b = fragmentActivity;
        this.c = str;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event.compareTo(Lifecycle.Event.ON_RESUME) == 0) {
            this.a.show(this.b.getSupportFragmentManager(), this.c);
            this.b.getLifecycle().removeObserver(this);
        }
    }
}

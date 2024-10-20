package androidx.core.view;

import android.view.MotionEvent;

/* loaded from: MotionEventCompat.class */
public abstract class MotionEventCompat {
    public static boolean isFromSource(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}

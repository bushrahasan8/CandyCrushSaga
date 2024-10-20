package androidx.constraintlayout.motion.widget;

import android.view.View;

/* loaded from: Debug.class */
public abstract class Debug {
    public static String getName(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception e) {
            return "UNKNOWN";
        }
    }
}

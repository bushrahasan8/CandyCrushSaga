package com.google.android.material.internal;

import android.widget.Checkable;

/* loaded from: MaterialCheckable.class */
public interface MaterialCheckable extends Checkable {

    /* loaded from: MaterialCheckable$OnCheckedChangeListener.class */
    public interface OnCheckedChangeListener {
        void onCheckedChanged(Object obj, boolean z);
    }

    int getId();

    void setInternalOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener);
}

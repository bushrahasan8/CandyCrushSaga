package com.google.android.ump;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;

/* loaded from: ConsentForm.class */
public interface ConsentForm {

    /* loaded from: ConsentForm$OnConsentFormDismissedListener.class */
    public interface OnConsentFormDismissedListener {
        void onConsentFormDismissed(FormError formError);
    }

    void show(@RecentlyNonNull Activity activity, @RecentlyNonNull OnConsentFormDismissedListener onConsentFormDismissedListener);
}

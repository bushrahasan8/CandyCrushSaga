package com.onetrust.otpublishers.headless.UI.fragment;

import android.content.SharedPreferences;
import androidx.fragment.app.FragmentActivity;

/* loaded from: a.class */
public abstract /* synthetic */ class a {
    public static SharedPreferences a(String str, String str2, FragmentActivity fragmentActivity, int i) {
        return fragmentActivity.getSharedPreferences(str + str2, i);
    }
}

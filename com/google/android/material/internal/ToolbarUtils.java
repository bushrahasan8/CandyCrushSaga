package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: ToolbarUtils.class */
public abstract class ToolbarUtils {
    private static final Comparator VIEW_TOP_COMPARATOR = new Comparator() { // from class: com.google.android.material.internal.ToolbarUtils.1
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    };

    private static ImageView getImageView(Toolbar toolbar, Drawable drawable) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ImageView) {
                ImageView imageView = (ImageView) childAt;
                if (drawable != null && imageView.getDrawable().getConstantState().equals(drawable.getConstantState())) {
                    return imageView;
                }
            }
        }
        return null;
    }

    public static ImageView getLogoImageView(Toolbar toolbar) {
        return getImageView(toolbar, toolbar.getLogo());
    }

    public static TextView getSubtitleTextView(Toolbar toolbar) {
        List textViewsWithText = getTextViewsWithText(toolbar, toolbar.getSubtitle());
        return textViewsWithText.isEmpty() ? null : (TextView) Collections.max(textViewsWithText, VIEW_TOP_COMPARATOR);
    }

    private static List getTextViewsWithText(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static TextView getTitleTextView(Toolbar toolbar) {
        List textViewsWithText = getTextViewsWithText(toolbar, toolbar.getTitle());
        return textViewsWithText.isEmpty() ? null : (TextView) Collections.min(textViewsWithText, VIEW_TOP_COMPARATOR);
    }
}

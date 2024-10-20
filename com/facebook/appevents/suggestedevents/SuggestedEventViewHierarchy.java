package com.facebook.appevents.suggestedevents;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.ironsource.t2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: SuggestedEventViewHierarchy.class */
public final class SuggestedEventViewHierarchy {
    public static final SuggestedEventViewHierarchy INSTANCE = new SuggestedEventViewHierarchy();
    private static final List blacklistedViews = CollectionsKt.listOf((Object[]) new Class[]{Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class});

    private SuggestedEventViewHierarchy() {
    }

    public static final List getAllClickableViews(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ArrayList arrayList = new ArrayList();
        Iterator it = blacklistedViews.iterator();
        while (it.hasNext()) {
            if (((Class) it.next()).isInstance(view)) {
                return arrayList;
            }
        }
        if (view.isClickable()) {
            arrayList.add(view);
        }
        Iterator it2 = ViewHierarchy.getChildrenOfView(view).iterator();
        while (it2.hasNext()) {
            arrayList.addAll(getAllClickableViews((View) it2.next()));
        }
        return arrayList;
    }

    public static final JSONObject getDictionaryOfView(View view, View clickedView) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(clickedView, "clickedView");
        JSONObject jSONObject = new JSONObject();
        if (view == clickedView) {
            try {
                jSONObject.put("is_interacted", true);
            } catch (JSONException e) {
            }
        }
        updateBasicInfo(view, jSONObject);
        JSONArray jSONArray = new JSONArray();
        Iterator it = ViewHierarchy.getChildrenOfView(view).iterator();
        while (it.hasNext()) {
            jSONArray.put(getDictionaryOfView((View) it.next(), clickedView));
        }
        jSONObject.put("childviews", jSONArray);
        return jSONObject;
    }

    private final List getTextOfChildren(View view) {
        ArrayList arrayList = new ArrayList();
        for (View view2 : ViewHierarchy.getChildrenOfView(view)) {
            String textOfView = ViewHierarchy.getTextOfView(view2);
            if (textOfView.length() > 0) {
                arrayList.add(textOfView);
            }
            arrayList.addAll(getTextOfChildren(view2));
        }
        return arrayList;
    }

    public static final String getTextOfViewRecursively(View hostView) {
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        String textOfView = ViewHierarchy.getTextOfView(hostView);
        if (textOfView.length() > 0) {
            return textOfView;
        }
        String join = TextUtils.join(" ", INSTANCE.getTextOfChildren(hostView));
        Intrinsics.checkNotNullExpressionValue(join, "join(\" \", childrenText)");
        return join;
    }

    public static final void updateBasicInfo(View view, JSONObject json) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            String textOfView = ViewHierarchy.getTextOfView(view);
            String hintOfView = ViewHierarchy.getHintOfView(view);
            json.put("classname", view.getClass().getSimpleName());
            json.put("classtypebitmask", ViewHierarchy.getClassTypeBitmask(view));
            if (textOfView.length() > 0) {
                json.put(t2.h.K0, textOfView);
            }
            if (hintOfView.length() > 0) {
                json.put("hint", hintOfView);
            }
            if (view instanceof EditText) {
                json.put("inputtype", ((EditText) view).getInputType());
            }
        } catch (JSONException e) {
        }
    }
}

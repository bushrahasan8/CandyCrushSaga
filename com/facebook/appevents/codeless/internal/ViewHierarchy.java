package com.facebook.appevents.codeless.internal;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import com.facebook.internal.Utility;
import com.ironsource.t2;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: ViewHierarchy.class */
public final class ViewHierarchy {
    private static Method methodFindTouchTargetView;
    public static final ViewHierarchy INSTANCE = new ViewHierarchy();
    private static final String TAG = ViewHierarchy.class.getCanonicalName();
    private static WeakReference RCTRootViewReference = new WeakReference(null);

    private ViewHierarchy() {
    }

    public static final View findRCTRootView(View view) {
        while (view != null) {
            if (INSTANCE.isRCTRootView(view)) {
                return view;
            }
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
        return null;
    }

    public static final List getChildrenOfView(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                arrayList.add(viewGroup.getChildAt(i));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int getClassTypeBitmask(android.view.View r4) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.codeless.internal.ViewHierarchy.getClassTypeBitmask(android.view.View):int");
    }

    public static final JSONObject getDictionaryOfView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
            RCTRootViewReference = new WeakReference(view);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            updateBasicInfoOfView(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            List childrenOfView = getChildrenOfView(view);
            int size = childrenOfView.size();
            for (int i = 0; i < size; i++) {
                jSONArray.put(getDictionaryOfView((View) childrenOfView.get(i)));
            }
            jSONObject.put("childviews", jSONArray);
        } catch (JSONException e) {
            Log.e(TAG, "Failed to create JSONObject for view.", e);
        }
        return jSONObject;
    }

    private final JSONObject getDimensionOfView(View view) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("top", view.getTop());
            jSONObject.put("left", view.getLeft());
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("scrollx", view.getScrollX());
            jSONObject.put("scrolly", view.getScrollY());
            jSONObject.put("visibility", view.getVisibility());
        } catch (JSONException e) {
            Log.e(TAG, "Failed to create JSONObject for dimension.", e);
        }
        return jSONObject;
    }

    private final Class getExistingClass(String str) {
        Class<?> cls;
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException e) {
            cls = null;
        }
        return cls;
    }

    public static final View.OnClickListener getExistingOnClickListener(View view) {
        View.OnClickListener onClickListener;
        Object obj;
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            obj = declaredField.get(view);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
            onClickListener = null;
        }
        if (obj == null) {
            return null;
        }
        Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
        onClickListener = null;
        if (declaredField2 != null) {
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.view.View.OnClickListener");
            onClickListener = (View.OnClickListener) obj2;
        }
        return onClickListener;
    }

    public static final View.OnTouchListener getExistingOnTouchListener(View view) {
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
            View.OnTouchListener onTouchListener = null;
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(obj);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.view.View.OnTouchListener");
                onTouchListener = (View.OnTouchListener) obj2;
            }
            return onTouchListener;
        } catch (ClassNotFoundException e) {
            Utility.logd(TAG, e);
            return null;
        } catch (IllegalAccessException e2) {
            Utility.logd(TAG, e2);
            return null;
        } catch (NoSuchFieldException e3) {
            Utility.logd(TAG, e3);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r0 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String getHintOfView(android.view.View r2) {
        /*
            r0 = r2
            boolean r0 = r0 instanceof android.widget.EditText
            if (r0 == 0) goto L12
            r0 = r2
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.CharSequence r0 = r0.getHint()
            r2 = r0
            goto L26
        L12:
            r0 = r2
            boolean r0 = r0 instanceof android.widget.TextView
            if (r0 == 0) goto L24
            r0 = r2
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r0 = r0.getHint()
            r2 = r0
            goto L26
        L24:
            r0 = 0
            r2 = r0
        L26:
            r0 = r2
            if (r0 == 0) goto L35
            r0 = r2
            java.lang.String r0 = r0.toString()
            r3 = r0
            r0 = r3
            r2 = r0
            r0 = r3
            if (r0 != 0) goto L39
        L35:
            java.lang.String r0 = ""
            r2 = r0
        L39:
            r0 = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.codeless.internal.ViewHierarchy.getHintOfView(android.view.View):java.lang.String");
    }

    public static final ViewGroup getParentOfView(View view) {
        if (view == null) {
            return null;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = null;
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        }
        return viewGroup;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0176, code lost:
    
        if (r0 == null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String getTextOfView(android.view.View r6) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.codeless.internal.ViewHierarchy.getTextOfView(android.view.View):java.lang.String");
    }

    private final View getTouchReactView(float[] fArr, View view) {
        initTouchTargetHelperMethods();
        Method method = methodFindTouchTargetView;
        if (method == null || view == null) {
            return null;
        }
        try {
            try {
                if (method == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                Object invoke = method.invoke(null, fArr, view);
                Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type android.view.View");
                View view2 = (View) invoke;
                if (view2.getId() <= 0) {
                    return null;
                }
                Object parent = view2.getParent();
                Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
                return (View) parent;
            } catch (IllegalAccessException e) {
                Utility.logd(TAG, e);
                return null;
            }
        } catch (InvocationTargetException e2) {
            Utility.logd(TAG, e2);
            return null;
        }
    }

    private final float[] getViewLocationOnScreen(View view) {
        view.getLocationOnScreen(new int[2]);
        return new float[]{r0[0], r0[1]};
    }

    private final void initTouchTargetHelperMethods() {
        try {
            if (methodFindTouchTargetView != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                methodFindTouchTargetView = declaredMethod;
                if (declaredMethod == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Utility.logd(TAG, e);
            }
        } catch (ClassNotFoundException e2) {
            Utility.logd(TAG, e2);
        }
    }

    private static final boolean isAdapterViewItem(View view) {
        ViewParent parent = view.getParent();
        boolean z = true;
        if (parent instanceof AdapterView) {
            return true;
        }
        ViewHierarchy viewHierarchy = INSTANCE;
        Class existingClass = viewHierarchy.getExistingClass("android.support.v4.view.NestedScrollingChild");
        if (existingClass != null && existingClass.isInstance(parent)) {
            return true;
        }
        Class existingClass2 = viewHierarchy.getExistingClass("androidx.core.view.NestedScrollingChild");
        if (existingClass2 == null || !existingClass2.isInstance(parent)) {
            z = false;
        }
        return z;
    }

    private final boolean isRCTRootView(View view) {
        return Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.ReactRootView");
    }

    public static final void setOnClickListener(View view, View.OnClickListener onClickListener) {
        Field field;
        Field field2;
        Object obj;
        Intrinsics.checkNotNullParameter(view, "view");
        try {
            try {
                field = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                try {
                    field2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                } catch (ClassNotFoundException | NoSuchFieldException e) {
                    field2 = null;
                    if (field != null) {
                    }
                    view.setOnClickListener(onClickListener);
                    return;
                }
            } catch (Exception e2) {
                return;
            }
        } catch (ClassNotFoundException | NoSuchFieldException e3) {
            field = null;
        }
        if (field != null || field2 == null) {
            view.setOnClickListener(onClickListener);
            return;
        }
        field.setAccessible(true);
        field2.setAccessible(true);
        try {
            field.setAccessible(true);
            obj = field.get(view);
        } catch (IllegalAccessException e4) {
            obj = null;
        }
        if (obj == null) {
            view.setOnClickListener(onClickListener);
        } else {
            field2.set(obj, onClickListener);
        }
    }

    public static final void updateBasicInfoOfView(View view, JSONObject json) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            String textOfView = getTextOfView(view);
            String hintOfView = getHintOfView(view);
            Object tag = view.getTag();
            CharSequence contentDescription = view.getContentDescription();
            json.put("classname", view.getClass().getCanonicalName());
            json.put("classtypebitmask", getClassTypeBitmask(view));
            json.put("id", view.getId());
            if (SensitiveUserDataUtils.isSensitiveUserData(view)) {
                json.put(t2.h.K0, "");
                json.put("is_user_input", true);
            } else {
                json.put(t2.h.K0, Utility.coerceValueIfNullOrEmpty(Utility.sha256hash(textOfView), ""));
            }
            json.put("hint", Utility.coerceValueIfNullOrEmpty(Utility.sha256hash(hintOfView), ""));
            if (tag != null) {
                json.put("tag", Utility.coerceValueIfNullOrEmpty(Utility.sha256hash(tag.toString()), ""));
            }
            if (contentDescription != null) {
                json.put(OTUXParamsKeys.OT_UX_DESCRIPTION, Utility.coerceValueIfNullOrEmpty(Utility.sha256hash(contentDescription.toString()), ""));
            }
            json.put("dimension", INSTANCE.getDimensionOfView(view));
        } catch (JSONException e) {
            Utility.logd(TAG, e);
        }
    }

    public final boolean isRCTButton(View view, View view2) {
        Intrinsics.checkNotNullParameter(view, "view");
        boolean z = false;
        if (Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup")) {
            View touchReactView = getTouchReactView(getViewLocationOnScreen(view), view2);
            z = false;
            if (touchReactView != null) {
                z = false;
                if (touchReactView.getId() == view.getId()) {
                    z = true;
                }
            }
        }
        return z;
    }
}

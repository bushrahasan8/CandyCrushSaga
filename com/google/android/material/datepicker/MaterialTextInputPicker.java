package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: MaterialTextInputPicker.class */
public final class MaterialTextInputPicker<S> extends PickerFragment {
    private CalendarConstraints calendarConstraints;
    private int themeResId;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MaterialTextInputPicker newInstance(DateSelector dateSelector, int i, CalendarConstraints calendarConstraints) {
        MaterialTextInputPicker materialTextInputPicker = new MaterialTextInputPicker();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        materialTextInputPicker.setArguments(bundle);
        return materialTextInputPicker;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = getArguments();
        }
        this.themeResId = bundle2.getInt("THEME_RES_ID_KEY");
        this.calendarConstraints = (CalendarConstraints) bundle2.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.themeResId));
        new OnSelectionChangedListener(this) { // from class: com.google.android.material.datepicker.MaterialTextInputPicker.1
            final MaterialTextInputPicker this$0;

            {
                this.this$0 = this;
            }
        };
        throw null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.themeResId);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.calendarConstraints);
    }
}

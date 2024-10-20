package com.onetrust.otpublishers.headless.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onetrust.otpublishers.headless.R$id;
import com.onetrust.otpublishers.headless.R$layout;

/* loaded from: d.class */
public final class d implements ViewBinding {
    public final RelativeLayout a;
    public final ImageView b;
    public final SwitchCompat c;
    public final TextView d;
    public final View e;
    public final TextView f;
    public final RelativeLayout g;

    public d(RelativeLayout relativeLayout, ImageView imageView, SwitchCompat switchCompat, TextView textView, View view, TextView textView2, RelativeLayout relativeLayout2) {
        this.a = relativeLayout;
        this.b = imageView;
        this.c = switchCompat;
        this.d = textView;
        this.e = view;
        this.f = textView2;
        this.g = relativeLayout2;
    }

    public static d a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R$layout.ot_google_vendor_list_item, viewGroup, false);
        int i = R$id.gv_show_more;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(inflate, i);
        if (imageView != null) {
            i = R$id.switchButton;
            SwitchCompat findChildViewById = ViewBindings.findChildViewById(inflate, i);
            if (findChildViewById != null) {
                i = R$id.vendor_name;
                TextView textView = (TextView) ViewBindings.findChildViewById(inflate, i);
                if (textView != null) {
                    i = R$id.view3;
                    View findChildViewById2 = ViewBindings.findChildViewById(inflate, i);
                    if (findChildViewById2 != null) {
                        i = R$id.view_powered_by_logo;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, i);
                        if (textView2 != null) {
                            i = R$id.vl_items;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(inflate, i);
                            if (relativeLayout != null) {
                                return new d((RelativeLayout) inflate, imageView, findChildViewById, textView, findChildViewById2, textView2, relativeLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public final RelativeLayout a() {
        return this.a;
    }
}

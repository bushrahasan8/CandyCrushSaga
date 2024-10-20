package com.onetrust.otpublishers.headless.UI.TVUI.adapter;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.onetrust.otpublishers.headless.R$id;
import com.onetrust.otpublishers.headless.R$layout;
import org.json.JSONArray;

/* loaded from: h.class */
public final class h extends RecyclerView.Adapter {
    public final JSONArray a;
    public final String b;

    /* loaded from: h$a.class */
    public static final class a extends RecyclerView.ViewHolder {
        public final TextView a;

        public a(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R$id.tv_vd_purpose_item);
        }
    }

    public h(String str, JSONArray jSONArray) {
        this.a = jSONArray;
        this.b = str;
    }

    public final int getItemCount() {
        return this.a.length();
    }

    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        a aVar = (a) viewHolder;
        aVar.setIsRecyclable(false);
        try {
            aVar.a.setText(this.a.getJSONObject(aVar.getAdapterPosition()).getString("name"));
            aVar.a.setTextColor(Color.parseColor(this.b));
            TextView textView = aVar.a;
            String str = this.b;
            for (Drawable drawable : textView.getCompoundDrawables()) {
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(Color.parseColor(str), PorterDuff.Mode.SRC_IN));
                }
            }
        } catch (Exception e) {
            com.onetrust.otpublishers.headless.Internal.Helper.e.a(e, new StringBuilder("error while rendering purpose items in Vendor detail screen "), "OneTrust", 6);
        }
    }

    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.ot_tv_vendor_details_purpose_item, viewGroup, false));
    }
}

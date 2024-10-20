package com.google.android.gms.drive.widget;

import android.content.Context;
import android.database.CursorIndexOutOfBoundsException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: DataBufferAdapter.class */
public class DataBufferAdapter<T> extends BaseAdapter {
    private static final GmsLogger zzbz = new GmsLogger("DataBufferAdapter", "");
    private final int fieldId;
    private final int resource;
    private final Context zzgw;
    private int zzmz;
    private final List<DataBuffer<T>> zzna;
    private final LayoutInflater zznb;
    private boolean zznc;

    public DataBufferAdapter(Context context, int i) {
        this(context, i, 0, new ArrayList());
    }

    public DataBufferAdapter(Context context, int i, int i2) {
        this(context, i, i2, new ArrayList());
    }

    public DataBufferAdapter(Context context, int i, int i2, List<DataBuffer<T>> list) {
        this.zznc = true;
        this.zzgw = context;
        this.zzmz = i;
        this.resource = i;
        this.fieldId = i2;
        this.zzna = list;
        this.zznb = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public DataBufferAdapter(Context context, int i, int i2, DataBuffer<T>... dataBufferArr) {
        this(context, i, i2, Arrays.asList(dataBufferArr));
    }

    public DataBufferAdapter(Context context, int i, List<DataBuffer<T>> list) {
        this(context, i, 0, list);
    }

    public DataBufferAdapter(Context context, int i, DataBuffer<T>... dataBufferArr) {
        this(context, i, 0, Arrays.asList(dataBufferArr));
    }

    private final View zza(int i, View view, ViewGroup viewGroup, int i2) {
        View view2 = view;
        if (view == null) {
            view2 = this.zznb.inflate(i2, viewGroup, false);
        }
        try {
            int i3 = this.fieldId;
            TextView textView = i3 == 0 ? (TextView) view2 : (TextView) view2.findViewById(i3);
            T item = getItem(i);
            if (item instanceof CharSequence) {
                textView.setText((CharSequence) item);
            } else {
                textView.setText(item.toString());
            }
            return view2;
        } catch (ClassCastException e) {
            zzbz.e("DataBufferAdapter", "You must supply a resource ID for a TextView", e);
            throw new IllegalStateException("DataBufferAdapter requires the resource ID to be a TextView", e);
        }
    }

    public void append(DataBuffer<T> dataBuffer) {
        this.zzna.add(dataBuffer);
        if (this.zznc) {
            notifyDataSetChanged();
        }
    }

    public void clear() {
        Iterator<DataBuffer<T>> it = this.zzna.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.zzna.clear();
        if (this.zznc) {
            notifyDataSetChanged();
        }
    }

    public Context getContext() {
        return this.zzgw;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Iterator<DataBuffer<T>> it = this.zzna.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            i = i2 + it.next().getCount();
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return zza(i, view, viewGroup, this.zzmz);
    }

    @Override // android.widget.Adapter
    public T getItem(int i) throws CursorIndexOutOfBoundsException {
        Iterator<DataBuffer<T>> it = this.zzna.iterator();
        int i2 = i;
        while (true) {
            int i3 = i2;
            if (!it.hasNext()) {
                throw new CursorIndexOutOfBoundsException(i, getCount());
            }
            DataBuffer<T> next = it.next();
            int count = next.getCount();
            if (count > i3) {
                try {
                    return next.get(i3);
                } catch (CursorIndexOutOfBoundsException e) {
                    throw new CursorIndexOutOfBoundsException(i, getCount());
                }
            }
            i2 = i3 - count;
        }
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return zza(i, view, viewGroup, this.resource);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.zznc = true;
    }

    public void setDropDownViewResource(int i) {
        this.zzmz = i;
    }

    public void setNotifyOnChange(boolean z) {
        this.zznc = z;
    }
}

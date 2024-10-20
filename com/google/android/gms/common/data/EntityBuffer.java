package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;

@KeepForSdk
/* loaded from: EntityBuffer.class */
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {
    private boolean zaa;
    private ArrayList zab;

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public EntityBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.zaa = false;
    }

    private final void zab() {
        synchronized (this) {
            if (!this.zaa) {
                int count = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                ArrayList arrayList = new ArrayList();
                this.zab = arrayList;
                if (count > 0) {
                    arrayList.add(0);
                    String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                    String string = this.mDataHolder.getString(primaryDataMarkerColumn, 0, this.mDataHolder.getWindowIndex(0));
                    int i = 1;
                    while (i < count) {
                        int windowIndex = this.mDataHolder.getWindowIndex(i);
                        String string2 = this.mDataHolder.getString(primaryDataMarkerColumn, i, windowIndex);
                        if (string2 == null) {
                            throw new NullPointerException("Missing value for markerColumn: " + primaryDataMarkerColumn + ", at row: " + i + ", for window: " + windowIndex);
                        }
                        String str = string;
                        if (!string2.equals(string)) {
                            this.zab.add(Integer.valueOf(i));
                            str = string2;
                        }
                        i++;
                        string = str;
                    }
                }
                this.zaa = true;
            }
        }
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public final T get(int i) {
        int intValue;
        int intValue2;
        zab();
        int zaa = zaa(i);
        int i2 = 0;
        if (i >= 0) {
            if (i == this.zab.size()) {
                i2 = 0;
            } else {
                if (i == this.zab.size() - 1) {
                    intValue = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                    intValue2 = ((Integer) this.zab.get(i)).intValue();
                } else {
                    intValue = ((Integer) this.zab.get(i + 1)).intValue();
                    intValue2 = ((Integer) this.zab.get(i)).intValue();
                }
                i2 = intValue - intValue2;
                if (i2 == 1) {
                    int zaa2 = zaa(i);
                    int windowIndex = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getWindowIndex(zaa2);
                    String childDataMarkerColumn = getChildDataMarkerColumn();
                    i2 = (childDataMarkerColumn == null || this.mDataHolder.getString(childDataMarkerColumn, zaa2, windowIndex) != null) ? 1 : 0;
                }
            }
        }
        return getEntry(zaa, i2);
    }

    @KeepForSdk
    protected String getChildDataMarkerColumn() {
        return null;
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    public int getCount() {
        zab();
        return this.zab.size();
    }

    @KeepForSdk
    protected abstract T getEntry(int i, int i2);

    @KeepForSdk
    protected abstract String getPrimaryDataMarkerColumn();

    final int zaa(int i) {
        if (i >= 0 && i < this.zab.size()) {
            return ((Integer) this.zab.get(i)).intValue();
        }
        throw new IllegalArgumentException("Position " + i + " is out of bounds for this buffer");
    }
}

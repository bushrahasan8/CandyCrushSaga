package com.onetrust.otpublishers.headless.gpp;

import com.ironsource.t2;
import java.util.ArrayList;

/* loaded from: b.class */
public abstract class b {
    public static String a(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 1) {
            arrayList.add(1);
            int i2 = 2;
            if (i >= 2) {
                arrayList.add(2);
                while (true) {
                    int i3 = i2 - 1;
                    int intValue = ((Integer) arrayList.get(i3)).intValue();
                    int i4 = i2 - 2;
                    if (i < ((Integer) arrayList.get(i4)).intValue() + intValue) {
                        break;
                    }
                    arrayList.add(Integer.valueOf(((Integer) arrayList.get(i4)).intValue() + ((Integer) arrayList.get(i3)).intValue()));
                    i2++;
                }
            }
        }
        StringBuilder sb = new StringBuilder("1");
        int i5 = i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            int intValue2 = ((Integer) arrayList.get(size)).intValue();
            if (i5 >= intValue2) {
                sb.insert(0, "1");
                i5 -= intValue2;
            } else {
                sb.insert(0, t2.h);
            }
        }
        return sb.toString();
    }
}

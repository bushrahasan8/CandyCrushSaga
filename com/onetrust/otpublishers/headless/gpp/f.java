package com.onetrust.otpublishers.headless.gpp;

import com.ironsource.t2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: f.class */
public final class f {
    public HashMap a;
    public String[] b;
    public final List c;

    public f(ArrayList arrayList) {
        this.c = arrayList;
        a();
    }

    public static String a(HashMap hashMap, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            if (hashMap.containsKey(str)) {
                sb.append((String) hashMap.get(str));
            } else {
                com.onetrust.otpublishers.headless.Internal.Helper.b.a("encodeToBitString: field not found ", str, "GPPHeader", 6);
            }
        }
        return sb.toString();
    }

    public final void a() {
        int intValue;
        String str;
        int i;
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.put("Id", g.a(3, 6));
        this.a.put("Version", g.a(1, 6));
        HashMap hashMap2 = this.a;
        List list = this.c;
        Collections.sort(list);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= list.size()) {
                break;
            }
            int i4 = i3;
            while (true) {
                i = i4;
                if (i < list.size() - 1) {
                    int intValue2 = ((Integer) list.get(i)).intValue();
                    int i5 = i + 1;
                    if (intValue2 + 1 == ((Integer) list.get(i5)).intValue()) {
                        i4 = i5;
                    }
                }
            }
            int i6 = i + 1;
            arrayList.add(list.subList(i3, i6));
            i2 = i6;
        }
        String a = g.a(arrayList.size(), 12);
        int i7 = 0;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            if (((List) arrayList.get(i8)).size() == 1) {
                int intValue3 = ((Integer) ((List) arrayList.get(i8)).get(0)).intValue();
                intValue = ((Integer) ((List) arrayList.get(i8)).get(0)).intValue();
                str = a + t2.h + b.a(intValue3 - i7);
            } else {
                int intValue4 = ((Integer) ((List) arrayList.get(i8)).get(0)).intValue();
                int intValue5 = ((Integer) ((List) arrayList.get(i8)).get(0)).intValue();
                int intValue6 = ((Integer) ((List) arrayList.get(i8)).get(((List) arrayList.get(i8)).size() - 1)).intValue();
                intValue = ((Integer) ((List) arrayList.get(i8)).get(((List) arrayList.get(i8)).size() - 1)).intValue();
                str = a + "1" + b.a(intValue4 - i7) + b.a(intValue6 - intValue5);
            }
            a = str;
            i7 = intValue;
        }
        hashMap2.put("SectionIds", a);
        this.b = new String[]{"Id", "Version", "SectionIds"};
    }
}

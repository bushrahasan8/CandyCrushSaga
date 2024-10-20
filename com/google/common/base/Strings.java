package com.google.common.base;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: Strings.class */
public abstract class Strings {
    public static String lenientFormat(String str, Object... objArr) {
        Object[] objArr2;
        int indexOf;
        String valueOf = String.valueOf(str);
        if (objArr != null) {
            int i = 0;
            while (true) {
                objArr2 = objArr;
                if (i >= objArr.length) {
                    break;
                }
                objArr[i] = lenientToString(objArr[i]);
                i++;
            }
        } else {
            objArr2 = new Object[]{"(Object[])null"};
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr2.length * 16));
        int i2 = 0;
        int i3 = 0;
        while (i3 < objArr2.length && (indexOf = valueOf.indexOf("%s", i2)) != -1) {
            sb.append((CharSequence) valueOf, i2, indexOf);
            sb.append(objArr2[i3]);
            i2 = indexOf + 2;
            i3++;
        }
        sb.append((CharSequence) valueOf, i2, valueOf.length());
        if (i3 < objArr2.length) {
            sb.append(" [");
            sb.append(objArr2[i3]);
            for (int i4 = i3 + 1; i4 < objArr2.length; i4++) {
                sb.append(", ");
                sb.append(objArr2[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static String lenientToString(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str, (Throwable) e);
            return "<" + str + " threw " + e.getClass().getName() + ">";
        }
    }
}

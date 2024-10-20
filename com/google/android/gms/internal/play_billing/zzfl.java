package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: zzfl.class */
final class zzfl implements PrivilegedExceptionAction {
    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ Object run() throws Exception {
        Unsafe unsafe;
        Field[] declaredFields = Unsafe.class.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            unsafe = null;
            if (i >= length) {
                break;
            }
            Field field = declaredFields[i];
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                unsafe = (Unsafe) Unsafe.class.cast(obj);
                break;
            }
            i++;
        }
        return unsafe;
    }
}

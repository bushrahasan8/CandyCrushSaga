package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: ht.class */
public final class ht {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: ht$d.class */
    public static final class d {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private hs f2444;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private int f2445;

        private d() {
        }

        /* synthetic */ d(byte b) {
            this();
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final hs m5203() {
            return this.f2444;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final boolean m5204(Method method) {
            if (this.f2444 == null || (method.getModifiers() & this.f2444.m5167()) != this.f2444.m5167() || (method.getModifiers() & this.f2444.m5166()) != 0 || this.f2444.m5183().contains(method.getReturnType())) {
                return false;
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (this.f2444.m5179() != -1 && this.f2444.m5179() != parameterTypes.length) {
                return false;
            }
            List<Class> m5180 = this.f2444.m5180();
            if (m5180 != null) {
                if (m5180.size() != parameterTypes.length) {
                    return false;
                }
                for (int i = 0; i < m5180.size(); i++) {
                    if (!m5180.get(i).equals(parameterTypes[i])) {
                        return false;
                    }
                }
            }
            if (!(this.f2444.m5181() != null ? this.f2444.m5184() ? method.getReturnType().equals(this.f2444.m5181()) : this.f2444.m5181().isAssignableFrom(method.getReturnType()) : true)) {
                return false;
            }
            int i2 = this.f2445;
            if (i2 == 0) {
                return true;
            }
            this.f2445 = i2 - 1;
            return false;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public final void m5205(hs hsVar) {
            this.f2444 = hsVar;
            this.f2445 = hsVar.m5182();
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static List<Method> m5199(Class cls, hs hsVar) {
        ArrayList arrayList = new ArrayList();
        d dVar = new d((byte) 0);
        dVar.m5205(hsVar);
        m5200(cls, dVar, arrayList);
        return arrayList;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m5200(Class cls, d dVar, List list) {
        hs m5203 = dVar.m5203();
        for (Method method : (m5203 == null || !m5203.m5169()) ? Arrays.asList(cls.getDeclaredMethods()) : m5202(cls, m5203.m5169(), m5203.m5168())) {
            if (dVar.m5204(method)) {
                list.add(method);
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Method m5201(Class cls, hs hsVar) {
        ArrayList arrayList = new ArrayList();
        d dVar = new d((byte) 0);
        dVar.m5205(hsVar);
        m5200(cls, dVar, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Method) arrayList.get(0);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static List m5202(Class cls, boolean z, int i) {
        int i2 = 0;
        Method[] methodArr = new Method[0];
        if (cls != null) {
            Method[] m5700 = kg.m5700(cls.getDeclaredMethods(), cls.getMethods());
            if (!z) {
                return Arrays.asList(m5700);
            }
            Class superclass = cls.getSuperclass();
            Method[] methodArr2 = m5700;
            while (true) {
                methodArr = methodArr2;
                if (superclass == null) {
                    break;
                }
                methodArr = methodArr2;
                if (i2 == i) {
                    break;
                }
                methodArr2 = kg.m5700(kg.m5700(methodArr2, superclass.getDeclaredMethods()), superclass.getMethods());
                superclass = superclass.getSuperclass();
                i2++;
            }
        }
        return Arrays.asList(methodArr);
    }
}

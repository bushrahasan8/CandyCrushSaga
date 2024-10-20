package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.hp;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* loaded from: hn.class */
public class hn {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private c f2394;

    /* renamed from: ｋ, reason: contains not printable characters */
    private List f2395;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private hp f2396;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: hn$c.class */
    public class c {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private hp f2399;

        /* renamed from: ｋ, reason: contains not printable characters */
        private hn f2400;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private int f2401;

        private c(hn hnVar) {
            this.f2400 = hnVar;
        }

        /* synthetic */ c(hn hnVar, byte b) {
            this(hnVar);
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public final hp m5137() {
            return this.f2399;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public final void m5138(hp hpVar) {
            this.f2399 = hpVar;
            this.f2401 = hpVar.m5148();
        }

        /* renamed from: ﻛ */
        public boolean mo5136(Field field) {
            if (this.f2399 == null || (field.getModifiers() & this.f2399.m5167()) != this.f2399.m5167() || (field.getModifiers() & this.f2399.m5166()) != 0 || this.f2399.m5150().contains(field.getType())) {
                return false;
            }
            if (!(this.f2399.m5147() ? field.getType().equals(this.f2399.m5149()) : this.f2399.m5149().isAssignableFrom(field.getType()))) {
                return false;
            }
            int i = this.f2401;
            if (i == 0) {
                return true;
            }
            this.f2401 = i - 1;
            return false;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static hp.b m5127() {
        return new hp.b();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m5128(Class cls, c cVar, List list) {
        for (Field field : m5131(cls, cVar.m5137())) {
            if (cVar.mo5136(field)) {
                field.setAccessible(true);
                list.add(field);
            }
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m5129(Class cls, hp hpVar, List list) {
        synchronized (hn.class) {
            try {
                if (this.f2394 == null) {
                    this.f2394 = new c(this, (byte) 0);
                }
                this.f2394.m5138(hpVar);
                m5128(cls, this.f2394, list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Field[] m5130(Class cls, boolean z, int i, List<String> list) {
        while (cls != null && !kg.m5688(cls, list)) {
            cls = cls.getSuperclass();
        }
        int i2 = 0;
        Field[] fieldArr = new Field[0];
        if (cls != null) {
            Field[] fieldArr2 = new Field[0];
            Field[] fieldArr3 = new Field[0];
            try {
                fieldArr2 = cls.getDeclaredFields();
            } catch (Error e) {
            }
            try {
                fieldArr3 = cls.getFields();
            } catch (Error e2) {
            }
            Field[] m5694 = kg.m5694(fieldArr2, fieldArr3);
            if (!z) {
                return m5694;
            }
            Class superclass = cls.getSuperclass();
            Field[] fieldArr4 = m5694;
            while (true) {
                fieldArr = fieldArr4;
                if (superclass == null) {
                    break;
                }
                fieldArr = fieldArr4;
                if (i2 == i) {
                    break;
                }
                try {
                    fieldArr4 = kg.m5694(fieldArr4, superclass.getDeclaredFields());
                } catch (Error e3) {
                }
                try {
                    fieldArr4 = kg.m5694(fieldArr4, superclass.getFields());
                } catch (Error e4) {
                }
                superclass = superclass.getSuperclass();
                i2++;
            }
        }
        return fieldArr;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static Field[] m5131(Class cls, hp hpVar) {
        if (hpVar != null && hpVar.m5169()) {
            return m5130(cls, hpVar.m5169(), hpVar.m5168(), null);
        }
        try {
            return cls.getDeclaredFields();
        } catch (Error e) {
            return cls.getFields();
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final Field m5132(Class cls, hp hpVar) {
        synchronized (jv.class) {
            try {
                if (this.f2395 == null) {
                    this.f2395 = new ArrayList();
                }
                this.f2395.clear();
                m5129(cls, hpVar, this.f2395);
                if (this.f2395.isEmpty()) {
                    return null;
                }
                return (Field) this.f2395.get(0);
            } finally {
            }
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final List<Field> m5133(Class cls, hp hpVar) {
        ArrayList arrayList = new ArrayList();
        m5129(cls, hpVar, arrayList);
        return arrayList;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final <T> Field m5134(Class cls, Class<T> cls2) {
        Field m5132;
        synchronized (jv.class) {
            try {
                if (this.f2396 == null) {
                    this.f2396 = new hp();
                }
                this.f2396.m5151(cls2);
                m5132 = m5132(cls, this.f2396);
            } catch (Throwable th) {
                throw th;
            }
        }
        return m5132;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Field m5135(Class cls, String str) {
        c cVar = new c(this, str) { // from class: com.ironsource.adqualitysdk.sdk.i.hn.5

            /* renamed from: ﻐ, reason: contains not printable characters */
            private hn f2397;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private String f2398;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this, (byte) 0);
                this.f2397 = this;
                this.f2398 = str;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.hn.c
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final boolean mo5136(Field field) {
                return field.getType().getName().toLowerCase().startsWith(this.f2398.toLowerCase());
            }
        };
        synchronized (hn.class) {
            try {
                if (this.f2395 == null) {
                    this.f2395 = new ArrayList();
                }
                this.f2395.clear();
                m5128(cls, cVar, this.f2395);
                if (this.f2395.isEmpty()) {
                    return null;
                }
                return (Field) this.f2395.get(0);
            } finally {
            }
        }
    }
}

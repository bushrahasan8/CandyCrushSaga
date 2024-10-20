package com.applovin.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: c8.class */
public interface c8 {

    /* loaded from: c8$a.class */
    public static final class a {
        private final byte[] a;
        private final String b;
        private final int c;

        public a(byte[] bArr, String str, int i) {
            this.a = bArr;
            this.b = str;
            this.c = i;
        }

        public byte[] a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    /* loaded from: c8$b.class */
    public interface b {
        void a(c8 c8Var, byte[] bArr, int i, int i2, byte[] bArr2);
    }

    /* loaded from: c8$c.class */
    public interface c {
        c8 a(UUID uuid);
    }

    /* loaded from: c8$d.class */
    public static final class d {
        private final byte[] a;
        private final String b;

        public d(byte[] bArr, String str) {
            this.a = bArr;
            this.b = str;
        }

        public byte[] a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    a a(byte[] bArr, List list, int i, HashMap hashMap);

    void a();

    void a(b bVar);

    void a(byte[] bArr);

    void a(byte[] bArr, byte[] bArr2);

    boolean a(byte[] bArr, String str);

    d b();

    Map b(byte[] bArr);

    byte[] b(byte[] bArr, byte[] bArr2);

    int c();

    void c(byte[] bArr);

    d5 d(byte[] bArr);

    byte[] d();
}

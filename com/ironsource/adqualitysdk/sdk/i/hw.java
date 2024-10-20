package com.ironsource.adqualitysdk.sdk.i;

import java.util.List;

/* loaded from: hw.class */
public final class hw {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private hx f2451;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private hr f2452;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private e f2453;

    /* loaded from: hw$d.class */
    public static final class d {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private hw f2454 = new hw(0);

        /* renamed from: ﻏ, reason: contains not printable characters */
        public final d m5230(int i) {
            this.f2454.f2453.f2460 = i;
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final d m5231(int i) {
            this.f2454.f2453.f2455 = i;
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final d m5232(boolean z) {
            this.f2454.f2453.f2460 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final hw m5233(hx hxVar, hr hrVar, List<String> list, int i) {
            this.f2454.f2451 = hxVar;
            this.f2454.f2452 = hrVar;
            this.f2454.f2453.f2464 = list;
            this.f2454.f2453.f2466 = i;
            this.f2454.f2453.f2463 = hxVar.getClass();
            this.f2454.f2453.f2465 = hrVar != null ? hrVar.getClass() : null;
            return this.f2454;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final hw m5234(hx hxVar, List<String> list, int i) {
            return m5233(hxVar, null, list, i);
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public final d m5235(int i) {
            this.f2454.f2453.f2461 = i;
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public final d m5236(boolean z) {
            this.f2454.f2453.f2455 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public final d m5237(int i) {
            this.f2454.f2453.f2458 = i;
            return this;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public final d m5238(boolean z) {
            this.f2454.f2453.f2457 = z;
            return this;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final d m5239(int i) {
            this.f2454.f2453.f2462 = i;
            return this;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final d m5240(boolean z) {
            this.f2454.f2453.f2461 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public final d m5241(int i) {
            this.f2454.f2453.f2459 = i;
            return this;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public final d m5242(Object obj) {
            this.f2454.f2453.f2456 = obj;
            return this;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public final d m5243(boolean z) {
            this.f2454.f2453.f2459 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: hw$e.class */
    public static final class e {

        /* renamed from: ﭸ, reason: contains not printable characters */
        private Object f2456;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private Class f2463;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private List f2464;

        /* renamed from: ｋ, reason: contains not printable characters */
        private Class f2465;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private int f2466;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private Class f2467;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private int f2462 = -1;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private int f2461 = -1;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private int f2458 = -1;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private int f2459 = -1;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private int f2460 = Integer.MAX_VALUE;

        /* renamed from: ﭴ, reason: contains not printable characters */
        private int f2455 = Integer.MAX_VALUE;

        /* renamed from: ﮌ, reason: contains not printable characters */
        private boolean f2457 = true;

        e() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f2466 != eVar.f2466 || this.f2462 != eVar.f2462 || this.f2461 != eVar.f2461 || this.f2458 != eVar.f2458 || this.f2459 != eVar.f2459 || this.f2460 != eVar.f2460 || this.f2455 != eVar.f2455 || this.f2457 != eVar.f2457) {
                return false;
            }
            Class cls = this.f2467;
            if (cls != null) {
                if (!cls.equals(eVar.f2467)) {
                    return false;
                }
            } else if (eVar.f2467 != null) {
                return false;
            }
            Class cls2 = this.f2463;
            if (cls2 != null) {
                if (!cls2.equals(eVar.f2463)) {
                    return false;
                }
            } else if (eVar.f2463 != null) {
                return false;
            }
            Class cls3 = this.f2465;
            if (cls3 != null) {
                if (!cls3.equals(eVar.f2465)) {
                    return false;
                }
            } else if (eVar.f2465 != null) {
                return false;
            }
            List list = this.f2464;
            if (list != null) {
                if (!list.equals(eVar.f2464)) {
                    return false;
                }
            } else if (eVar.f2464 != null) {
                return false;
            }
            Object obj2 = this.f2456;
            Object obj3 = eVar.f2456;
            return obj2 != null ? obj2.equals(obj3) : obj3 == null;
        }

        public final int hashCode() {
            Class cls = this.f2467;
            int i = 0;
            int hashCode = cls != null ? cls.hashCode() : 0;
            Class cls2 = this.f2463;
            int hashCode2 = cls2 != null ? cls2.hashCode() : 0;
            Class cls3 = this.f2465;
            int hashCode3 = cls3 != null ? cls3.hashCode() : 0;
            List list = this.f2464;
            int hashCode4 = list != null ? list.hashCode() : 0;
            int i2 = this.f2466;
            int i3 = this.f2462;
            int i4 = this.f2461;
            int i5 = this.f2458;
            int i6 = this.f2459;
            int i7 = this.f2460;
            int i8 = this.f2455;
            boolean z = this.f2457;
            Object obj = this.f2456;
            if (obj != null) {
                i = obj.hashCode();
            }
            return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + i8) * 31) + (z ? 1 : 0)) * 31) + i;
        }
    }

    private hw() {
        this.f2453 = new e();
    }

    /* synthetic */ hw(byte b) {
        this();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m5216(int i, int i2) {
        return i >= i2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final e m5219(Class cls) {
        this.f2453.f2467 = cls;
        return this.f2453;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m5220() {
        return this.f2453.f2457;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m5221(int i) {
        return m5216(i, this.f2453.f2459);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final hx m5222() {
        return this.f2451;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m5223(int i) {
        return m5216(i, this.f2453.f2462);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final List<String> m5224() {
        return this.f2453.f2464;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final boolean m5225(int i) {
        return m5216(i, this.f2453.f2455);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final hr m5226() {
        return this.f2452;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m5227(int i) {
        return m5216(i, this.f2453.f2460);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int m5228() {
        return this.f2453.f2466;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int m5229(int i) {
        if (m5216(i, this.f2453.f2461)) {
            return this.f2453.f2458;
        }
        return 0;
    }
}

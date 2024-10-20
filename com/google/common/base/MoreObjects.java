package com.google.common.base;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/* loaded from: MoreObjects.class */
public abstract class MoreObjects {

    /* loaded from: MoreObjects$ToStringHelper.class */
    public static final class ToStringHelper {
        private final String className;
        private final ValueHolder holderHead;
        private ValueHolder holderTail;
        private boolean omitEmptyValues;
        private boolean omitNullValues;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: MoreObjects$ToStringHelper$ValueHolder.class */
        public static class ValueHolder {
            String name;
            ValueHolder next;
            Object value;

            private ValueHolder() {
            }
        }

        private ToStringHelper(String str) {
            ValueHolder valueHolder = new ValueHolder();
            this.holderHead = valueHolder;
            this.holderTail = valueHolder;
            this.omitNullValues = false;
            this.omitEmptyValues = false;
            this.className = (String) Preconditions.checkNotNull(str);
        }

        private ValueHolder addHolder() {
            ValueHolder valueHolder = new ValueHolder();
            this.holderTail.next = valueHolder;
            this.holderTail = valueHolder;
            return valueHolder;
        }

        private ToStringHelper addHolder(Object obj) {
            addHolder().value = obj;
            return this;
        }

        private static boolean isEmpty(Object obj) {
            boolean z = false;
            if (obj instanceof CharSequence) {
                if (((CharSequence) obj).length() == 0) {
                    z = true;
                }
                return z;
            }
            if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            }
            if (obj instanceof Map) {
                return ((Map) obj).isEmpty();
            }
            if (obj instanceof Optional) {
                return !((Optional) obj).isPresent();
            }
            boolean z2 = false;
            if (obj.getClass().isArray()) {
                z2 = false;
                if (Array.getLength(obj) == 0) {
                    z2 = true;
                }
            }
            return z2;
        }

        public ToStringHelper addValue(Object obj) {
            return addHolder(obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0070  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                r0 = r6
                boolean r0 = r0.omitNullValues
                r8 = r0
                r0 = r6
                boolean r0 = r0.omitEmptyValues
                r7 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r2 = 32
                r1.<init>(r2)
                r12 = r0
                r0 = r12
                r1 = r6
                java.lang.String r1 = r1.className
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r12
                r1 = 123(0x7b, float:1.72E-43)
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r6
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r0 = r0.holderHead
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r0 = r0.next
                r9 = r0
                java.lang.String r0 = ""
                r11 = r0
            L33:
                r0 = r9
                if (r0 == 0) goto Lc9
                r0 = r9
                java.lang.Object r0 = r0.value
                r13 = r0
                r0 = r13
                if (r0 != 0) goto L4d
                r0 = r11
                r10 = r0
                r0 = r8
                if (r0 != 0) goto Lbd
                goto L5d
            L4d:
                r0 = r7
                if (r0 == 0) goto L5d
                r0 = r11
                r10 = r0
                r0 = r13
                boolean r0 = isEmpty(r0)
                if (r0 != 0) goto Lbd
            L5d:
                r0 = r12
                r1 = r11
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r9
                java.lang.String r0 = r0.name
                r10 = r0
                r0 = r10
                if (r0 == 0) goto L80
                r0 = r12
                r1 = r10
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r12
                r1 = 61
                java.lang.StringBuilder r0 = r0.append(r1)
            L80:
                r0 = r13
                if (r0 == 0) goto Lb1
                r0 = r13
                java.lang.Class r0 = r0.getClass()
                boolean r0 = r0.isArray()
                if (r0 == 0) goto Lb1
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = r0
                r2 = 0
                r3 = r13
                r1[r2] = r3
                java.lang.String r0 = java.util.Arrays.deepToString(r0)
                r10 = r0
                r0 = r12
                r1 = r10
                r2 = 1
                r3 = r10
                int r3 = r3.length()
                r4 = 1
                int r3 = r3 - r4
                java.lang.StringBuilder r0 = r0.append(r1, r2, r3)
                goto Lb9
            Lb1:
                r0 = r12
                r1 = r13
                java.lang.StringBuilder r0 = r0.append(r1)
            Lb9:
                java.lang.String r0 = ", "
                r10 = r0
            Lbd:
                r0 = r9
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r0 = r0.next
                r9 = r0
                r0 = r10
                r11 = r0
                goto L33
            Lc9:
                r0 = r12
                r1 = 125(0x7d, float:1.75E-43)
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r12
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.MoreObjects.ToStringHelper.toString():java.lang.String");
        }
    }

    public static Object firstNonNull(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName());
    }
}

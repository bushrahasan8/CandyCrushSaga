package com.unity3d.services.core.network.mapper;

/* loaded from: HttpResponseHeaderToJSONArrayKt.class */
public final class HttpResponseHeaderToJSONArrayKt {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
    
        if (r8 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final org.json.JSONArray toResponseHeadersMap(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r8) {
        /*
            r0 = r8
            if (r0 == 0) goto L73
            r0 = r8
            java.util.Set r0 = r0.entrySet()
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L73
            r0 = r8
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r9 = r0
            org.json.JSONArray r0 = new org.json.JSONArray
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
        L23:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L6d
            r0 = r9
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r10 = r0
            r0 = r8
            org.json.JSONArray r1 = new org.json.JSONArray
            r2 = r1
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r10
            java.lang.Object r6 = r6.getKey()
            java.lang.String r6 = (java.lang.String) r6
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r10
            java.lang.Object r6 = r6.getValue()
            java.util.List r6 = (java.util.List) r6
            r4[r5] = r6
            java.util.List r3 = kotlin.collections.CollectionsKt.listOf(r3)
            java.util.Collection r3 = (java.util.Collection) r3
            r2.<init>(r3)
            org.json.JSONArray r0 = r0.put(r1)
            r8 = r0
            r0 = r8
            java.lang.String r1 = "acc.put(JSONArray(listOf(key, value)))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            goto L23
        L6d:
            r0 = r8
            r9 = r0
            r0 = r8
            if (r0 != 0) goto L7b
        L73:
            org.json.JSONArray r0 = new org.json.JSONArray
            r1 = r0
            r1.<init>()
            r9 = r0
        L7b:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.mapper.HttpResponseHeaderToJSONArrayKt.toResponseHeadersMap(java.util.Map):org.json.JSONArray");
    }
}

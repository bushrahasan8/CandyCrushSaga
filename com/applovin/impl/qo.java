package com.applovin.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: qo.class */
public abstract class qo {
    public static final List a;

    static {
        ArrayList arrayList = new ArrayList();
        a = arrayList;
        arrayList.add("send_http_request");
        arrayList.add("send_http_request_v2");
        arrayList.add("set_ad_request_query_params");
        arrayList.add("set_ad_request_post_body");
        arrayList.add("set_mediate_request_post_body_data");
    }
}

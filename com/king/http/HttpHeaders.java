package com.king.http;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;

@Keep
/* loaded from: HttpHeaders.class */
public class HttpHeaders {
    private List<Header> mHeaders = new ArrayList();

    @Keep
    /* loaded from: HttpHeaders$Header.class */
    public static class Header {
        public String key;
        public String value;

        public Header(String str) {
            this.key = str;
        }

        public Header(String str, String str2) {
            this.key = str;
            this.value = str2;
        }

        public void add(String str) {
            String str2 = str;
            if (this.value != null) {
                str2 = this.value + ", " + str;
            }
            this.value = str2;
        }

        public void set(String str) {
            this.value = str;
        }
    }

    private Header find(String str) {
        for (Header header : this.mHeaders) {
            if (str.equalsIgnoreCase(header.key)) {
                return header;
            }
        }
        return null;
    }

    public void add(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return;
        }
        Header find = find(str);
        if (find == null) {
            this.mHeaders.add(new Header(str, str2));
        } else {
            find.add(str2);
        }
    }

    public Header[] array() {
        List<Header> list = this.mHeaders;
        return (Header[]) list.toArray(new Header[list.size()]);
    }

    public void set(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return;
        }
        Header find = find(str);
        if (find == null) {
            this.mHeaders.add(new Header(str, str2));
        } else {
            find.set(str2);
        }
    }
}

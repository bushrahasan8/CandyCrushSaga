package okhttp3;

import com.onetrust.otpublishers.headless.Public.OTUIDisplayReason.OTUIDisplayReasonCode;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okio.Buffer;

/* loaded from: HttpUrl.class */
public final class HttpUrl {
    public static final Companion Companion = new Companion(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List pathSegments;
    private final int port;
    private final List queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;

    /* loaded from: HttpUrl$Builder.class */
    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        private String encodedFragment;
        private final List encodedPathSegments;
        private List encodedQueryNamesAndValues;
        private String host;
        private String scheme;
        private String encodedUsername = "";
        private String encodedPassword = "";
        private int port = -1;

        /* loaded from: HttpUrl$Builder$Companion.class */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String str, int i, int i2) {
                int i3;
                try {
                    int parseInt = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i2, "", false, false, false, false, null, 248, null));
                    i3 = -1;
                    if (1 <= parseInt) {
                        i3 = -1;
                        if (parseInt < 65536) {
                            i3 = parseInt;
                        }
                    }
                } catch (NumberFormatException e) {
                    i3 = -1;
                }
                return i3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String str, int i, int i2) {
                int i3;
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt == '[') {
                        int i4 = i;
                        while (true) {
                            int i5 = i4 + 1;
                            i3 = i5;
                            if (i5 < i2) {
                                i4 = i5;
                                if (str.charAt(i5) == ']') {
                                    i3 = i5;
                                    break;
                                }
                            }
                        }
                    } else {
                        i3 = i;
                        if (charAt == ':') {
                            return i;
                        }
                    }
                    i = i3 + 1;
                }
                return i2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String str, int i, int i2) {
                int i3;
                if (i2 - i < 2) {
                    return -1;
                }
                char charAt = str.charAt(i);
                if (Intrinsics.compare((int) charAt, 97) < 0 || Intrinsics.compare((int) charAt, 122) > 0) {
                    i3 = -1;
                    if (Intrinsics.compare((int) charAt, 65) >= 0) {
                        if (Intrinsics.compare((int) charAt, 90) > 0) {
                            i3 = -1;
                        }
                    }
                    return i3;
                }
                while (true) {
                    i++;
                    i3 = -1;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if (('a' > charAt2 || charAt2 >= '{') && (('A' > charAt2 || charAt2 >= '[') && (('0' > charAt2 || charAt2 >= ':') && charAt2 != '+' && charAt2 != '-' && charAt2 != '.'))) {
                        i3 = -1;
                        if (charAt2 == ':') {
                            i3 = i;
                        }
                    }
                }
                return i3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i, int i2) {
                char charAt;
                int i3 = 0;
                while (i < i2 && ((charAt = str.charAt(i)) == '\\' || charAt == '/')) {
                    i3++;
                    i++;
                }
                return i3;
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final int effectivePort() {
            int i = this.port;
            if (i == -1) {
                Companion companion = HttpUrl.Companion;
                String str = this.scheme;
                Intrinsics.checkNotNull(str);
                i = companion.defaultPort(str);
            }
            return i;
        }

        private final boolean isDot(String str) {
            boolean z = true;
            if (!Intrinsics.areEqual(str, ".")) {
                z = StringsKt.equals(str, "%2e", true);
            }
            return z;
        }

        private final boolean isDotDot(String str) {
            boolean z = true;
            if (!Intrinsics.areEqual(str, "..")) {
                z = true;
                if (!StringsKt.equals(str, "%2e.", true)) {
                    z = true;
                    if (!StringsKt.equals(str, ".%2e", true)) {
                        z = StringsKt.equals(str, "%2e%2e", true);
                    }
                }
            }
            return z;
        }

        private final void pop() {
            List list = this.encodedPathSegments;
            if (((String) list.remove(list.size() - 1)).length() != 0 || !(!this.encodedPathSegments.isEmpty())) {
                this.encodedPathSegments.add("");
            } else {
                List list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, "");
            }
        }

        private final void push(String str, int i, int i2, boolean z, boolean z2) {
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, false, null, 240, null);
            if (isDot(canonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(canonicalize$okhttp$default)) {
                pop();
                return;
            }
            List list = this.encodedPathSegments;
            if (((CharSequence) list.get(list.size() - 1)).length() == 0) {
                List list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, canonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(canonicalize$okhttp$default);
            }
            if (z) {
                this.encodedPathSegments.add("");
            }
        }

        private final void resolvePath(String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char charAt = str.charAt(i);
            if (charAt == '/' || charAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                i++;
            } else {
                List list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            while (i < i2) {
                int delimiterOffset = Util.delimiterOffset(str, "/\\", i, i2);
                boolean z = delimiterOffset < i2;
                push(str, i, delimiterOffset, z, true);
                i = delimiterOffset;
                if (z) {
                    i = delimiterOffset + 1;
                }
            }
        }

        public final Builder addEncodedQueryParameter(String encodedName, String str) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                setEncodedQueryNamesAndValues$okhttp(new ArrayList());
            }
            List encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
            Intrinsics.checkNotNull(encodedQueryNamesAndValues$okhttp);
            Companion companion = HttpUrl.Companion;
            encodedQueryNamesAndValues$okhttp.add(Companion.canonicalize$okhttp$default(companion, encodedName, 0, 0, " \"'<>#&=", true, false, true, false, null, OTUIDisplayReasonCode.UIShownCode.PC_SHOWN_NEW_GROUP_ADDED, null));
            List encodedQueryNamesAndValues$okhttp2 = getEncodedQueryNamesAndValues$okhttp();
            Intrinsics.checkNotNull(encodedQueryNamesAndValues$okhttp2);
            encodedQueryNamesAndValues$okhttp2.add(str == null ? null : Companion.canonicalize$okhttp$default(companion, str, 0, 0, " \"'<>#&=", true, false, true, false, null, OTUIDisplayReasonCode.UIShownCode.PC_SHOWN_NEW_GROUP_ADDED, null));
            return this;
        }

        public final Builder addQueryParameter(String name, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                setEncodedQueryNamesAndValues$okhttp(new ArrayList());
            }
            List encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
            Intrinsics.checkNotNull(encodedQueryNamesAndValues$okhttp);
            Companion companion = HttpUrl.Companion;
            encodedQueryNamesAndValues$okhttp.add(Companion.canonicalize$okhttp$default(companion, name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
            List encodedQueryNamesAndValues$okhttp2 = getEncodedQueryNamesAndValues$okhttp();
            Intrinsics.checkNotNull(encodedQueryNamesAndValues$okhttp2);
            encodedQueryNamesAndValues$okhttp2.add(str == null ? null : Companion.canonicalize$okhttp$default(companion, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
            return this;
        }

        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = HttpUrl.Companion;
            String percentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
            String percentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int effectivePort = effectivePort();
            List list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, (String) it.next(), 0, 0, false, 7, null));
            }
            List list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                List list3 = list2;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator it2 = list3.iterator();
                while (true) {
                    arrayList = arrayList3;
                    if (!it2.hasNext()) {
                        break;
                    }
                    String str3 = (String) it2.next();
                    arrayList3.add(str3 == null ? null : Companion.percentDecode$okhttp$default(HttpUrl.Companion, str3, 0, 0, true, 3, null));
                }
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new HttpUrl(str, percentDecode$okhttp$default, percentDecode$okhttp$default2, str2, effectivePort, arrayList2, arrayList, str4 == null ? null : Companion.percentDecode$okhttp$default(HttpUrl.Companion, str4, 0, 0, false, 7, null), toString());
        }

        public final Builder encodedQuery(String str) {
            List queryNamesAndValues$okhttp;
            if (str == null) {
                queryNamesAndValues$okhttp = null;
            } else {
                Companion companion = HttpUrl.Companion;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str, 0, 0, " \"'<>#", true, false, true, false, null, OTUIDisplayReasonCode.UIShownCode.PC_SHOWN_NEW_GROUP_ADDED, null);
                queryNamesAndValues$okhttp = canonicalize$okhttp$default == null ? null : companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
            }
            setEncodedQueryNamesAndValues$okhttp(queryNamesAndValues$okhttp);
            return this;
        }

        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        public final List getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        public final String getScheme$okhttp() {
            return this.scheme;
        }

        public final Builder host(String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, host, 0, 0, false, 7, null));
            if (canonicalHost == null) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected host: ", host));
            }
            setHost$okhttp(canonicalHost);
            return this;
        }

        public final Builder parse$okhttp(HttpUrl httpUrl, String input) {
            int delimiterOffset;
            Intrinsics.checkNotNullParameter(input, "input");
            int indexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(input, 0, 0, 3, null);
            int indexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(input, indexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = Companion;
            int schemeDelimiterOffset = companion.schemeDelimiterOffset(input, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            if (schemeDelimiterOffset != -1) {
                if (StringsKt.startsWith(input, "https:", indexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = HttpRequest.DEFAULT_SCHEME;
                    indexOfFirstNonAsciiWhitespace$default += 6;
                } else {
                    if (!StringsKt.startsWith(input, "http:", indexOfFirstNonAsciiWhitespace$default, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String substring = input.substring(0, schemeDelimiterOffset);
                        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(substring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.scheme = "http";
                    indexOfFirstNonAsciiWhitespace$default += 5;
                }
            } else {
                if (httpUrl == null) {
                    String str = input;
                    if (input.length() > 6) {
                        str = Intrinsics.stringPlus(StringsKt.take(input, 6), "...");
                    }
                    throw new IllegalArgumentException(Intrinsics.stringPlus("Expected URL scheme 'http' or 'https' but no scheme was found for ", str));
                }
                this.scheme = httpUrl.scheme();
            }
            int slashCount = companion.slashCount(input, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            if (slashCount >= 2 || httpUrl == null || !Intrinsics.areEqual(httpUrl.scheme(), this.scheme)) {
                boolean z = false;
                boolean z2 = false;
                int i = indexOfFirstNonAsciiWhitespace$default + slashCount;
                while (true) {
                    delimiterOffset = Util.delimiterOffset(input, "@/\\?#", i, indexOfLastNonAsciiWhitespace$default);
                    char charAt = delimiterOffset != indexOfLastNonAsciiWhitespace$default ? input.charAt(delimiterOffset) : (char) 65535;
                    if (charAt == 65535 || charAt == '#' || charAt == '/' || charAt == '\\' || charAt == '?') {
                        break;
                    }
                    if (charAt == '@') {
                        if (z) {
                            this.encodedPassword += "%40" + Companion.canonicalize$okhttp$default(HttpUrl.Companion, input, i, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                        } else {
                            int delimiterOffset2 = Util.delimiterOffset(input, ':', i, delimiterOffset);
                            Companion companion2 = HttpUrl.Companion;
                            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, input, i, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            String str2 = canonicalize$okhttp$default;
                            if (z2) {
                                str2 = this.encodedUsername + "%40" + canonicalize$okhttp$default;
                            }
                            this.encodedUsername = str2;
                            if (delimiterOffset2 != delimiterOffset) {
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, input, delimiterOffset2 + 1, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z = true;
                            }
                            z2 = true;
                        }
                        i = delimiterOffset + 1;
                    }
                }
                Companion companion3 = Companion;
                int portColonOffset = companion3.portColonOffset(input, i, delimiterOffset);
                int i2 = portColonOffset + 1;
                if (i2 < delimiterOffset) {
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, input, i, portColonOffset, false, 4, null));
                    int parsePort = companion3.parsePort(input, i2, delimiterOffset);
                    this.port = parsePort;
                    if (parsePort == -1) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid URL port: \"");
                        String substring2 = input.substring(i2, delimiterOffset);
                        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(substring2);
                        sb2.append('\"');
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                } else {
                    Companion companion4 = HttpUrl.Companion;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, input, i, portColonOffset, false, 4, null));
                    String str3 = this.scheme;
                    Intrinsics.checkNotNull(str3);
                    this.port = companion4.defaultPort(str3);
                }
                if (this.host == null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Invalid URL host: \"");
                    String substring3 = input.substring(i, portColonOffset);
                    Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb3.append(substring3);
                    sb3.append('\"');
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
                indexOfFirstNonAsciiWhitespace$default = delimiterOffset;
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (indexOfFirstNonAsciiWhitespace$default == indexOfLastNonAsciiWhitespace$default || input.charAt(indexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
            }
            int delimiterOffset3 = Util.delimiterOffset(input, "?#", indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            resolvePath(input, indexOfFirstNonAsciiWhitespace$default, delimiterOffset3);
            int i3 = delimiterOffset3;
            if (delimiterOffset3 < indexOfLastNonAsciiWhitespace$default) {
                i3 = delimiterOffset3;
                if (input.charAt(delimiterOffset3) == '?') {
                    i3 = Util.delimiterOffset(input, '#', delimiterOffset3, indexOfLastNonAsciiWhitespace$default);
                    Companion companion5 = HttpUrl.Companion;
                    this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, input, delimiterOffset3 + 1, i3, " \"'<>#", true, false, true, false, null, 208, null));
                }
            }
            if (i3 < indexOfLastNonAsciiWhitespace$default && input.charAt(i3) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, input, i3 + 1, indexOfLastNonAsciiWhitespace$default, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final Builder password(String password) {
            Intrinsics.checkNotNullParameter(password, "password");
            setEncodedPassword$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.Companion, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        public final Builder port(int i) {
            if (1 > i || i >= 65536) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected port: ", Integer.valueOf(i)).toString());
            }
            setPort$okhttp(i);
            return this;
        }

        public final Builder reencodeForUri$okhttp() {
            String host$okhttp = getHost$okhttp();
            setHost$okhttp(host$okhttp == null ? null : new Regex("[\"<>^`{|}]").replace(host$okhttp, ""));
            int size = getEncodedPathSegments$okhttp().size();
            for (int i = 0; i < size; i++) {
                getEncodedPathSegments$okhttp().set(i, Companion.canonicalize$okhttp$default(HttpUrl.Companion, (String) getEncodedPathSegments$okhttp().get(i), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
            if (encodedQueryNamesAndValues$okhttp != null) {
                int size2 = encodedQueryNamesAndValues$okhttp.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = (String) encodedQueryNamesAndValues$okhttp.get(i2);
                    encodedQueryNamesAndValues$okhttp.set(i2, str == null ? null : Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null));
                }
            }
            String encodedFragment$okhttp = getEncodedFragment$okhttp();
            setEncodedFragment$okhttp(encodedFragment$okhttp == null ? null : Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedFragment$okhttp, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null));
            return this;
        }

        public final Builder scheme(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (StringsKt.equals(scheme, "http", true)) {
                setScheme$okhttp("http");
            } else {
                if (!StringsKt.equals(scheme, HttpRequest.DEFAULT_SCHEME, true)) {
                    throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected scheme: ", scheme));
                }
                setScheme$okhttp(HttpRequest.DEFAULT_SCHEME);
            }
            return this;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.encodedPassword = str;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final void setEncodedUsername$okhttp(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00e1, code lost:
        
            if (r0 != r0.defaultPort(r0)) goto L29;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 323
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        public final Builder username(String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            setEncodedUsername$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.Companion, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }
    }

    /* loaded from: HttpUrl$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 8) != 0) {
                z = false;
            }
            if ((i3 & 16) != 0) {
                z2 = false;
            }
            if ((i3 & 32) != 0) {
                z3 = false;
            }
            if ((i3 & 64) != 0) {
                z4 = false;
            }
            if ((i3 & 128) != 0) {
                charset = null;
            }
            return companion.canonicalize$okhttp(str, i, i2, str2, z, z2, z3, z4, charset);
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
        
            if (okhttp3.internal.Util.parseHexDigit(r5.charAt(r0)) != (-1)) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final boolean isPercentEncoded(java.lang.String r5, int r6, int r7) {
            /*
                r4 = this;
                r0 = r6
                r1 = 2
                int r0 = r0 + r1
                r8 = r0
                r0 = r8
                r1 = r7
                if (r0 >= r1) goto L36
                r0 = r5
                r1 = r6
                char r0 = r0.charAt(r1)
                r1 = 37
                if (r0 != r1) goto L36
                r0 = 1
                r9 = r0
                r0 = r5
                r1 = r6
                r2 = 1
                int r1 = r1 + r2
                char r0 = r0.charAt(r1)
                int r0 = okhttp3.internal.Util.parseHexDigit(r0)
                r1 = -1
                if (r0 == r1) goto L36
                r0 = r5
                r1 = r8
                char r0 = r0.charAt(r1)
                int r0 = okhttp3.internal.Util.parseHexDigit(r0)
                r1 = -1
                if (r0 == r1) goto L36
                goto L39
            L36:
                r0 = 0
                r9 = r0
            L39:
                r0 = r9
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.isPercentEncoded(java.lang.String, int, int):boolean");
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return companion.percentDecode$okhttp(str, i, i2, z);
        }

        private final void writeCanonicalized(Buffer buffer, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
            Buffer buffer2 = null;
            while (i < i2) {
                int codePointAt = str.codePointAt(i);
                if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                    if (codePointAt == 43 && z3) {
                        buffer.writeUtf8(z ? "+" : "%2B");
                    } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z4) || StringsKt.contains$default((CharSequence) str2, (char) codePointAt, false, 2, (Object) null) || (codePointAt == 37 && (!z || (z2 && !isPercentEncoded(str, i, i2)))))) {
                        Buffer buffer3 = buffer2;
                        if (buffer2 == null) {
                            buffer3 = new Buffer();
                        }
                        if (charset == null || Intrinsics.areEqual(charset, StandardCharsets.UTF_8)) {
                            buffer3.writeUtf8CodePoint(codePointAt);
                        } else {
                            buffer3.writeString(str, i, Character.charCount(codePointAt) + i, charset);
                        }
                        while (true) {
                            buffer2 = buffer3;
                            if (!buffer3.exhausted()) {
                                byte readByte = buffer3.readByte();
                                buffer.writeByte(37);
                                buffer.writeByte((int) HttpUrl.HEX_DIGITS[((readByte & 255) >> 4) & 15]);
                                buffer.writeByte((int) HttpUrl.HEX_DIGITS[readByte & 15]);
                            }
                        }
                    } else {
                        buffer.writeUtf8CodePoint(codePointAt);
                    }
                }
                i += Character.charCount(codePointAt);
            }
        }

        private final void writePercentDecoded(Buffer buffer, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                int codePointAt = str.codePointAt(i);
                if (codePointAt != 37 || (i3 = i + 2) >= i2) {
                    if (codePointAt == 43 && z) {
                        buffer.writeByte(32);
                        i++;
                    }
                    buffer.writeUtf8CodePoint(codePointAt);
                    i += Character.charCount(codePointAt);
                } else {
                    int parseHexDigit = Util.parseHexDigit(str.charAt(i + 1));
                    int parseHexDigit2 = Util.parseHexDigit(str.charAt(i3));
                    if (parseHexDigit != -1 && parseHexDigit2 != -1) {
                        buffer.writeByte((parseHexDigit << 4) + parseHexDigit2);
                        i = Character.charCount(codePointAt) + i3;
                    }
                    buffer.writeUtf8CodePoint(codePointAt);
                    i += Character.charCount(codePointAt);
                }
            }
        }

        public final String canonicalize$okhttp(String str, int i, int i2, String encodeSet, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
            int i3;
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
            int i4 = i;
            while (true) {
                i3 = i4;
                if (i3 >= i2) {
                    String substring = str.substring(i, i2);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return substring;
                }
                int codePointAt = str.codePointAt(i3);
                if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z4) || StringsKt.contains$default((CharSequence) encodeSet, (char) codePointAt, false, 2, (Object) null) || ((codePointAt == 37 && (!z || (z2 && !isPercentEncoded(str, i3, i2)))) || (codePointAt == 43 && z3)))) {
                    break;
                }
                i4 = i3 + Character.charCount(codePointAt);
            }
            Buffer buffer = new Buffer();
            buffer.writeUtf8(str, i, i3);
            writeCanonicalized(buffer, str, i3, i2, encodeSet, z, z2, z3, z4, charset);
            return buffer.readUtf8();
        }

        public final int defaultPort(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            return Intrinsics.areEqual(scheme, "http") ? 80 : Intrinsics.areEqual(scheme, HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
        }

        public final HttpUrl get(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return new Builder().parse$okhttp(null, str).build();
        }

        public final HttpUrl parse(String str) {
            HttpUrl httpUrl;
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                httpUrl = get(str);
            } catch (IllegalArgumentException e) {
                httpUrl = null;
            }
            return httpUrl;
        }

        public final String percentDecode$okhttp(String str, int i, int i2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            for (int i3 = i; i3 < i2; i3++) {
                char charAt = str.charAt(i3);
                if (charAt == '%' || (charAt == '+' && z)) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i, i3);
                    writePercentDecoded(buffer, str, i3, i2, z);
                    return buffer.readUtf8();
                }
            }
            String substring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final void toPathString$okhttp(List list, StringBuilder out) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                out.append('/');
                out.append((String) list.get(i));
            }
        }

        public final List toQueryNamesAndValues$okhttp(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 > str.length()) {
                    return arrayList;
                }
                int indexOf$default = StringsKt.indexOf$default((CharSequence) str, '&', i2, false, 4, (Object) null);
                int i3 = indexOf$default;
                if (indexOf$default == -1) {
                    i3 = str.length();
                }
                int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str, '=', i2, false, 4, (Object) null);
                if (indexOf$default2 == -1 || indexOf$default2 > i3) {
                    String substring = str.substring(i2, i3);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add(null);
                } else {
                    String substring2 = str.substring(i2, indexOf$default2);
                    Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(indexOf$default2 + 1, i3);
                    Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i = i3 + 1;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x003d, code lost:
        
            if (r0 > r0) goto L6;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void toQueryString$okhttp(java.util.List r5, java.lang.StringBuilder r6) {
            /*
                r4 = this;
                r0 = r5
                java.lang.String r1 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                r0 = r6
                java.lang.String r1 = "out"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                r0 = 0
                r1 = r5
                int r1 = r1.size()
                kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r0, r1)
                r1 = 2
                kotlin.ranges.IntProgression r0 = kotlin.ranges.RangesKt.step(r0, r1)
                r11 = r0
                r0 = r11
                int r0 = r0.getFirst()
                r8 = r0
                r0 = r11
                int r0 = r0.getLast()
                r9 = r0
                r0 = r11
                int r0 = r0.getStep()
                r10 = r0
                r0 = r10
                if (r0 <= 0) goto L40
                r0 = r8
                r7 = r0
                r0 = r8
                r1 = r9
                if (r0 <= r1) goto L4f
            L40:
                r0 = r10
                if (r0 >= 0) goto L9f
                r0 = r9
                r1 = r8
                if (r0 > r1) goto L9f
                r0 = r8
                r7 = r0
            L4f:
                r0 = r5
                r1 = r7
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r0 = (java.lang.String) r0
                r12 = r0
                r0 = r5
                r1 = r7
                r2 = 1
                int r1 = r1 + r2
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r0 = (java.lang.String) r0
                r11 = r0
                r0 = r7
                if (r0 <= 0) goto L74
                r0 = r6
                r1 = 38
                java.lang.StringBuilder r0 = r0.append(r1)
            L74:
                r0 = r6
                r1 = r12
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r11
                if (r0 == 0) goto L8e
                r0 = r6
                r1 = 61
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r6
                r1 = r11
                java.lang.StringBuilder r0 = r0.append(r1)
            L8e:
                r0 = r7
                r1 = r9
                if (r0 != r1) goto L97
                goto L9f
            L97:
                r0 = r7
                r1 = r10
                int r0 = r0 + r1
                r7 = r0
                goto L4f
            L9f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.toQueryString$okhttp(java.util.List, java.lang.StringBuilder):void");
        }
    }

    public HttpUrl(String scheme, String username, String password, String host, int i, List pathSegments, List list, String str, String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.scheme = scheme;
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = i;
        this.pathSegments = pathSegments;
        this.queryNamesAndValues = list;
        this.fragment = str;
        this.url = url;
        this.isHttps = Intrinsics.areEqual(scheme, HttpRequest.DEFAULT_SCHEME);
    }

    public static final HttpUrl get(String str) {
        return Companion.get(str);
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        String substring = this.url.substring(StringsKt.indexOf$default((CharSequence) this.url, '#', 0, false, 6, (Object) null) + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        int indexOf$default = StringsKt.indexOf$default((CharSequence) this.url, ':', this.scheme.length() + 3, false, 4, (Object) null);
        String substring = this.url.substring(indexOf$default + 1, StringsKt.indexOf$default((CharSequence) this.url, '@', 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String encodedPath() {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) this.url, '/', this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        String substring = this.url.substring(indexOf$default, Util.delimiterOffset(str, "?#", indexOf$default, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final List encodedPathSegments() {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) this.url, '/', this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, "?#", indexOf$default, str.length());
        ArrayList arrayList = new ArrayList();
        while (indexOf$default < delimiterOffset) {
            int i = indexOf$default + 1;
            indexOf$default = Util.delimiterOffset(this.url, '/', i, delimiterOffset);
            String substring = this.url.substring(i, indexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int indexOf$default = StringsKt.indexOf$default((CharSequence) this.url, '?', 0, false, 6, (Object) null) + 1;
        String str = this.url;
        String substring = this.url.substring(indexOf$default, Util.delimiterOffset(str, '#', indexOf$default, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        String substring = this.url.substring(length, Util.delimiterOffset(str, ":@", length, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && Intrinsics.areEqual(((HttpUrl) obj).url, this.url);
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final Builder newBuilder(String link) {
        Builder builder;
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            builder = new Builder().parse$okhttp(this, link);
        } catch (IllegalArgumentException e) {
            builder = null;
        }
        return builder;
    }

    public final List pathSegments() {
        return this.pathSegments;
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final String redact() {
        Builder newBuilder = newBuilder("/...");
        Intrinsics.checkNotNull(newBuilder);
        return newBuilder.username("").password("").build().toString();
    }

    public final HttpUrl resolve(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        Builder newBuilder = newBuilder(link);
        return newBuilder == null ? null : newBuilder.build();
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.url;
    }

    public final URI uri() {
        URI create;
        String builder = newBuilder().reencodeForUri$okhttp().toString();
        try {
            create = new URI(builder);
        } catch (URISyntaxException e) {
            try {
                create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(builder, ""));
                Intrinsics.checkNotNullExpressionValue(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
            } catch (Exception e2) {
                throw new RuntimeException(e);
            }
        }
        return create;
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}

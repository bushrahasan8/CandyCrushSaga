package com.facebook.internal;

import com.facebook.FacebookRequestError;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: FacebookRequestErrorClassification.class */
public final class FacebookRequestErrorClassification {
    public static final Companion Companion = new Companion(null);
    private static FacebookRequestErrorClassification defaultInstance;
    private final Map loginRecoverableErrors;
    private final String loginRecoverableRecoveryMessage;
    private final Map otherErrors;
    private final String otherRecoveryMessage;
    private final Map transientErrors;
    private final String transientRecoveryMessage;

    /* loaded from: FacebookRequestErrorClassification$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final FacebookRequestErrorClassification getDefaultErrorClassificationImpl() {
            return new FacebookRequestErrorClassification(null, MapsKt.hashMapOf(TuplesKt.to(2, null), TuplesKt.to(4, null), TuplesKt.to(9, null), TuplesKt.to(17, null), TuplesKt.to(341, null)), MapsKt.hashMapOf(TuplesKt.to(102, null), TuplesKt.to(190, null), TuplesKt.to(412, null)), null, null, null);
        }

        private final Map parseJSONDefinition(JSONObject jSONObject) {
            int optInt;
            HashSet hashSet;
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray.length() == 0) {
                return null;
            }
            HashMap hashMap = new HashMap();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null && (optInt = optJSONObject.optInt("code")) != 0) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                    if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                        HashSet hashSet2 = new HashSet();
                        int length2 = optJSONArray2.length();
                        int i2 = 0;
                        while (true) {
                            hashSet = hashSet2;
                            if (i2 >= length2) {
                                break;
                            }
                            int optInt2 = optJSONArray2.optInt(i2);
                            if (optInt2 != 0) {
                                hashSet2.add(Integer.valueOf(optInt2));
                            }
                            i2++;
                        }
                    } else {
                        hashSet = null;
                    }
                    hashMap.put(Integer.valueOf(optInt), hashSet);
                }
            }
            return hashMap;
        }

        public final FacebookRequestErrorClassification createFromJSON(JSONArray jSONArray) {
            Map map;
            Map map2;
            String str;
            String str2;
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            int i = 0;
            Map map3 = null;
            Map map4 = null;
            Map map5 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (i < length) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    map = map3;
                    map2 = map4;
                    str = str3;
                    str2 = str4;
                } else {
                    String optString = optJSONObject.optString("name");
                    if (optString == null) {
                        map = map3;
                        map2 = map4;
                        str = str3;
                        str2 = str4;
                    } else if (StringsKt.equals(optString, "other", true)) {
                        str = optJSONObject.optString("recovery_message", null);
                        map = parseJSONDefinition(optJSONObject);
                        map2 = map4;
                        str2 = str4;
                    } else if (StringsKt.equals(optString, "transient", true)) {
                        str2 = optJSONObject.optString("recovery_message", null);
                        map2 = parseJSONDefinition(optJSONObject);
                        map = map3;
                        str = str3;
                    } else {
                        map = map3;
                        map2 = map4;
                        str = str3;
                        str2 = str4;
                        if (StringsKt.equals(optString, "login_recoverable", true)) {
                            str5 = optJSONObject.optString("recovery_message", null);
                            map5 = parseJSONDefinition(optJSONObject);
                            str2 = str4;
                            str = str3;
                            map2 = map4;
                            map = map3;
                        }
                    }
                }
                i++;
                map3 = map;
                map4 = map2;
                str3 = str;
                str4 = str2;
            }
            return new FacebookRequestErrorClassification(map3, map4, map5, str3, str4, str5);
        }

        public final FacebookRequestErrorClassification getDefaultErrorClassification() {
            FacebookRequestErrorClassification facebookRequestErrorClassification;
            synchronized (this) {
                if (FacebookRequestErrorClassification.defaultInstance == null) {
                    FacebookRequestErrorClassification.defaultInstance = getDefaultErrorClassificationImpl();
                }
                facebookRequestErrorClassification = FacebookRequestErrorClassification.defaultInstance;
                Intrinsics.checkNotNull(facebookRequestErrorClassification, "null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            }
            return facebookRequestErrorClassification;
        }
    }

    /* loaded from: FacebookRequestErrorClassification$WhenMappings.class */
    public abstract /* synthetic */ class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FacebookRequestError.Category.values().length];
            try {
                iArr[FacebookRequestError.Category.OTHER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[FacebookRequestError.Category.LOGIN_RECOVERABLE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[FacebookRequestError.Category.TRANSIENT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FacebookRequestErrorClassification(Map map, Map map2, Map map3, String str, String str2, String str3) {
        this.otherErrors = map;
        this.transientErrors = map2;
        this.loginRecoverableErrors = map3;
        this.otherRecoveryMessage = str;
        this.transientRecoveryMessage = str2;
        this.loginRecoverableRecoveryMessage = str3;
    }

    public final FacebookRequestError.Category classify(int i, int i2, boolean z) {
        Set set;
        Set set2;
        Set set3;
        if (z) {
            return FacebookRequestError.Category.TRANSIENT;
        }
        Map map = this.otherErrors;
        if (map != null && map.containsKey(Integer.valueOf(i)) && ((set3 = (Set) this.otherErrors.get(Integer.valueOf(i))) == null || set3.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.Category.OTHER;
        }
        Map map2 = this.loginRecoverableErrors;
        if (map2 != null && map2.containsKey(Integer.valueOf(i)) && ((set2 = (Set) this.loginRecoverableErrors.get(Integer.valueOf(i))) == null || set2.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.Category.LOGIN_RECOVERABLE;
        }
        Map map3 = this.transientErrors;
        return (map3 != null && map3.containsKey(Integer.valueOf(i)) && ((set = (Set) this.transientErrors.get(Integer.valueOf(i))) == null || set.contains(Integer.valueOf(i2)))) ? FacebookRequestError.Category.TRANSIENT : FacebookRequestError.Category.OTHER;
    }

    public final String getRecoveryMessage(FacebookRequestError.Category category) {
        int i = category == null ? -1 : WhenMappings.$EnumSwitchMapping$0[category.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? null : this.transientRecoveryMessage : this.loginRecoverableRecoveryMessage : this.otherRecoveryMessage;
    }
}

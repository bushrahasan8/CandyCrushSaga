package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import android.content.Intent;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.Keys.OTBroadcastServiceKeys;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: j0.class */
public final class j0 {
    public final Context a;
    public final com.onetrust.otpublishers.headless.Internal.Preferences.e b;
    public final l0 c;

    public j0(Context context) {
        this.a = context;
        this.b = new com.onetrust.otpublishers.headless.Internal.Preferences.e(context);
        this.c = new l0(context);
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2, JSONArray jSONArray, JSONArray jSONArray2, JSONObject jSONObject3, JSONObject jSONObject4) {
        if ((!(jSONObject.optString("userConsentStatus").equals("ACTIVE") && jSONObject.optString("transactionType").equals("OPT_OUT")) && jSONObject.optString("userConsentStatus").equals("ACTIVE") && jSONObject.optString("transactionType").equals("ACTIVE")) ? !jSONObject4.optString("userConsentStatus").equals(jSONObject4.optString("transactionType")) : false) {
            jSONObject2.put("TransactionType", "CHANGE_PREFERENCES");
            jSONObject3.put("OptionId", jSONObject4.optString("id"));
            jSONObject3.put("TransactionType", jSONObject4.optString("userConsentStatus").equals("OPT_IN") ? "OPT_IN" : "OPT_OUT");
            jSONArray.put(jSONObject3);
            return;
        }
        if (!jSONObject.optString("userConsentStatus").equals("ACTIVE") || jSONObject2.getString("TransactionType").equals("CHANGE_PREFERENCES")) {
            return;
        }
        jSONObject2.put("TransactionType", "CONFIRMED");
        if (jSONObject4.getString("userConsentStatus").equals("OPT_IN")) {
            jSONArray2.put(jSONObject4.optString("id"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fa, code lost:
    
        if (r0.optString("userConsentStatus").equals(r0.optString("transactionType")) == false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(org.json.JSONObject r5, org.json.JSONObject r6, org.json.JSONObject r7, java.lang.String r8, org.json.JSONArray r9) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onetrust.otpublishers.headless.Internal.Helper.j0.a(org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, java.lang.String, org.json.JSONArray):void");
    }

    public final JSONArray a() {
        String string = this.b.b().getString("OT_UC_PURPOSES_PURPOSE_SERVER_DATA", "");
        String string2 = this.b.b().getString("OT_UC_PURPOSES_CUSTOM_PREF_OPTIONS_SERVER_DATA", "");
        String string3 = this.b.b().getString("OT_UC_PURPOSES_TOPIC_SERVER_DATA", "");
        JSONArray jSONArray = new JSONArray();
        try {
            a(jSONArray, new JSONObject(string), new JSONObject(string2), new JSONObject(string3));
        } catch (JSONException e) {
            h.a(e, new StringBuilder("Error in fetching saved ucp data :"), "UCPConsentLoggingData", 6);
        }
        OTLogger.a("UCPConsentLoggingData", 3, "UCP consent payload :" + jSONArray);
        return jSONArray;
    }

    public final void a(String str, int i) {
        boolean z;
        StringBuilder sb;
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray names = jSONObject.names();
            if (com.onetrust.otpublishers.headless.Internal.a.a(names)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            int i2 = 0;
            boolean z2 = false;
            while (true) {
                z = z2;
                if (i2 >= names.length()) {
                    break;
                }
                String string = names.getString(i2);
                boolean a = a(string, jSONObject.getJSONObject(string), jSONObject2);
                boolean z3 = z;
                if (a) {
                    z3 = z;
                    if (!z) {
                        z3 = a;
                    }
                }
                i2++;
                z2 = z3;
            }
            if (z) {
                Context context = this.a;
                if (!com.onetrust.otpublishers.headless.Internal.a.a(jSONObject2)) {
                    JSONArray names2 = jSONObject2.names();
                    if (names2 != null) {
                        for (int i3 = 0; i3 < names2.length(); i3++) {
                            try {
                                String string2 = names2.getString(i3);
                                JSONObject jSONObject3 = jSONObject2.getJSONObject(string2);
                                OTLogger.a("OTConsentChanges", 4, "UCP: Sending " + string2 + " broadcast, value = " + jSONObject3);
                                Intent intent = new Intent(string2);
                                intent.putExtra(OTBroadcastServiceKeys.UCP_EVENT_STATUS, jSONObject3.toString());
                                intent.setPackage(context.getApplicationContext().getPackageName());
                                context.sendBroadcast(intent);
                            } catch (JSONException e) {
                                sb = new StringBuilder("UCP: Failed to broadcast UCP consent changes,");
                                sb.append(e.toString());
                                OTLogger.a("OTConsentChanges", 6, sb.toString());
                                this.b.b().edit().putString("OT_UCP_PURPOSE_RELATION_DATA", jSONObject.toString()).apply();
                            }
                        }
                    }
                }
                this.b.b().edit().putString("OT_UCP_PURPOSE_RELATION_DATA", jSONObject.toString()).apply();
            }
            if (i != 1) {
                Context context2 = this.a;
                if (!com.onetrust.otpublishers.headless.Internal.a.a(jSONObject)) {
                    JSONArray names3 = jSONObject.names();
                    if (names3 != null) {
                        for (int i4 = 0; i4 < names3.length(); i4++) {
                            try {
                                String string3 = names3.getString(i4);
                                JSONObject jSONObject4 = jSONObject.getJSONObject(string3);
                                OTLogger.a("OTConsentChanges", 4, "UCP: Sending " + string3 + " broadcast, value = " + jSONObject4);
                                Intent intent2 = new Intent(string3);
                                intent2.putExtra(OTBroadcastServiceKeys.UCP_EVENT_STATUS, jSONObject4.toString());
                                intent2.setPackage(context2.getApplicationContext().getPackageName());
                                context2.sendBroadcast(intent2);
                            } catch (JSONException e2) {
                                sb = new StringBuilder("UCP: Failed to broadcast UCP consent changes,");
                                sb.append(e2.toString());
                                OTLogger.a("OTConsentChanges", 6, sb.toString());
                                this.b.b().edit().putString("OT_UCP_PURPOSE_RELATION_DATA", jSONObject.toString()).apply();
                            }
                        }
                    }
                }
            }
            this.b.b().edit().putString("OT_UCP_PURPOSE_RELATION_DATA", jSONObject.toString()).apply();
        } catch (JSONException e3) {
            g.a(e3, new StringBuilder("failed to trigger broadcast for UC Purposes,"), "OneTrust", 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v52, types: [org.json.JSONException] */
    /* JADX WARN: Type inference failed for: r1v24, types: [org.json.JSONException] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(org.json.JSONArray r8, org.json.JSONObject r9, org.json.JSONObject r10, org.json.JSONObject r11) {
        /*
            Method dump skipped, instructions count: 787
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onetrust.otpublishers.headless.Internal.Helper.j0.a(org.json.JSONArray, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject):void");
    }

    public final boolean a(String str, String str2, JSONObject jSONObject, boolean z) {
        for (int i = 0; i < jSONObject.length(); i++) {
            String string = jSONObject.names().getString(i);
            int i2 = jSONObject.getInt(string);
            int a = this.c.a(string, str, str2);
            if (i2 != a) {
                jSONObject.put(string, a);
                z = true;
            }
        }
        return z;
    }

    public final boolean a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z;
        int i = jSONObject.getInt("status");
        int d = this.c.d(str);
        if (i != d) {
            jSONObject.put("status", d);
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("topics");
        boolean z2 = z;
        if (!com.onetrust.otpublishers.headless.Internal.a.a(jSONObject3)) {
            JSONArray names = jSONObject3.names();
            int i2 = 0;
            while (true) {
                z2 = z;
                if (i2 >= jSONObject3.length()) {
                    break;
                }
                String string = names.getString(i2);
                int i3 = jSONObject3.getInt(string);
                int a = this.c.a(string, str);
                if (i3 != a) {
                    jSONObject3.put(string, a);
                    z = true;
                }
                i2++;
            }
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("custom_preferences");
        boolean z3 = z2;
        if (!com.onetrust.otpublishers.headless.Internal.a.a(jSONObject4)) {
            int i4 = 0;
            while (true) {
                z3 = z2;
                if (i4 >= jSONObject4.length()) {
                    break;
                }
                String string2 = jSONObject4.names().getString(i4);
                z2 = a(str, string2, jSONObject4.getJSONObject(string2), z2);
                i4++;
            }
        }
        if (z3) {
            jSONObject2.put(str, jSONObject);
        }
        return z3;
    }
}

package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.ironsource.i1;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.Keys.OTBroadcastServiceKeys;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import com.onetrust.otpublishers.headless.Public.OTVendorListMode;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: l0.class */
public final class l0 {
    public final com.onetrust.otpublishers.headless.Internal.Preferences.e a;
    public final com.onetrust.otpublishers.headless.Internal.a b = new com.onetrust.otpublishers.headless.Internal.a();
    public final Context c;
    public JSONObject d;
    public JSONObject e;
    public JSONObject f;

    public l0(Context context) {
        this.c = context;
        this.a = new com.onetrust.otpublishers.headless.Internal.Preferences.e(context);
        a();
    }

    public static void a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        String str2;
        if (jSONObject2.has(str)) {
            jSONObject.put("userConsentStatus", jSONObject2.optJSONObject(str).optString("userConsentStatus"));
            str2 = jSONObject2.optJSONObject(str).optString("transactionType");
        } else {
            str2 = "OPT_OUT";
            jSONObject.put("userConsentStatus", "OPT_OUT");
        }
        jSONObject.put("transactionType", str2);
    }

    public final int a(String str, String str2) {
        int a = k0.a(this.f, str.trim() + str2.trim());
        OTLogger.a("UCPurposesDataHandler", 4, "UCP: Consent Status for Topic id " + str + " : " + a);
        return a;
    }

    public final int a(String str, String str2, String str3) {
        int a = k0.a(this.e, str.trim() + str2.trim() + str3.trim());
        OTLogger.a("UCPurposesDataHandler", 4, "UCP: Consent Status for Custom Preference Options id " + str + " : " + a);
        return a;
    }

    public final JSONArray a(String str) {
        String string = this.a.b().getString("OT_UC_PURPOSES_CUSTOM_PREF_SERVER_DATA", "");
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject(string);
            for (int i = 0; i < jSONObject.length(); i++) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(jSONObject.names().get(i).toString());
                if (str.equals(jSONObject2.optString("purposeId"))) {
                    jSONArray.put(jSONObject2);
                }
            }
        } catch (JSONException e) {
            h.a(e, new StringBuilder("Error in fetching CP data by purpose  :"), "UCPurposesDataHandler", 6);
        }
        OTLogger.a("UCPurposesDataHandler", 3, "Custom Prefs by PurposeId :" + jSONArray);
        return jSONArray;
    }

    public final JSONArray a(JSONArray jSONArray, String str, JSONObject jSONObject, JSONArray jSONArray2, int i) {
        JSONObject jSONObject2 = jSONObject.getJSONObject(jSONObject.names().get(i).toString());
        OTLogger.a("UCPurposesDataHandler", 3, "purposeObject :" + jSONObject2);
        String obj = jSONObject.names().get(i).toString();
        JSONArray c = c(obj);
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        JSONObject jSONObject3 = new JSONObject();
        for (int i2 = 0; i2 < c.length(); i2++) {
            JSONObject jSONObject4 = c.getJSONObject(i2);
            if (obj.equals(jSONObject4.optString("purposeId"))) {
                jSONObject3.put("name", str);
                jSONArray4.put(jSONObject4);
                jSONObject3.put("options", jSONArray4);
            } else {
                jSONObject3 = new JSONObject();
                jSONArray3 = new JSONArray();
                jSONObject2.put("topics", jSONArray3);
            }
        }
        if (jSONObject3.length() > 0) {
            jSONArray3.put(jSONObject3);
        }
        jSONObject2.put("topics", jSONArray3);
        JSONArray a = a(obj);
        JSONArray jSONArray5 = new JSONArray();
        JSONArray jSONArray6 = jSONArray2;
        for (int i3 = 0; i3 < a.length(); i3++) {
            JSONObject jSONObject5 = a.getJSONObject(i3);
            String optString = jSONObject5.optString("id");
            JSONArray jSONArray7 = new JSONArray();
            if (obj.equals(jSONObject5.optString("purposeId"))) {
                String str2 = optString;
                if (!com.onetrust.otpublishers.headless.Internal.c.b(optString)) {
                    str2 = jSONObject5.optString("id");
                    jSONArray6 = b(str2);
                }
                if (jSONArray6 != null) {
                    for (int i4 = 0; i4 < jSONArray6.length(); i4++) {
                        JSONObject jSONObject6 = jSONArray6.getJSONObject(i4);
                        if (str2 != null && str2.equals(jSONObject6.optString("customPreferenceId"))) {
                            jSONArray7.put(jSONObject6);
                            jSONObject5.put("customPreferenceOptions", jSONArray7);
                        }
                    }
                }
                jSONArray5.put(jSONObject5);
                jSONObject2.put("customPreferences", jSONArray5);
            } else {
                jSONArray5 = new JSONArray();
            }
        }
        jSONObject2.put("customPreferences", jSONArray5);
        jSONArray.put(jSONObject2);
        return jSONArray6;
    }

    public final void a() {
        String string = this.a.b().getString("OT_UC_PURPOSES_PURPOSE_SERVER_DATA", "{}");
        String string2 = this.a.b().getString("OT_UC_PURPOSES_CUSTOM_PREF_OPTIONS_SERVER_DATA", "{}");
        String string3 = this.a.b().getString("OT_UC_PURPOSES_TOPIC_SERVER_DATA", "{}");
        try {
            this.d = new JSONObject(string);
            this.e = new JSONObject(string2);
            this.f = new JSONObject(string3);
        } catch (JSONException e) {
            h.a(e, new StringBuilder("Error in initializing user state object :"), "UCPurposesDataHandler", 6);
        }
    }

    public final void a(int i, JSONArray jSONArray, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
        String optString = jSONObject2.optString("id");
        if (jSONObject2.has("customPreferences")) {
            JSONArray jSONArray2 = jSONObject2.getJSONArray("customPreferences");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                this.b.getClass();
                com.onetrust.otpublishers.headless.Internal.a.a("id", jSONObject3, jSONObject4);
                this.b.getClass();
                com.onetrust.otpublishers.headless.Internal.a.a("name", jSONObject3, jSONObject4);
                this.b.getClass();
                com.onetrust.otpublishers.headless.Internal.a.a(OTUXParamsKeys.OT_UX_DESCRIPTION, jSONObject3, jSONObject4);
                this.b.getClass();
                com.onetrust.otpublishers.headless.Internal.a.a("selectionType", jSONObject3, jSONObject4);
                jSONObject3.put("selectionType", "MULTI_CHOICE");
                this.b.getClass();
                com.onetrust.otpublishers.headless.Internal.a.a("displayAs", jSONObject3, jSONObject4);
                this.b.getClass();
                com.onetrust.otpublishers.headless.Internal.a.a("required", jSONObject3, jSONObject4);
                jSONObject3.put("purposeId", optString);
                jSONObject.put(jSONObject4.optString("id"), jSONObject3);
            }
            OTLogger.a("UCPurposesDataHandler", 3, "customPrefObjectToSave :" + jSONObject);
            this.a.b().edit().putString("OT_UC_PURPOSES_CUSTOM_PREF_SERVER_DATA", String.valueOf(jSONObject)).apply();
        }
    }

    public final void a(String str, String str2, String str3, boolean z) {
        try {
            if (this.e.has(str2)) {
                JSONObject optJSONObject = this.e.optJSONObject(str2);
                if (k0.a(z, optJSONObject, str, optJSONObject.optString("customPreferenceId"))) {
                    OTLogger.a("UCPurposesDataHandler", 3, "Updated Custom Preference options: " + str3 + " of Custom Preference Id: " + str + " with status: " + z);
                }
            }
            OTLogger.a("UCPurposesDataHandler", 5, "Invalid id passed to update custom preference options");
        } catch (JSONException e) {
            h.a(e, new StringBuilder("Error in updating consent for CP options :"), "UCPurposesDataHandler", 6);
        }
    }

    public final void a(String str, String str2, boolean z) {
        JSONObject optJSONObject;
        try {
            if (this.e.has(str2) && (optJSONObject = this.e.optJSONObject(str2)) != null) {
                k0.a(z, optJSONObject, str, optJSONObject.optString("customPreferenceId"));
            }
            OTLogger.a("UCPurposesDataHandler", 3, "Updated CustomPref options object : " + this.e.optJSONObject(str2));
            k0.a(this.a, this.d, this.f, this.e);
            b(this.e);
            a();
        } catch (JSONException e) {
            h.a(e, new StringBuilder("Error in updating consent for CP options :"), "UCPurposesDataHandler", 6);
        }
    }

    public final void a(String str, boolean z) {
        try {
            JSONObject optJSONObject = this.d.optJSONObject(str);
            if (this.d.has(str)) {
                optJSONObject.put("userConsentStatus", z ? "ACTIVE" : "OPT_OUT");
                OTLogger.a("UCPurposesDataHandler", 3, "Updated purpose id: " + str + " with status: " + z);
                if (!z) {
                    b(str, this.a.b().getString("OT_UCP_PURPOSE_RELATION_DATA", "{}"));
                }
            } else {
                OTLogger.a("UCPurposesDataHandler", 5, "Invalid ID passed to update UCP Consent values");
            }
        } catch (JSONException e) {
            h.a(e, new StringBuilder("Error in updating consent for purposes :"), "UCPurposesDataHandler", 6);
        }
    }

    public final void a(JSONObject jSONObject) {
        JSONArray names;
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject.has(OTVendorListMode.GENERAL)) {
            jSONObject2.put(OTVendorListMode.GENERAL, jSONObject.getJSONObject(OTVendorListMode.GENERAL));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_DESCRIPTION)) {
            jSONObject2.put(OTUXParamsKeys.OT_UX_DESCRIPTION, jSONObject.getJSONObject(OTUXParamsKeys.OT_UX_DESCRIPTION));
        }
        if (jSONObject.has("title")) {
            jSONObject2.put("title", jSONObject.getJSONObject("title"));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_BUTTONS)) {
            jSONObject2.put(OTUXParamsKeys.OT_UX_BUTTONS, jSONObject.getJSONObject(OTUXParamsKeys.OT_UX_BUTTONS));
        }
        this.a.b().edit().putString("OT_UC_PURPOSES_UI_SERVER_DATA", String.valueOf(jSONObject2)).apply();
        OTLogger.a("UCPurposesDataHandler", 3, "Saved server UCPurpose UI Data :" + this.a.b().getString("OT_UC_PURPOSES_UI_SERVER_DATA", ""));
        JSONObject jSONObject3 = new JSONObject();
        JSONArray optJSONArray = jSONObject.optJSONArray("purposes");
        JSONObject jSONObject4 = this.d;
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject5 = new JSONObject();
                JSONObject jSONObject6 = optJSONArray.getJSONObject(i);
                this.b.getClass();
                com.onetrust.otpublishers.headless.Internal.a.a("id", jSONObject5, jSONObject6);
                this.b.getClass();
                com.onetrust.otpublishers.headless.Internal.a.a("version", jSONObject5, jSONObject6);
                this.b.getClass();
                com.onetrust.otpublishers.headless.Internal.a.a("label", jSONObject5, jSONObject6);
                this.b.getClass();
                com.onetrust.otpublishers.headless.Internal.a.a(OTUXParamsKeys.OT_UX_DESCRIPTION, jSONObject5, jSONObject6);
                this.b.getClass();
                com.onetrust.otpublishers.headless.Internal.a.a("status", jSONObject5, jSONObject6);
                this.b.getClass();
                com.onetrust.otpublishers.headless.Internal.a.a("newVersionAvailable", jSONObject5, jSONObject6);
                this.b.getClass();
                com.onetrust.otpublishers.headless.Internal.a.a("purposeType", jSONObject5, jSONObject6);
                this.b.getClass();
                com.onetrust.otpublishers.headless.Internal.a.a("consentLifeSpan", jSONObject5, jSONObject6);
                this.b.getClass();
                com.onetrust.otpublishers.headless.Internal.a.a("externalReference", jSONObject5, jSONObject6);
                this.b.getClass();
                com.onetrust.otpublishers.headless.Internal.a.a(i1.t, jSONObject5, jSONObject6);
                a(jSONObject6.optString("id"), jSONObject5, this.d);
                jSONObject5.put("defaultConsentStatus", "OPT_OUT");
                jSONObject4.put(jSONObject6.optString("id"), jSONObject5);
            }
            this.a.b().edit().putString("OT_UC_PURPOSES_PURPOSE_SERVER_DATA", String.valueOf(jSONObject4)).apply();
            OTLogger.a("UCPurposesDataHandler", 3, "Saved UC Purpose Server Data :" + this.a.b().getString("OT_UC_PURPOSES_PURPOSE_SERVER_DATA", ""));
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("purposes");
        JSONObject jSONObject7 = new JSONObject();
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                try {
                    b(i2, optJSONArray2, jSONObject7);
                } catch (JSONException e) {
                    h.a(e, new StringBuilder("Error in saving topics data :"), "UCPurposesDataHandler", 6);
                }
                OTLogger.a("UCPurposesDataHandler", 3, "Saved server Topic Data :" + this.a.b().getString("OT_UC_PURPOSES_TOPIC_SERVER_DATA", ""));
            }
        }
        try {
            JSONArray optJSONArray3 = jSONObject.optJSONArray("purposes");
            JSONObject jSONObject8 = new JSONObject();
            if (optJSONArray3 != null) {
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    a(i3, optJSONArray3, jSONObject8);
                }
                OTLogger.a("UCPurposesDataHandler", 3, "Saved server Custom Pref Data :" + this.a.b().getString("OT_UC_PURPOSES_CUSTOM_PREF_SERVER_DATA", ""));
            }
        } catch (JSONException e2) {
            h.a(e2, new StringBuilder("Error in saving custom pref data :"), "UCPurposesDataHandler", 6);
        }
        JSONArray optJSONArray4 = jSONObject.optJSONArray("purposes");
        JSONObject jSONObject9 = this.e;
        if (optJSONArray4 != null) {
            for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                try {
                    JSONObject jSONObject10 = optJSONArray4.getJSONObject(i4);
                    String optString = jSONObject10.optString("id");
                    if (jSONObject10.has("customPreferences")) {
                        JSONArray jSONArray = jSONObject10.getJSONArray("customPreferences");
                        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                            a(jSONObject9, jSONArray, i5, optString);
                        }
                    }
                } catch (JSONException e3) {
                    h.a(e3, new StringBuilder("Error in saving CP options data :"), "UCPurposesDataHandler", 6);
                }
                OTLogger.a("UCPurposesDataHandler", 3, "Saved server Custom Pref options Data :" + this.a.b().getString("OT_UC_PURPOSES_CUSTOM_PREF_OPTIONS_SERVER_DATA", ""));
            }
        }
        a();
        JSONArray optJSONArray5 = jSONObject.optJSONArray("purposes");
        if (optJSONArray5 != null) {
            for (int i6 = 0; i6 < optJSONArray5.length(); i6++) {
                try {
                    a(optJSONArray5.getJSONObject(i6), jSONObject3);
                } catch (JSONException e4) {
                    g.a(e4, new StringBuilder("UCP: error while creating broadcasting object:"), "UCPurposesDataHandler", 6);
                }
            }
        }
        c.a(jSONObject3, this.a.b().edit(), "OT_UCP_PURPOSE_RELATION_DATA");
        Context context = this.c;
        if (com.onetrust.otpublishers.headless.Internal.a.a(jSONObject3) || (names = jSONObject3.names()) == null) {
            return;
        }
        for (int i7 = 0; i7 < names.length(); i7++) {
            try {
                String string = names.getString(i7);
                JSONObject jSONObject11 = jSONObject3.getJSONObject(string);
                OTLogger.a("OTConsentChanges", 4, "UCP: Sending " + string + " broadcast, value = " + jSONObject11);
                Intent intent = new Intent(string);
                intent.putExtra(OTBroadcastServiceKeys.UCP_EVENT_STATUS, jSONObject11.toString());
                intent.setPackage(context.getApplicationContext().getPackageName());
                context.sendBroadcast(intent);
            } catch (JSONException e5) {
                g.a(e5, new StringBuilder("UCP: Failed to broadcast UCP consent changes,"), "OTConsentChanges", 6);
                return;
            }
        }
    }

    public final void a(JSONObject jSONObject, JSONArray jSONArray, int i, String str) {
        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
        String optString = jSONObject2.optString("id");
        if (jSONObject2.has("customPreferenceOptions")) {
            JSONArray jSONArray2 = jSONObject2.getJSONArray("customPreferenceOptions");
            OTLogger.a("UCPurposesDataHandler", 3, "customPrefArraylength() optionsArray :" + jSONArray2.length());
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                String str2 = jSONObject4.optString("id") + str + optString;
                this.b.getClass();
                com.onetrust.otpublishers.headless.Internal.a.a("id", jSONObject3, jSONObject4);
                this.b.getClass();
                com.onetrust.otpublishers.headless.Internal.a.a("label", jSONObject3, jSONObject4);
                jSONObject3.put("customPreferenceId", optString);
                jSONObject3.put("purposeOptionsId", str2);
                jSONObject3.put("purposeId", str);
                a(str2, jSONObject3, this.e);
                jSONObject.put(str2, jSONObject3);
            }
            this.a.b().edit().putString("OT_UC_PURPOSES_CUSTOM_PREF_OPTIONS_SERVER_DATA", String.valueOf(jSONObject)).apply();
        }
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        String optString = jSONObject.optString("id");
        jSONObject3.put("status", d(optString));
        if (jSONObject.has("topics")) {
            JSONArray jSONArray = jSONObject.getJSONObject("topics").getJSONArray("options");
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString2 = jSONArray.getJSONObject(i).optString("id", "");
                int a = a(optString2, optString);
                int i2 = a;
                if (a == -1) {
                    i2 = 0;
                }
                jSONObject4.put(optString2, i2);
            }
        }
        jSONObject3.put("topics", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        if (jSONObject.has("customPreferences")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("customPreferences");
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                JSONObject jSONObject6 = jSONArray2.getJSONObject(i3);
                String string = jSONObject6.getString("id");
                JSONArray jSONArray3 = jSONObject6.getJSONArray("customPreferenceOptions");
                JSONObject jSONObject7 = new JSONObject();
                for (int i4 = 0; i4 < jSONArray3.length(); i4++) {
                    String string2 = jSONArray3.getJSONObject(i4).getString("id");
                    int a2 = a(string2, optString, string);
                    int i5 = a2;
                    if (a2 == -1) {
                        i5 = 0;
                    }
                    jSONObject7.put(string2, i5);
                }
                jSONObject5.put(string, jSONObject7);
            }
        }
        jSONObject3.put("custom_preferences", jSONObject5);
        jSONObject2.put(optString, jSONObject3);
    }

    public final JSONArray b(String str) {
        String string = this.a.b().getString("OT_UC_PURPOSES_CUSTOM_PREF_OPTIONS_SERVER_DATA", "");
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject(string);
            for (int i = 0; i < jSONObject.length(); i++) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(jSONObject.names().get(i).toString());
                if (str.equals(jSONObject2.optString("customPreferenceId"))) {
                    jSONArray.put(jSONObject2);
                }
            }
        } catch (JSONException e) {
            h.a(e, new StringBuilder("Error in fetching CP options data by purposeCPId  :"), "UCPurposesDataHandler", 6);
        }
        OTLogger.a("UCPurposesDataHandler", 3, "Options by Purpose and CustomPrefId :" + jSONArray);
        return jSONArray;
    }

    public final void b(int i, JSONArray jSONArray, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
        String optString = jSONObject2.optString("id");
        if (jSONObject2.has("topics")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("topics");
            if (jSONObject3.has("options")) {
                JSONArray jSONArray2 = jSONObject3.getJSONArray("options");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    JSONObject jSONObject4 = new JSONObject();
                    JSONObject jSONObject5 = jSONArray2.getJSONObject(i2);
                    this.b.getClass();
                    com.onetrust.otpublishers.headless.Internal.a.a("id", jSONObject4, jSONObject5);
                    this.b.getClass();
                    com.onetrust.otpublishers.headless.Internal.a.a("name", jSONObject4, jSONObject5);
                    this.b.getClass();
                    com.onetrust.otpublishers.headless.Internal.a.a("integrationKey", jSONObject4, jSONObject5);
                    jSONObject4.put("purposeId", optString);
                    jSONObject4.put("purposeTopicId", jSONObject5.optString("id") + optString);
                    a(jSONObject5.optString("id") + optString, jSONObject4, this.f);
                    jSONObject.put(jSONObject5.optString("id") + optString, jSONObject4);
                }
                this.a.b().edit().putString("OT_UC_PURPOSES_TOPIC_SERVER_DATA", String.valueOf(jSONObject)).apply();
            }
        }
    }

    public final void b(String str, String str2) {
        JSONObject jSONObject = new JSONObject(str2);
        if (jSONObject.has(str)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            if (jSONObject2.has("topics") && !com.onetrust.otpublishers.headless.Internal.a.a(jSONObject2.getJSONObject("topics"))) {
                JSONArray names = jSONObject2.getJSONObject("topics").names();
                for (int i = 0; i < names.length(); i++) {
                    String string = names.getString(i);
                    c(string.trim() + str.trim(), string, false);
                }
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject("custom_preferences");
            if (com.onetrust.otpublishers.headless.Internal.a.a(jSONObject3)) {
                return;
            }
            for (int i2 = 0; i2 < jSONObject3.length(); i2++) {
                String string2 = jSONObject3.names().getString(i2);
                JSONObject jSONObject4 = jSONObject3.getJSONObject(string2);
                for (int i3 = 0; i3 < jSONObject4.length(); i3++) {
                    String string3 = jSONObject4.names().getString(i3);
                    a(string2, string3.trim() + str.trim() + string2.trim(), string3, false);
                }
            }
        }
    }

    public final void b(String str, String str2, boolean z) {
        try {
            if (this.f.has(str)) {
                JSONObject optJSONObject = this.f.optJSONObject(str);
                k0.a(z, optJSONObject, str2, optJSONObject.optString("id"));
            }
            OTLogger.a("UCPurposesDataHandler", 3, "Updated topic object : " + this.f.optJSONObject(str));
            k0.a(this.a, this.d, this.f, this.e);
            b(this.f);
        } catch (JSONException e) {
            h.a(e, new StringBuilder("Error in updating consent for topics :"), "UCPurposesDataHandler", 6);
        }
    }

    public final void b(JSONObject jSONObject) {
        SharedPreferences.Editor edit;
        String valueOf;
        String str;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            JSONObject optJSONObject = jSONObject.optJSONObject(keys.next());
            if (optJSONObject != null) {
                try {
                    optJSONObject.put("transactionType", optJSONObject.optString("userConsentStatus"));
                } catch (JSONException e) {
                    h.a(e, new StringBuilder("Error while updating previous selection to latest selection :"), "UCPurposesDataHandler", 6);
                }
            }
        }
        if (jSONObject.equals(this.d)) {
            edit = this.a.b().edit();
            valueOf = String.valueOf(this.d);
            str = "OT_UC_PURPOSES_PURPOSE_SERVER_DATA";
        } else if (jSONObject.equals(this.f)) {
            edit = this.a.b().edit();
            valueOf = String.valueOf(this.f);
            str = "OT_UC_PURPOSES_TOPIC_SERVER_DATA";
        } else {
            if (!jSONObject.equals(this.e)) {
                return;
            }
            edit = this.a.b().edit();
            valueOf = String.valueOf(this.e);
            str = "OT_UC_PURPOSES_CUSTOM_PREF_OPTIONS_SERVER_DATA";
        }
        edit.putString(str, valueOf).apply();
    }

    public final JSONArray c(String str) {
        String string = this.a.b().getString("OT_UC_PURPOSES_TOPIC_SERVER_DATA", "");
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject(string);
            for (int i = 0; i < jSONObject.length(); i++) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(jSONObject.names().get(i).toString());
                if (str.equals(jSONObject2.optString("purposeId"))) {
                    jSONArray.put(jSONObject2);
                }
            }
        } catch (JSONException e) {
            h.a(e, new StringBuilder("Error in fetching topics data by purpose :"), "UCPurposesDataHandler", 6);
        }
        OTLogger.a("UCPurposesDataHandler", 3, "Topics by PurposeId :" + jSONArray);
        return jSONArray;
    }

    public final void c(String str, String str2, boolean z) {
        try {
            if (this.f.has(str)) {
                JSONObject optJSONObject = this.f.optJSONObject(str);
                k0.a(z, optJSONObject, str2, optJSONObject.optString("id"));
                OTLogger.a("UCPurposesDataHandler", 3, "Updated topic id: " + str2 + " with status: " + z);
            } else {
                OTLogger.a("UCPurposesDataHandler", 5, "Invalid id passed to update topics");
            }
        } catch (JSONException e) {
            h.a(e, new StringBuilder("Error in updating consent for topics :"), "UCPurposesDataHandler", 6);
        }
    }

    public final int d(String str) {
        int a = k0.a(this.d, str);
        OTLogger.a("UCPurposesDataHandler", 4, "UCP: Consent Status for Purpose id " + str + " : " + a);
        return a;
    }
}

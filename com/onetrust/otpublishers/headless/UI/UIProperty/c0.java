package com.onetrust.otpublishers.headless.UI.UIProperty;

import com.ironsource.i1;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: c0.class */
public final class c0 {
    public static void a(com.onetrust.otpublishers.headless.UI.DataModels.c cVar, JSONObject jSONObject) {
        if (jSONObject.has("customPreferences")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("customPreferences");
            for (int i = 0; i < jSONArray.length(); i++) {
                com.onetrust.otpublishers.headless.UI.DataModels.b bVar = new com.onetrust.otpublishers.headless.UI.DataModels.b();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2.has("id")) {
                    bVar.a = jSONObject2.optString("id");
                }
                if (jSONObject2.has("name")) {
                    bVar.b = jSONObject2.optString("name");
                }
                if (jSONObject2.has(OTUXParamsKeys.OT_UX_DESCRIPTION)) {
                    bVar.c = jSONObject2.optString(OTUXParamsKeys.OT_UX_DESCRIPTION);
                }
                if (jSONObject2.has("selectionType")) {
                    bVar.d = jSONObject2.optString("selectionType");
                }
                if (jSONObject2.has("purposeId")) {
                    jSONObject2.optString("purposeId");
                }
                if (jSONObject2.has("customPreferenceOptions")) {
                    ArrayList arrayList2 = new ArrayList();
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("customPreferenceOptions");
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        com.onetrust.otpublishers.headless.UI.DataModels.d dVar = new com.onetrust.otpublishers.headless.UI.DataModels.d();
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                        if (jSONObject3.has("id")) {
                            dVar.a = jSONObject3.optString("id");
                        }
                        if (jSONObject3.has("label")) {
                            dVar.e = jSONObject3.optString("label");
                        }
                        if (jSONObject3.has(i1.t)) {
                            dVar.f = jSONObject3.optString(i1.t);
                        }
                        if (jSONObject3.has("isDefault")) {
                            dVar.g = jSONObject3.optString("isDefault");
                        }
                        if (jSONObject3.has("canDelete")) {
                            dVar.b = jSONObject3.optString("canDelete");
                        }
                        if (jSONObject3.has("purposeOptionsId")) {
                            dVar.i = jSONObject3.optString("purposeOptionsId");
                        }
                        if (jSONObject3.has("purposeId")) {
                            dVar.j = jSONObject3.optString("purposeId");
                        }
                        if (jSONObject3.has("userConsentStatus")) {
                            dVar.h = jSONObject3.optString("userConsentStatus");
                        }
                        if (jSONObject3.has("customPreferenceId")) {
                            dVar.k = jSONObject3.optString("customPreferenceId");
                        }
                        arrayList2.add(dVar);
                    }
                    bVar.f = arrayList2;
                }
                arrayList.add(bVar);
            }
            cVar.j = arrayList;
        }
    }

    public static void b(com.onetrust.otpublishers.headless.UI.DataModels.c cVar, JSONObject jSONObject) {
        if (jSONObject.has("topics")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("topics");
            for (int i = 0; i < jSONArray.length(); i++) {
                com.onetrust.otpublishers.headless.UI.DataModels.e eVar = new com.onetrust.otpublishers.headless.UI.DataModels.e();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2.has("name")) {
                    eVar.a = jSONObject2.optString("name");
                }
                if (jSONObject2.has("options")) {
                    ArrayList arrayList2 = new ArrayList();
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("options");
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        com.onetrust.otpublishers.headless.UI.DataModels.d dVar = new com.onetrust.otpublishers.headless.UI.DataModels.d();
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                        if (jSONObject3.has("id")) {
                            dVar.a = jSONObject3.optString("id");
                        }
                        if (jSONObject3.has("name")) {
                            dVar.c = jSONObject3.optString("name");
                        }
                        if (jSONObject3.has("integrationKey")) {
                            dVar.d = jSONObject3.optString("integrationKey");
                        }
                        if (jSONObject3.has("customPreferenceId")) {
                            dVar.i = jSONObject3.optString("customPreferenceId");
                        }
                        if (jSONObject3.has("purposeId")) {
                            dVar.j = jSONObject3.optString("purposeId");
                        }
                        if (jSONObject3.has("userConsentStatus")) {
                            dVar.h = jSONObject3.optString("userConsentStatus");
                        }
                        if (jSONObject3.has("purposeTopicId")) {
                            dVar.l = jSONObject3.optString("purposeTopicId");
                        }
                        arrayList2.add(dVar);
                    }
                    eVar.b = arrayList2;
                }
                arrayList.add(eVar);
            }
            cVar.i = arrayList;
        }
    }

    public static void c(com.onetrust.otpublishers.headless.UI.DataModels.c cVar, JSONObject jSONObject) {
        if (jSONObject.has("id")) {
            cVar.a = jSONObject.optString("id");
        }
        if (jSONObject.has("label")) {
            cVar.b = jSONObject.optString("label");
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_DESCRIPTION)) {
            cVar.c = jSONObject.optString(OTUXParamsKeys.OT_UX_DESCRIPTION);
        }
        if (jSONObject.has("status")) {
            cVar.d = jSONObject.optString("status");
        }
        if (jSONObject.has("newVersionAvailable")) {
            cVar.e = jSONObject.optString("newVersionAvailable");
        }
        if (jSONObject.has("type")) {
            cVar.f = jSONObject.optString("type");
        }
        if (jSONObject.has("consentLifeSpan")) {
            cVar.g = jSONObject.optString("consentLifeSpan");
        }
        if (jSONObject.has("version")) {
            cVar.h = jSONObject.optString("version");
        }
        if (jSONObject.has("userConsentStatus")) {
            cVar.k = jSONObject.optString("userConsentStatus");
        }
    }
}

package com.android.billingclient.api;

import android.text.TextUtils;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Purchase.class */
public class Purchase {
    private final String zza;
    private final String zzb;
    private final JSONObject zzc;

    @zzk
    /* loaded from: Purchase$PendingPurchaseUpdate.class */
    public static final class PendingPurchaseUpdate {
        private final JSONObject mParsedJson;

        private PendingPurchaseUpdate(JSONObject jSONObject) {
            this.mParsedJson = jSONObject;
        }

        /* synthetic */ PendingPurchaseUpdate(JSONObject jSONObject, zzcy zzcyVar) {
            this(jSONObject);
        }

        public List<String> getProducts() {
            JSONArray optJSONArray;
            ArrayList arrayList = new ArrayList();
            if (this.mParsedJson.has("productIds") && (optJSONArray = this.mParsedJson.optJSONArray("productIds")) != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
            }
            return arrayList;
        }

        public String getPurchaseToken() {
            return this.mParsedJson.optString("purchaseToken");
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: Purchase$PurchaseState.class */
    public @interface PurchaseState {
        public static final int PENDING = 2;
        public static final int PURCHASED = 1;
        public static final int UNSPECIFIED_STATE = 0;
    }

    public Purchase(String str, String str2) throws JSONException {
        this.zza = str;
        this.zzb = str2;
        this.zzc = new JSONObject(str);
    }

    private final ArrayList zza() {
        ArrayList arrayList = new ArrayList();
        if (this.zzc.has("productIds")) {
            JSONArray optJSONArray = this.zzc.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
            }
        } else if (this.zzc.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
            arrayList.add(this.zzc.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.zza, purchase.getOriginalJson()) && TextUtils.equals(this.zzb, purchase.getSignature());
    }

    public AccountIdentifiers getAccountIdentifiers() {
        JSONObject jSONObject = this.zzc;
        String optString = jSONObject.optString("obfuscatedAccountId");
        String optString2 = jSONObject.optString("obfuscatedProfileId");
        if (optString == null && optString2 == null) {
            return null;
        }
        return new AccountIdentifiers(optString, optString2);
    }

    public String getDeveloperPayload() {
        return this.zzc.optString("developerPayload");
    }

    public String getOrderId() {
        String optString = this.zzc.optString("orderId");
        String str = optString;
        if (TextUtils.isEmpty(optString)) {
            str = null;
        }
        return str;
    }

    public String getOriginalJson() {
        return this.zza;
    }

    public String getPackageName() {
        return this.zzc.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
    }

    @zzk
    public PendingPurchaseUpdate getPendingPurchaseUpdate() {
        JSONObject optJSONObject = this.zzc.optJSONObject("pendingPurchaseUpdate");
        if (optJSONObject == null) {
            return null;
        }
        return new PendingPurchaseUpdate(optJSONObject);
    }

    public List<String> getProducts() {
        return zza();
    }

    public int getPurchaseState() {
        return this.zzc.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public long getPurchaseTime() {
        return this.zzc.optLong("purchaseTime");
    }

    public String getPurchaseToken() {
        JSONObject jSONObject = this.zzc;
        return jSONObject.optString(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY, jSONObject.optString("purchaseToken"));
    }

    public int getQuantity() {
        return this.zzc.optInt("quantity", 1);
    }

    public String getSignature() {
        return this.zzb;
    }

    @Deprecated
    public ArrayList<String> getSkus() {
        return zza();
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    public boolean isAcknowledged() {
        return this.zzc.optBoolean("acknowledged", true);
    }

    public boolean isAutoRenewing() {
        return this.zzc.optBoolean("autoRenewing");
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.zza));
    }
}

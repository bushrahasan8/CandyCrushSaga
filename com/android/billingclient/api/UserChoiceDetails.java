package com.android.billingclient.api;

import com.ironsource.t2;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzl
/* loaded from: UserChoiceDetails.class */
public final class UserChoiceDetails {
    private final String mOriginalJson;
    private final JSONObject mParsedJson;
    private final List<Product> mProducts;

    @zzl
    /* loaded from: UserChoiceDetails$Product.class */
    public static class Product {
        private final String id;
        private final String offerToken;
        private final String type;

        Product(String str, String str2, String str3) {
            this.id = str;
            this.type = str2;
            this.offerToken = str3;
        }

        private Product(JSONObject jSONObject) {
            this.id = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
            this.type = jSONObject.optString(t2.h.m);
            String optString = jSONObject.optString("offerToken");
            this.offerToken = true == optString.isEmpty() ? null : optString;
        }

        /* synthetic */ Product(JSONObject jSONObject, zzdl zzdlVar) {
            this(jSONObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return this.id.equals(product.getId()) && this.type.equals(product.getType()) && Objects.equals(this.offerToken, product.getOfferToken());
        }

        public String getId() {
            return this.id;
        }

        public String getOfferToken() {
            return this.offerToken;
        }

        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return Objects.hash(this.id, this.type, this.offerToken);
        }

        public String toString() {
            return String.format("{id: %s, type: %s, offer token: %s}", this.id, this.type, this.offerToken);
        }
    }

    public UserChoiceDetails(String str) throws JSONException {
        this.mOriginalJson = str;
        JSONObject jSONObject = new JSONObject(str);
        this.mParsedJson = jSONObject;
        this.mProducts = toProductList(jSONObject.optJSONArray("products"));
    }

    private static List<Product> toProductList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new Product(optJSONObject));
                }
            }
        }
        return arrayList;
    }

    public String getExternalTransactionToken() {
        return this.mParsedJson.optString("externalTransactionToken");
    }

    public String getOriginalExternalTransactionId() {
        String optString = this.mParsedJson.optString("originalExternalTransactionId");
        String str = optString;
        if (optString.isEmpty()) {
            str = null;
        }
        return str;
    }

    public List<Product> getProducts() {
        return this.mProducts;
    }
}

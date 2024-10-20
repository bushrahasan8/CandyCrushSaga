package com.google.android.datatransport;

/* loaded from: AutoValue_ProductData.class */
final class AutoValue_ProductData extends ProductData {
    private final Integer productId;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_ProductData(Integer num) {
        this.productId = num;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProductData)) {
            return false;
        }
        Integer num = this.productId;
        Integer productId = ((ProductData) obj).getProductId();
        if (num != null) {
            z = num.equals(productId);
        } else if (productId != null) {
            z = false;
        }
        return z;
    }

    @Override // com.google.android.datatransport.ProductData
    public Integer getProductId() {
        return this.productId;
    }

    public int hashCode() {
        Integer num = this.productId;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.productId + "}";
    }
}

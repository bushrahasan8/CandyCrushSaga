package com.google.android.datatransport;

/* loaded from: AutoValue_Event.class */
final class AutoValue_Event extends Event {
    private final Integer code;
    private final Object payload;
    private final Priority priority;
    private final ProductData productData;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Event(Integer num, Object obj, Priority priority, ProductData productData) {
        this.code = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.payload = obj;
        if (priority == null) {
            throw new NullPointerException("Null priority");
        }
        this.priority = priority;
        this.productData = productData;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        Integer num = this.code;
        if (num != null ? num.equals(event.getCode()) : event.getCode() == null) {
            if (this.payload.equals(event.getPayload())) {
                if (this.priority.equals(event.getPriority())) {
                    if ((r0 = this.productData) == null) {
                    }
                }
            }
        }
        z = false;
        return z;
    }

    @Override // com.google.android.datatransport.Event
    public Integer getCode() {
        return this.code;
    }

    @Override // com.google.android.datatransport.Event
    public Object getPayload() {
        return this.payload;
    }

    @Override // com.google.android.datatransport.Event
    public Priority getPriority() {
        return this.priority;
    }

    @Override // com.google.android.datatransport.Event
    public ProductData getProductData() {
        return this.productData;
    }

    public int hashCode() {
        Integer num = this.code;
        int i = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        int hashCode2 = this.payload.hashCode();
        int hashCode3 = this.priority.hashCode();
        ProductData productData = this.productData;
        if (productData != null) {
            i = productData.hashCode();
        }
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i;
    }

    public String toString() {
        return "Event{code=" + this.code + ", payload=" + this.payload + ", priority=" + this.priority + ", productData=" + this.productData + "}";
    }
}

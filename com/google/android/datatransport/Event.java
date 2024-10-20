package com.google.android.datatransport;

/* loaded from: Event.class */
public abstract class Event {
    public static Event ofData(Object obj) {
        return new AutoValue_Event(null, obj, Priority.DEFAULT, null);
    }

    public static Event ofData(Object obj, ProductData productData) {
        return new AutoValue_Event(null, obj, Priority.DEFAULT, productData);
    }

    public abstract Integer getCode();

    public abstract Object getPayload();

    public abstract Priority getPriority();

    public abstract ProductData getProductData();
}

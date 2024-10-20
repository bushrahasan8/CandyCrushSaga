package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.messaging.Constants;
import java.util.Map;

/* loaded from: RemoteMessage.class */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new RemoteMessageCreator();
    Bundle bundle;
    private Map data;

    public RemoteMessage(Bundle bundle) {
        this.bundle = bundle;
    }

    public Map getData() {
        if (this.data == null) {
            this.data = Constants.MessagePayloadKeys.extractDeveloperDefinedPayload(this.bundle);
        }
        return this.data;
    }

    public String getTo() {
        return this.bundle.getString("google.to");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void populateSendMessageIntent(Intent intent) {
        intent.putExtras(this.bundle);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        RemoteMessageCreator.writeToParcel(this, parcel, i);
    }
}

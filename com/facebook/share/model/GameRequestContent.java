package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: GameRequestContent.class */
public final class GameRequestContent implements Parcelable {
    private final ActionType actionType;
    private final String cta;
    private final String data;
    private final Filters filters;
    private final String message;
    private final String objectId;
    private final List recipients;
    private final List suggestions;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GameRequestContent> CREATOR = new Parcelable.Creator() { // from class: com.facebook.share.model.GameRequestContent$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        public GameRequestContent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GameRequestContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public GameRequestContent[] newArray(int i) {
            return new GameRequestContent[i];
        }
    };

    /* loaded from: GameRequestContent$ActionType.class */
    public enum ActionType {
        SEND,
        ASKFOR,
        TURN,
        INVITE
    }

    /* loaded from: GameRequestContent$Builder.class */
    public static final class Builder {
        private ActionType actionType;
        private String cta;
        private String data;
        private Filters filters;
        private String message;
        private String objectId;
        private List recipients;
        private List suggestions;
        private String title;

        public GameRequestContent build() {
            return new GameRequestContent(this, null);
        }

        public final ActionType getActionType$facebook_android_sdk_common_release() {
            return this.actionType;
        }

        public final String getCta$facebook_android_sdk_common_release() {
            return this.cta;
        }

        public final String getData$facebook_android_sdk_common_release() {
            return this.data;
        }

        public final Filters getFilters$facebook_android_sdk_common_release() {
            return this.filters;
        }

        public final String getMessage$facebook_android_sdk_common_release() {
            return this.message;
        }

        public final String getObjectId$facebook_android_sdk_common_release() {
            return this.objectId;
        }

        public final List getRecipients$facebook_android_sdk_common_release() {
            return this.recipients;
        }

        public final List getSuggestions$facebook_android_sdk_common_release() {
            return this.suggestions;
        }

        public final String getTitle$facebook_android_sdk_common_release() {
            return this.title;
        }

        public final Builder setData(String str) {
            this.data = str;
            return this;
        }

        public final Builder setFilters(Filters filters) {
            this.filters = filters;
            return this;
        }

        public final Builder setMessage(String str) {
            this.message = str;
            return this;
        }

        public final Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        public final Builder setTo(String str) {
            if (str != null) {
                this.recipients = CollectionsKt.toList(StringsKt.split$default((CharSequence) str, new char[]{','}, false, 0, 6, (Object) null));
            }
            return this;
        }
    }

    /* loaded from: GameRequestContent$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: GameRequestContent$Filters.class */
    public enum Filters {
        APP_USERS,
        APP_NON_USERS,
        EVERYBODY
    }

    public GameRequestContent(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.message = parcel.readString();
        this.cta = parcel.readString();
        this.recipients = parcel.createStringArrayList();
        this.title = parcel.readString();
        this.data = parcel.readString();
        this.actionType = (ActionType) parcel.readSerializable();
        this.objectId = parcel.readString();
        this.filters = (Filters) parcel.readSerializable();
        this.suggestions = parcel.createStringArrayList();
    }

    private GameRequestContent(Builder builder) {
        this.message = builder.getMessage$facebook_android_sdk_common_release();
        this.cta = builder.getCta$facebook_android_sdk_common_release();
        this.recipients = builder.getRecipients$facebook_android_sdk_common_release();
        this.title = builder.getTitle$facebook_android_sdk_common_release();
        this.data = builder.getData$facebook_android_sdk_common_release();
        this.actionType = builder.getActionType$facebook_android_sdk_common_release();
        this.objectId = builder.getObjectId$facebook_android_sdk_common_release();
        this.filters = builder.getFilters$facebook_android_sdk_common_release();
        this.suggestions = builder.getSuggestions$facebook_android_sdk_common_release();
    }

    public /* synthetic */ GameRequestContent(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final ActionType getActionType() {
        return this.actionType;
    }

    public final String getData() {
        return this.data;
    }

    public final Filters getFilters() {
        return this.filters;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getObjectId() {
        return this.objectId;
    }

    public final List getRecipients() {
        return this.recipients;
    }

    public final List getSuggestions() {
        return this.suggestions;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.message);
        out.writeString(this.cta);
        out.writeStringList(this.recipients);
        out.writeString(this.title);
        out.writeString(this.data);
        out.writeSerializable(this.actionType);
        out.writeString(this.objectId);
        out.writeSerializable(this.filters);
        out.writeStringList(this.suggestions);
    }
}

package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: MediaDescriptionCompat.class */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator() { // from class: android.support.v4.media.MediaDescriptionCompat.1
        AnonymousClass1() {
        }

        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.fromMediaDescription(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    };
    private final CharSequence mDescription;
    private MediaDescription mDescriptionFwk;
    private final Bundle mExtras;
    private final Bitmap mIcon;
    private final Uri mIconUri;
    private final String mMediaId;
    private final Uri mMediaUri;
    private final CharSequence mSubtitle;
    private final CharSequence mTitle;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$1 */
    /* loaded from: MediaDescriptionCompat$1.class */
    class AnonymousClass1 implements Parcelable.Creator {
        AnonymousClass1() {
        }

        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.fromMediaDescription(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* loaded from: MediaDescriptionCompat$Api21Impl.class */
    public static abstract class Api21Impl {
        static MediaDescription build(MediaDescription.Builder builder) {
            return builder.build();
        }

        static MediaDescription.Builder createBuilder() {
            return new MediaDescription.Builder();
        }

        static CharSequence getDescription(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        static Bundle getExtras(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        static Bitmap getIconBitmap(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        static Uri getIconUri(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        static String getMediaId(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        static CharSequence getSubtitle(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        static CharSequence getTitle(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        static void setDescription(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void setExtras(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void setIconBitmap(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        static void setIconUri(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        static void setMediaId(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        static void setSubtitle(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void setTitle(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* loaded from: MediaDescriptionCompat$Api23Impl.class */
    public static abstract class Api23Impl {
        static Uri getMediaUri(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        static void setMediaUri(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    /* loaded from: MediaDescriptionCompat$Builder.class */
    public static final class Builder {
        private CharSequence mDescription;
        private Bundle mExtras;
        private Bitmap mIcon;
        private Uri mIconUri;
        private String mMediaId;
        private Uri mMediaUri;
        private CharSequence mSubtitle;
        private CharSequence mTitle;

        public MediaDescriptionCompat build() {
            return new MediaDescriptionCompat(this.mMediaId, this.mTitle, this.mSubtitle, this.mDescription, this.mIcon, this.mIconUri, this.mExtras, this.mMediaUri);
        }

        public Builder setDescription(CharSequence charSequence) {
            this.mDescription = charSequence;
            return this;
        }

        public Builder setExtras(Bundle bundle) {
            this.mExtras = bundle;
            return this;
        }

        public Builder setIconBitmap(Bitmap bitmap) {
            this.mIcon = bitmap;
            return this;
        }

        public Builder setIconUri(Uri uri) {
            this.mIconUri = uri;
            return this;
        }

        public Builder setMediaId(String str) {
            this.mMediaId = str;
            return this;
        }

        public Builder setMediaUri(Uri uri) {
            this.mMediaUri = uri;
            return this;
        }

        public Builder setSubtitle(CharSequence charSequence) {
            this.mSubtitle = charSequence;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            this.mTitle = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.mMediaId = str;
        this.mTitle = charSequence;
        this.mSubtitle = charSequence2;
        this.mDescription = charSequence3;
        this.mIcon = bitmap;
        this.mIconUri = uri;
        this.mExtras = bundle;
        this.mMediaUri = uri2;
    }

    public static MediaDescriptionCompat fromMediaDescription(Object obj) {
        MediaDescriptionCompat mediaDescriptionCompat = null;
        if (obj != null) {
            Builder builder = new Builder();
            MediaDescription mediaDescription = (MediaDescription) obj;
            builder.setMediaId(Api21Impl.getMediaId(mediaDescription));
            builder.setTitle(Api21Impl.getTitle(mediaDescription));
            builder.setSubtitle(Api21Impl.getSubtitle(mediaDescription));
            builder.setDescription(Api21Impl.getDescription(mediaDescription));
            builder.setIconBitmap(Api21Impl.getIconBitmap(mediaDescription));
            builder.setIconUri(Api21Impl.getIconUri(mediaDescription));
            Bundle extras = Api21Impl.getExtras(mediaDescription);
            Bundle bundle = extras;
            if (extras != null) {
                bundle = MediaSessionCompat.unparcelWithClassLoader(extras);
            }
            Uri uri = bundle != null ? (Uri) bundle.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
            if (uri != null) {
                if (bundle.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundle.size() == 2) {
                    bundle = null;
                } else {
                    bundle.remove("android.support.v4.media.description.MEDIA_URI");
                    bundle.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                }
            }
            builder.setExtras(bundle);
            if (uri != null) {
                builder.setMediaUri(uri);
            } else {
                builder.setMediaUri(Api23Impl.getMediaUri(mediaDescription));
            }
            mediaDescriptionCompat = builder.build();
            mediaDescriptionCompat.mDescriptionFwk = mediaDescription;
        }
        return mediaDescriptionCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Object getMediaDescription() {
        MediaDescription mediaDescription = this.mDescriptionFwk;
        MediaDescription mediaDescription2 = mediaDescription;
        if (mediaDescription == null) {
            MediaDescription.Builder createBuilder = Api21Impl.createBuilder();
            Api21Impl.setMediaId(createBuilder, this.mMediaId);
            Api21Impl.setTitle(createBuilder, this.mTitle);
            Api21Impl.setSubtitle(createBuilder, this.mSubtitle);
            Api21Impl.setDescription(createBuilder, this.mDescription);
            Api21Impl.setIconBitmap(createBuilder, this.mIcon);
            Api21Impl.setIconUri(createBuilder, this.mIconUri);
            Api21Impl.setExtras(createBuilder, this.mExtras);
            Api23Impl.setMediaUri(createBuilder, this.mMediaUri);
            mediaDescription2 = Api21Impl.build(createBuilder);
            this.mDescriptionFwk = mediaDescription2;
        }
        return mediaDescription2;
    }

    public String toString() {
        return ((Object) this.mTitle) + ", " + ((Object) this.mSubtitle) + ", " + ((Object) this.mDescription);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((MediaDescription) getMediaDescription()).writeToParcel(parcel, i);
    }
}

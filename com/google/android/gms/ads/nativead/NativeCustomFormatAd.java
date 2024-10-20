package com.google.android.gms.ads.nativead;

import android.view.View;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.List;

/* loaded from: NativeCustomFormatAd.class */
public interface NativeCustomFormatAd {
    public static final String ASSET_NAME_VIDEO = "_videoMediaView";

    /* loaded from: NativeCustomFormatAd$DisplayOpenMeasurement.class */
    public interface DisplayOpenMeasurement {
        void setView(View view);

        boolean start();
    }

    /* loaded from: NativeCustomFormatAd$OnCustomClickListener.class */
    public interface OnCustomClickListener {
        void onCustomClick(NativeCustomFormatAd nativeCustomFormatAd, String str);
    }

    /* loaded from: NativeCustomFormatAd$OnCustomFormatAdLoadedListener.class */
    public interface OnCustomFormatAdLoadedListener {
        void onCustomFormatAdLoaded(NativeCustomFormatAd nativeCustomFormatAd);
    }

    void destroy();

    List<String> getAvailableAssetNames();

    String getCustomFormatId();

    DisplayOpenMeasurement getDisplayOpenMeasurement();

    NativeAd.Image getImage(String str);

    MediaContent getMediaContent();

    CharSequence getText(String str);

    void performClick(String str);

    void recordImpression();
}

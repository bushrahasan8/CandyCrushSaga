package com.unity3d.scar.adapter.common;

import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;

/* loaded from: GMAAdsError.class */
public class GMAAdsError extends WebViewAdsError {
    public GMAAdsError(GMAEvent gMAEvent, String str, Object... objArr) {
        super(gMAEvent, str, objArr);
    }

    public GMAAdsError(GMAEvent gMAEvent, Object... objArr) {
        super(gMAEvent, null, objArr);
    }

    public static GMAAdsError AdNotLoadedError(ScarAdMetadata scarAdMetadata) {
        String format = String.format("Cannot show ad that is not loaded for placement %s", scarAdMetadata.getPlacementId());
        return new GMAAdsError(GMAEvent.AD_NOT_LOADED_ERROR, format, scarAdMetadata.getPlacementId(), scarAdMetadata.getQueryId(), format);
    }

    public static GMAAdsError AdapterCreationError(String str) {
        return new GMAAdsError(GMAEvent.SCAR_UNSUPPORTED, str, new Object[0]);
    }

    public static GMAAdsError InternalLoadError(ScarAdMetadata scarAdMetadata, String str) {
        return new GMAAdsError(GMAEvent.INTERNAL_LOAD_ERROR, str, scarAdMetadata.getPlacementId(), scarAdMetadata.getQueryId(), str);
    }

    public static GMAAdsError InternalShowError(ScarAdMetadata scarAdMetadata, String str) {
        return new GMAAdsError(GMAEvent.INTERNAL_SHOW_ERROR, str, scarAdMetadata.getPlacementId(), scarAdMetadata.getQueryId(), str);
    }

    public static GMAAdsError InternalSignalsError(String str) {
        return new GMAAdsError(GMAEvent.INTERNAL_SIGNALS_ERROR, str, str);
    }

    public static GMAAdsError NoAdsError(String str, String str2, String str3) {
        return new GMAAdsError(GMAEvent.NO_AD_ERROR, str3, str, str2, str3);
    }

    public static GMAAdsError QueryNotFoundError(ScarAdMetadata scarAdMetadata) {
        String format = String.format("Missing queryInfoMetadata for ad %s", scarAdMetadata.getPlacementId());
        return new GMAAdsError(GMAEvent.QUERY_NOT_FOUND_ERROR, format, scarAdMetadata.getPlacementId(), scarAdMetadata.getQueryId(), format);
    }

    @Override // com.unity3d.scar.adapter.common.WebViewAdsError
    public String getDomain() {
        return "GMA";
    }
}

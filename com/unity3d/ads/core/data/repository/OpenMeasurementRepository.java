package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import kotlin.coroutines.Continuation;

/* loaded from: OpenMeasurementRepository.class */
public interface OpenMeasurementRepository {
    Object activateOM(Context context, Continuation<? super OMResult> continuation);

    Object finishSession(ByteString byteString, Continuation<? super OMResult> continuation);

    OMData getOmData();

    boolean hasSessionFinished(ByteString byteString);

    Object impressionOccurred(ByteString byteString, boolean z, Continuation<? super OMResult> continuation);

    boolean isOMActive();

    void setOMActive(boolean z);

    Object startSession(ByteString byteString, WebView webView, OmidOptions omidOptions, Continuation<? super OMResult> continuation);
}

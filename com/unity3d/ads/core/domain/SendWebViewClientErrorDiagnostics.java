package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.model.WebViewClientError;
import java.util.List;

/* loaded from: SendWebViewClientErrorDiagnostics.class */
public interface SendWebViewClientErrorDiagnostics {
    void invoke(List<WebViewClientError> list);
}

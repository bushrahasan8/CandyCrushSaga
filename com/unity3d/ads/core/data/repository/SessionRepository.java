package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.InitializationState;
import gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlags;
import gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfiguration;
import gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;

/* loaded from: SessionRepository.class */
public interface SessionRepository {
    NativeConfigurationOuterClass$FeatureFlags getFeatureFlags();

    String getGameId();

    Object getGatewayCache(Continuation<? super ByteString> continuation);

    ByteString getGatewayState();

    String getGatewayUrl();

    int getHeaderBiddingTokenCounter();

    InitializationState getInitializationState();

    NativeConfigurationOuterClass$NativeConfiguration getNativeConfiguration();

    Flow getObserveInitializationState();

    SharedFlow getOnChange();

    Object getPrivacy(Continuation<? super ByteString> continuation);

    Object getPrivacyFsm(Continuation<? super ByteString> continuation);

    SessionCountersOuterClass$SessionCounters getSessionCounters();

    ByteString getSessionId();

    ByteString getSessionToken();

    boolean getShouldInitialize();

    void incrementBannerImpressionCount();

    void incrementBannerLoadRequestAdmCount();

    void incrementBannerLoadRequestCount();

    void incrementLoadRequestAdmCount();

    void incrementLoadRequestCount();

    boolean isDiagnosticsEnabled();

    boolean isOmEnabled();

    boolean isSdkInitialized();

    boolean isTestModeEnabled();

    Object persistNativeConfiguration(Continuation<? super Unit> continuation);

    void setGameId(String str);

    Object setGatewayCache(ByteString byteString, Continuation<? super Unit> continuation);

    void setGatewayState(ByteString byteString);

    void setGatewayUrl(String str);

    void setInitializationState(InitializationState initializationState);

    void setNativeConfiguration(NativeConfigurationOuterClass$NativeConfiguration nativeConfigurationOuterClass$NativeConfiguration);

    Object setPrivacy(ByteString byteString, Continuation<? super Unit> continuation);

    Object setPrivacyFsm(ByteString byteString, Continuation<? super Unit> continuation);

    void setSessionCounters(SessionCountersOuterClass$SessionCounters sessionCountersOuterClass$SessionCounters);

    void setSessionToken(ByteString byteString);

    void setShouldInitialize(boolean z);
}

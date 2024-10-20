package com.unity3d.services.core.di;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.adplayer.GetAdAssetLoader;
import com.unity3d.ads.adplayer.GetAdAssetLoaderKt;
import com.unity3d.ads.adplayer.GetWebViewAssetLoaderKt;
import com.unity3d.ads.adplayer.GetWebViewCacheAssetLoader;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.data.datasource.AnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLocalCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidMediationDataSource;
import com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStoreDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.FetchGLInfoDataMigration;
import com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StoreDataSource;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.manager.AndroidOmidManager;
import com.unity3d.ads.core.data.manager.AndroidSDKPropertiesManager;
import com.unity3d.ads.core.data.manager.AndroidStorageManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.AndroidAdRepository;
import com.unity3d.ads.core.data.repository.AndroidCacheRepository;
import com.unity3d.ads.core.data.repository.AndroidCampaignRepository;
import com.unity3d.ads.core.data.repository.AndroidDeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.AndroidLegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidMediationRepository;
import com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.AndroidSessionRepository;
import com.unity3d.ads.core.data.repository.AndroidTransactionEventRepository;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.AndroidBoldExperimentHandler;
import com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.AndroidGenerateByteStringId;
import com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase;
import com.unity3d.ads.core.domain.AndroidHandleOpenUrl;
import com.unity3d.ads.core.domain.AndroidLoad;
import com.unity3d.ads.core.domain.AndroidRefresh;
import com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent;
import com.unity3d.ads.core.domain.AndroidSendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.AndroidShow;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.BoldExperimentHandler;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.ClearCache;
import com.unity3d.ads.core.domain.CommonAwaitInitialization;
import com.unity3d.ads.core.domain.CommonCacheFile;
import com.unity3d.ads.core.domain.CommonClearCache;
import com.unity3d.ads.core.domain.CommonGetAdObject;
import com.unity3d.ads.core.domain.CommonGetAdPlayer;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonGetInitializationState;
import com.unity3d.ads.core.domain.CommonGetIsFileCache;
import com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonSetInitializationState;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAdPlayer;
import com.unity3d.ads.core.domain.GetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.GetAdRequest;
import com.unity3d.ads.core.domain.GetAdRequestPolicy;
import com.unity3d.ads.core.domain.GetAndroidAdDataRefreshRequest;
import com.unity3d.ads.core.domain.GetAndroidAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.GetAndroidAdPlayerContext;
import com.unity3d.ads.core.domain.GetAndroidAdRequest;
import com.unity3d.ads.core.domain.GetAndroidClientInfo;
import com.unity3d.ads.core.domain.GetAndroidInitializationCompletedRequest;
import com.unity3d.ads.core.domain.GetAndroidInitializationRequest;
import com.unity3d.ads.core.domain.GetAndroidLimitedSessionToken;
import com.unity3d.ads.core.domain.GetAndroidOpenGLRendererInfo;
import com.unity3d.ads.core.domain.GetAndroidSharedDataTimestamps;
import com.unity3d.ads.core.domain.GetAndroidUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.GetAndroidUniversalRequestSharedData;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.GetClientInfo;
import com.unity3d.ads.core.domain.GetCommonWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitRequestPolicy;
import com.unity3d.ads.core.domain.GetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.GetInitializationRequest;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.ads.core.domain.GetLimitedSessionToken;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.GetOperativeEventRequestPolicy;
import com.unity3d.ads.core.domain.GetOtherRequestPolicy;
import com.unity3d.ads.core.domain.GetPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.GetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.GetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.HandleAndroidGatewayInitializationResponse;
import com.unity3d.ads.core.domain.HandleAndroidGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HandleGatewayAdResponse;
import com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse;
import com.unity3d.ads.core.domain.HandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.InitializeAndroidBoldSDK;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.Load;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.SetInitializationState;
import com.unity3d.ads.core.domain.Show;
import com.unity3d.ads.core.domain.TriggerAndroidInitializationCompletedRequest;
import com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.TriggerInitializeListener;
import com.unity3d.ads.core.domain.events.DiagnosticEventObserver;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.events.GetAndroidTransactionData;
import com.unity3d.ads.core.domain.events.GetCommonTransactionRequest;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.events.GetOperativeEventRequest;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.core.domain.events.HandleGatewayAndroidEventResponse;
import com.unity3d.ads.core.domain.events.HandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.OperativeEventObserver;
import com.unity3d.ads.core.domain.events.TransactionEventObserver;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.domain.om.AndroidOmFinishSession;
import com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.AndroidOmStartSession;
import com.unity3d.ads.core.domain.om.CommonGetOmData;
import com.unity3d.ads.core.domain.om.CommonIsOMActivated;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.InitializeOMAndroidSDK;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.privacy.DeveloperConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.LegacyUserConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier;
import com.unity3d.ads.core.utils.CommonCoroutineTimer;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.services.SDKErrorHandler;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeContentObserver;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.domain.task.InitializeSDK;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.domain.task.InitializeStateError;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.StoreWebViewEventSender;
import com.unity3d.services.store.core.GatewayStoreExceptionHandler;
import com.unity3d.services.store.core.StoreEventListenerFactory;
import com.unity3d.services.store.core.StoreExceptionHandler;
import gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfiguration;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* loaded from: ServiceProvider.class */
public final class ServiceProvider implements IServiceProvider {
    public static final String CDN_CREATIVES_HOST = "cdn-creatives-cf-prd.acquire.unity3dusercontent.com";
    public static final int CDN_CREATIVES_PORT = 443;
    public static final String DATA_STORE_GATEWAY_CACHE = "gateway_cache.pb";
    public static final String DATA_STORE_GL_INFO = "glinfo.pb";
    public static final String DATA_STORE_IAP_TRANSACTION = "iap_transaction.pb";
    public static final String DATA_STORE_NATIVE_CONFIG = "native_configuration.pb";
    public static final String DATA_STORE_PRIVACY = "privacy.pb";
    public static final String DATA_STORE_PRIVACY_FSM = "privacy_fsm.pb";
    public static final String DATA_STORE_UNIVERSAL_REQUEST = "universal_request.pb";
    public static final String DATA_STORE_WEBVIEW_CONFIG = "webview_config.pb";
    public static final String DEFAULT_DISPATCHER = "default_dispatcher";
    public static final String DEV_CONSENT_PRIVACY_RULES = "dev_consent_privacy_rules";
    public static final String GATEWAY_HOST = "gateway.unityads.unity3d.com";
    public static final int GATEWAY_PORT = 443;
    public static final long HTTP_CACHE_DISK_SIZE = 5242880;
    public static final long HTTP_CLIENT_FETCH_TIMEOUT = 500;
    public static final ServiceProvider INSTANCE;
    public static final String IO_DISPATCHER = "io_dispatcher";
    public static final String LEGACY_PRIVACY_RULES = "legacy_privacy_rules";
    public static final String MAIN_DISPATCHER = "main_dispatcher";
    public static final String NAMED_AD_REQ = "ad_req";
    public static final String NAMED_GET_TOKEN_SCOPE = "get_token_scope";
    public static final String NAMED_INIT_REQ = "init_req";
    public static final String NAMED_INIT_SCOPE = "init_scope";
    public static final String NAMED_LOAD_SCOPE = "load_scope";
    public static final String NAMED_LOCAL = "local";
    public static final String NAMED_OMID_SCOPE = "omid_scope";
    public static final String NAMED_OPERATIVE_REQ = "op_event_req";
    public static final String NAMED_OTHER_REQ = "other_req";
    public static final String NAMED_PUBLIC_JOB = "public_job";
    public static final String NAMED_REMOTE = "remote";
    public static final String NAMED_SDK = "sdk";
    public static final String NAMED_SHOW_SCOPE = "show_scope";
    public static final String NAMED_TRANSACTION_SCOPE = "transaction_scope";
    public static final String PREF_GL_INFO = "glinfo";
    private static final IServicesRegistry serviceRegistry;

    static {
        ServiceProvider serviceProvider = new ServiceProvider();
        INSTANCE = serviceProvider;
        serviceRegistry = serviceProvider.initialize();
    }

    private ServiceProvider() {
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    public IServicesRegistry getRegistry() {
        return serviceRegistry;
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    public IServicesRegistry initialize() {
        return ServicesRegistryKt.registry(new Function1() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ServicesRegistry) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(ServicesRegistry registry) {
                Intrinsics.checkNotNullParameter(registry, "$this$registry");
                UnityAdsModule unityAdsModule = new UnityAdsModule();
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.1
                    @Override // kotlin.jvm.functions.Function0
                    public final Context invoke() {
                        return ClientProperties.getApplicationContext();
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class)), LazyKt.lazy(new Function0(unityAdsModule) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.2
                    final UnityAdsModule $moduleInstance;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final CoroutineDispatcher invoke() {
                        return this.$moduleInstance.mainDispatcher();
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class)), LazyKt.lazy(new Function0(unityAdsModule) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.3
                    final UnityAdsModule $moduleInstance;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final CoroutineDispatcher invoke() {
                        return this.$moduleInstance.defaultDispatcher();
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class)), LazyKt.lazy(new Function0(unityAdsModule) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.4
                    final UnityAdsModule $moduleInstance;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final CoroutineDispatcher invoke() {
                        return this.$moduleInstance.ioDispatcher();
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class)), LazyKt.lazy(new Function0(unityAdsModule) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.5
                    final UnityAdsModule $moduleInstance;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final ISDKDispatchers invoke() {
                        return this.$moduleInstance.sdkDispatchers();
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SDKMetricsSender.class)), LazyKt.lazy(new Function0(unityAdsModule) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.6
                    final UnityAdsModule $moduleInstance;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final SDKMetricsSender invoke() {
                        return this.$moduleInstance.sdkMetrics();
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.7
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final CoroutineScope invoke() {
                        return this.$moduleInstance.initCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.8
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final CoroutineScope invoke() {
                        return this.$moduleInstance.loadCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_SHOW_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.9
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final CoroutineScope invoke() {
                        return this.$moduleInstance.showCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.10
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final CoroutineScope invoke() {
                        return this.$moduleInstance.transactionCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_GET_TOKEN_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.11
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final CoroutineScope invoke() {
                        return this.$moduleInstance.getTokenCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_OMID_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.12
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final CoroutineScope invoke() {
                        return this.$moduleInstance.omidCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class)), ServiceFactoryKt.factoryOf(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.13
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Job invoke() {
                        return this.$moduleInstance.publicApiJob((DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DiagnosticEventRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, Reflection.getOrCreateKotlinClass(DataStore.class)), LazyKt.lazy(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.14
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final DataStore invoke() {
                        return this.$moduleInstance.gatewayDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, Reflection.getOrCreateKotlinClass(DataStore.class)), LazyKt.lazy(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.15
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final DataStore invoke() {
                        return this.$moduleInstance.privacyDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class)), LazyKt.lazy(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.16
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final ByteStringDataSource invoke() {
                        return this.$moduleInstance.privacyDataStore((DataStore) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, Reflection.getOrCreateKotlinClass(DataStore.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, Reflection.getOrCreateKotlinClass(DataStore.class)), LazyKt.lazy(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.17
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final DataStore invoke() {
                        return this.$moduleInstance.privacyFsmDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class)), LazyKt.lazy(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.18
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final ByteStringDataSource invoke() {
                        return this.$moduleInstance.privacyFsmDataStore((DataStore) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, Reflection.getOrCreateKotlinClass(DataStore.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, Reflection.getOrCreateKotlinClass(DataStore.class)), LazyKt.lazy(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.19
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final DataStore invoke() {
                        return this.$moduleInstance.nativeConfigurationDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class)), LazyKt.lazy(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.20
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final ByteStringDataSource invoke() {
                        return this.$moduleInstance.nativeConfigurationDataStore((DataStore) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, Reflection.getOrCreateKotlinClass(DataStore.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, Reflection.getOrCreateKotlinClass(DataStore.class)), LazyKt.lazy(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.21
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final DataStore invoke() {
                        return this.$moduleInstance.glInfoDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (DataMigration) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.PREF_GL_INFO, Reflection.getOrCreateKotlinClass(DataMigration.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class)), LazyKt.lazy(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.22
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final ByteStringDataSource invoke() {
                        return this.$moduleInstance.glInfoDataStore((DataStore) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, Reflection.getOrCreateKotlinClass(DataStore.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST, Reflection.getOrCreateKotlinClass(DataStore.class)), LazyKt.lazy(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.23
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final DataStore invoke() {
                        return this.$moduleInstance.universalRequestDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, Reflection.getOrCreateKotlinClass(DataStore.class)), LazyKt.lazy(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.24
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final DataStore invoke() {
                        return this.$moduleInstance.iapTransactionDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class)), LazyKt.lazy(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.25
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final ByteStringDataSource invoke() {
                        return this.$moduleInstance.iapTransactionDataStore((DataStore) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, Reflection.getOrCreateKotlinClass(DataStore.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, Reflection.getOrCreateKotlinClass(DataStore.class)), LazyKt.lazy(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.26
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final DataStore invoke() {
                        return this.$moduleInstance.webViewConfigurationDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AsyncTokenStorage.class)), LazyKt.lazy(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.27
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final AsyncTokenStorage invoke() {
                        return this.$moduleInstance.asyncTokenStorage((TokenStorage) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TokenStorage.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SDKMetricsSender.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(VolumeChangeMonitor.class)), LazyKt.lazy(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.28
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final VolumeChangeMonitor invoke() {
                        return this.$moduleInstance.volumeChangeMonitor((VolumeChange) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(VolumeChange.class))));
                    }
                }));
                registry.updateService(new ServiceKey("PUBLIC", Reflection.getOrCreateKotlinClass(JsonStorage.class)), LazyKt.lazy(new Function0(unityAdsModule) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.29
                    final UnityAdsModule $moduleInstance;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final JsonStorage invoke() {
                        return this.$moduleInstance.publicJsonStorage();
                    }
                }));
                registry.updateService(new ServiceKey("PRIVATE", Reflection.getOrCreateKotlinClass(JsonStorage.class)), LazyKt.lazy(new Function0(unityAdsModule) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.30
                    final UnityAdsModule $moduleInstance;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final JsonStorage invoke() {
                        return this.$moduleInstance.privateJsonStorage();
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(NativeConfigurationOuterClass$NativeConfiguration.class)), LazyKt.lazy(new Function0(unityAdsModule) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.31
                    final UnityAdsModule $moduleInstance;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final NativeConfigurationOuterClass$NativeConfiguration invoke() {
                        return this.$moduleInstance.defaultNativeConfiguration();
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class)), LazyKt.lazy(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.32
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final ByteStringDataSource invoke() {
                        return this.$moduleInstance.gatewayCacheDataStore((DataStore) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, Reflection.getOrCreateKotlinClass(DataStore.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MeasurementsService.class)), LazyKt.lazy(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.33
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final MeasurementsService invoke() {
                        return this.$moduleInstance.measurementService((Context) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TopicsService.class)), LazyKt.lazy(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.34
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final TopicsService invoke() {
                        return this.$moduleInstance.topicsService((Context) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HttpClient.class)), LazyKt.lazy(new Function0(unityAdsModule, registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.35
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$moduleInstance = unityAdsModule;
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final HttpClient invoke() {
                        return this.$moduleInstance.provideHttpClient((ConfigFileFromLocalStorage) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ConfigFileFromLocalStorage.class))), (AlternativeFlowReader) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AlternativeFlowReader.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AlternativeFlowReader.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.36
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final AlternativeFlowReader invoke() {
                        return new AlternativeFlowReader((ConfigurationReader) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ConfigurationReader.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GameServerIdReader.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.37
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GameServerIdReader invoke() {
                        return new GameServerIdReader((JsonStorage) this.$this_registry.resolveService(new ServiceKey("PUBLIC", Reflection.getOrCreateKotlinClass(JsonStorage.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(StoreDataSource.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.38
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final StoreDataSource invoke() {
                        return new AndroidStoreDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AnalyticsDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.39
                    @Override // kotlin.jvm.functions.Function0
                    public final AnalyticsDataSource invoke() {
                        return new AndroidAnalyticsDataSource();
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeveloperConsentDataSource.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.40
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final DeveloperConsentDataSource invoke() {
                        return new AndroidDeveloperConsentDataSource((FlattenerRulesUseCase) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, Reflection.getOrCreateKotlinClass(FlattenerRulesUseCase.class))), (JsonStorage) this.$this_registry.resolveService(new ServiceKey("PUBLIC", Reflection.getOrCreateKotlinClass(JsonStorage.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DynamicDeviceInfoDataSource.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.41
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final DynamicDeviceInfoDataSource invoke() {
                        return new AndroidDynamicDeviceInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(LifecycleDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(LegacyUserConsentDataSource.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.42
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final LegacyUserConsentDataSource invoke() {
                        return new AndroidLegacyUserConsentDataSource((FlattenerRulesUseCase) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, Reflection.getOrCreateKotlinClass(FlattenerRulesUseCase.class))), (JsonStorage) this.$this_registry.resolveService(new ServiceKey("PRIVATE", Reflection.getOrCreateKotlinClass(JsonStorage.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(LifecycleDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.43
                    @Override // kotlin.jvm.functions.Function0
                    public final LifecycleDataSource invoke() {
                        return new AndroidLifecycleDataSource();
                    }
                }));
                registry.updateService(new ServiceKey("local", Reflection.getOrCreateKotlinClass(CacheDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.44
                    @Override // kotlin.jvm.functions.Function0
                    public final CacheDataSource invoke() {
                        return new AndroidLocalCacheDataSource();
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MediationDataSource.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.45
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final MediationDataSource invoke() {
                        return new AndroidMediationDataSource((JsonStorage) this.$this_registry.resolveService(new ServiceKey("PUBLIC", Reflection.getOrCreateKotlinClass(JsonStorage.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(PrivacyDeviceInfoDataSource.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.46
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final PrivacyDeviceInfoDataSource invoke() {
                        return new AndroidPrivacyDeviceInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_REMOTE, Reflection.getOrCreateKotlinClass(CacheDataSource.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.47
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final CacheDataSource invoke() {
                        return new AndroidRemoteCacheDataSource((HttpClient) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HttpClient.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(StaticDeviceInfoDataSource.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.48
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final StaticDeviceInfoDataSource invoke() {
                        return new AndroidStaticDeviceInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class))), (AnalyticsDataSource) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AnalyticsDataSource.class))), (StoreDataSource) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(StoreDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.PREF_GL_INFO, Reflection.getOrCreateKotlinClass(DataMigration.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.49
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final DataMigration invoke() {
                        return new FetchGLInfoDataMigration((GetOpenGLRendererInfo) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetOpenGLRendererInfo.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(UniversalRequestDataSource.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.50
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final UniversalRequestDataSource invoke() {
                        return new UniversalRequestDataSource((DataStore) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST, Reflection.getOrCreateKotlinClass(DataStore.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(WebviewConfigurationDataSource.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.51
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final WebviewConfigurationDataSource invoke() {
                        return new WebviewConfigurationDataSource((DataStore) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, Reflection.getOrCreateKotlinClass(DataStore.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OmidManager.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.52
                    @Override // kotlin.jvm.functions.Function0
                    public final OmidManager invoke() {
                        return new AndroidOmidManager();
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SDKPropertiesManager.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.53
                    @Override // kotlin.jvm.functions.Function0
                    public final SDKPropertiesManager invoke() {
                        return new AndroidSDKPropertiesManager();
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(StorageManager.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.54
                    @Override // kotlin.jvm.functions.Function0
                    public final StorageManager invoke() {
                        return new AndroidStorageManager();
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TransactionEventManager.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.55
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final TransactionEventManager invoke() {
                        return new TransactionEventManager((CoroutineScope) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class))), (StoreMonitor) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(StoreMonitor.class))), (GetTransactionData) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetTransactionData.class))), (GetTransactionRequest) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetTransactionRequest.class))), (TransactionEventRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TransactionEventRepository.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdRepository.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.56
                    @Override // kotlin.jvm.functions.Function0
                    public final AdRepository invoke() {
                        return new AndroidAdRepository();
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CacheRepository.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.57
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final CacheRepository invoke() {
                        return new AndroidCacheRepository((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (CacheDataSource) this.$this_registry.resolveService(new ServiceKey("local", Reflection.getOrCreateKotlinClass(CacheDataSource.class))), (CacheDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_REMOTE, Reflection.getOrCreateKotlinClass(CacheDataSource.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CampaignRepository.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.58
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final CampaignRepository invoke() {
                        return new AndroidCampaignRepository((GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetSharedDataTimestamps.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeveloperConsentRepository.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.59
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final DeveloperConsentRepository invoke() {
                        return new AndroidDeveloperConsentRepository((DeveloperConsentDataSource) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeveloperConsentDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.60
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final DeviceInfoRepository invoke() {
                        return new AndroidDeviceInfoRepository((StaticDeviceInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(StaticDeviceInfoDataSource.class))), (DynamicDeviceInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DynamicDeviceInfoDataSource.class))), (PrivacyDeviceInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(PrivacyDeviceInfoDataSource.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DiagnosticEventRepository.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.61
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final DiagnosticEventRepository invoke() {
                        return new AndroidDiagnosticEventRepository((CoroutineTimer) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CoroutineTimer.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(LegacyUserConsentRepository.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.62
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final LegacyUserConsentRepository invoke() {
                        return new AndroidLegacyUserConsentRepository((LegacyUserConsentDataSource) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(LegacyUserConsentDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MediationRepository.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.63
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final MediationRepository invoke() {
                        return new AndroidMediationRepository((MediationDataSource) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MediationDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.64
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final OpenMeasurementRepository invoke() {
                        return new AndroidOpenMeasurementRepository((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (OmidManager) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OmidManager.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.65
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final SessionRepository invoke() {
                        return new AndroidSessionRepository((ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class))), (NativeConfigurationOuterClass$NativeConfiguration) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(NativeConfigurationOuterClass$NativeConfiguration.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TransactionEventRepository.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.66
                    @Override // kotlin.jvm.functions.Function0
                    public final TransactionEventRepository invoke() {
                        return new AndroidTransactionEventRepository();
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OperativeEventRepository.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.67
                    @Override // kotlin.jvm.functions.Function0
                    public final OperativeEventRepository invoke() {
                        return new OperativeEventRepository();
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(BoldExperimentHandler.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.68
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final BoldExperimentHandler invoke() {
                        return new AndroidBoldExperimentHandler((ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ExecuteAdViewerRequest.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.69
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final ExecuteAdViewerRequest invoke() {
                        return new AndroidExecuteAdViewerRequest((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (HttpClient) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HttpClient.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetByteStringId.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.70
                    @Override // kotlin.jvm.functions.Function0
                    public final GetByteStringId invoke() {
                        return new AndroidGenerateByteStringId();
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleOpenUrl.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.71
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final HandleOpenUrl invoke() {
                        return new AndroidHandleOpenUrl((Context) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Refresh.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.72
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Refresh invoke() {
                        return new AndroidRefresh((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (GetAdDataRefreshRequest) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAdDataRefreshRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GatewayClient.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.73
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final SendDiagnosticEvent invoke() {
                        return new AndroidSendDiagnosticEvent((DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DiagnosticEventRepository.class))), (GetDiagnosticEventRequest) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetDiagnosticEventRequest.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendWebViewClientErrorDiagnostics.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.74
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final SendWebViewClientErrorDiagnostics invoke() {
                        return new AndroidSendWebViewClientErrorDiagnostics((SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Show.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.75
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Show invoke() {
                        return new AndroidShow((AdRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdRepository.class))), (GameServerIdReader) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GameServerIdReader.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CacheFile.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.76
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final CacheFile invoke() {
                        return new CommonCacheFile((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CacheRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ClearCache.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.77
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final ClearCache invoke() {
                        return new CommonClearCache((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CacheRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAdObject.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.78
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetAdObject invoke() {
                        return new CommonGetAdObject((AdRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetHeaderBiddingToken.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.79
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetHeaderBiddingToken invoke() {
                        return new CommonGetHeaderBiddingToken((GetByteStringId) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetByteStringId.class))), (GetClientInfo) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetClientInfo.class))), (GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetSharedDataTimestamps.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CampaignRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetInitializationState.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.80
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetInitializationState invoke() {
                        return new CommonGetInitializationState((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetIsFileCache.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.81
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetIsFileCache invoke() {
                        return new CommonGetIsFileCache((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CacheRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SetInitializationState.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.82
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final SetInitializationState invoke() {
                        return new CommonSetInitializationState((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.83
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetRequestPolicy invoke() {
                        return new GetAdRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAdDataRefreshRequest.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.84
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetAdDataRefreshRequest invoke() {
                        return new GetAndroidAdDataRefreshRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CampaignRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAdPlayerConfigRequest.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.85
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetAdPlayerConfigRequest invoke() {
                        return new GetAndroidAdPlayerConfigRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAndroidAdPlayerContext.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.86
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetAndroidAdPlayerContext invoke() {
                        return new GetAndroidAdPlayerContext((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAdRequest.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.87
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetAdRequest invoke() {
                        return new GetAndroidAdRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CampaignRepository.class))), (WebviewConfigurationDataSource) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(WebviewConfigurationDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetClientInfo.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.88
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetClientInfo invoke() {
                        return new GetAndroidClientInfo((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (MediationRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MediationRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetInitializationCompletedRequest.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.89
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetInitializationCompletedRequest invoke() {
                        return new GetAndroidInitializationCompletedRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetInitializationRequest.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.90
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetInitializationRequest invoke() {
                        return new GetAndroidInitializationRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (GetClientInfo) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetClientInfo.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (LegacyUserConsentRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(LegacyUserConsentRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetLimitedSessionToken.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.91
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetLimitedSessionToken invoke() {
                        return new GetAndroidLimitedSessionToken((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (MediationRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MediationRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetOpenGLRendererInfo.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.92
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetOpenGLRendererInfo invoke() {
                        return new GetAndroidOpenGLRendererInfo((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetSharedDataTimestamps.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.93
                    @Override // kotlin.jvm.functions.Function0
                    public final GetSharedDataTimestamps invoke() {
                        return new GetAndroidSharedDataTimestamps();
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.94
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetUniversalRequestForPayLoad invoke() {
                        return new GetAndroidUniversalRequestForPayLoad((GetUniversalRequestSharedData) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestSharedData.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestSharedData.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.95
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetUniversalRequestSharedData invoke() {
                        return new GetAndroidUniversalRequestSharedData((GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetSharedDataTimestamps.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (GetLimitedSessionToken) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetLimitedSessionToken.class))), (DeveloperConsentRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeveloperConsentRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetCachedAsset.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.96
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetCachedAsset invoke() {
                        return new GetCachedAsset((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CacheRepository.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetWebViewBridgeUseCase.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.97
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetWebViewBridgeUseCase invoke() {
                        return new GetCommonWebViewBridgeUseCase((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.98
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetRequestPolicy invoke() {
                        return new GetInitRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetLatestWebViewConfiguration.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.99
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetLatestWebViewConfiguration invoke() {
                        return new GetLatestWebViewConfiguration((WebviewConfigurationDataSource) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(WebviewConfigurationDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_OPERATIVE_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.100
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetRequestPolicy invoke() {
                        return new GetOperativeEventRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.101
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetRequestPolicy invoke() {
                        return new GetOtherRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetPrivacyUpdateRequest.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.102
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetPrivacyUpdateRequest invoke() {
                        return new GetPrivacyUpdateRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleGatewayInitializationResponse.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.103
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final HandleGatewayInitializationResponse invoke() {
                        return new HandleAndroidGatewayInitializationResponse((TransactionEventManager) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TransactionEventManager.class))), (TriggerInitializationCompletedRequest) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TriggerInitializationCompletedRequest.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (CoroutineScope) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleGatewayUniversalResponse.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.104
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final HandleGatewayUniversalResponse invoke() {
                        return new HandleAndroidGatewayUniversalResponse((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeBoldSDK.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.105
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final InitializeBoldSDK invoke() {
                        return new InitializeAndroidBoldSDK((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (InitializeOMSDK) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeOMSDK.class))), (GetInitializationRequest) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetInitializationRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class))), (ClearCache) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ClearCache.class))), (HandleGatewayInitializationResponse) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleGatewayInitializationResponse.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GatewayClient.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (EventObservers) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(EventObservers.class))), (TriggerInitializeListener) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TriggerInitializeListener.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DiagnosticEventRepository.class))), (StorageManager) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(StorageManager.class))), (ConfigurationReader) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ConfigurationReader.class))), (SDKPropertiesManager) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SDKPropertiesManager.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(LegacyShowUseCase.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.106
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final LegacyShowUseCase invoke() {
                        return new LegacyShowUseCase((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (Show) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Show.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (GetOperativeEventApi) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetOperativeEventApi.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetInitializationState.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendPrivacyUpdateRequest.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.107
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final SendPrivacyUpdateRequest invoke() {
                        return new SendPrivacyUpdateRequest((GetPrivacyUpdateRequest) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetPrivacyUpdateRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GatewayClient.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TriggerInitializationCompletedRequest.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.108
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final TriggerInitializationCompletedRequest invoke() {
                        return new TriggerAndroidInitializationCompletedRequest((GetInitializationCompletedRequest) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetInitializationCompletedRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GatewayClient.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TriggerInitializeListener.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.109
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final TriggerInitializeListener invoke() {
                        return new TriggerInitializeListener((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DiagnosticEventObserver.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.110
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final DiagnosticEventObserver invoke() {
                        return new DiagnosticEventObserver((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (GetDiagnosticEventBatchRequest) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetDiagnosticEventBatchRequest.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DiagnosticEventRepository.class))), (UniversalRequestDataSource) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(UniversalRequestDataSource.class))), (BackgroundWorker) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(BackgroundWorker.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(EventObservers.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.111
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final EventObservers invoke() {
                        return new EventObservers((OperativeEventObserver) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OperativeEventObserver.class))), (DiagnosticEventObserver) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DiagnosticEventObserver.class))), (TransactionEventObserver) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TransactionEventObserver.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetTransactionData.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.112
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetTransactionData invoke() {
                        return new GetAndroidTransactionData((GetByteStringId) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetByteStringId.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetTransactionRequest.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.113
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetTransactionRequest invoke() {
                        return new GetCommonTransactionRequest((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetDiagnosticEventBatchRequest.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.114
                    @Override // kotlin.jvm.functions.Function0
                    public final GetDiagnosticEventBatchRequest invoke() {
                        return new GetDiagnosticEventBatchRequest();
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetDiagnosticEventRequest.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.115
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetDiagnosticEventRequest invoke() {
                        return new GetDiagnosticEventRequest((GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetSharedDataTimestamps.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetOperativeEventApi.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.116
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetOperativeEventApi invoke() {
                        return new GetOperativeEventApi((OperativeEventRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OperativeEventRepository.class))), (GetOperativeEventRequest) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetOperativeEventRequest.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetOperativeEventRequest.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.117
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetOperativeEventRequest invoke() {
                        return new GetOperativeEventRequest((GetByteStringId) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetByteStringId.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CampaignRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleGatewayEventResponse.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.118
                    @Override // kotlin.jvm.functions.Function0
                    public final HandleGatewayEventResponse invoke() {
                        return new HandleGatewayAndroidEventResponse();
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OperativeEventObserver.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.119
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final OperativeEventObserver invoke() {
                        return new OperativeEventObserver((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (OperativeEventRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OperativeEventRepository.class))), (UniversalRequestDataSource) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(UniversalRequestDataSource.class))), (BackgroundWorker) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(BackgroundWorker.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TransactionEventObserver.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.120
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final TransactionEventObserver invoke() {
                        return new TransactionEventObserver((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (TransactionEventRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TransactionEventRepository.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GatewayClient.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(UniversalRequestEventSender.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.121
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final UniversalRequestEventSender invoke() {
                        return new UniversalRequestEventSender((GatewayClient) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GatewayClient.class))), (HandleGatewayEventResponse) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleGatewayEventResponse.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OmFinishSession.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.122
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final OmFinishSession invoke() {
                        return new AndroidOmFinishSession((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OmImpressionOccurred.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.123
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final OmImpressionOccurred invoke() {
                        return new AndroidOmImpressionOccurred((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidOmInteraction.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.124
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final AndroidOmInteraction invoke() {
                        return new AndroidOmStartSession((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetOmData.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.125
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetOmData invoke() {
                        return new CommonGetOmData((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(IsOMActivated.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.126
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final IsOMActivated invoke() {
                        return new CommonIsOMActivated((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeOMSDK.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.127
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final InitializeOMSDK invoke() {
                        return new InitializeOMAndroidSDK((Context) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, Reflection.getOrCreateKotlinClass(FlattenerRulesUseCase.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.128
                    @Override // kotlin.jvm.functions.Function0
                    public final FlattenerRulesUseCase invoke() {
                        return new DeveloperConsentFlattenerRulesUseCase();
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, Reflection.getOrCreateKotlinClass(FlattenerRulesUseCase.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.129
                    @Override // kotlin.jvm.functions.Function0
                    public final FlattenerRulesUseCase invoke() {
                        return new LegacyUserConsentFlattenerRulesUseCase();
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(BackgroundWorker.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.130
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final BackgroundWorker invoke() {
                        return new BackgroundWorker((Context) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DiagnosticEventRequestWorkModifier.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.131
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final DiagnosticEventRequestWorkModifier invoke() {
                        return new DiagnosticEventRequestWorkModifier((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(LifecycleDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GatewayClient.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.132
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GatewayClient invoke() {
                        return new CommonGatewayClient((HttpClient) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HttpClient.class))), (HandleGatewayUniversalResponse) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleGatewayUniversalResponse.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_SDK, Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.133
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final CoroutineExceptionHandler invoke() {
                        return new SDKErrorHandler((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (AlternativeFlowReader) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AlternativeFlowReader.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SDKMetricsSender.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TokenStorage.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.134
                    @Override // kotlin.jvm.functions.Function0
                    public final TokenStorage invoke() {
                        return new InMemoryTokenStorage();
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(VolumeChange.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.135
                    @Override // kotlin.jvm.functions.Function0
                    public final VolumeChange invoke() {
                        return new VolumeChangeContentObserver();
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ConfigFileFromLocalStorage.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.136
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final ConfigFileFromLocalStorage invoke() {
                        return new ConfigFileFromLocalStorage((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeSDK.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.137
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final InitializeSDK invoke() {
                        return new InitializeSDK((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (ConfigFileFromLocalStorage) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ConfigFileFromLocalStorage.class))), (InitializeStateReset) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateReset.class))), (InitializeStateError) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateError.class))), (InitializeStateConfig) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateConfig.class))), (InitializeStateCreate) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateCreate.class))), (InitializeStateLoadCache) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateLoadCache.class))), (InitializeStateLoadWeb) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateLoadWeb.class))), (InitializeStateComplete) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateComplete.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateComplete.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.138
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final InitializeStateComplete invoke() {
                        return new InitializeStateComplete((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateConfig.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.139
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final InitializeStateConfig invoke() {
                        return new InitializeStateConfig((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (InitializeStateConfigWithLoader) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateConfigWithLoader.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateConfigWithLoader.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.140
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final InitializeStateConfigWithLoader invoke() {
                        return new InitializeStateConfigWithLoader((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (InitializeStateNetworkError) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateNetworkError.class))), (TokenStorage) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TokenStorage.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SDKMetricsSender.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateCreate.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.141
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final InitializeStateCreate invoke() {
                        return new InitializeStateCreate((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateError.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.142
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final InitializeStateError invoke() {
                        return new InitializeStateError((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateLoadCache.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.143
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final InitializeStateLoadCache invoke() {
                        return new InitializeStateLoadCache((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateLoadWeb.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.144
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final InitializeStateLoadWeb invoke() {
                        return new InitializeStateLoadWeb((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (InitializeStateNetworkError) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateNetworkError.class))), (HttpClient) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HttpClient.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateReset.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.145
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final InitializeStateReset invoke() {
                        return new InitializeStateReset((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(StoreMonitor.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.146
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final StoreMonitor invoke() {
                        return new StoreMonitor((StoreExceptionHandler) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(StoreExceptionHandler.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(StoreWebViewEventSender.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.147
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final StoreWebViewEventSender invoke() {
                        return new StoreWebViewEventSender((IEventSender) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(IEventSender.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(StoreExceptionHandler.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.148
                    @Override // kotlin.jvm.functions.Function0
                    public final StoreExceptionHandler invoke() {
                        return new GatewayStoreExceptionHandler();
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(StoreEventListenerFactory.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.149
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final StoreEventListenerFactory invoke() {
                        return new StoreEventListenerFactory((StoreWebViewEventSender) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(StoreWebViewEventSender.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ConfigurationReader.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.150
                    @Override // kotlin.jvm.functions.Function0
                    public final ConfigurationReader invoke() {
                        return new ConfigurationReader();
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdPlayerScope.class)), ServiceFactoryKt.factoryOf(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.151
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final AdPlayerScope invoke() {
                        return new AdPlayerScope((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidWebViewClient.class)), ServiceFactoryKt.factoryOf(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.152
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final AndroidWebViewClient invoke() {
                        return new AndroidWebViewClient((GetWebViewCacheAssetLoader) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetWebViewCacheAssetLoader.class))), (GetAdAssetLoader) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAdAssetLoader.class))), (GetCachedAsset) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetCachedAsset.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidGetWebViewContainerUseCase.class)), ServiceFactoryKt.factoryOf(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.153
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final AndroidGetWebViewContainerUseCase invoke() {
                        return new AndroidGetWebViewContainerUseCase((Context) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (AndroidWebViewClient) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidWebViewClient.class))), (SendWebViewClientErrorDiagnostics) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendWebViewClientErrorDiagnostics.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Load.class)), ServiceFactoryKt.factoryOf(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.154
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Load invoke() {
                        return new AndroidLoad((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (GetAdRequest) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAdRequest.class))), (GetAdPlayerConfigRequest) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAdPlayerConfigRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class))), (HandleGatewayAdResponse) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleGatewayAdResponse.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GatewayClient.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AwaitInitialization.class)), ServiceFactoryKt.factoryOf(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.155
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final AwaitInitialization invoke() {
                        return new CommonAwaitInitialization((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAsyncHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.156
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetAsyncHeaderBiddingToken invoke() {
                        return new CommonInitAwaitingGetHeaderBiddingToken((GetHeaderBiddingToken) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetHeaderBiddingToken.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetInitializationState.class))), (AwaitInitialization) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AwaitInitialization.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAdPlayer.class)), ServiceFactoryKt.factoryOf(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.157
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetAdPlayer invoke() {
                        return new CommonGetAdPlayer((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (ExecuteAdViewerRequest) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ExecuteAdViewerRequest.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (CoroutineScope) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdPlayerScope.class))), (OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleGatewayAdResponse.class)), ServiceFactoryKt.factoryOf(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.158
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final HandleGatewayAdResponse invoke() {
                        return new HandleGatewayAndroidAdResponse((AdRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdRepository.class))), (AndroidGetWebViewContainerUseCase) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidGetWebViewContainerUseCase.class))), (GetWebViewBridgeUseCase) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetWebViewBridgeUseCase.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (HandleInvocationsFromAdViewer) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleInvocationsFromAdViewer.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CampaignRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (GetOperativeEventApi) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetOperativeEventApi.class))), (GetLatestWebViewConfiguration) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetLatestWebViewConfiguration.class))), (AdPlayerScope) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdPlayerScope.class))), (GetAdPlayer) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAdPlayer.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleInvocationsFromAdViewer.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.159
                    @Override // kotlin.jvm.functions.Function0
                    public final HandleInvocationsFromAdViewer invoke() {
                        return new HandleInvocationsFromAdViewer();
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(LegacyLoadUseCase.class)), ServiceFactoryKt.factoryOf(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.160
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final LegacyLoadUseCase invoke() {
                        return new LegacyLoadUseCase((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (Load) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Load.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetInitializationState.class))), (AwaitInitialization) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AwaitInitialization.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateNetworkError.class)), ServiceFactoryKt.factoryOf(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.161
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final InitializeStateNetworkError invoke() {
                        return new InitializeStateNetworkError((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAdAssetLoader.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.162
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetAdAssetLoader invoke() {
                        return GetAdAssetLoaderKt.provideGetAdCacheAssetLoader((Context) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetWebViewCacheAssetLoader.class)), LazyKt.lazy(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.163
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final GetWebViewCacheAssetLoader invoke() {
                        return GetWebViewAssetLoaderKt.provideGetWebViewCacheAssetLoader((Context) this.$this_registry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CoroutineTimer.class)), ServiceFactoryKt.factoryOf(new Function0(registry) { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.164
                    final ServicesRegistry $this_registry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.$this_registry = registry;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final CoroutineTimer invoke() {
                        return new CommonCoroutineTimer((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(IEventSender.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.165
                    @Override // kotlin.jvm.functions.Function0
                    public final IEventSender invoke() {
                        return SharedInstances.INSTANCE.getWebViewEventSender();
                    }
                }));
            }
        });
    }
}

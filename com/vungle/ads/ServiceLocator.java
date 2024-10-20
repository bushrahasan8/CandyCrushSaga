package com.vungle.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.bidding.BidTokenEncoder;
import com.vungle.ads.internal.downloader.AssetDownloader;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.SDKExecutors;
import com.vungle.ads.internal.locale.LocaleInfo;
import com.vungle.ads.internal.locale.SystemLocaleInfo;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.omsdk.OMTracker;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.platform.AndroidPlatform;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.task.JobCreator;
import com.vungle.ads.internal.task.JobRunner;
import com.vungle.ads.internal.task.JobRunnerThreadPriorityHelper;
import com.vungle.ads.internal.task.VungleJobCreator;
import com.vungle.ads.internal.task.VungleJobRunner;
import com.vungle.ads.internal.util.ConcurrencyTimeoutProvider;
import com.vungle.ads.internal.util.PathProvider;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: ServiceLocator.class */
public final class ServiceLocator {
    public static final Companion Companion = new Companion(null);

    @SuppressLint({"StaticFieldLeak"})
    private static volatile ServiceLocator INSTANCE;
    private final Map<Class<?>, Object> cache;
    private final Map<Class<?>, Creator> creators;
    private final Context ctx;

    @Keep
    /* loaded from: ServiceLocator$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getINSTANCE$vungle_ads_release$annotations() {
        }

        public final void deInit() {
            synchronized (this) {
                setINSTANCE$vungle_ads_release(null);
            }
        }

        public final ServiceLocator getINSTANCE$vungle_ads_release() {
            return ServiceLocator.INSTANCE;
        }

        public final ServiceLocator getInstance(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ServiceLocator iNSTANCE$vungle_ads_release = getINSTANCE$vungle_ads_release();
            ServiceLocator serviceLocator = iNSTANCE$vungle_ads_release;
            if (iNSTANCE$vungle_ads_release == null) {
                synchronized (this) {
                    Companion companion = ServiceLocator.Companion;
                    ServiceLocator iNSTANCE$vungle_ads_release2 = companion.getINSTANCE$vungle_ads_release();
                    serviceLocator = iNSTANCE$vungle_ads_release2;
                    if (iNSTANCE$vungle_ads_release2 == null) {
                        serviceLocator = new ServiceLocator(context, null);
                        companion.setINSTANCE$vungle_ads_release(serviceLocator);
                    }
                }
            }
            return serviceLocator;
        }

        public final /* synthetic */ <T> Lazy inject(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
            Intrinsics.needClassReification();
            return LazyKt.lazy(lazyThreadSafetyMode, new Function0(context) { // from class: com.vungle.ads.ServiceLocator$Companion$inject$1
                final Context $context;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.$context = context;
                }

                /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final T invoke() {
                    ServiceLocator companion = ServiceLocator.Companion.getInstance(this.$context);
                    Intrinsics.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
                    return companion.getOrBuild$vungle_ads_release(Object.class);
                }
            });
        }

        public final void setINSTANCE$vungle_ads_release(ServiceLocator serviceLocator) {
            ServiceLocator.INSTANCE = serviceLocator;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: ServiceLocator$Creator.class */
    public abstract class Creator {
        private final boolean isSingleton;
        final ServiceLocator this$0;

        public Creator(ServiceLocator serviceLocator, boolean z) {
            this.this$0 = serviceLocator;
            this.isSingleton = z;
        }

        public /* synthetic */ Creator(ServiceLocator serviceLocator, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(serviceLocator, (i & 1) != 0 ? true : z);
        }

        public abstract Object create();

        public final boolean isSingleton() {
            return this.isSingleton;
        }
    }

    private ServiceLocator(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.ctx = applicationContext;
        this.creators = new HashMap();
        this.cache = new HashMap();
        buildCreators();
    }

    public /* synthetic */ ServiceLocator(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private final void buildCreators() {
        this.creators.put(JobCreator.class, new Creator(this) { // from class: com.vungle.ads.ServiceLocator$buildCreators$1
            final ServiceLocator this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this, false, 1, null);
                this.this$0 = this;
            }

            @Override // com.vungle.ads.ServiceLocator.Creator
            public JobCreator create() {
                Context context;
                context = this.this$0.ctx;
                return new VungleJobCreator(context, (PathProvider) this.this$0.getOrBuild$vungle_ads_release(PathProvider.class));
            }
        });
        this.creators.put(JobRunner.class, new Creator(this) { // from class: com.vungle.ads.ServiceLocator$buildCreators$2
            final ServiceLocator this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this, false, 1, null);
                this.this$0 = this;
            }

            @Override // com.vungle.ads.ServiceLocator.Creator
            public JobRunner create() {
                return new VungleJobRunner((JobCreator) this.this$0.getOrBuild$vungle_ads_release(JobCreator.class), ((Executors) this.this$0.getOrBuild$vungle_ads_release(Executors.class)).getJobExecutor(), new JobRunnerThreadPriorityHelper());
            }
        });
        this.creators.put(VungleApiClient.class, new Creator(this) { // from class: com.vungle.ads.ServiceLocator$buildCreators$3
            final ServiceLocator this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this, false, 1, null);
                this.this$0 = this;
            }

            @Override // com.vungle.ads.ServiceLocator.Creator
            public VungleApiClient create() {
                Context context;
                context = this.this$0.ctx;
                return new VungleApiClient(context, (Platform) this.this$0.getOrBuild$vungle_ads_release(Platform.class), (FilePreferences) this.this$0.getOrBuild$vungle_ads_release(FilePreferences.class));
            }
        });
        this.creators.put(Platform.class, new Creator(this) { // from class: com.vungle.ads.ServiceLocator$buildCreators$4
            final ServiceLocator this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this, false, 1, null);
                this.this$0 = this;
            }

            @Override // com.vungle.ads.ServiceLocator.Creator
            public Platform create() {
                Context context;
                Executors executors = (Executors) this.this$0.getOrBuild$vungle_ads_release(Executors.class);
                context = this.this$0.ctx;
                return new AndroidPlatform(context, executors.getUaExecutor());
            }
        });
        this.creators.put(Executors.class, new Creator(this) { // from class: com.vungle.ads.ServiceLocator$buildCreators$5
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(this, false, 1, null);
            }

            @Override // com.vungle.ads.ServiceLocator.Creator
            public Executors create() {
                return new SDKExecutors();
            }
        });
        this.creators.put(OMInjector.class, new Creator(this) { // from class: com.vungle.ads.ServiceLocator$buildCreators$6
            final ServiceLocator this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this, false, 1, null);
                this.this$0 = this;
            }

            @Override // com.vungle.ads.ServiceLocator.Creator
            public OMInjector create() {
                Context context;
                context = this.this$0.ctx;
                return new OMInjector(context);
            }
        });
        this.creators.put(OMTracker.Factory.class, new Creator(this) { // from class: com.vungle.ads.ServiceLocator$buildCreators$7
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(this, false, 1, null);
            }

            @Override // com.vungle.ads.ServiceLocator.Creator
            public OMTracker.Factory create() {
                return new OMTracker.Factory();
            }
        });
        this.creators.put(FilePreferences.class, new Creator(this) { // from class: com.vungle.ads.ServiceLocator$buildCreators$8
            final ServiceLocator this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this, false, 1, null);
                this.this$0 = this;
            }

            @Override // com.vungle.ads.ServiceLocator.Creator
            public FilePreferences create() {
                return new FilePreferences(((Executors) this.this$0.getOrBuild$vungle_ads_release(Executors.class)).getIoExecutor(), (PathProvider) this.this$0.getOrBuild$vungle_ads_release(PathProvider.class), null, 4, null);
            }
        });
        this.creators.put(LocaleInfo.class, new Creator(this) { // from class: com.vungle.ads.ServiceLocator$buildCreators$9
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(this, false, 1, null);
            }

            @Override // com.vungle.ads.ServiceLocator.Creator
            public LocaleInfo create() {
                return new SystemLocaleInfo();
            }
        });
        this.creators.put(BidTokenEncoder.class, new Creator(this) { // from class: com.vungle.ads.ServiceLocator$buildCreators$10
            final ServiceLocator this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this, false, 1, null);
                this.this$0 = this;
            }

            @Override // com.vungle.ads.ServiceLocator.Creator
            public BidTokenEncoder create() {
                Context context;
                context = this.this$0.ctx;
                return new BidTokenEncoder(context);
            }
        });
        this.creators.put(PathProvider.class, new Creator(this) { // from class: com.vungle.ads.ServiceLocator$buildCreators$11
            final ServiceLocator this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this, false, 1, null);
                this.this$0 = this;
            }

            @Override // com.vungle.ads.ServiceLocator.Creator
            public PathProvider create() {
                Context context;
                context = this.this$0.ctx;
                return new PathProvider(context);
            }
        });
        this.creators.put(Downloader.class, new Creator(this) { // from class: com.vungle.ads.ServiceLocator$buildCreators$12
            final ServiceLocator this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this, false);
                this.this$0 = this;
            }

            @Override // com.vungle.ads.ServiceLocator.Creator
            public Downloader create() {
                return new AssetDownloader(((Executors) this.this$0.getOrBuild$vungle_ads_release(Executors.class)).getDownloaderExecutor(), (PathProvider) this.this$0.getOrBuild$vungle_ads_release(PathProvider.class));
            }
        });
        this.creators.put(ConcurrencyTimeoutProvider.class, new Creator(this) { // from class: com.vungle.ads.ServiceLocator$buildCreators$13
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(this, false, 1, null);
            }

            @Override // com.vungle.ads.ServiceLocator.Creator
            public ConcurrencyTimeoutProvider create() {
                return new ConcurrencyTimeoutProvider();
            }
        });
    }

    private final Class<?> getServiceClass(Class<?> cls) {
        for (Class<?> cls2 : this.creators.keySet()) {
            if (cls2.isAssignableFrom(cls)) {
                return cls2;
            }
        }
        throw new IllegalArgumentException("Unknown dependency for " + cls);
    }

    public final <T> void bindService$vungle_ads_release(Class<?> serviceClass, T t) {
        Intrinsics.checkNotNullParameter(serviceClass, "serviceClass");
        this.cache.put(serviceClass, t);
    }

    public final <T> T getOrBuild$vungle_ads_release(Class<T> serviceClass) {
        Intrinsics.checkNotNullParameter(serviceClass, "serviceClass");
        Class<?> serviceClass2 = getServiceClass(serviceClass);
        Object obj = this.cache.get(serviceClass2);
        Object obj2 = obj;
        if (obj == null) {
            Creator creator = this.creators.get(serviceClass2);
            if (creator == null) {
                throw new IllegalArgumentException("Unknown class");
            }
            obj2 = creator.create();
            if (creator.isSingleton()) {
                this.cache.put(serviceClass2, obj2);
            }
        }
        return (T) obj2;
    }

    public final <T> T getService(Class<T> serviceClass) {
        T t;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(serviceClass, "serviceClass");
            t = (T) getOrBuild$vungle_ads_release(serviceClass);
        }
        return t;
    }

    public final <T> boolean isCreated(Class<T> serviceClass) {
        boolean containsKey;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(serviceClass, "serviceClass");
            containsKey = this.cache.containsKey(getServiceClass(serviceClass));
        }
        return containsKey;
    }
}

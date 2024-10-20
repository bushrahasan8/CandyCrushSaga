package com.unity3d.services.ads.token;

import android.os.ConditionVariable;
import com.unity3d.services.core.configuration.PrivacyConfig;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.misc.IObserver;
import java.util.concurrent.ExecutorService;

/* loaded from: NativeTokenGeneratorWithPrivacyAwait.class */
public class NativeTokenGeneratorWithPrivacyAwait implements INativeTokenGenerator {
    private final ExecutorService _executorService;
    private final INativeTokenGenerator _nativeTokenGenerator;
    private final ConditionVariable _privacyAwait = new ConditionVariable();
    private final int _privacyAwaitTimeout;

    public NativeTokenGeneratorWithPrivacyAwait(ExecutorService executorService, INativeTokenGenerator iNativeTokenGenerator, int i) {
        this._executorService = executorService;
        this._nativeTokenGenerator = iNativeTokenGenerator;
        this._privacyAwaitTimeout = i;
    }

    @Override // com.unity3d.services.ads.token.INativeTokenGenerator
    public void generateToken(INativeTokenGeneratorListener iNativeTokenGeneratorListener) {
        IObserver<PrivacyConfig> iObserver = new IObserver<PrivacyConfig>(this) { // from class: com.unity3d.services.ads.token.NativeTokenGeneratorWithPrivacyAwait.1
            final NativeTokenGeneratorWithPrivacyAwait this$0;

            {
                this.this$0 = this;
            }

            @Override // com.unity3d.services.core.misc.IObserver
            public void updated(PrivacyConfig privacyConfig) {
                this.this$0._privacyAwait.open();
            }
        };
        PrivacyConfigStorage.getInstance().registerObserver(iObserver);
        this._executorService.execute(new Runnable(this, iObserver, iNativeTokenGeneratorListener) { // from class: com.unity3d.services.ads.token.NativeTokenGeneratorWithPrivacyAwait.2
            final NativeTokenGeneratorWithPrivacyAwait this$0;
            final INativeTokenGeneratorListener val$callback;
            final IObserver val$privacyConfigObserver;

            {
                this.this$0 = this;
                this.val$privacyConfigObserver = iObserver;
                this.val$callback = iNativeTokenGeneratorListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0._privacyAwait.block(this.this$0._privacyAwaitTimeout);
                PrivacyConfigStorage.getInstance().unregisterObserver(this.val$privacyConfigObserver);
                this.this$0._nativeTokenGenerator.generateToken(this.val$callback);
            }
        });
    }
}

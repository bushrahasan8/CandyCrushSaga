package com.unity3d.services.ads.operation.show;

import android.app.Activity;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.services.ads.operation.OperationState;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.misc.Utilities;
import java.lang.ref.WeakReference;

/* loaded from: ShowOperationState.class */
public class ShowOperationState extends OperationState {
    public WeakReference<Activity> activity;
    public IUnityAdsShowListener listener;
    public UnityAdsShowOptions showOptions;

    public ShowOperationState(String str, IUnityAdsShowListener iUnityAdsShowListener, Activity activity, UnityAdsShowOptions unityAdsShowOptions, Configuration configuration) {
        super(str, configuration);
        this.listener = iUnityAdsShowListener;
        this.activity = new WeakReference<>(activity);
        this.showOptions = unityAdsShowOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUnityAdsShowClick$1() {
        this.listener.onUnityAdsShowClick(this.placementId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUnityAdsShowComplete$3(UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        this.listener.onUnityAdsShowComplete(this.placementId, unityAdsShowCompletionState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUnityAdsShowFailure$0(UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        this.listener.onUnityAdsShowFailure(this.placementId, unityAdsShowError, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUnityAdsShowStart$2(String str) {
        this.listener.onUnityAdsShowStart(str);
    }

    public void onUnityAdsShowClick() {
        if (this.listener != null) {
            Utilities.wrapCustomerListener(new Runnable(this) { // from class: com.unity3d.services.ads.operation.show.ShowOperationState$$ExternalSyntheticLambda0
                public final ShowOperationState f$0;

                {
                    this.f$0 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onUnityAdsShowClick$1();
                }
            });
        }
    }

    public void onUnityAdsShowComplete(final UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        if (this.listener != null) {
            Utilities.wrapCustomerListener(new Runnable(this, unityAdsShowCompletionState) { // from class: com.unity3d.services.ads.operation.show.ShowOperationState$$ExternalSyntheticLambda2
                public final ShowOperationState f$0;
                public final UnityAds.UnityAdsShowCompletionState f$1;

                {
                    this.f$0 = this;
                    this.f$1 = unityAdsShowCompletionState;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onUnityAdsShowComplete$3(this.f$1);
                }
            });
        }
    }

    public void onUnityAdsShowFailure(final UnityAds.UnityAdsShowError unityAdsShowError, final String str) {
        if (this.listener != null) {
            Utilities.wrapCustomerListener(new Runnable(this, unityAdsShowError, str) { // from class: com.unity3d.services.ads.operation.show.ShowOperationState$$ExternalSyntheticLambda3
                public final ShowOperationState f$0;
                public final UnityAds.UnityAdsShowError f$1;
                public final String f$2;

                {
                    this.f$0 = this;
                    this.f$1 = unityAdsShowError;
                    this.f$2 = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onUnityAdsShowFailure$0(this.f$1, this.f$2);
                }
            });
        }
    }

    public void onUnityAdsShowStart(final String str) {
        if (this.listener != null) {
            Utilities.wrapCustomerListener(new Runnable(this, str) { // from class: com.unity3d.services.ads.operation.show.ShowOperationState$$ExternalSyntheticLambda1
                public final ShowOperationState f$0;
                public final String f$1;

                {
                    this.f$0 = this;
                    this.f$1 = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onUnityAdsShowStart$2(this.f$1);
                }
            });
        }
    }
}

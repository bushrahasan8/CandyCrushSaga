package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: s6.class */
public interface s6<T> {

    /* loaded from: s6$a.class */
    public static final class a implements s6<ISDemandOnlyInterstitialListener> {
        private ISDemandOnlyInterstitialListener a = new r6();
        private final Map b = new HashMap();

        @Override // com.ironsource.s6
        public void a(ISDemandOnlyInterstitialListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.a = new r6(listener);
            for (String str : this.b.keySet()) {
                Map map = this.b;
                ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = this.a;
                Intrinsics.checkNotNull(iSDemandOnlyInterstitialListener, "null cannot be cast to non-null type com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListenerWrapper");
                map.put(str, (r6) iSDemandOnlyInterstitialListener);
            }
        }

        @Override // com.ironsource.s6
        public void a(String instanceId, ISDemandOnlyInterstitialListener listener) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.b.put(instanceId, new r6(listener));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v8, types: [com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener] */
        @Override // com.ironsource.s6
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyInterstitialListener a(String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            r6 r6Var = (r6) this.b.get(instanceId);
            if (r6Var == null) {
                r6Var = this.a;
            }
            return r6Var;
        }
    }

    /* loaded from: s6$b.class */
    public static final class b implements s6<ISDemandOnlyRewardedVideoListener> {
        private ISDemandOnlyRewardedVideoListener a = new t6();
        private final Map b = new HashMap();

        @Override // com.ironsource.s6
        public void a(ISDemandOnlyRewardedVideoListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.a = new t6(listener);
            for (String str : this.b.keySet()) {
                Map map = this.b;
                ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener = this.a;
                Intrinsics.checkNotNull(iSDemandOnlyRewardedVideoListener, "null cannot be cast to non-null type com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListenerWrapper");
                map.put(str, (t6) iSDemandOnlyRewardedVideoListener);
            }
        }

        @Override // com.ironsource.s6
        public void a(String instanceId, ISDemandOnlyRewardedVideoListener listener) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.b.put(instanceId, new t6(listener));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v8, types: [com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener] */
        @Override // com.ironsource.s6
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyRewardedVideoListener a(String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            t6 t6Var = (t6) this.b.get(instanceId);
            if (t6Var == null) {
                t6Var = this.a;
            }
            return t6Var;
        }
    }

    T a(String str);

    void a(T t);

    void a(String str, T t);
}

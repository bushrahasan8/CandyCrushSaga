package androidx.work.impl.background.systemalarm;

/* loaded from: DelayMetCommandHandler$$ExternalSyntheticLambda0.class */
public final /* synthetic */ class DelayMetCommandHandler$$ExternalSyntheticLambda0 implements Runnable {
    public final DelayMetCommandHandler f$0;

    public /* synthetic */ DelayMetCommandHandler$$ExternalSyntheticLambda0(DelayMetCommandHandler delayMetCommandHandler) {
        this.f$0 = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.stopWork();
    }
}

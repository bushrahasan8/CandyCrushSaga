package com.ironsource;

import android.os.CountDownTimer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: pd.class */
public interface pd {

    /* loaded from: pd$a.class */
    public interface a {
        void a();
    }

    /* loaded from: pd$b.class */
    public static final class b implements pd {
        private final long a;
        private final long b;
        private CountDownTimer c;

        /* loaded from: pd$b$a.class */
        public static final class a extends CountDownTimer {
            final a a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a aVar, long j, long j2) {
                super(j, j2);
                this.a = aVar;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                this.a.a();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j) {
            }
        }

        public b(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        @Override // com.ironsource.pd
        public void a(a callback) {
            synchronized (this) {
                Intrinsics.checkNotNullParameter(callback, "callback");
                CountDownTimer countDownTimer = this.c;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                a aVar = new a(callback, this.a, this.b);
                this.c = aVar;
                aVar.start();
            }
        }

        @Override // com.ironsource.pd
        public void cancel() {
            synchronized (this) {
                CountDownTimer countDownTimer = this.c;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
            }
        }
    }

    void a(a aVar);

    void cancel();
}

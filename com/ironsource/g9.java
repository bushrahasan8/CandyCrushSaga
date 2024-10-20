package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.ironsource.q9;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: g9.class */
public final class g9 extends WebView implements r9 {
    private q9 a;
    private fb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g9(Context context, q9 javascriptEngine) {
        this(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(javascriptEngine, "javascriptEngine");
        this.a = javascriptEngine;
    }

    public /* synthetic */ g9(Context context, q9 q9Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new q9.a(0, 1, null) : q9Var);
    }

    public final void a(fb fbVar) {
        this.b = fbVar;
    }

    @Override // com.ironsource.r9
    public void a(String script) {
        Intrinsics.checkNotNullParameter(script, "script");
        q9 q9Var = this.a;
        q9 q9Var2 = q9Var;
        if (q9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
            q9Var2 = null;
        }
        if (!q9Var2.a()) {
            q9 q9Var3 = this.a;
            q9 q9Var4 = q9Var3;
            if (q9Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
                q9Var4 = null;
            }
            q9Var4.a(this);
        }
        q9 q9Var5 = this.a;
        if (q9Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
            q9Var5 = null;
        }
        q9Var5.a(script);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r0.onBackButtonPressed() == true) goto L10;
     */
    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            r0 = r6
            java.lang.String r1 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r5
            r1 = 4
            if (r0 != r1) goto L2a
            r0 = r4
            com.ironsource.fb r0 = r0.b
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L2a
            r0 = r9
            boolean r0 = r0.onBackButtonPressed()
            r8 = r0
            r0 = 1
            r7 = r0
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L2a
            goto L31
        L2a:
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = super.onKeyDown(r1, r2)
            r7 = r0
        L31:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.g9.onKeyDown(int, android.view.KeyEvent):boolean");
    }
}

package com.onetrust.otpublishers.headless.UI.Helper;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.onetrust.otpublishers.headless.UI.Helper.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: a.class */
public final class a {
    public final Fragment a;
    public final Function1 b;
    public ViewBinding c;

    /* renamed from: com.onetrust.otpublishers.headless.UI.Helper.a$a, reason: collision with other inner class name */
    /* loaded from: a$a.class */
    public static final class C0068a implements DefaultLifecycleObserver {
        public final Observer a;
        public final a b;

        /* renamed from: com.onetrust.otpublishers.headless.UI.Helper.a$a$a, reason: collision with other inner class name */
        /* loaded from: a$a$a.class */
        public static final class C0069a implements DefaultLifecycleObserver {
            public final a a;

            public C0069a(a aVar) {
                this.a = aVar;
            }

            public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                DefaultLifecycleObserver._CC.$default$onCreate(this, lifecycleOwner);
            }

            public final void onDestroy(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                this.a.c = null;
            }

            public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                DefaultLifecycleObserver._CC.$default$onPause(this, lifecycleOwner);
            }

            public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                DefaultLifecycleObserver._CC.$default$onResume(this, lifecycleOwner);
            }

            public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                DefaultLifecycleObserver._CC.$default$onStart(this, lifecycleOwner);
            }

            public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                DefaultLifecycleObserver._CC.$default$onStop(this, lifecycleOwner);
            }
        }

        public C0068a(final a aVar) {
            this.b = aVar;
            this.a = new Observer(aVar) { // from class: com.onetrust.otpublishers.headless.UI.Helper.a$a$$ExternalSyntheticLambda0
                public final a f$0;

                {
                    this.f$0 = aVar;
                }

                public final void onChanged(Object obj) {
                    a.C0068a.a(this.f$0, (LifecycleOwner) obj);
                }
            };
        }

        public static final void a(a this$0, LifecycleOwner lifecycleOwner) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (lifecycleOwner == null) {
                return;
            }
            lifecycleOwner.getLifecycle().addObserver(new C0069a(this$0));
        }

        public final void onCreate(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.b.a.getViewLifecycleOwnerLiveData().observeForever(this.a);
        }

        public final void onDestroy(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.b.a.getViewLifecycleOwnerLiveData().removeObserver(this.a);
        }

        public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            DefaultLifecycleObserver._CC.$default$onPause(this, lifecycleOwner);
        }

        public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            DefaultLifecycleObserver._CC.$default$onResume(this, lifecycleOwner);
        }

        public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            DefaultLifecycleObserver._CC.$default$onStart(this, lifecycleOwner);
        }

        public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            DefaultLifecycleObserver._CC.$default$onStop(this, lifecycleOwner);
        }
    }

    public a(Fragment fragment, Function1 viewBindingFactory) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(viewBindingFactory, "viewBindingFactory");
        this.a = fragment;
        this.b = viewBindingFactory;
        fragment.getLifecycle().addObserver(new C0068a(this));
    }

    public final ViewBinding a(Fragment thisRef, KProperty property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        ViewBinding viewBinding = this.c;
        if (viewBinding != null) {
            return viewBinding;
        }
        if (!this.a.getViewLifecycleOwner().getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.INITIALIZED)) {
            throw new IllegalStateException("Should not attempt to get bindings when Fragment views are destroyed.");
        }
        Function1 function1 = this.b;
        View requireView = thisRef.requireView();
        Intrinsics.checkNotNullExpressionValue(requireView, "thisRef.requireView()");
        ViewBinding viewBinding2 = (ViewBinding) function1.invoke(requireView);
        this.c = viewBinding2;
        return viewBinding2;
    }
}

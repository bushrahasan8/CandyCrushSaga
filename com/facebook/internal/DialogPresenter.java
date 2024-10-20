package com.facebook.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import com.facebook.CallbackManager;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.ironsource.t2;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: DialogPresenter.class */
public final class DialogPresenter {
    public static final DialogPresenter INSTANCE = new DialogPresenter();

    private DialogPresenter() {
    }

    public static final void present(AppCall appCall, Activity activity) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.startActivityForResult(appCall.getRequestIntent(), appCall.getRequestCode());
        appCall.setPending();
    }

    public static final void present(AppCall appCall, ActivityResultRegistry registry, CallbackManager callbackManager) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intent requestIntent = appCall.getRequestIntent();
        if (requestIntent == null) {
            return;
        }
        startActivityForResultWithAndroidX(registry, callbackManager, requestIntent, appCall.getRequestCode());
        appCall.setPending();
    }

    public static final void setupAppCallForCannotShowError(AppCall appCall) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        setupAppCallForValidationError(appCall, new FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
    }

    public static final void setupAppCallForCustomTabDialog(AppCall appCall, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Validate.hasCustomTabRedirectActivity(FacebookSdk.getApplicationContext(), CustomTabUtils.getDefaultRedirectURI());
        Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
        Intent intent = new Intent(FacebookSdk.getApplicationContext(), (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.EXTRA_ACTION, str);
        intent.putExtra(CustomTabMainActivity.EXTRA_PARAMS, bundle);
        intent.putExtra(CustomTabMainActivity.EXTRA_CHROME_PACKAGE, CustomTabUtils.getChromePackage());
        NativeProtocol.setupProtocolRequestIntent(intent, appCall.getCallId().toString(), str, NativeProtocol.getLatestKnownVersion(), null);
        appCall.setRequestIntent(intent);
    }

    public static final void setupAppCallForErrorResult(AppCall appCall, FacebookException facebookException) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        if (facebookException == null) {
            return;
        }
        Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
        Intent intent = new Intent();
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction("PassThrough");
        NativeProtocol.setupProtocolRequestIntent(intent, appCall.getCallId().toString(), null, NativeProtocol.getLatestKnownVersion(), NativeProtocol.createBundleForException(facebookException));
        appCall.setRequestIntent(intent);
    }

    public static final void setupAppCallForValidationError(AppCall appCall, FacebookException facebookException) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        setupAppCallForErrorResult(appCall, facebookException);
    }

    public static final void setupAppCallForWebDialog(AppCall appCall, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
        Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
        Bundle bundle2 = new Bundle();
        bundle2.putString(t2.h.h, str);
        bundle2.putBundle("params", bundle);
        Intent intent = new Intent();
        NativeProtocol.setupProtocolRequestIntent(intent, appCall.getCallId().toString(), str, NativeProtocol.getLatestKnownVersion(), bundle2);
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        appCall.setRequestIntent(intent);
    }

    public static final void startActivityForResultWithAndroidX(ActivityResultRegistry registry, final CallbackManager callbackManager, Intent intent, final int i) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(intent, "intent");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ActivityResultLauncher register = registry.register("facebook-dialog-request-" + i, new ActivityResultContract() { // from class: com.facebook.internal.DialogPresenter$startActivityForResultWithAndroidX$1
            public Intent createIntent(Context context, Intent input) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                return input;
            }

            /* renamed from: parseResult, reason: merged with bridge method [inline-methods] */
            public Pair m149parseResult(int i2, Intent intent2) {
                Pair create = Pair.create(Integer.valueOf(i2), intent2);
                Intrinsics.checkNotNullExpressionValue(create, "create(resultCode, intent)");
                return create;
            }
        }, new ActivityResultCallback(callbackManager, i, ref$ObjectRef) { // from class: com.facebook.internal.DialogPresenter$$ExternalSyntheticLambda0
            public final CallbackManager f$0;
            public final int f$1;
            public final Ref$ObjectRef f$2;

            {
                this.f$0 = callbackManager;
                this.f$1 = i;
                this.f$2 = ref$ObjectRef;
            }

            public final void onActivityResult(Object obj) {
                DialogPresenter.startActivityForResultWithAndroidX$lambda$2(this.f$0, this.f$1, this.f$2, (Pair) obj);
            }
        });
        ref$ObjectRef.element = register;
        if (register != null) {
            register.launch(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startActivityForResultWithAndroidX$lambda$2(CallbackManager callbackManager, int i, Ref$ObjectRef launcher, Pair pair) {
        Intrinsics.checkNotNullParameter(launcher, "$launcher");
        CallbackManager callbackManager2 = callbackManager;
        if (callbackManager == null) {
            callbackManager2 = new CallbackManagerImpl();
        }
        Object obj = pair.first;
        Intrinsics.checkNotNullExpressionValue(obj, "result.first");
        callbackManager2.onActivityResult(i, ((Number) obj).intValue(), (Intent) pair.second);
        ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) launcher.element;
        if (activityResultLauncher != null) {
            synchronized (activityResultLauncher) {
                activityResultLauncher.unregister();
                launcher.element = null;
                Unit unit = Unit.INSTANCE;
            }
        }
    }
}

package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.common.R$string;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.login.LoginClient;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.t2;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: LoginClient.class */
public class LoginClient implements Parcelable {
    private BackgroundProcessingListener backgroundProcessingListener;
    private boolean checkedInternetPermission;
    private int currentHandler;
    private Map extraData;
    private Fragment fragment;
    private LoginMethodHandler[] handlersToTry;
    private Map loggingExtras;
    private LoginLogger loginLogger;
    private int numActivitiesReturned;
    private int numTotalIntentsFired;
    private OnCompletedListener onCompletedListener;
    private Request pendingRequest;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LoginClient> CREATOR = new Parcelable.Creator() { // from class: com.facebook.login.LoginClient$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        public LoginClient createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new LoginClient(source);
        }

        @Override // android.os.Parcelable.Creator
        public LoginClient[] newArray(int i) {
            return new LoginClient[i];
        }
    };

    /* loaded from: LoginClient$BackgroundProcessingListener.class */
    public interface BackgroundProcessingListener {
        void onBackgroundProcessingStarted();

        void onBackgroundProcessingStopped();
    }

    /* loaded from: LoginClient$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getE2E() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(t2.a.e, System.currentTimeMillis());
            } catch (JSONException e) {
            }
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "e2e.toString()");
            return jSONObject2;
        }

        public final int getLoginRequestCode() {
            return CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
        }
    }

    /* loaded from: LoginClient$OnCompletedListener.class */
    public interface OnCompletedListener {
        void onCompleted(Result result);
    }

    /* loaded from: LoginClient$Request.class */
    public static final class Request implements Parcelable {
        private final String applicationId;
        private String authId;
        private String authType;
        private final String codeChallenge;
        private final CodeChallengeMethod codeChallengeMethod;
        private final String codeVerifier;
        private final DefaultAudience defaultAudience;
        private String deviceAuthTargetUserId;
        private String deviceRedirectUriString;
        private boolean isFamilyLogin;
        private boolean isRerequest;
        private final LoginBehavior loginBehavior;
        private final LoginTargetApp loginTargetApp;
        private String messengerPageId;
        private final String nonce;
        private Set permissions;
        private boolean resetMessengerState;
        private boolean shouldSkipAccountDeduplication;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Request> CREATOR = new Parcelable.Creator() { // from class: com.facebook.login.LoginClient$Request$Companion$CREATOR$1
            @Override // android.os.Parcelable.Creator
            public LoginClient.Request createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new LoginClient.Request(source, null);
            }

            @Override // android.os.Parcelable.Creator
            public LoginClient.Request[] newArray(int i) {
                return new LoginClient.Request[i];
            }
        };

        /* loaded from: LoginClient$Request$Companion.class */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private Request(Parcel parcel) {
            this.loginBehavior = LoginBehavior.valueOf(Validate.notNullOrEmpty(parcel.readString(), "loginBehavior"));
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.permissions = new HashSet(arrayList);
            String readString = parcel.readString();
            this.defaultAudience = readString != null ? DefaultAudience.valueOf(readString) : DefaultAudience.NONE;
            this.applicationId = Validate.notNullOrEmpty(parcel.readString(), "applicationId");
            this.authId = Validate.notNullOrEmpty(parcel.readString(), "authId");
            this.isRerequest = parcel.readByte() != 0;
            this.deviceRedirectUriString = parcel.readString();
            this.authType = Validate.notNullOrEmpty(parcel.readString(), "authType");
            this.deviceAuthTargetUserId = parcel.readString();
            this.messengerPageId = parcel.readString();
            this.resetMessengerState = parcel.readByte() != 0;
            String readString2 = parcel.readString();
            this.loginTargetApp = readString2 != null ? LoginTargetApp.valueOf(readString2) : LoginTargetApp.FACEBOOK;
            this.isFamilyLogin = parcel.readByte() != 0;
            this.shouldSkipAccountDeduplication = parcel.readByte() != 0;
            this.nonce = Validate.notNullOrEmpty(parcel.readString(), "nonce");
            this.codeVerifier = parcel.readString();
            this.codeChallenge = parcel.readString();
            String readString3 = parcel.readString();
            this.codeChallengeMethod = readString3 != null ? CodeChallengeMethod.valueOf(readString3) : null;
        }

        public /* synthetic */ Request(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        public Request(LoginBehavior loginBehavior, Set set, DefaultAudience defaultAudience, String authType, String applicationId, String authId, LoginTargetApp loginTargetApp, String str, String str2, String str3, CodeChallengeMethod codeChallengeMethod) {
            Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            Intrinsics.checkNotNullParameter(authType, "authType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(authId, "authId");
            this.loginBehavior = loginBehavior;
            this.permissions = set == null ? new HashSet() : set;
            this.defaultAudience = defaultAudience;
            this.authType = authType;
            this.applicationId = applicationId;
            this.authId = authId;
            this.loginTargetApp = loginTargetApp == null ? LoginTargetApp.FACEBOOK : loginTargetApp;
            if (str == null || str.length() == 0) {
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
                this.nonce = uuid;
            } else {
                this.nonce = str;
            }
            this.codeVerifier = str2;
            this.codeChallenge = str3;
            this.codeChallengeMethod = codeChallengeMethod;
        }

        public /* synthetic */ Request(LoginBehavior loginBehavior, Set set, DefaultAudience defaultAudience, String str, String str2, String str3, LoginTargetApp loginTargetApp, String str4, String str5, String str6, CodeChallengeMethod codeChallengeMethod, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(loginBehavior, set, defaultAudience, str, str2, str3, (i & 64) != 0 ? LoginTargetApp.FACEBOOK : loginTargetApp, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : str6, (i & 1024) != 0 ? null : codeChallengeMethod);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String getApplicationId() {
            return this.applicationId;
        }

        public final String getAuthId() {
            return this.authId;
        }

        public final String getAuthType() {
            return this.authType;
        }

        public final String getCodeChallenge() {
            return this.codeChallenge;
        }

        public final CodeChallengeMethod getCodeChallengeMethod() {
            return this.codeChallengeMethod;
        }

        public final String getCodeVerifier() {
            return this.codeVerifier;
        }

        public final DefaultAudience getDefaultAudience() {
            return this.defaultAudience;
        }

        public final String getDeviceAuthTargetUserId() {
            return this.deviceAuthTargetUserId;
        }

        public final String getDeviceRedirectUriString() {
            return this.deviceRedirectUriString;
        }

        public final LoginBehavior getLoginBehavior() {
            return this.loginBehavior;
        }

        public final LoginTargetApp getLoginTargetApp() {
            return this.loginTargetApp;
        }

        public final String getMessengerPageId() {
            return this.messengerPageId;
        }

        public final String getNonce() {
            return this.nonce;
        }

        public final Set getPermissions() {
            return this.permissions;
        }

        public final boolean getResetMessengerState() {
            return this.resetMessengerState;
        }

        public final boolean hasPublishPermission() {
            Iterator it = this.permissions.iterator();
            while (it.hasNext()) {
                if (LoginManager.Companion.isPublishPermission((String) it.next())) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isFamilyLogin() {
            return this.isFamilyLogin;
        }

        public final boolean isInstagramLogin() {
            return this.loginTargetApp == LoginTargetApp.INSTAGRAM;
        }

        public final boolean isRerequest() {
            return this.isRerequest;
        }

        public final void setFamilyLogin(boolean z) {
            this.isFamilyLogin = z;
        }

        public final void setMessengerPageId(String str) {
            this.messengerPageId = str;
        }

        public final void setPermissions(Set set) {
            Intrinsics.checkNotNullParameter(set, "<set-?>");
            this.permissions = set;
        }

        public final void setRerequest(boolean z) {
            this.isRerequest = z;
        }

        public final void setResetMessengerState(boolean z) {
            this.resetMessengerState = z;
        }

        public final void setShouldSkipAccountDeduplication(boolean z) {
            this.shouldSkipAccountDeduplication = z;
        }

        public final boolean shouldSkipAccountDeduplication() {
            return this.shouldSkipAccountDeduplication;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.loginBehavior.name());
            dest.writeStringList(new ArrayList(this.permissions));
            dest.writeString(this.defaultAudience.name());
            dest.writeString(this.applicationId);
            dest.writeString(this.authId);
            dest.writeByte(this.isRerequest ? (byte) 1 : (byte) 0);
            dest.writeString(this.deviceRedirectUriString);
            dest.writeString(this.authType);
            dest.writeString(this.deviceAuthTargetUserId);
            dest.writeString(this.messengerPageId);
            dest.writeByte(this.resetMessengerState ? (byte) 1 : (byte) 0);
            dest.writeString(this.loginTargetApp.name());
            dest.writeByte(this.isFamilyLogin ? (byte) 1 : (byte) 0);
            dest.writeByte(this.shouldSkipAccountDeduplication ? (byte) 1 : (byte) 0);
            dest.writeString(this.nonce);
            dest.writeString(this.codeVerifier);
            dest.writeString(this.codeChallenge);
            CodeChallengeMethod codeChallengeMethod = this.codeChallengeMethod;
            dest.writeString(codeChallengeMethod != null ? codeChallengeMethod.name() : null);
        }
    }

    /* loaded from: LoginClient$Result.class */
    public static final class Result implements Parcelable {
        public final AuthenticationToken authenticationToken;
        public final Code code;
        public final String errorCode;
        public final String errorMessage;
        public Map extraData;
        public Map loggingExtras;
        public final Request request;
        public final AccessToken token;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Result> CREATOR = new Parcelable.Creator() { // from class: com.facebook.login.LoginClient$Result$Companion$CREATOR$1
            @Override // android.os.Parcelable.Creator
            public LoginClient.Result createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new LoginClient.Result(source, null);
            }

            @Override // android.os.Parcelable.Creator
            public LoginClient.Result[] newArray(int i) {
                return new LoginClient.Result[i];
            }
        };

        /* loaded from: LoginClient$Result$Code.class */
        public enum Code {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR(MRAIDPresenter.ERROR);

            private final String loggingValue;

            Code(String str) {
                this.loggingValue = str;
            }

            public final String getLoggingValue() {
                return this.loggingValue;
            }
        }

        /* loaded from: LoginClient$Result$Companion.class */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ Result createErrorResult$default(Companion companion, Request request, String str, String str2, String str3, int i, Object obj) {
                if ((i & 8) != 0) {
                    str3 = null;
                }
                return companion.createErrorResult(request, str, str2, str3);
            }

            public final Result createCancelResult(Request request, String str) {
                return new Result(request, Code.CANCEL, null, str, null);
            }

            public final Result createCompositeTokenResult(Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
                return new Result(request, Code.SUCCESS, accessToken, authenticationToken, null, null);
            }

            public final Result createErrorResult(Request request, String str, String str2, String str3) {
                ArrayList arrayList = new ArrayList();
                if (str != null) {
                    arrayList.add(str);
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                return new Result(request, Code.ERROR, null, TextUtils.join(": ", arrayList), str3);
            }

            public final Result createTokenResult(Request request, AccessToken token) {
                Intrinsics.checkNotNullParameter(token, "token");
                return new Result(request, Code.SUCCESS, token, null, null);
            }
        }

        private Result(Parcel parcel) {
            String readString = parcel.readString();
            this.code = Code.valueOf(readString == null ? MRAIDPresenter.ERROR : readString);
            this.token = parcel.readParcelable(AccessToken.class.getClassLoader());
            this.authenticationToken = parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.errorMessage = parcel.readString();
            this.errorCode = parcel.readString();
            this.request = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.loggingExtras = Utility.readNonnullStringMapFromParcel(parcel);
            this.extraData = Utility.readNonnullStringMapFromParcel(parcel);
        }

        public /* synthetic */ Result(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        public Result(Request request, Code code, AccessToken accessToken, AuthenticationToken authenticationToken, String str, String str2) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.request = request;
            this.token = accessToken;
            this.authenticationToken = authenticationToken;
            this.errorMessage = str;
            this.code = code;
            this.errorCode = str2;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Result(Request request, Code code, AccessToken accessToken, String str, String str2) {
            this(request, code, accessToken, null, str, str2);
            Intrinsics.checkNotNullParameter(code, "code");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.code.name());
            dest.writeParcelable(this.token, i);
            dest.writeParcelable(this.authenticationToken, i);
            dest.writeString(this.errorMessage);
            dest.writeString(this.errorCode);
            dest.writeParcelable(this.request, i);
            Utility.writeNonnullStringMapToParcel(dest, this.loggingExtras);
            Utility.writeNonnullStringMapToParcel(dest, this.extraData);
        }
    }

    public LoginClient(Parcel source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.currentHandler = -1;
        Parcelable[] readParcelableArray = source.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        Parcelable[] parcelableArr = readParcelableArray == null ? new Parcelable[0] : readParcelableArray;
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : parcelableArr) {
            LoginMethodHandler loginMethodHandler = parcelable instanceof LoginMethodHandler ? (LoginMethodHandler) parcelable : null;
            if (loginMethodHandler != null) {
                loginMethodHandler.setLoginClient(this);
            }
            if (loginMethodHandler != null) {
                arrayList.add(loginMethodHandler);
            }
        }
        this.handlersToTry = (LoginMethodHandler[]) arrayList.toArray(new LoginMethodHandler[0]);
        this.currentHandler = source.readInt();
        this.pendingRequest = (Request) source.readParcelable(Request.class.getClassLoader());
        Map readNonnullStringMapFromParcel = Utility.readNonnullStringMapFromParcel(source);
        this.loggingExtras = readNonnullStringMapFromParcel != null ? MapsKt.toMutableMap(readNonnullStringMapFromParcel) : null;
        Map readNonnullStringMapFromParcel2 = Utility.readNonnullStringMapFromParcel(source);
        this.extraData = readNonnullStringMapFromParcel2 != null ? MapsKt.toMutableMap(readNonnullStringMapFromParcel2) : null;
    }

    public LoginClient(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.currentHandler = -1;
        setFragment(fragment);
    }

    private final void addLoggingExtra(String str, String str2, boolean z) {
        Map map = this.loggingExtras;
        Map map2 = map;
        if (map == null) {
            map2 = new HashMap();
        }
        if (this.loggingExtras == null) {
            this.loggingExtras = map2;
        }
        String str3 = str2;
        if (map2.containsKey(str)) {
            str3 = str2;
            if (z) {
                str3 = ((String) map2.get(str)) + ',' + str2;
            }
        }
        map2.put(str, str3);
    }

    private final void completeWithFailure() {
        complete(Result.Companion.createErrorResult$default(Result.Companion, this.pendingRequest, "Login attempt failed.", null, null, 8, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, r0 != null ? r0.getApplicationId() : null) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.facebook.login.LoginLogger getLogger() {
        /*
            r5 = this;
            r0 = r5
            com.facebook.login.LoginLogger r0 = r0.loginLogger
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L29
            r0 = r7
            java.lang.String r0 = r0.getApplicationId()
            r8 = r0
            r0 = r5
            com.facebook.login.LoginClient$Request r0 = r0.pendingRequest
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L1f
            r0 = r6
            java.lang.String r0 = r0.getApplicationId()
            r6 = r0
            goto L21
        L1f:
            r0 = 0
            r6 = r0
        L21:
            r0 = r8
            r1 = r6
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L60
        L29:
            r0 = r5
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L35
            goto L39
        L35:
            android.content.Context r0 = com.facebook.FacebookSdk.getApplicationContext()
            r6 = r0
        L39:
            r0 = r5
            com.facebook.login.LoginClient$Request r0 = r0.pendingRequest
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L4d
            r0 = r7
            java.lang.String r0 = r0.getApplicationId()
            r8 = r0
            r0 = r8
            r7 = r0
            r0 = r8
            if (r0 != 0) goto L51
        L4d:
            java.lang.String r0 = com.facebook.FacebookSdk.getApplicationId()
            r7 = r0
        L51:
            com.facebook.login.LoginLogger r0 = new com.facebook.login.LoginLogger
            r1 = r0
            r2 = r6
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r5
            r1 = r7
            r0.loginLogger = r1
        L60:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.getLogger():com.facebook.login.LoginLogger");
    }

    private final void logAuthorizationMethodComplete(String str, Result result, Map map) {
        logAuthorizationMethodComplete(str, result.code.getLoggingValue(), result.errorMessage, result.errorCode, map);
    }

    private final void logAuthorizationMethodComplete(String str, String str2, String str3, String str4, Map map) {
        Request request = this.pendingRequest;
        if (request == null) {
            getLogger().logUnexpectedError("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            getLogger().logAuthorizationMethodComplete(request.getAuthId(), str, str2, str3, str4, map, request.isFamilyLogin() ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete");
        }
    }

    private final void notifyOnCompleteListener(Result result) {
        OnCompletedListener onCompletedListener = this.onCompletedListener;
        if (onCompletedListener != null) {
            onCompletedListener.onCompleted(result);
        }
    }

    public final void authorize(Request request) {
        if (request == null) {
            return;
        }
        if (this.pendingRequest != null) {
            throw new FacebookException("Attempted to authorize while a request is pending.");
        }
        if (!AccessToken.Companion.isCurrentAccessTokenActive() || checkInternetPermission()) {
            this.pendingRequest = request;
            this.handlersToTry = getHandlersToTry(request);
            tryNextHandler();
        }
    }

    public final void cancelCurrentHandler() {
        LoginMethodHandler currentHandler = getCurrentHandler();
        if (currentHandler != null) {
            currentHandler.cancel();
        }
    }

    public final boolean checkInternetPermission() {
        if (this.checkedInternetPermission) {
            return true;
        }
        if (checkPermission("android.permission.INTERNET") == 0) {
            this.checkedInternetPermission = true;
            return true;
        }
        FragmentActivity activity = getActivity();
        String str = null;
        String string = activity != null ? activity.getString(R$string.com_facebook_internet_permission_error_title) : null;
        if (activity != null) {
            str = activity.getString(R$string.com_facebook_internet_permission_error_message);
        }
        complete(Result.Companion.createErrorResult$default(Result.Companion, this.pendingRequest, string, str, null, 8, null));
        return false;
    }

    public final int checkPermission(String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        FragmentActivity activity = getActivity();
        return activity != null ? activity.checkCallingOrSelfPermission(permission) : -1;
    }

    public final void complete(Result outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        LoginMethodHandler currentHandler = getCurrentHandler();
        if (currentHandler != null) {
            logAuthorizationMethodComplete(currentHandler.getNameForLogging(), outcome, currentHandler.getMethodLoggingExtras());
        }
        Map map = this.loggingExtras;
        if (map != null) {
            outcome.loggingExtras = map;
        }
        Map map2 = this.extraData;
        if (map2 != null) {
            outcome.extraData = map2;
        }
        this.handlersToTry = null;
        this.currentHandler = -1;
        this.pendingRequest = null;
        this.loggingExtras = null;
        this.numActivitiesReturned = 0;
        this.numTotalIntentsFired = 0;
        notifyOnCompleteListener(outcome);
    }

    public final void completeAndValidate(Result outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        if (outcome.token == null || !AccessToken.Companion.isCurrentAccessTokenActive()) {
            complete(outcome);
        } else {
            validateSameFbidAndFinish(outcome);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final FragmentActivity getActivity() {
        Fragment fragment = this.fragment;
        return fragment != null ? fragment.getActivity() : null;
    }

    public final LoginMethodHandler getCurrentHandler() {
        int i = this.currentHandler;
        LoginMethodHandler loginMethodHandler = null;
        if (i >= 0) {
            LoginMethodHandler[] loginMethodHandlerArr = this.handlersToTry;
            loginMethodHandler = null;
            if (loginMethodHandlerArr != null) {
                loginMethodHandler = loginMethodHandlerArr[i];
            }
        }
        return loginMethodHandler;
    }

    public final Fragment getFragment() {
        return this.fragment;
    }

    public LoginMethodHandler[] getHandlersToTry(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ArrayList arrayList = new ArrayList();
        LoginBehavior loginBehavior = request.getLoginBehavior();
        if (!request.isInstagramLogin()) {
            if (loginBehavior.allowsGetTokenAuth()) {
                arrayList.add(new GetTokenLoginMethodHandler(this));
            }
            if (!FacebookSdk.bypassAppSwitch && loginBehavior.allowsKatanaAuth()) {
                arrayList.add(new KatanaProxyLoginMethodHandler(this));
            }
        } else if (!FacebookSdk.bypassAppSwitch && loginBehavior.allowsInstagramAppAuth()) {
            arrayList.add(new InstagramAppLoginMethodHandler(this));
        }
        if (loginBehavior.allowsCustomTabAuth()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (loginBehavior.allowsWebViewAuth()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (!request.isInstagramLogin() && loginBehavior.allowsDeviceAuth()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        return (LoginMethodHandler[]) arrayList.toArray(new LoginMethodHandler[0]);
    }

    public final boolean getInProgress() {
        return this.pendingRequest != null && this.currentHandler >= 0;
    }

    public final Request getPendingRequest() {
        return this.pendingRequest;
    }

    public final void notifyBackgroundProcessingStart() {
        BackgroundProcessingListener backgroundProcessingListener = this.backgroundProcessingListener;
        if (backgroundProcessingListener != null) {
            backgroundProcessingListener.onBackgroundProcessingStarted();
        }
    }

    public final void notifyBackgroundProcessingStop() {
        BackgroundProcessingListener backgroundProcessingListener = this.backgroundProcessingListener;
        if (backgroundProcessingListener != null) {
            backgroundProcessingListener.onBackgroundProcessingStopped();
        }
    }

    public final boolean onActivityResult(int i, int i2, Intent intent) {
        this.numActivitiesReturned++;
        if (this.pendingRequest == null) {
            return false;
        }
        if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.NO_ACTIVITY_EXCEPTION, false)) {
            tryNextHandler();
            return false;
        }
        LoginMethodHandler currentHandler = getCurrentHandler();
        if (currentHandler == null) {
            return false;
        }
        if (currentHandler.shouldKeepTrackOfMultipleIntents() && intent == null && this.numActivitiesReturned < this.numTotalIntentsFired) {
            return false;
        }
        return currentHandler.onActivityResult(i, i2, intent);
    }

    public final void setBackgroundProcessingListener(BackgroundProcessingListener backgroundProcessingListener) {
        this.backgroundProcessingListener = backgroundProcessingListener;
    }

    public final void setFragment(Fragment fragment) {
        if (this.fragment != null) {
            throw new FacebookException("Can't set fragment once it is already set.");
        }
        this.fragment = fragment;
    }

    public final void setOnCompletedListener(OnCompletedListener onCompletedListener) {
        this.onCompletedListener = onCompletedListener;
    }

    public final void startOrContinueAuth(Request request) {
        if (getInProgress()) {
            return;
        }
        authorize(request);
    }

    public final boolean tryCurrentHandler() {
        LoginMethodHandler currentHandler = getCurrentHandler();
        boolean z = false;
        if (currentHandler == null) {
            return false;
        }
        if (currentHandler.needsInternetPermission() && !checkInternetPermission()) {
            addLoggingExtra("no_internet_permission", "1", false);
            return false;
        }
        Request request = this.pendingRequest;
        if (request == null) {
            return false;
        }
        int tryAuthorize = currentHandler.tryAuthorize(request);
        this.numActivitiesReturned = 0;
        if (tryAuthorize > 0) {
            getLogger().logAuthorizationMethodStart(request.getAuthId(), currentHandler.getNameForLogging(), request.isFamilyLogin() ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start");
            this.numTotalIntentsFired = tryAuthorize;
        } else {
            getLogger().logAuthorizationMethodNotTried(request.getAuthId(), currentHandler.getNameForLogging(), request.isFamilyLogin() ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried");
            addLoggingExtra("not_tried", currentHandler.getNameForLogging(), true);
        }
        if (tryAuthorize > 0) {
            z = true;
        }
        return z;
    }

    public final void tryNextHandler() {
        int i;
        LoginMethodHandler currentHandler = getCurrentHandler();
        if (currentHandler != null) {
            logAuthorizationMethodComplete(currentHandler.getNameForLogging(), "skipped", null, null, currentHandler.getMethodLoggingExtras());
        }
        LoginMethodHandler[] loginMethodHandlerArr = this.handlersToTry;
        while (loginMethodHandlerArr != null && (i = this.currentHandler) < loginMethodHandlerArr.length - 1) {
            this.currentHandler = i + 1;
            if (tryCurrentHandler()) {
                return;
            }
        }
        if (this.pendingRequest != null) {
            completeWithFailure();
        }
    }

    public final void validateSameFbidAndFinish(Result pendingResult) {
        Result createCompositeTokenResult;
        Intrinsics.checkNotNullParameter(pendingResult, "pendingResult");
        if (pendingResult.token == null) {
            throw new FacebookException("Can't validate without a token");
        }
        AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
        AccessToken accessToken = pendingResult.token;
        if (currentAccessToken != null) {
            try {
                if (Intrinsics.areEqual(currentAccessToken.getUserId(), accessToken.getUserId())) {
                    createCompositeTokenResult = Result.Companion.createCompositeTokenResult(this.pendingRequest, pendingResult.token, pendingResult.authenticationToken);
                    complete(createCompositeTokenResult);
                }
            } catch (Exception e) {
                complete(Result.Companion.createErrorResult$default(Result.Companion, this.pendingRequest, "Caught exception", e.getMessage(), null, 8, null));
                return;
            }
        }
        createCompositeTokenResult = Result.Companion.createErrorResult$default(Result.Companion, this.pendingRequest, "User logged in as different Facebook user.", null, null, 8, null);
        complete(createCompositeTokenResult);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelableArray(this.handlersToTry, i);
        dest.writeInt(this.currentHandler);
        dest.writeParcelable(this.pendingRequest, i);
        Utility.writeNonnullStringMapToParcel(dest, this.loggingExtras);
        Utility.writeNonnullStringMapToParcel(dest, this.extraData);
    }
}

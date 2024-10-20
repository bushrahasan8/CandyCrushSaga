package com.facebook.internal;

import android.content.Intent;
import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: CallbackManagerImpl.class */
public final class CallbackManagerImpl implements CallbackManager {
    public static final Companion Companion = new Companion(null);
    private static final Map staticCallbacks = new HashMap();
    private final Map callbacks = new HashMap();

    /* loaded from: CallbackManagerImpl$Callback.class */
    public interface Callback {
        boolean onActivityResult(int i, Intent intent);
    }

    /* loaded from: CallbackManagerImpl$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Callback getStaticCallback(int i) {
            Callback callback;
            synchronized (this) {
                callback = (Callback) CallbackManagerImpl.staticCallbacks.get(Integer.valueOf(i));
            }
            return callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean runStaticCallback(int i, int i2, Intent intent) {
            Callback staticCallback = getStaticCallback(i);
            return staticCallback != null ? staticCallback.onActivityResult(i2, intent) : false;
        }

        public final void registerStaticCallback(int i, Callback callback) {
            synchronized (this) {
                Intrinsics.checkNotNullParameter(callback, "callback");
                if (CallbackManagerImpl.staticCallbacks.containsKey(Integer.valueOf(i))) {
                    return;
                }
                CallbackManagerImpl.staticCallbacks.put(Integer.valueOf(i), callback);
            }
        }
    }

    /* loaded from: CallbackManagerImpl$RequestCodeOffset.class */
    public enum RequestCodeOffset {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11),
        GamingContextCreate(12),
        GamingContextSwitch(13),
        GamingContextChoose(14),
        TournamentShareDialog(15),
        TournamentJoinDialog(16);

        private final int offset;

        RequestCodeOffset(int i) {
            this.offset = i;
        }

        public final int toRequestCode() {
            return FacebookSdk.getCallbackRequestCodeOffset() + this.offset;
        }
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        Callback callback = (Callback) this.callbacks.get(Integer.valueOf(i));
        return callback != null ? callback.onActivityResult(i2, intent) : Companion.runStaticCallback(i, i2, intent);
    }

    public final void registerCallback(int i, Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callbacks.put(Integer.valueOf(i), callback);
    }
}

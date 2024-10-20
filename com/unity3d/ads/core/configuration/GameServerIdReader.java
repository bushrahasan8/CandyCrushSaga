package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: GameServerIdReader.class */
public final class GameServerIdReader extends MetadataReader<String> {
    public static final Companion Companion = new Companion(null);
    public static final String PLAYER_SERVER_ID_KEY = "player.server_id.value";

    /* loaded from: GameServerIdReader$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameServerIdReader(JsonStorage jsonStorage) {
        super(jsonStorage, PLAYER_SERVER_ID_KEY);
        Intrinsics.checkNotNullParameter(jsonStorage, "jsonStorage");
    }
}

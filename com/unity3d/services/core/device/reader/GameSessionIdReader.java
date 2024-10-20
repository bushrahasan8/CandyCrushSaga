package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.UUID;

/* loaded from: GameSessionIdReader.class */
public class GameSessionIdReader implements IGameSessionIdReader {
    private static final int GAME_SESSION_ID_LENGTH = 12;
    private static volatile GameSessionIdReader _instance;
    private Long gameSessionId;

    private GameSessionIdReader() {
    }

    private void generate() {
        UUID randomUUID = UUID.randomUUID();
        this.gameSessionId = Long.valueOf((Long.toString(randomUUID.getMostSignificantBits()) + Long.toString(randomUUID.getLeastSignificantBits())).replace("-", "").substring(0, 12));
    }

    public static GameSessionIdReader getInstance() {
        if (_instance == null) {
            synchronized (GameSessionIdReader.class) {
                try {
                    if (_instance == null) {
                        _instance = new GameSessionIdReader();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return _instance;
    }

    private void store() {
        Storage storage;
        if (!StorageManager.init(ClientProperties.getApplicationContext()) || (storage = StorageManager.getStorage(StorageManager.StorageType.PRIVATE)) == null) {
            return;
        }
        storage.set(JsonStorageKeyNames.GAME_SESSION_ID_NORMALIZED_KEY, this.gameSessionId);
        storage.writeStorage();
    }

    @Override // com.unity3d.services.core.device.reader.IGameSessionIdReader
    public Long getGameSessionId() {
        Long l;
        synchronized (this) {
            if (this.gameSessionId == null) {
                generate();
            }
            l = this.gameSessionId;
        }
        return l;
    }

    @Override // com.unity3d.services.core.device.reader.IGameSessionIdReader
    public Long getGameSessionIdAndStore() {
        Long l;
        synchronized (this) {
            if (this.gameSessionId == null) {
                generate();
                store();
            }
            l = this.gameSessionId;
        }
        return l;
    }
}

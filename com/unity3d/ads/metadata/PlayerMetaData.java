package com.unity3d.ads.metadata;

import android.content.Context;

/* loaded from: PlayerMetaData.class */
public class PlayerMetaData extends MetaData {
    public static final String KEY_SERVER_ID = "server_id";

    public PlayerMetaData(Context context) {
        super(context);
        setCategory("player");
    }

    public void setServerId(String str) {
        set(KEY_SERVER_ID, str);
    }
}

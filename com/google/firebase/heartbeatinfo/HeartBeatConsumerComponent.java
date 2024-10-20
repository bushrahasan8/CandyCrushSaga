package com.google.firebase.heartbeatinfo;

import com.google.firebase.components.Component;

/* loaded from: HeartBeatConsumerComponent.class */
public abstract class HeartBeatConsumerComponent {
    public static Component create() {
        return Component.intoSet(new HeartBeatConsumer() { // from class: com.google.firebase.heartbeatinfo.HeartBeatConsumerComponent.1
        }, HeartBeatConsumer.class);
    }
}

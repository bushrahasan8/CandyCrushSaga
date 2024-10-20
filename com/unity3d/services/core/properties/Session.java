package com.unity3d.services.core.properties;

/* loaded from: Session.class */
public interface Session {
    public static final Default Default = Default.$$INSTANCE;

    /* loaded from: Session$Default.class */
    public static final class Default implements Session {
        static final Default $$INSTANCE = new Default();
        private static final String id = SessionIdReader.INSTANCE.getSessionId();

        private Default() {
        }

        @Override // com.unity3d.services.core.properties.Session
        public String getId() {
            return id;
        }
    }

    String getId();
}

package com.google.firebase.heartbeatinfo;

/* loaded from: HeartBeatInfo.class */
public interface HeartBeatInfo {

    /* loaded from: HeartBeatInfo$HeartBeat.class */
    public enum HeartBeat {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);

        private final int code;

        HeartBeat(int i) {
            this.code = i;
        }

        public int getCode() {
            return this.code;
        }
    }

    HeartBeat getHeartBeatCode(String str);
}

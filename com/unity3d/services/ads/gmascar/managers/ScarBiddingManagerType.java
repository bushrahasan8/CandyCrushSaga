package com.unity3d.services.ads.gmascar.managers;

/* loaded from: ScarBiddingManagerType.class */
public enum ScarBiddingManagerType {
    DISABLED("dis"),
    EAGER("eag");

    private final String name;

    /* loaded from: ScarBiddingManagerType$Constants.class */
    private static class Constants {
        private static final String DIS = "dis";
        private static final String EAG = "eag";

        private Constants() {
        }
    }

    ScarBiddingManagerType(String str) {
        this.name = str;
    }

    public static ScarBiddingManagerType fromName(String str) {
        int hashCode = str.hashCode();
        if (hashCode == 99470) {
            str.equals("dis");
        } else if (hashCode == 100171 && str.equals("eag")) {
            return EAGER;
        }
        return DISABLED;
    }

    public String getName() {
        return this.name;
    }
}

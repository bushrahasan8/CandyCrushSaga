package com.braze.ui.inappmessage.config;

/* loaded from: BrazeInAppMessageParams.class */
public final class BrazeInAppMessageParams {
    public static final BrazeInAppMessageParams INSTANCE = new BrazeInAppMessageParams();
    private static double modalizedImageRadiusDp = 9.0d;
    private static double graphicModalMaxWidthDp = 290.0d;
    private static double graphicModalMaxHeightDp = 290.0d;

    private BrazeInAppMessageParams() {
    }

    public static final double getModalizedImageRadiusDp() {
        return modalizedImageRadiusDp;
    }
}

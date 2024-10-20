package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R$attr;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.MaterialAttributes;

/* loaded from: ElevationOverlayProvider.class */
public class ElevationOverlayProvider {
    private static final int OVERLAY_ACCENT_COLOR_ALPHA = (int) Math.round(5.1000000000000005d);
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayAccentColor;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    public ElevationOverlayProvider(Context context) {
        this(MaterialAttributes.resolveBoolean(context, R$attr.elevationOverlayEnabled, false), MaterialColors.getColor(context, R$attr.elevationOverlayColor, 0), MaterialColors.getColor(context, R$attr.elevationOverlayAccentColor, 0), MaterialColors.getColor(context, R$attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    public ElevationOverlayProvider(boolean z, int i, int i2, int i3, float f) {
        this.elevationOverlayEnabled = z;
        this.elevationOverlayColor = i;
        this.elevationOverlayAccentColor = i2;
        this.colorSurface = i3;
        this.displayDensity = f;
    }

    private boolean isThemeSurfaceColor(int i) {
        return ColorUtils.setAlphaComponent(i, 255) == this.colorSurface;
    }

    public float calculateOverlayAlphaFraction(float f) {
        if (this.displayDensity <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int compositeOverlay(int i, float f) {
        float calculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f);
        int alpha = Color.alpha(i);
        int layer = MaterialColors.layer(ColorUtils.setAlphaComponent(i, 255), this.elevationOverlayColor, calculateOverlayAlphaFraction);
        int i2 = layer;
        if (calculateOverlayAlphaFraction > 0.0f) {
            int i3 = this.elevationOverlayAccentColor;
            i2 = layer;
            if (i3 != 0) {
                i2 = MaterialColors.layer(layer, ColorUtils.setAlphaComponent(i3, OVERLAY_ACCENT_COLOR_ALPHA));
            }
        }
        return ColorUtils.setAlphaComponent(i2, alpha);
    }

    public int compositeOverlayIfNeeded(int i, float f) {
        int i2 = i;
        if (this.elevationOverlayEnabled) {
            i2 = i;
            if (isThemeSurfaceColor(i)) {
                i2 = compositeOverlay(i, f);
            }
        }
        return i2;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.elevationOverlayEnabled;
    }
}

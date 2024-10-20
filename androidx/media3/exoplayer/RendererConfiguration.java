package androidx.media3.exoplayer;

/* loaded from: RendererConfiguration.class */
public final class RendererConfiguration {
    public static final RendererConfiguration DEFAULT = new RendererConfiguration(0, false);
    public final int offloadModePreferred;
    public final boolean tunneling;

    public RendererConfiguration(int i, boolean z) {
        this.offloadModePreferred = i;
        this.tunneling = z;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || RendererConfiguration.class != obj.getClass()) {
            return false;
        }
        RendererConfiguration rendererConfiguration = (RendererConfiguration) obj;
        if (this.offloadModePreferred != rendererConfiguration.offloadModePreferred || this.tunneling != rendererConfiguration.tunneling) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (this.offloadModePreferred << 1) + (this.tunneling ? 1 : 0);
    }
}

package androidx.media3.common;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: AuxEffectInfo.class */
public final class AuxEffectInfo {
    public final int effectId;
    public final float sendLevel;

    public AuxEffectInfo(int i, float f) {
        this.effectId = i;
        this.sendLevel = f;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || AuxEffectInfo.class != obj.getClass()) {
            return false;
        }
        AuxEffectInfo auxEffectInfo = (AuxEffectInfo) obj;
        if (this.effectId != auxEffectInfo.effectId || Float.compare(auxEffectInfo.sendLevel, this.sendLevel) != 0) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.effectId) * 31) + Float.floatToIntBits(this.sendLevel);
    }
}

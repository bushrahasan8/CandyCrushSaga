package androidx.appcompat.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.graphics.drawable.DrawableContainerCompat;

/* loaded from: StateListDrawableCompat.class */
public abstract class StateListDrawableCompat extends DrawableContainerCompat {
    private boolean mMutated;
    private StateListState mStateListState;

    /* loaded from: StateListDrawableCompat$StateListState.class */
    public static abstract class StateListState extends DrawableContainerCompat.DrawableContainerState {
        int[][] mStateSets;

        /* JADX WARN: Type inference failed for: r1v3, types: [int[], int[][]] */
        public StateListState(StateListState stateListState, StateListDrawableCompat stateListDrawableCompat, Resources resources) {
            super(stateListState, stateListDrawableCompat, resources);
            if (stateListState != null) {
                this.mStateSets = stateListState.mStateSets;
            } else {
                this.mStateSets = new int[getCapacity()];
            }
        }

        public int addStateSet(int[] iArr, Drawable drawable) {
            int addChild = addChild(drawable);
            this.mStateSets[addChild] = iArr;
            return addChild;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [int[], int[][], java.lang.Object] */
        @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        public void growArray(int i, int i2) {
            super.growArray(i, i2);
            ?? r0 = new int[i2];
            System.arraycopy(this.mStateSets, 0, r0, 0, i);
            this.mStateSets = r0;
        }

        public int indexOfStateSet(int[] iArr) {
            int[][] iArr2 = this.mStateSets;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        abstract void mutate();
    }

    public StateListDrawableCompat(StateListState stateListState) {
        if (stateListState != null) {
            setConstantState(stateListState);
        }
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    public int[] extractStateSet(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i >= attributeCount) {
                return StateSet.trimStateSet(iArr, i3);
            }
            int attributeNameResource = attributeSet.getAttributeNameResource(i);
            int i4 = i3;
            if (attributeNameResource != 0) {
                i4 = i3;
                if (attributeNameResource != 16842960) {
                    i4 = i3;
                    if (attributeNameResource != 16843161) {
                        iArr[i3] = attributeSet.getAttributeBooleanValue(i, false) ? attributeNameResource : -attributeNameResource;
                        i4 = i3 + 1;
                    }
                }
            }
            i++;
            i2 = i4;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.mMutated && super.mutate() == this) {
            this.mStateListState.mutate();
            this.mMutated = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected abstract boolean onStateChange(int[] iArr);

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public void setConstantState(DrawableContainerCompat.DrawableContainerState drawableContainerState) {
        super.setConstantState(drawableContainerState);
        if (drawableContainerState instanceof StateListState) {
            this.mStateListState = (StateListState) drawableContainerState;
        }
    }
}

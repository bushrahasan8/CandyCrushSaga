package androidx.core.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;

/* loaded from: ActivityOptionsCompat.class */
public abstract class ActivityOptionsCompat {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: ActivityOptionsCompat$ActivityOptionsCompatImpl.class */
    public static class ActivityOptionsCompatImpl extends ActivityOptionsCompat {
        private final ActivityOptions mActivityOptions;

        ActivityOptionsCompatImpl(ActivityOptions activityOptions) {
            this.mActivityOptions = activityOptions;
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public Bundle toBundle() {
            return this.mActivityOptions.toBundle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: ActivityOptionsCompat$Api16Impl.class */
    public static abstract class Api16Impl {
        static ActivityOptions makeCustomAnimation(Context context, int i, int i2) {
            return ActivityOptions.makeCustomAnimation(context, i, i2);
        }

        static ActivityOptions makeScaleUpAnimation(View view, int i, int i2, int i3, int i4) {
            return ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4);
        }

        static ActivityOptions makeThumbnailScaleUpAnimation(View view, Bitmap bitmap, int i, int i2) {
            return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2);
        }
    }

    protected ActivityOptionsCompat() {
    }

    public static ActivityOptionsCompat makeCustomAnimation(Context context, int i, int i2) {
        return new ActivityOptionsCompatImpl(Api16Impl.makeCustomAnimation(context, i, i2));
    }

    public abstract Bundle toBundle();
}

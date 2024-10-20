package bo.app;

import com.braze.models.IPutIntoJson;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: x5.class */
public enum x5 implements IPutIntoJson {
    SUBSCRIBED,
    UNSUBSCRIBED;

    /* loaded from: x5$a.class */
    public abstract /* synthetic */ class a {
        public static final int[] a;

        static {
            int[] iArr = new int[x5.values().length];
            try {
                iArr[x5.SUBSCRIBED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[x5.UNSUBSCRIBED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            a = iArr;
        }
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: v */
    public String forJsonPut() {
        String str;
        int i = a.a[ordinal()];
        if (i == 1) {
            str = "subscribed";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "unsubscribed";
        }
        return str;
    }
}

package androidx.media3.extractor.text.ssa;

import android.text.TextUtils;
import androidx.media3.common.util.Assertions;
import com.google.common.base.Ascii;
import com.ironsource.t2;

/* loaded from: SsaDialogueFormat.class */
final class SsaDialogueFormat {
    public final int endTimeIndex;
    public final int length;
    public final int startTimeIndex;
    public final int styleIndex;
    public final int textIndex;

    private SsaDialogueFormat(int i, int i2, int i3, int i4, int i5) {
        this.startTimeIndex = i;
        this.endTimeIndex = i2;
        this.styleIndex = i3;
        this.textIndex = i4;
        this.length = i5;
    }

    public static SsaDialogueFormat fromFormatLine(String str) {
        boolean z;
        Assertions.checkArgument(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < split.length; i5++) {
            String lowerCase = Ascii.toLowerCase(split[i5].trim());
            lowerCase.hashCode();
            switch (lowerCase.hashCode()) {
                case 100571:
                    if (lowerCase.equals("end")) {
                        z = false;
                        break;
                    }
                    break;
                case 3556653:
                    if (lowerCase.equals(t2.h.K0)) {
                        z = true;
                        break;
                    }
                    break;
                case 109757538:
                    if (lowerCase.equals("start")) {
                        z = 2;
                        break;
                    }
                    break;
                case 109780401:
                    if (lowerCase.equals("style")) {
                        z = 3;
                        break;
                    }
                    break;
            }
            z = -1;
            switch (z) {
                case false:
                    i2 = i5;
                    break;
                case true:
                    i3 = i5;
                    break;
                case true:
                    i = i5;
                    break;
                case true:
                    i4 = i5;
                    break;
            }
        }
        return (i == -1 || i2 == -1 || i3 == -1) ? null : new SsaDialogueFormat(i, i2, i4, i3, split.length);
    }
}

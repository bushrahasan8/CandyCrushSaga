package support.ada.embed;

import android.R;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

/* loaded from: R$styleable.class */
public abstract class R$styleable {
    public static int AdaEmbedView_ada_accept_third_party_cookies = 0;
    public static int AdaEmbedView_ada_cluster = 1;
    public static int AdaEmbedView_ada_device_token = 2;
    public static int AdaEmbedView_ada_greetings = 3;
    public static int AdaEmbedView_ada_handle = 4;
    public static int AdaEmbedView_ada_language = 5;
    public static int AdaEmbedView_ada_load_timeout = 6;
    public static int AdaEmbedView_ada_metaFields = 7;
    public static int AdaEmbedView_ada_sensitiveMetaFields = 8;
    public static int AdaEmbedView_ada_styles = 9;
    public static int[] ActionBar = {2130968701, 2130968708, 2130968709, 2130968927, 2130968928, 2130968929, 2130968930, 2130968931, 2130968932, 2130968971, 2130968997, 2130968998, 2130969031, 2130969140, 2130969147, 2130969155, 2130969156, 2130969160, 2130969184, 2130969207, 2130969331, 2130969434, 2130969489, 2130969506, 2130969507, 2130969631, 2130969635, 2130969771, 2130969784};
    public static int[] ActionBarLayout = {R.attr.layout_gravity};
    public static int[] ActionMenuItemView = {R.attr.minWidth};
    public static int[] ActionMenuView = new int[0];
    public static int[] ActionMode = {2130968701, 2130968708, 2130968850, 2130969140, 2130969635, 2130969784};
    public static int[] ActivityChooserView = {2130969057, 2130969190};
    public static int[] AdaEmbedView = {2130968620, 2130968621, 2130968622, 2130968623, 2130968624, 2130968625, 2130968626, 2130968627, 2130968628, 2130968629};
    public static int[] AlertDialog = {R.attr.layout, 2130968767, 2130968768, 2130969320, 2130969321, 2130969430, 2130969573, 2130969587};
    public static int[] AnimatedStateListDrawableCompat = {R.attr.dither, R.attr.visible, R.attr.variablePadding, R.attr.constantSize, R.attr.enterFadeDuration, R.attr.exitFadeDuration};
    public static int[] AnimatedStateListDrawableItem = {R.attr.id, R.attr.drawable};
    public static int[] AnimatedStateListDrawableTransition = {R.attr.drawable, R.attr.toId, R.attr.fromId, R.attr.reversible};
    public static int[] AppCompatImageView = {R.attr.src, 2130969606, 2130969769, 2130969770};
    public static int[] AppCompatSeekBar = {R.attr.thumb, 2130969764, 2130969765, 2130969766};
    public static int[] AppCompatTextHelper = {R.attr.textAppearance, R.attr.drawableTop, R.attr.drawableBottom, R.attr.drawableLeft, R.attr.drawableRight, R.attr.drawableStart, R.attr.drawableEnd};
    public static int[] AppCompatTextView = {R.attr.textAppearance, 2130968694, 2130968695, 2130968696, 2130968697, 2130968698, 2130969010, 2130969011, 2130969012, 2130969013, 2130969015, 2130969016, 2130969017, 2130969018, 2130969035, 2130969087, 2130969118, 2130969127, 2130969235, 2130969313, 2130969685, 2130969740};
    public static int[] AppCompatTheme = $d2j$hex$78259798$decode_I("57000101ae0001010200047f0300047f0400047f0500047f0600047f0700047f0800047f0900047f0a00047f0b00047f0c00047f0d00047f0e00047f1000047f1100047f1200047f1300047f1400047f1500047f1600047f1700047f1800047f1900047f1a00047f1b00047f1c00047f1d00047f1e00047f1f00047f2000047f2100047f2200047f2600047f5e00047f5f00047f6000047f6100047f7500047fa300047fb800047fb900047fba00047fbb00047fbc00047fc200047fc300047fde00047fe800047f1f01047f2001047f2101047f2301047f2401047f2501047f2601047f3701047f3901047f4401047f6e01047f9c01047fa101047fa201047fa801047fad01047fbe01047fbf01047fc301047fc401047fc601047f4302047f5602047fe402047fe502047fe602047fe702047fea02047feb02047fec02047fed02047fee02047fef02047ff002047ff102047ff202047f7603047f7703047f7803047f9003047f9203047faa03047fac03047fad03047fae03047fcc03047fcf03047fd103047fd203047ffe03047fff03047f3104047f6c04047f6e04047f6f04047f7004047f7204047f7304047f7404047f7504047f8004047f8104047fba04047fbb04047fbd04047fbe04047fe404047ff304047ff404047ff504047ff604047ff704047ff804047ff904047ffa04047ffb04047ffc04047f");
    public static int[] ButtonBarLayout = {2130968677};
    public static int[] ColorStateListItem = {R.attr.color, R.attr.alpha, 16844359, 2130968678, 2130969231};
    public static int[] CompoundButton = {R.attr.button, 2130968765, 2130968772, 2130968773};
    public static int[] DrawerArrowToggle = {2130968688, 2130968689, 2130968718, 2130968862, 2130969014, 2130969133, 2130969597, 2130969752};
    public static int[] FontFamily = {2130969119, 2130969120, 2130969121, 2130969122, 2130969123, 2130969124, 2130969125};
    public static int[] FontFamilyFont = {R.attr.font, R.attr.fontWeight, R.attr.fontStyle, R.attr.ttcIndex, R.attr.fontVariationSettings, 2130969117, 2130969126, 2130969127, 2130969128, 2130969816};
    public static int[] GradientColor = {R.attr.startColor, R.attr.endColor, R.attr.type, R.attr.centerX, R.attr.centerY, R.attr.gradientRadius, R.attr.tileMode, R.attr.centerColor, R.attr.startX, R.attr.startY, R.attr.endX, R.attr.endY};
    public static int[] GradientColorItem = {R.attr.color, R.attr.offset};
    public static int[] LinearLayoutCompat = {R.attr.gravity, R.attr.orientation, R.attr.baselineAligned, R.attr.baselineAlignedChildIndex, R.attr.weightSum, 2130968998, 2130969003, 2130969385, 2130969568};
    public static int[] LinearLayoutCompat_Layout = {R.attr.layout_gravity, R.attr.layout_width, R.attr.layout_height, R.attr.layout_weight};
    public static int[] ListPopupWindow = {R.attr.dropDownHorizontalOffset, R.attr.dropDownVerticalOffset};
    public static int[] MenuGroup = {R.attr.enabled, R.attr.id, R.attr.visible, R.attr.menuCategory, R.attr.orderInCategory, R.attr.checkableBehavior};
    public static int[] MenuItem = {R.attr.icon, R.attr.enabled, R.attr.id, R.attr.checked, R.attr.visible, R.attr.menuCategory, R.attr.orderInCategory, R.attr.title, R.attr.titleCondensed, R.attr.alphabeticShortcut, R.attr.numericShortcut, R.attr.checkable, R.attr.onClick, 2130968591, 2130968611, 2130968613, 2130968679, 2130968926, 2130969167, 2130969168, 2130969442, 2130969566, 2130969792};
    public static int[] MenuView = {R.attr.windowAnimationStyle, R.attr.itemTextAppearance, R.attr.horizontalDivider, R.attr.verticalDivider, R.attr.headerBackground, R.attr.itemBackground, R.attr.itemIconDisabledAlpha, 2130969504, 2130969625};
    public static int[] PopupWindow = {R.attr.popupBackground, R.attr.popupAnimationStyle, 2130969452};
    public static int[] PopupWindowBackgroundState = {2130969614};
    public static int[] RecycleListView = {2130969454, 2130969460};
    public static int[] SearchView = {R.attr.focusable, R.attr.maxWidth, R.attr.inputType, R.attr.imeOptions, 2130968843, 2130968917, 2130968980, 2130969135, 2130969169, 2130969237, 2130969511, 2130969512, 2130969546, 2130969547, 2130969630, 2130969639, 2130969834};
    public static int[] Spinner = {R.attr.entries, R.attr.popupBackground, R.attr.prompt, R.attr.dropDownWidth, 2130969489};
    public static int[] StateListDrawable = {R.attr.dither, R.attr.visible, R.attr.variablePadding, R.attr.constantSize, R.attr.enterFadeDuration, R.attr.exitFadeDuration};
    public static int[] StateListDrawableItem = {R.attr.drawable};
    public static int[] SwitchCompat = {R.attr.textOn, R.attr.textOff, R.attr.thumb, 2130969572, 2130969600, 2130969645, 2130969646, 2130969650, 2130969758, 2130969759, 2130969760, 2130969798, 2130969805, 2130969806};
    public static int[] TextAppearance = {R.attr.textSize, R.attr.typeface, R.attr.textStyle, R.attr.textColor, R.attr.textColorHint, R.attr.textColorLink, R.attr.shadowColor, R.attr.shadowDx, R.attr.shadowDy, R.attr.shadowRadius, R.attr.fontFamily, R.attr.textFontWeight, 2130969118, 2130969127, 2130969685, 2130969740};
    public static int[] Toolbar = {R.attr.gravity, R.attr.minHeight, 2130968766, 2130968851, 2130968852, 2130968927, 2130968928, 2130968929, 2130968930, 2130968931, 2130968932, 2130969331, 2130969333, 2130969378, 2130969386, 2130969431, 2130969432, 2130969489, 2130969631, 2130969633, 2130969634, 2130969771, 2130969775, 2130969776, 2130969777, 2130969778, 2130969779, 2130969780, 2130969782, 2130969783};
    public static int[] View = {R.attr.theme, R.attr.focusable, 2130969456, 2130969459, 2130969750};
    public static int[] ViewBackgroundHelper = {R.attr.background, 2130968710, 2130968711};
    public static int[] ViewStubCompat = {R.attr.id, R.attr.layout, R.attr.inflatedId};

    private static long[] $d2j$hex$78259798$decode_J(String src) {
        byte[] d = $d2j$hex$78259798$decode_B(src);
        ByteBuffer b = ByteBuffer.wrap(d);
        b.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s = b.asLongBuffer();
        long[] data = new long[d.length / 8];
        s.get(data);
        return data;
    }

    private static int[] $d2j$hex$78259798$decode_I(String src) {
        byte[] d = $d2j$hex$78259798$decode_B(src);
        ByteBuffer b = ByteBuffer.wrap(d);
        b.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s = b.asIntBuffer();
        int[] data = new int[d.length / 4];
        s.get(data);
        return data;
    }

    private static short[] $d2j$hex$78259798$decode_S(String src) {
        byte[] d = $d2j$hex$78259798$decode_B(src);
        ByteBuffer b = ByteBuffer.wrap(d);
        b.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s = b.asShortBuffer();
        short[] data = new short[d.length / 2];
        s.get(data);
        return data;
    }

    private static byte[] $d2j$hex$78259798$decode_B(String src) {
        int hh;
        int i;
        char[] d = src.toCharArray();
        byte[] ret = new byte[src.length() / 2];
        for (int i2 = 0; i2 < ret.length; i2++) {
            char h = d[2 * i2];
            char l = d[(2 * i2) + 1];
            if (h >= '0' && h <= '9') {
                hh = h - '0';
            } else if (h >= 'a' && h <= 'f') {
                hh = (h - 'a') + 10;
            } else if (h >= 'A' && h <= 'F') {
                hh = (h - 'A') + 10;
            } else {
                throw new RuntimeException();
            }
            if (l >= '0' && l <= '9') {
                i = l - '0';
            } else if (l >= 'a' && l <= 'f') {
                i = (l - 'a') + 10;
            } else if (l >= 'A' && l <= 'F') {
                i = (l - 'A') + 10;
            } else {
                throw new RuntimeException();
            }
            int ll = i;
            ret[i2] = (byte) ((hh << 4) | ll);
        }
        return ret;
    }
}

package com.king.core;

import androidx.annotation.Keep;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.onetrust.otpublishers.headless.Public.OTUIDisplayReason.OTUIDisplayReasonCode;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.HashMap;
import java.util.Map;

@Keep
/* loaded from: KeyboardMapping.class */
public class KeyboardMapping {
    private static final Map<Integer, Integer> mapping;

    static {
        HashMap hashMap = new HashMap();
        mapping = hashMap;
        hashMap.put(111, 1);
        hashMap.put(8, 2);
        hashMap.put(9, 3);
        hashMap.put(10, 4);
        hashMap.put(11, 5);
        hashMap.put(12, 6);
        hashMap.put(13, 7);
        hashMap.put(14, 8);
        hashMap.put(15, 9);
        hashMap.put(16, 10);
        hashMap.put(7, 11);
        hashMap.put(69, 12);
        hashMap.put(70, 13);
        hashMap.put(67, 14);
        hashMap.put(61, 15);
        hashMap.put(45, 16);
        hashMap.put(51, 17);
        hashMap.put(33, 18);
        hashMap.put(46, 19);
        hashMap.put(48, 20);
        hashMap.put(53, 21);
        hashMap.put(49, 22);
        hashMap.put(37, 23);
        hashMap.put(43, 24);
        hashMap.put(44, 25);
        hashMap.put(71, 26);
        hashMap.put(72, 27);
        hashMap.put(66, 28);
        hashMap.put(113, 29);
        hashMap.put(29, 30);
        hashMap.put(47, 31);
        hashMap.put(32, 32);
        hashMap.put(34, 33);
        hashMap.put(35, 34);
        hashMap.put(36, 35);
        hashMap.put(38, 36);
        hashMap.put(39, 37);
        hashMap.put(40, 38);
        hashMap.put(74, 39);
        hashMap.put(75, 40);
        hashMap.put(68, 41);
        hashMap.put(59, 42);
        hashMap.put(73, 43);
        hashMap.put(54, 44);
        hashMap.put(52, 45);
        hashMap.put(31, 46);
        hashMap.put(50, 47);
        hashMap.put(30, 48);
        hashMap.put(42, 49);
        hashMap.put(41, 50);
        hashMap.put(55, 51);
        hashMap.put(56, 52);
        hashMap.put(76, 53);
        hashMap.put(60, 54);
        hashMap.put(155, 55);
        hashMap.put(57, 56);
        hashMap.put(62, 57);
        hashMap.put(115, 58);
        hashMap.put(131, 59);
        hashMap.put(132, 60);
        hashMap.put(133, 61);
        hashMap.put(134, 62);
        hashMap.put(135, 63);
        hashMap.put(136, 64);
        hashMap.put(137, 65);
        hashMap.put(Integer.valueOf(Sdk$SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE), 66);
        hashMap.put(139, 67);
        hashMap.put(Integer.valueOf(IronSourceConstants.USING_CACHE_FOR_INIT_EVENT), 68);
        hashMap.put(143, 69);
        hashMap.put(116, 70);
        hashMap.put(151, 71);
        hashMap.put(152, 72);
        hashMap.put(153, 73);
        hashMap.put(156, 74);
        hashMap.put(148, 75);
        hashMap.put(149, 76);
        hashMap.put(Integer.valueOf(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED), 77);
        hashMap.put(157, 78);
        hashMap.put(145, 79);
        hashMap.put(146, 80);
        hashMap.put(147, 81);
        hashMap.put(144, 82);
        hashMap.put(159, 83);
        hashMap.put(141, 87);
        hashMap.put(142, 88);
        hashMap.put(218, 112);
        hashMap.put(216, 125);
        hashMap.put(161, 141);
        hashMap.put(88, 144);
        hashMap.put(77, 145);
        hashMap.put(87, 153);
        hashMap.put(160, 156);
        hashMap.put(114, 157);
        hashMap.put(91, 160);
        hashMap.put(210, 161);
        hashMap.put(85, 162);
        hashMap.put(86, 164);
        hashMap.put(25, 174);
        hashMap.put(24, 176);
        hashMap.put(154, 181);
        hashMap.put(120, 183);
        hashMap.put(58, 184);
        hashMap.put(127, 197);
        hashMap.put(19, 200);
        hashMap.put(92, 201);
        hashMap.put(21, 203);
        hashMap.put(22, 205);
        hashMap.put(123, 207);
        hashMap.put(20, 208);
        hashMap.put(93, 209);
        hashMap.put(124, 210);
        hashMap.put(112, Integer.valueOf(OTUIDisplayReasonCode.UIShownCode.PC_SHOWN_NEW_GROUP_ADDED));
        hashMap.put(26, 222);
        hashMap.put(223, 223);
        hashMap.put(224, 227);
        hashMap.put(23, 28);
        hashMap.put(4, 65281);
        hashMap.put(82, 65282);
    }

    private KeyboardMapping() {
        throw new IllegalStateException("Utility class");
    }

    public static int getFictionKeyCode(int i) {
        return mapping.get(Integer.valueOf(i)).intValue();
    }

    public static boolean hasMapping(int i) {
        return mapping.containsKey(Integer.valueOf(i));
    }
}

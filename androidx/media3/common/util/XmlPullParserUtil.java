package androidx.media3.common.util;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: XmlPullParserUtil.class */
public abstract class XmlPullParserUtil {
    public static String getAttributeValue(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static String getAttributeValueIgnorePrefix(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (stripPrefix(xmlPullParser.getAttributeName(i)).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static boolean isEndTag(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean isEndTag(XmlPullParser xmlPullParser, String str) {
        return isEndTag(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean isStartTag(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean isStartTag(XmlPullParser xmlPullParser, String str) {
        return isStartTag(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean isStartTagIgnorePrefix(XmlPullParser xmlPullParser, String str) {
        return isStartTag(xmlPullParser) && stripPrefix(xmlPullParser.getName()).equals(str);
    }

    private static String stripPrefix(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            str = str.substring(indexOf + 1);
        }
        return str;
    }
}

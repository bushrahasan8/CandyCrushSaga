package androidx.core.util;

/* loaded from: DebugUtils.class */
public abstract class DebugUtils {
    public static void buildShortClassTag(Object obj, StringBuilder sb) {
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        String str = simpleName;
        if (simpleName.length() <= 0) {
            String name = obj.getClass().getName();
            int lastIndexOf = name.lastIndexOf(46);
            str = name;
            if (lastIndexOf > 0) {
                str = name.substring(lastIndexOf + 1);
            }
        }
        sb.append(str);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}

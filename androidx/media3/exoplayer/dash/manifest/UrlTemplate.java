package androidx.media3.exoplayer.dash.manifest;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: UrlTemplate.class */
public final class UrlTemplate {
    private final List identifierFormatTags;
    private final List identifiers;
    private final List urlPieces;

    private UrlTemplate(List list, List list2, List list3) {
        this.urlPieces = list;
        this.identifiers = list2;
        this.identifierFormatTags = list3;
    }

    public static UrlTemplate compile(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        parseTemplate(str, arrayList, arrayList2, arrayList3);
        return new UrlTemplate(arrayList, arrayList2, arrayList3);
    }

    private static void parseTemplate(String str, List list, List list2, List list3) {
        String str2;
        boolean z;
        list.add("");
        int i = 0;
        while (i < str.length()) {
            int indexOf = str.indexOf("$", i);
            if (indexOf == -1) {
                list.set(list2.size(), ((String) list.get(list2.size())) + str.substring(i));
                i = str.length();
            } else if (indexOf != i) {
                list.set(list2.size(), ((String) list.get(list2.size())) + str.substring(i, indexOf));
                i = indexOf;
            } else if (str.startsWith("$$", i)) {
                list.set(list2.size(), ((String) list.get(list2.size())) + "$");
                i += 2;
            } else {
                list3.add("");
                int i2 = i + 1;
                int indexOf2 = str.indexOf("$", i2);
                String substring = str.substring(i2, indexOf2);
                if (substring.equals("RepresentationID")) {
                    list2.add(1);
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        String substring2 = substring.substring(indexOf3);
                        str2 = substring2;
                        if (!substring2.endsWith("d")) {
                            str2 = substring2;
                            if (!substring2.endsWith("x")) {
                                str2 = substring2;
                                if (!substring2.endsWith("X")) {
                                    str2 = substring2 + "d";
                                }
                            }
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    substring.hashCode();
                    switch (substring.hashCode()) {
                        case -1950496919:
                            if (substring.equals("Number")) {
                                z = false;
                                break;
                            }
                            break;
                        case 2606829:
                            if (substring.equals("Time")) {
                                z = true;
                                break;
                            }
                            break;
                        case 38199441:
                            if (substring.equals("Bandwidth")) {
                                z = 2;
                                break;
                            }
                            break;
                    }
                    z = -1;
                    switch (z) {
                        case false:
                            list2.add(2);
                            break;
                        case true:
                            list2.add(4);
                            break;
                        case true:
                            list2.add(3);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: " + str);
                    }
                    list3.set(list2.size() - 1, str2);
                }
                list.add("");
                i = indexOf2 + 1;
            }
        }
    }

    public String buildUri(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < this.identifiers.size(); i2++) {
            sb.append((String) this.urlPieces.get(i2));
            if (((Integer) this.identifiers.get(i2)).intValue() == 1) {
                sb.append(str);
            } else if (((Integer) this.identifiers.get(i2)).intValue() == 2) {
                sb.append(String.format(Locale.US, (String) this.identifierFormatTags.get(i2), Long.valueOf(j)));
            } else if (((Integer) this.identifiers.get(i2)).intValue() == 3) {
                sb.append(String.format(Locale.US, (String) this.identifierFormatTags.get(i2), Integer.valueOf(i)));
            } else if (((Integer) this.identifiers.get(i2)).intValue() == 4) {
                sb.append(String.format(Locale.US, (String) this.identifierFormatTags.get(i2), Long.valueOf(j2)));
            }
        }
        sb.append((String) this.urlPieces.get(this.identifiers.size()));
        return sb.toString();
    }
}

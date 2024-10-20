package com.facebook.appevents.ml;

import android.text.TextUtils;
import com.facebook.FacebookSdk;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: Utils.class */
public final class Utils {
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    public static final File getMlDir() {
        File file = new File(FacebookSdk.getApplicationContext().getFilesDir(), "facebook_ml/");
        File file2 = file;
        if (!file.exists()) {
            file2 = file.mkdirs() ? file : null;
        }
        return file2;
    }

    public static final Map parseModelWeights(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int available = fileInputStream.available();
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            byte[] bArr = new byte[available];
            dataInputStream.readFully(bArr);
            dataInputStream.close();
            if (available < 4) {
                return null;
            }
            ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            int i = wrap.getInt();
            int i2 = i + 4;
            if (available < i2) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(new String(bArr, 4, i, Charsets.UTF_8));
            JSONArray names = jSONObject.names();
            int length = names.length();
            String[] strArr = new String[length];
            for (int i3 = 0; i3 < length; i3++) {
                strArr[i3] = names.getString(i3);
            }
            ArraysKt.sort(strArr);
            HashMap hashMap = new HashMap();
            for (int i4 = 0; i4 < length; i4++) {
                String str = strArr[i4];
                if (str != null) {
                    JSONArray jSONArray = jSONObject.getJSONArray(str);
                    int length2 = jSONArray.length();
                    int[] iArr = new int[length2];
                    int i5 = 1;
                    for (int i6 = 0; i6 < length2; i6++) {
                        int i7 = jSONArray.getInt(i6);
                        iArr[i6] = i7;
                        i5 *= i7;
                    }
                    int i8 = i5 * 4;
                    int i9 = i2 + i8;
                    if (i9 > available) {
                        return null;
                    }
                    ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i2, i8);
                    wrap2.order(ByteOrder.LITTLE_ENDIAN);
                    MTensor mTensor = new MTensor(iArr);
                    wrap2.asFloatBuffer().get(mTensor.getData(), 0, i5);
                    hashMap.put(str, mTensor);
                    i2 = i9;
                }
            }
            return hashMap;
        } catch (Exception e) {
            return null;
        }
    }

    public final String normalizeString(String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String join = TextUtils.join(" ", (String[]) new Regex("\\s+").split(str.subSequence(i, length + 1).toString(), 0).toArray(new String[0]));
        Intrinsics.checkNotNullExpressionValue(join, "join(\" \", strArray)");
        return join;
    }

    public final int[] vectorize(String texts, int i) {
        Intrinsics.checkNotNullParameter(texts, "texts");
        int[] iArr = new int[i];
        String normalizeString = normalizeString(texts);
        Charset forName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-8\")");
        byte[] bytes = normalizeString.getBytes(forName);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < bytes.length) {
                iArr[i2] = bytes[i2] & 255;
            } else {
                iArr[i2] = 0;
            }
        }
        return iArr;
    }
}

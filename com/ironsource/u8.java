package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* loaded from: u8.class */
public class u8 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: u8$a.class */
    public class a extends GZIPOutputStream {
        final int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(OutputStream outputStream, int i) {
            super(outputStream);
            this.a = i;
            if (i < 0 || i > 9) {
                return;
            }
            ((GZIPOutputStream) this).def.setLevel(i);
        }
    }

    public static String a(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, "UTF-8"));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return sb.toString();
                }
                sb.append(readLine);
            }
        } catch (Exception e) {
            IronLog.INTERNAL.error("exception while decompressing " + e);
            return null;
        } catch (OutOfMemoryError e2) {
            String str = "Error while decompressing:" + e2.getMessage();
            IronLog.INTERNAL.error(str);
            b(str);
            return null;
        }
    }

    public static byte[] a(String str) throws Exception {
        return a(str, -1);
    }

    public static byte[] a(String str, int i) throws Exception {
        byte[] bArr;
        byte[] bArr2 = new byte[0];
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            a aVar = new a(byteArrayOutputStream, i);
            aVar.write(str.getBytes());
            aVar.close();
            bArr = byteArrayOutputStream.toByteArray();
            bArr2 = bArr;
            byteArrayOutputStream.close();
        } catch (OutOfMemoryError e) {
            String str2 = "Error while compressing:" + e.getMessage();
            IronLog.INTERNAL.error(str2);
            b(str2);
            bArr = bArr2;
        }
        return bArr;
    }

    private static void b(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, str);
        } catch (Exception e) {
            IronLog.INTERNAL.error(e.getMessage());
        }
        dc.i().a(new l4(81321, jSONObject));
    }
}

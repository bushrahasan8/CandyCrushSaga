package com.ironsource.mediationsdk.utils;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.h4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.u8;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: IronSourceAES.class */
public class IronSourceAES {
    private static SecretKeySpec a(String str) {
        int i = 32;
        byte[] bArr = new byte[32];
        Arrays.fill(bArr, (byte) 0);
        byte[] bytes = str.getBytes("UTF-8");
        if (bytes.length < 32) {
            i = bytes.length;
        }
        System.arraycopy(bytes, 0, bArr, 0, i);
        return new SecretKeySpec(bArr, "AES");
    }

    public static String compressAndEncrypt(String str) {
        String compressAndEncrypt;
        synchronized (IronSourceAES.class) {
            try {
                compressAndEncrypt = compressAndEncrypt(h4.b().c(), str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return compressAndEncrypt;
    }

    public static String compressAndEncrypt(String str, String str2) {
        synchronized (IronSourceAES.class) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    return "";
                }
                try {
                    byte[] a = u8.a(str2);
                    if (a != null) {
                        return encodeFromBytes(str, a);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return "";
            } finally {
            }
        }
    }

    public static String decode(String str, String str2) {
        synchronized (IronSourceAES.class) {
            try {
                byte[] decodeToBytes = decodeToBytes(str, str2);
                if (decodeToBytes == null) {
                    return "";
                }
                return new String(decodeToBytes);
            } finally {
            }
        }
    }

    public static byte[] decodeToBytes(String str, String str2) {
        synchronized (IronSourceAES.class) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                if (TextUtils.isEmpty(str2)) {
                    return null;
                }
                SecretKeySpec a = a(str);
                byte[] bArr = new byte[16];
                Arrays.fill(bArr, (byte) 0);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                byte[] decode = Base64.decode(str2, 0);
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(2, a, ivParameterSpec);
                return cipher.doFinal(decode);
            } catch (Exception e) {
                IronLog.INTERNAL.error("exception on decryption error: " + e.getMessage());
                e.printStackTrace();
                return null;
            } finally {
            }
        }
    }

    public static String decryptAndDecompress(String str) {
        String decryptAndDecompress;
        synchronized (IronSourceAES.class) {
            try {
                decryptAndDecompress = decryptAndDecompress(h4.b().c(), str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return decryptAndDecompress;
    }

    public static String decryptAndDecompress(String str, String str2) {
        synchronized (IronSourceAES.class) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    return "";
                }
                try {
                    byte[] decodeToBytes = decodeToBytes(str, str2);
                    if (decodeToBytes != null) {
                        return u8.a(decodeToBytes);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return "";
            } finally {
            }
        }
    }

    public static String encode(String str, String str2) {
        synchronized (IronSourceAES.class) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                if (TextUtils.isEmpty(str2)) {
                    return "";
                }
                try {
                    return encodeFromBytes(str, str2.getBytes("UTF8"));
                } catch (Exception e) {
                    e.printStackTrace();
                    return "";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @SuppressLint({"TrulyRandom"})
    public static String encodeFromBytes(String str, byte[] bArr) {
        synchronized (IronSourceAES.class) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                if (bArr == null) {
                    return "";
                }
                try {
                    SecretKeySpec a = a(str);
                    byte[] bArr2 = new byte[16];
                    Arrays.fill(bArr2, (byte) 0);
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                    cipher.init(1, a, ivParameterSpec);
                    return Base64.encodeToString(cipher.doFinal(bArr), 0).replaceAll(System.getProperty("line.separator"), "");
                } catch (Exception e) {
                    e.printStackTrace();
                    return "";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String encrypt(String str) {
        String encode;
        synchronized (IronSourceAES.class) {
            try {
                encode = encode(h4.b().c(), str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return encode;
    }
}

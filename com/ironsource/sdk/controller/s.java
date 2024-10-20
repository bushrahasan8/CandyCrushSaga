package com.ironsource.sdk.controller;

import com.ironsource.aa;
import com.ironsource.t2;
import java.security.MessageDigest;
import java.util.UUID;

/* loaded from: s.class */
final class s {
    private String a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(String str) {
        this.a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a() {
        return UUID.randomUUID().toString();
    }

    private String a(String str) {
        String b;
        try {
            b = aa.a(str);
        } catch (Exception e) {
            e.printStackTrace();
            b = b(str);
        }
        return b;
    }

    private String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            String str = hexString;
            if (hexString.length() < 2) {
                str = t2.h + hexString;
            }
            sb.append(str);
        }
        return sb.toString();
    }

    private String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return a(messageDigest.digest());
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str, String str2, String str3) {
        try {
            return str3.equalsIgnoreCase(a(str + str2 + this.a));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.a;
    }
}

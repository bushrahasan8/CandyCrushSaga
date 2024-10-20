package com.onetrust.otpublishers.headless.Public.Response;

/* loaded from: OTResponse.class */
public class OTResponse {
    public final String a;
    public final int b;
    public final String c;
    public final String d;

    public OTResponse(String str, int i, String str2, String str3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
    }

    public int getResponseCode() {
        return this.b;
    }

    public String getResponseData() {
        return this.d;
    }

    public String getResponseMessage() {
        return this.c;
    }

    public String getResponseType() {
        return this.a;
    }

    public String toString() {
        return "OTResponse{responseType='" + this.a + "', responseCode=" + this.b + ", responseMessage='" + this.c + "', responseData='" + this.d + "'}";
    }
}

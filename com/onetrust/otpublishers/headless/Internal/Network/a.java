package com.onetrust.otpublishers.headless.Internal.Network;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Url;

/* loaded from: a.class */
public interface a {
    @Headers({"Content-Type: application/json"})
    @GET
    Call<String> a(@Url String str);

    @Headers({"Content-Type: application/json"})
    @POST
    Call<String> a(@Url String str, @Body String str2);

    @Headers({"Content-Type: application/json"})
    @POST
    Call<String> b(@Url String str);
}

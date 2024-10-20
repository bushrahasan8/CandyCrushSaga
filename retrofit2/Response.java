package retrofit2;

import java.util.Objects;
import okhttp3.ResponseBody;

/* loaded from: Response.class */
public final class Response<T> {
    private final Object body;
    private final ResponseBody errorBody;
    private final okhttp3.Response rawResponse;

    private Response(okhttp3.Response response, Object obj, ResponseBody responseBody) {
        this.rawResponse = response;
        this.body = obj;
        this.errorBody = responseBody;
    }

    public static Response error(ResponseBody responseBody, okhttp3.Response response) {
        Objects.requireNonNull(responseBody, "body == null");
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.isSuccessful()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new Response(response, null, responseBody);
    }

    public static Response success(Object obj, okhttp3.Response response) {
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.isSuccessful()) {
            return new Response(response, obj, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public Object body() {
        return this.body;
    }

    public int code() {
        return this.rawResponse.code();
    }

    public boolean isSuccessful() {
        return this.rawResponse.isSuccessful();
    }

    public String message() {
        return this.rawResponse.message();
    }

    public okhttp3.Response raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }
}

package okhttp3;

/* loaded from: Interceptor.class */
public interface Interceptor {

    /* loaded from: Interceptor$Chain.class */
    public interface Chain {
        Call call();

        Response proceed(Request request);

        Request request();
    }

    Response intercept(Chain chain);
}

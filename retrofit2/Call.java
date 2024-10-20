package retrofit2;

import okhttp3.Request;

/* loaded from: Call.class */
public interface Call<T> extends Cloneable {
    void cancel();

    /* renamed from: clone */
    Call mo7719clone();

    void enqueue(Callback callback);

    Response execute();

    boolean isCanceled();

    Request request();
}

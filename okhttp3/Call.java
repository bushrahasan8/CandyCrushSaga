package okhttp3;

/* loaded from: Call.class */
public interface Call extends Cloneable {

    /* loaded from: Call$Factory.class */
    public interface Factory {
        Call newCall(Request request);
    }

    void cancel();

    void enqueue(Callback callback);

    Response execute();

    boolean isCanceled();

    Request request();
}

package okhttp3;

import java.io.IOException;

/* loaded from: Callback.class */
public interface Callback {
    void onFailure(Call call, IOException iOException);

    void onResponse(Call call, Response response);
}

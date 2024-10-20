package com.google.firebase.messaging;

import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: RequestDeduplicator.class */
public class RequestDeduplicator {
    private final Executor executor;
    private final Map getTokenRequests = new ArrayMap();

    /* loaded from: RequestDeduplicator$GetTokenRequest.class */
    interface GetTokenRequest {
        Task start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RequestDeduplicator(Executor executor) {
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getOrStartGetTokenRequest$0(String str, Task task) {
        synchronized (this) {
            this.getTokenRequests.remove(str);
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task getOrStartGetTokenRequest(final String str, GetTokenRequest getTokenRequest) {
        synchronized (this) {
            Task task = (Task) this.getTokenRequests.get(str);
            if (task != null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
                }
                return task;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Making new request for: " + str);
            }
            Task continueWithTask = getTokenRequest.start().continueWithTask(this.executor, new Continuation(this, str) { // from class: com.google.firebase.messaging.RequestDeduplicator$$ExternalSyntheticLambda0
                public final RequestDeduplicator f$0;
                public final String f$1;

                {
                    this.f$0 = this;
                    this.f$1 = str;
                }

                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    Task lambda$getOrStartGetTokenRequest$0;
                    lambda$getOrStartGetTokenRequest$0 = this.f$0.lambda$getOrStartGetTokenRequest$0(this.f$1, task2);
                    return lambda$getOrStartGetTokenRequest$0;
                }
            });
            this.getTokenRequests.put(str, continueWithTask);
            return continueWithTask;
        }
    }
}

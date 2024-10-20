package androidx.lifecycle;

import android.app.Application;

/* loaded from: AndroidViewModel.class */
public abstract class AndroidViewModel extends ViewModel {
    private Application mApplication;

    public AndroidViewModel(Application application) {
        this.mApplication = application;
    }

    public Application getApplication() {
        return this.mApplication;
    }
}

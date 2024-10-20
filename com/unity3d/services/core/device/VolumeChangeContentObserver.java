package com.unity3d.services.core.device;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: VolumeChangeContentObserver.class */
public final class VolumeChangeContentObserver implements VolumeChange {
    private ContentObserver contentObserver;
    private List<VolumeChangeListener> listeners = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public final void triggerListeners() {
        synchronized (this) {
            for (VolumeChangeListener volumeChangeListener : this.listeners) {
                volumeChangeListener.onVolumeChanged(Device.getStreamVolume(volumeChangeListener.getStreamType()));
            }
        }
    }

    @Override // com.unity3d.services.core.device.VolumeChange
    public void clearAllListeners() {
        synchronized (this) {
            this.listeners.clear();
            stopObserving();
        }
    }

    @Override // com.unity3d.services.core.device.VolumeChange
    public void registerListener(VolumeChangeListener volumeChangeListener) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(volumeChangeListener, "volumeChangeListener");
            if (!this.listeners.contains(volumeChangeListener)) {
                startObserving();
                this.listeners.add(volumeChangeListener);
            }
        }
    }

    @Override // com.unity3d.services.core.device.VolumeChange
    public void startObserving() {
        ContentResolver contentResolver;
        synchronized (this) {
            if (this.contentObserver != null) {
                return;
            }
            final Handler handler = new Handler(Looper.getMainLooper());
            this.contentObserver = new ContentObserver(this, handler) { // from class: com.unity3d.services.core.device.VolumeChangeContentObserver$startObserving$1
                final VolumeChangeContentObserver this$0;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.this$0 = this;
                }

                @Override // android.database.ContentObserver
                public boolean deliverSelfNotifications() {
                    return false;
                }

                @Override // android.database.ContentObserver
                public void onChange(boolean z, Uri uri) {
                    this.this$0.triggerListeners();
                }
            };
            Context applicationContext = ClientProperties.getApplicationContext();
            if (applicationContext != null && (contentResolver = applicationContext.getContentResolver()) != null) {
                Uri uri = Settings.System.CONTENT_URI;
                ContentObserver contentObserver = this.contentObserver;
                Intrinsics.checkNotNull(contentObserver, "null cannot be cast to non-null type android.database.ContentObserver");
                contentResolver.registerContentObserver(uri, true, contentObserver);
            }
        }
    }

    @Override // com.unity3d.services.core.device.VolumeChange
    public void stopObserving() {
        ContentResolver contentResolver;
        synchronized (this) {
            if (this.contentObserver == null) {
                return;
            }
            Context applicationContext = ClientProperties.getApplicationContext();
            if (applicationContext != null && (contentResolver = applicationContext.getContentResolver()) != null) {
                ContentObserver contentObserver = this.contentObserver;
                Intrinsics.checkNotNull(contentObserver);
                contentResolver.unregisterContentObserver(contentObserver);
            }
            this.contentObserver = null;
        }
    }

    @Override // com.unity3d.services.core.device.VolumeChange
    public void unregisterListener(VolumeChangeListener volumeChangeListener) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(volumeChangeListener, "volumeChangeListener");
            this.listeners.remove(volumeChangeListener);
            if (this.listeners.isEmpty()) {
                stopObserving();
            }
        }
    }
}

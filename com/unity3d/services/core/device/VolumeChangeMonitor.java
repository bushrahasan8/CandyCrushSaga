package com.unity3d.services.core.device;

import android.util.SparseArray;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: VolumeChangeMonitor.class */
public final class VolumeChangeMonitor {
    private final IEventSender eventSender;
    private final VolumeChange volumeChange;
    private final SparseArray<VolumeChangeListener> volumeChangeListeners;

    public VolumeChangeMonitor(IEventSender eventSender, VolumeChange volumeChange) {
        Intrinsics.checkNotNullParameter(eventSender, "eventSender");
        Intrinsics.checkNotNullParameter(volumeChange, "volumeChange");
        this.eventSender = eventSender;
        this.volumeChange = volumeChange;
        this.volumeChangeListeners = new SparseArray<>();
    }

    public final void registerVolumeChangeListener(final int i) {
        if (this.volumeChangeListeners.get(i) == null) {
            VolumeChangeListener volumeChangeListener = new VolumeChangeListener(this, i) { // from class: com.unity3d.services.core.device.VolumeChangeMonitor$registerVolumeChangeListener$listener$1
                final int $streamType;
                final VolumeChangeMonitor this$0;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.this$0 = this;
                    this.$streamType = i;
                }

                @Override // com.unity3d.services.core.device.VolumeChangeListener
                public int getStreamType() {
                    return this.$streamType;
                }

                @Override // com.unity3d.services.core.device.VolumeChangeListener
                public void onVolumeChanged(int i2) {
                    IEventSender iEventSender;
                    iEventSender = this.this$0.eventSender;
                    iEventSender.sendEvent(WebViewEventCategory.DEVICEINFO, DeviceInfoEvent.VOLUME_CHANGED, Integer.valueOf(getStreamType()), Integer.valueOf(i2), Integer.valueOf(Device.getStreamMaxVolume(this.$streamType)));
                }
            };
            this.volumeChangeListeners.append(i, volumeChangeListener);
            this.volumeChange.registerListener(volumeChangeListener);
        }
    }

    public final void unregisterVolumeChangeListener(int i) {
        if (this.volumeChangeListeners.get(i) != null) {
            VolumeChangeListener listener = this.volumeChangeListeners.get(i);
            VolumeChange volumeChange = this.volumeChange;
            Intrinsics.checkNotNullExpressionValue(listener, "listener");
            volumeChange.unregisterListener(listener);
            this.volumeChangeListeners.remove(i);
        }
    }
}

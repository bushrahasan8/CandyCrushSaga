package androidx.media3.common;

/* loaded from: VideoGraph.class */
public interface VideoGraph {

    /* loaded from: VideoGraph$Listener.class */
    public interface Listener {
    }

    VideoFrameProcessor getProcessor(int i);

    int registerInput();
}

package androidx.media3.decoder;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.drive.DriveFile;

/* loaded from: Buffer.class */
public abstract class Buffer {
    private int flags;

    public final void addFlag(int i) {
        this.flags = i | this.flags;
    }

    public void clear() {
        this.flags = 0;
    }

    public final void clearFlag(int i) {
        this.flags = (i ^ (-1)) & this.flags;
    }

    public final boolean getFlag(int i) {
        return (this.flags & i) == i;
    }

    public final boolean hasSupplementalData() {
        return getFlag(DriveFile.MODE_READ_ONLY);
    }

    public final boolean isDecodeOnly() {
        return getFlag(RecyclerView.UNDEFINED_DURATION);
    }

    public final boolean isEndOfStream() {
        return getFlag(4);
    }

    public final boolean isFirstSample() {
        return getFlag(134217728);
    }

    public final boolean isKeyFrame() {
        return getFlag(1);
    }

    public final boolean isLastSample() {
        return getFlag(DriveFile.MODE_WRITE_ONLY);
    }

    public final void setFlags(int i) {
        this.flags = i;
    }
}

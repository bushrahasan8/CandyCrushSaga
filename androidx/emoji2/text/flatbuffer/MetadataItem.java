package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: MetadataItem.class */
public final class MetadataItem extends Table {
    public MetadataItem __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public int codepoints(int i) {
        int __offset = __offset(16);
        return __offset != 0 ? this.bb.getInt(__vector(__offset) + (i * 4)) : 0;
    }

    public int codepointsLength() {
        int __offset = __offset(16);
        return __offset != 0 ? __vector_len(__offset) : 0;
    }

    public boolean emojiStyle() {
        int __offset = __offset(6);
        boolean z = false;
        if (__offset != 0) {
            z = false;
            if (this.bb.get(__offset + this.bb_pos) != 0) {
                z = true;
            }
        }
        return z;
    }

    public short height() {
        int __offset = __offset(14);
        return __offset != 0 ? this.bb.getShort(__offset + this.bb_pos) : (short) 0;
    }

    public int id() {
        int __offset = __offset(4);
        return __offset != 0 ? this.bb.getInt(__offset + this.bb_pos) : 0;
    }

    public short sdkAdded() {
        int __offset = __offset(8);
        return __offset != 0 ? this.bb.getShort(__offset + this.bb_pos) : (short) 0;
    }

    public short width() {
        int __offset = __offset(12);
        return __offset != 0 ? this.bb.getShort(__offset + this.bb_pos) : (short) 0;
    }
}

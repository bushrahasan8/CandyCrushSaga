package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: Composer.class */
public class Composer {
    public final JsonWriter writer;
    private boolean writingFirst;

    public Composer(JsonWriter writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.writer = writer;
        this.writingFirst = true;
    }

    public final boolean getWritingFirst() {
        return this.writingFirst;
    }

    public void indent() {
        this.writingFirst = true;
    }

    public void nextItem() {
        this.writingFirst = false;
    }

    public void print(byte b) {
        this.writer.writeLong(b);
    }

    public final void print(char c) {
        this.writer.writeChar(c);
    }

    public void print(double d) {
        this.writer.write(String.valueOf(d));
    }

    public void print(float f) {
        this.writer.write(String.valueOf(f));
    }

    public void print(int i) {
        this.writer.writeLong(i);
    }

    public void print(long j) {
        this.writer.writeLong(j);
    }

    public final void print(String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.writer.write(v);
    }

    public void print(short s) {
        this.writer.writeLong(s);
    }

    public void print(boolean z) {
        this.writer.write(String.valueOf(z));
    }

    public final void printQuoted(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.writer.writeQuoted(value);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setWritingFirst(boolean z) {
        this.writingFirst = z;
    }

    public void space() {
    }

    public void unIndent() {
    }
}

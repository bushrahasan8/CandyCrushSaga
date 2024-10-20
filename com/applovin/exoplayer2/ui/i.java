package com.applovin.exoplayer2.ui;

/* loaded from: i.class */
public interface i {

    /* loaded from: i$a.class */
    public interface a {
        void a(i iVar, long j);

        void a(i iVar, long j, boolean z);

        void b(i iVar, long j);
    }

    void a(a aVar);

    void a(long[] jArr, boolean[] zArr, int i);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setPosition(long j);
}

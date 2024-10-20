package androidx.media3.exoplayer.upstream;

/* loaded from: Allocator.class */
public interface Allocator {

    /* loaded from: Allocator$AllocationNode.class */
    public interface AllocationNode {
        Allocation getAllocation();

        AllocationNode next();
    }

    Allocation allocate();

    int getIndividualAllocationLength();

    void release(Allocation allocation);

    void release(AllocationNode allocationNode);

    void trim();
}

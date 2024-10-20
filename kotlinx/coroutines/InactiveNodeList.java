package kotlinx.coroutines;

/* loaded from: InactiveNodeList.class */
public final class InactiveNodeList implements Incomplete {
    private final NodeList list;

    public InactiveNodeList(NodeList nodeList) {
        this.list = nodeList;
    }

    @Override // kotlinx.coroutines.Incomplete
    public NodeList getList() {
        return this.list;
    }

    @Override // kotlinx.coroutines.Incomplete
    public boolean isActive() {
        return false;
    }

    public String toString() {
        return super.toString();
    }
}

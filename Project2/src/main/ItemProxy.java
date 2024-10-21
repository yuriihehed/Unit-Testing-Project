package Project2.src.main;

public class ItemProxy {
    private Item base;
    private ItemProxy next;

    public ItemProxy(Item base) {
        this.base = base;
    }

    public String getName() {
        return base.getName();
    }

    public Node getBase() {
        return base;
    }

    // using this for adding methods to handle linked list traversal
    public ItemProxy getNext() {
        return next;
    }

    public void setNext(ItemProxy next) {
        this.next = next;
    }

    public void killParentName(String name) {
    }
}

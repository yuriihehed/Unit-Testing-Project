package Project2.src.main;

public class ItemProxy {
    private Item base;

    public ItemProxy(Item base) {
        this.base = base;
    }

    public String getName() {
        return base.getName();
    }

    public Node getBase() {
        return base;
    }

    public void killParentName(String name) {
        // Placeholder for future implementation
    }
}

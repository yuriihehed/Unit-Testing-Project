package Project2.src.main;

public class BucketProxy {
    private Bucket base;

    public BucketProxy(Bucket base) {
        this.base = base;
    }

    public String getName() {
        return base.getName();
    }

    public Node getBase() {
        return base;
    }
}

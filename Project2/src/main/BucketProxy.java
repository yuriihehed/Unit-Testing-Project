package Project2.src.main;

public class BucketProxy {
    private Bucket base;
    private BucketProxy next;

    public BucketProxy(Bucket base) {
        this.base = base;
    }

    public String getName() {
        return base.getName();
    }

    // Update this to return a Bucket
    public Bucket getBase() {
        return base;
    }

    public BucketProxy getNext() {
        return next;
    }

    public void setNext(BucketProxy next) {
        this.next = next;
    }
}

package Project2.src.main;

public class Item extends Node {
    private String name; 
    private BucketProxy firstBucketProxy; 

    public Item(String name) {
        if (name.length() > 32) {
            throw new IllegalArgumentException("Item name exceeds 32 characters.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //linked list structure
    public void addBucket(Bucket bucket) {
        BucketProxy newBucketProxy = new BucketProxy(bucket);
        newBucketProxy.setNext(firstBucketProxy);
        firstBucketProxy = newBucketProxy;
    }

    public void removeBucket(String bucketName) {
        if (firstBucketProxy == null) return; 

        if (firstBucketProxy.getName().equals(bucketName)) {
            firstBucketProxy = firstBucketProxy.getNext(); 
            return;
        }

        BucketProxy current = firstBucketProxy;
        while (current.getNext() != null) {
            BucketProxy nextBucket = (BucketProxy) current.getNext();
            if (nextBucket.getName().equals(bucketName)) {
                current.setNext(nextBucket.getNext()); 
                return;
            }
            current = nextBucket;
        }
    }

    // clear items
    public void clear() {
        firstBucketProxy = null; 
    }

    public BucketProxy findBucket(String bucketName) {
        BucketProxy current = firstBucketProxy;
        while (current != null) {
            if (current.getName().equals(bucketName)) {
                return current; 
            }
            current = (BucketProxy) current.getNext();
        }
        return null; 
    }

    public void getBuckets() {
        BucketProxy current = firstBucketProxy;
        while (current != null) {
            System.out.println(current.getName()); 
            current = (BucketProxy) current.getNext();
        }
    }
}

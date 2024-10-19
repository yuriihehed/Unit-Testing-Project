package Project2.src.main;

public class Item extends Node {
    private String name; // max 32 chars
    private BucketProxy firstBucketProxy; // Head of the bucket list
    private BucketProxy[] bucketProxies;

    public Item(String name) {
        if (name.length() > 32) {
            throw new IllegalArgumentException("Item name exceeds 32 characters.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addBucket(Bucket bucket) {
        BucketProxy newBucketProxy = new BucketProxy(bucket); // Create a new proxy for the bucket

        // If firstBucketProxy is null, initialize the head
        if (firstBucketProxy == null) {
            firstBucketProxy = newBucketProxy;
        } else {
            // Add the newBucketProxy to our array manually
            for (int i = 0; i < bucketProxies.length; i++) {
                if (bucketProxies[i] == null) {
                    bucketProxies[i] = newBucketProxy;
                    break; // Add the proxy and stop
                }
            }
        }
    }

    public void removeBucket(String bucketName) {
        // Placeholder for future implementation

    }

    public void clear() {
        // Placeholder for future implementation
    }

    public BucketProxy findBucket(String bucketName) {
        for (BucketProxy bucketProxy : bucketProxies) {
            if (bucketProxy != null && bucketProxy.getName().equals(bucketName)) {
                return bucketProxy;
            }
        }
        return null;
    }


    public void getBucket() {

    }
}

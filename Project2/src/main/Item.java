package Project2.src.main;

public class Item extends Node {
    private String name; // max 32 chars
    private BucketProxy firstBucketProxy; // Head of the bucket list

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
        // Placeholder for future implementation
    }

    public void removeBucket(String bucketName) {
        // Placeholder for future implementation
    }

    public void clear() {
        // Placeholder for future implementation
    }

    public BucketProxy findBucket(String bucketName) {
        return null; // Placeholder for future implementation
    }
}

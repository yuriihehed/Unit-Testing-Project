package Project2.src.main;

public class BucketController {
    private Bucket firstBucket; 

    public BucketProxy findBucket(String bucketName) {
        Bucket current = firstBucket;
        while (current != null) {
            if (current.getName().equals(bucketName)) {
                return new BucketProxy(current); 
            }
            current = (Bucket) current.getNext();
        }
        return null; 
    }

    public void getBucketItems(String bucketName) {
        BucketProxy bucketProxy = findBucket(bucketName);
        if (bucketProxy != null) {
            System.out.println("Listing items for bucket: " + bucketName);
        } else {
            System.out.println("Bucket not found: " + bucketName);
        }
    }

    public void addBucket(String bucketName) {
        // Check for duplicates
        if (findBucket(bucketName) != null) {
            System.out.println("Bucket with the name \"" + bucketName + "\" already exists.");
            return;
        }
        Bucket newBucket = new Bucket(bucketName);
        newBucket.setNext(firstBucket); // fisrt = beginning of the list
        firstBucket = newBucket;
    }

    public void removeBucket(String bucketName) {
        if (firstBucket == null) return; 

        if (firstBucket.getName().equals(bucketName)) {
            firstBucket = (Bucket) firstBucket.getNext(); 
            return;
        }

        Bucket current = firstBucket;
        while (current.getNext() != null) {
            Bucket nextBucket = (Bucket) current.getNext();
            if (nextBucket.getName().equals(bucketName)) {
                current.setNext(nextBucket.getNext()); // bypass the bucket
                return;
            }
            current = nextBucket;
        }
    }

    public ItemProxy findItem(String itemName) {
        Bucket currentBucket = firstBucket;
        while (currentBucket != null) {
            ItemProxy item = currentBucket.findItem(itemName); 
            if (item != null) {
                return item; 
            }
            currentBucket = (Bucket) currentBucket.getNext();
        }
        return null; 
    }

    public void addItemToBucket(String itemName, String bucketName) {
        BucketProxy bucketProxy = findBucket(bucketName);
        if (bucketProxy != null) {
            Item item = new Item(itemName);
            bucketProxy.getBase().addItem(item); 
        } else {
            System.out.println("Bucket not found.");
        }
    }

    public void removeItemFromBucket(String itemName, String bucketName) {
        BucketProxy bucketProxy = findBucket(bucketName);
        if (bucketProxy != null) {
            bucketProxy.getBase().removeItem(itemName);
        } else {
            System.out.println("Bucket not found.");
        }
    }

    public Bucket getBuckets() {
        return firstBucket; 
    }

    public void removeItem(String itemName) {
        Bucket currentBucket = firstBucket;
        while (currentBucket != null) {
            currentBucket.removeItem(itemName); 
            currentBucket = (Bucket) currentBucket.getNext();
        }
    }

    public Bucket getBucketsForItem(String itemName) {
        Bucket currentBucket = firstBucket;
        while (currentBucket != null) {
            if (currentBucket.findItem(itemName) != null) {
                return currentBucket; 
            }
            currentBucket = (Bucket) currentBucket.getNext();
        }
        return null;
    }
}

package Project2.src.main;

public class BucketControllerTest {
    public static void main(String[] args) {

        BucketController controller = new BucketController();

        // Test adding buckets
        System.out.println("Adding Buckets:");
        controller.addBucket("Bucket1");
        controller.addBucket("Bucket2");
        controller.addBucket("Bucket3");

        // Test adding duplicate bucket
        System.out.println("\nAdding Duplicate Bucket (Bucket1):");
        controller.addBucket("Bucket1"); 

        // Test getting buckets
        System.out.println("\nAll Buckets:");
        Bucket currentBucket = controller.getBuckets();
        while (currentBucket != null) {
            System.out.println(currentBucket.getName());
            currentBucket = (Bucket) currentBucket.getNext();
        }

        // Test adding items to buckets
        System.out.println("\nAdding Items to Bucket1:");
        controller.addItemToBucket("Item1", "Bucket1");
        controller.addItemToBucket("Item2", "Bucket1");

        // Test adding duplicate item to Bucket1
        System.out.println("\nAdding Duplicate Item (Item1) to Bucket1:");
        controller.addItemToBucket("Item1", "Bucket1"); 

        // Test getting items from Bucket1
        System.out.println("\nGetting Items from Bucket1:");
        controller.getBucketItems("Bucket1");

        // Test removing item from Bucket1
        System.out.println("\nRemoving Item1 from Bucket1:");
        controller.removeItemFromBucket("Item1", "Bucket1");
        controller.getBucketItems("Bucket1");

        // Test listing buckets containing Item2
        System.out.println("\nListing Buckets Containing Item2:");
        Bucket bucketContainingItem2 = controller.getBucketsForItem("Item2");
        if (bucketContainingItem2 != null) {
            System.out.println("Bucket containing Item2: " + bucketContainingItem2.getName());
        } else {
            System.out.println("No buckets contain Item2.");
        }

        // Test removing bucket
        System.out.println("\nRemoving Bucket2 and its items:");
        controller.removeBucket("Bucket2");
        System.out.println("All Buckets after removing Bucket2:");
        currentBucket = controller.getBuckets();
        while (currentBucket != null) {
            System.out.println(currentBucket.getName());
            currentBucket = (Bucket) currentBucket.getNext();
        }

        // Test removing a non-existent bucket
        System.out.println("\nAttempting to remove non-existent bucket (Bucket4):");
        controller.removeBucket("Bucket4");

        // Test removing a non-existent item
        System.out.println("\nAttempting to remove non-existent item (Item3) from Bucket1:");
        controller.removeItemFromBucket("Item3", "Bucket1");

        // Test adding a bucket with an empty name
        System.out.println("\nAdding Bucket with an empty name:");
        controller.addBucket(""); 

        // Test adding an item with a name longer than 32 characters
        System.out.println("\nAdding Item with 33-character name (should fail):");
        controller.addItemToBucket("ThisItemNameIsDefinitelyWayTooLongForTheBucket", "Bucket1");
    }
}

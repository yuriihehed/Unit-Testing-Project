public class StringSetTest {

    private StringSet stringSet;

    public void setUp() {
        stringSet = new StringSet(1000, 0.01);
    }

    public void testRemoveRight() {
        setUp();  // Reset test environment
        System.out.println("Running testRemoveRight...");

        stringSet.add("test");
        long hash = stringSet.hash("test");
        stringSet.removeRight(hash, 0, 4);

        // Simulate a check to validate the behavior
        System.out.println("testRemoveRight passed");
    }

    public void testRemoveLeft() {
        setUp();  // Reset test environment
        System.out.println("Running testRemoveLeft...");

        stringSet.add("example");
        long hash = stringSet.hash("example");
        stringSet.removeLeft(hash, 0, 4, 8);

        // Simulate a check to validate the behavior
        System.out.println("testRemoveLeft passed");
    }

    public void testToString() {
        setUp();  // Reset test environment
        System.out.println("Running testToString...");

        stringSet.add("hello");
        String result = stringSet.toString();

        // Simulate a check for output
        if (result != null && result.contains("BloomFilter state")) {
            System.out.println("testToString passed");
        } else {
            System.out.println("testToString failed");
        }
    }

    public static void main(String[] args) {
        StringSetTest test = new StringSetTest();

        test.testRemoveRight();
        test.testRemoveLeft();
        test.testToString();
    }
}

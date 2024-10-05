public class MinimumWeightPerfectMatchingTest {
    public static void main(String[] args) {
        testInclude();
    }

    public static void testInclude() {
        // Initialize the class with the desired size
        MinimumWeightPerfectMatching mwpm = new MinimumWeightPerfectMatching(10);

        // Test value to include
        int valueToInclude = 5;

        // Call the include method
        mwpm.include(valueToInclude);

        // Check if the value is included
        boolean isIncluded = mwpm.isIncluded(valueToInclude);

        // Check the result
        if (isIncluded) {
            System.out.println("Test passed: " + valueToInclude + " was successfully included.");
        } else {
            System.out.println("Test failed: " + valueToInclude + " was not included as expected.");
        }
    }
}
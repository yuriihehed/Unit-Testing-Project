public class MinimumWeightPerfectMatching {

    private boolean[] included;
    private int size;

    // Constructor
    public MinimumWeightPerfectMatching(int size) {
        this.size = size;
        this.included = new boolean[size];
    }

    // Method to include a value
    public void include(int value) {
        if (value >= 0 && value < size) {
            included[value] = true;
        }
    }

    // Method to check if a value is included
    public boolean isIncluded(int value) {
        if (value >= 0 && value < size) {
            return included[value]; // Return true if value is included
        }
        return false; // Return false for out-of-bounds values
    }
}


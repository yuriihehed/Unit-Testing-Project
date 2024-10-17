package Project2.src.main;

public class Bucket extends Node {
    private String name; // max 32 chars
    private ItemProxy firstItemProxy; // Head of the item list

    public Bucket(String name) {
        if (name.length() > 32) {
            throw new IllegalArgumentException("Bucket name exceeds 32 characters.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ItemProxy findItem(String itemName) {
        return null; // Placeholder for future implementation
    }

    public void addItem(Item item) {
        // Placeholder for future implementation
    }

    public void removeItem(String itemName) {
        // Placeholder for future implementation
    }

    public void clear() {
        // Placeholder for future implementation
    }
}
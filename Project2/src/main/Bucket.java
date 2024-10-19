package Project2.src.main;

public class Bucket extends Node {
    private String name; // max 32 chars
    private ItemProxy firstItemProxy; // Head of the item list
    private Item firstItem;

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

    public ItemProxy getItem() {
        return null;
    }
    public void addItem(Item item) {
        // Check for duplicates
        Item currentItem = firstItem; // Assuming firstItem is the head of the Item linked list

        while (currentItem != null) {
            if (currentItem.getName().equals(item.getName())) {
                System.out.println("Item '" + item.getName() + "' already exists in the bucket.");
                return; // Exit if the item already exists
            }
            currentItem = (Item) currentItem.getNext(); // Move to the next item
        }

        // If no duplicates, add the item to the bucket
        if (firstItem == null) {
            firstItem = item; // If the list is empty, set the first item
        } else {
            // Traverse to the end of the linked list to add the new item
            Item lastItem = firstItem;
            while (lastItem.getNext() != null) {
                lastItem = (Item) lastItem.getNext(); // Move to the last item
            }
            lastItem.setNext(item); // Set the next of the last item to the new item
        }

        System.out.println("Item '" + item.getName() + "' added to the bucket.");
    }

    public void removeItem(String itemName) {
        // Placeholder for future implementation
    }

    public void clear() {
        // Placeholder for future implementation
    }

}
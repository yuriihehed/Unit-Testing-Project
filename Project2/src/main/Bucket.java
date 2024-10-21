package Project2.src.main;

public class Bucket extends Node {
    private String name; 
    private ItemProxy firstItemProxy; // Head of the item list (acting as the first item)

    public Bucket(String name) {
        if (name.length() > 32) {
            throw new IllegalArgumentException("Bucket name exceeds 32 characters.");
        }
        this.name = name;
        this.firstItemProxy = null; // Initially, the bucket is empty
    }

    public String getName() {
        return name;
    }

    public ItemProxy findItem(String itemName) {
        ItemProxy current = firstItemProxy;
        while (current != null) {
            if (current.getName().equals(itemName)) {
                return current;
            }
            current = current.getNext(); 
        }
        return null; 
    }

    public void addItem(Item item) {
        // check duplicates
        if (findItem(item.getName()) != null) {
            System.out.println("Item \"" + item.getName() + "\" already exists in this bucket.");
            return;
        }
        ItemProxy newItemProxy = new ItemProxy(item);
        newItemProxy.setNext(firstItemProxy); 
        firstItemProxy = newItemProxy; 
    }

    public void removeItem(String itemName) {
        if (firstItemProxy == null) return; 

        if (firstItemProxy.getName().equals(itemName)) {
            firstItemProxy = firstItemProxy.getNext(); 
            return;
        }

        ItemProxy current = firstItemProxy;
        while (current.getNext() != null) {
            ItemProxy nextItem = current.getNext();
            if (nextItem.getName().equals(itemName)) {
                current.setNext(nextItem.getNext()); 
                return;
            }
            current = nextItem;
        }
    }

    public void clear() {
        firstItemProxy = null; 
    }
}

public class StringSet {

    private BloomFilter bloomFilter;

    public StringSet(int capacity, double falsePositiveProbability) {
        bloomFilter = new BloomFilter(new int[] {capacity});
    }

    public long hash(String s) {
        return s.hashCode();
    }

    public void add(String s) {
        long hashValue = hash(s);
        bloomFilter.add(new long[] {hashValue});
    }

    public boolean contains(String s) {
        return bloomFilter.contains(new long[] {hash(s)});
    }

    public void removeRight(long hash, int start, int end) {
        System.out.println("Removing from the right: " + hash + " from index " + start + " to " + end);
    }

    public void removeLeft(long hash, int start, int mid, int end) {
        System.out.println("Removing from the left: " + hash + " from index " + start + " to " + mid);
    }

    @Override
    public String toString() {
        return bloomFilter.toString();
    }
}

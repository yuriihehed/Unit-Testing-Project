public class BloomFilter {

    private long[][] bitsets;

    public BloomFilter(int[] bitSetSizes) {
        bitsets = new long[bitSetSizes.length][];
        for (int i = 0; i < bitSetSizes.length; i++) {
            bitsets[i] = new long[bitSetSizes[i]];
        }
    }

    public void add(long[] hashes) {
        System.out.println("Adding hash: " + hashes[0]);
    }

    public boolean contains(long[] hashes) {
        System.out.println("Checking if hash exists: " + hashes[0]);
        return true;
    }

    @Override
    public String toString() {
        return "BloomFilter state: [Dummy bloom filter output]";
    }
}

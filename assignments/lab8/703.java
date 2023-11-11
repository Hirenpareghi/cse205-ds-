class KthLargest {
    List<Integer> store = new ArrayList<>();
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int num : nums)
            store.add(num);
        Collections.sort(store);
    }
    
    public int add(int val) {
        int pos = binarySearch(val); 
        store.add(pos, val);
        return store.get(store.size() - k);
    }
    
    public int binarySearch(int val) {
        int low = 0, high = store.size() - 1, res = high + 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (store.get(mid) == val)
                return mid;
            else if (store.get(mid) > val) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
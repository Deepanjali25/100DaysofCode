class LongestSubArray {
    int min(int x, int y) { // Utility function to find minimum of two elements
        return (x < y) ? x : y;
    }
    int max(int x, int y) { // Utility function to find maximum of two elements
        return (x > y) ? x : y;
    }
    int findLength(int arr[], int n) { // Returns length of the longest contiguous subArray
        int max_len = 1; // Initialize result
        for (int i = 0; i < n - 1; i++) {
            // Initialize min and max for all subArrays starting with i
            int mn = arr[i], mx = arr[i];
            // Consider all subArrays starting with i and ending with j
            for (int j = i + 1; j < n; j++) {
                // Update min and max in this subArray if needed
                mn = min(mn, arr[j]);
                mx = max(mx, arr[j]);

                // If current subArray has all contiguous elements
                if ((mx - mn) == j - i)
                    max_len = max(max_len, mx - mn + 1);
            }
        }
        return max_len; // Return result
    }
    public static void main(String[] args) {
        LongestSubArray large = new LongestSubArray();
        int arr[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
        int n = arr.length;
        System.out.println("Length of the longest contiguous subArray is " + large.findLength(arr, n));
    }
}
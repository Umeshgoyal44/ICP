class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        Arrays.sort(arr);
        int count = 0;
        int i = 0; 
        int j = arr.length - 1;

        while (i <= j) {
            if (arr[i] + arr[j] <= limit) {
                arr[i] = 0;
                arr[j] = 0;
                i++;
                j--;
            } else {
                arr[j] = 0;
                j--;
            }
            count++;
        }

        return count;
    }
}

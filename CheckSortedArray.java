public class CheckSortedArray {
    public static boolean isSorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // If any element is greater than the next, the array is not sorted
            }
        }
        return true; // If no such element is found, the array is sorted
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Is the array sorted? " + isSorted(arr));
    }
}
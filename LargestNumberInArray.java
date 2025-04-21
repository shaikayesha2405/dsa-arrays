public class LargestNumberInArray {

    public static int largestNumber(int arr[]) {
        int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; 
            }
        }
        return max; 
    }

public static void main(String args[]) {
    int arr[] = {1, 2, 3, 4, 5};
    System.out.println("Largest number in the array is: " + largestNumber(arr));
}
} 
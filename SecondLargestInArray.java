public class SecondLargestInArray {
    public static int secondLargestNumber(int arr[]) {
        int first = Integer.MIN_VALUE;  //intialize first largest element to minimum value
        int second = Integer.MIN_VALUE; //initialize second largest element to minimum value

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {//condition to add the largest element
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {//condition to add the second largest element
                second = arr[i];
            }
        }
        return second;
    }
    public static void main (String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Second largest number in the array is: " + secondLargestNumber(arr));
    }
}

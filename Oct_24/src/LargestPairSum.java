import java.util.Arrays;

public class LargestPairSum {
    public static void main(String[] args) {

    }
//    public static int pairsum(int[] arr) {
//        // code here
//        Arrays.sort(arr);
//        int n = arr.length;
//        return arr[n-1] + arr[n-2];
//    }
    public static int pairsum(int[] arr) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for(int x: arr){
            if(x>largest){
                secondLargest = largest;
                largest = x;
            }else if(x > secondLargest){
                secondLargest = x;
            }
        }
        return largest + secondLargest;
    }
}

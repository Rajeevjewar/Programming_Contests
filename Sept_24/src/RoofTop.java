// Problem: Roof Top
// 26/09/24

public class RoofTop {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1};
        System.out.println(maxStep(arr));
    }
    static int maxStep(int arr[]) {
        int ans = 0, increaseCount = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i]>arr[i-1]) {
                increaseCount++;
            }else{
                ans = Math.max(ans, increaseCount);
                increaseCount = 0;
            }
        }
        ans = Math.max(ans, increaseCount);
        return ans;
    }
}

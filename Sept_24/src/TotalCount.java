public class TotalCount {
    public static void main(String[] args) {
        int[] arr = {5, 8, 10, 13};
        int k = 3;
        System.out.println(totalCount(k, arr));
//        System.out.println((10 + 3 -1) /3);
    }
    static int totalCount(int k, int[] arr) {
        int ans = 0;
        for(int x: arr){
            ans += (x+k-1)/k;
        }
        return ans;
    }
}

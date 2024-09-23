import java.util.HashMap;

public class MissingRepeating {
    public static void main(String[] args) {

    }
    int[] findTwoElement(int[] arr) {
        // code here
        int rep = 0, mis = 0;
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            if(map.get(arr[i]) == null){
                map.put(arr[i], true);
            }
            else {
                rep = arr[i];
            }
        }
        for(int i = 1; i <= arr.length; i++){
            if(map.get(arr[i]) == null){
                mis = arr[i];
            }
        }
        return new int[]{rep, mis};
    }
}

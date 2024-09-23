// Missing And Repeating
// Date: 23/09/24

import java.util.Arrays;
import java.util.HashMap;

public class MissingRepeating {
    public static void main(String[] args) {
        int[] arr = {2, 2};
        System.out.println(Arrays.toString(findTwoElement(arr)));
    }
    static int[] findTwoElement(int[] arr) {
        int rep = 0, mis = 0;
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i : arr) {
            if (map.get(i) == null) {
                map.put(i, true);
            } else {
                rep = i;
            }
        }
        for(int i = 1; i <= arr.length; i++){
            if(map.get(i) == null){
                mis = i;
            }
        }
        return new int[]{rep, mis};
    }
}

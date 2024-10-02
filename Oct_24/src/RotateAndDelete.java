import java.util.ArrayList;

public class RotateAndDelete {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(rotateDelete(list));
    }
    public static int rotateDelete(ArrayList<Integer> arr) {
        int n = arr.size(), temp = n/2;
        int i = 3 * (temp/2);
        if(temp % 2 == 1){
            i++;
        }
        return arr.get(n-i);
    }
}

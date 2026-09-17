package in.List;
import java.util.ArrayList;

public class CheckSort {
    public static boolean isSorted(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(java.util.List.of(1, 3, 5, 7, 9));
        System.out.println(isSorted(list));
        System.out.println("Size: "+list.size());
    }
}

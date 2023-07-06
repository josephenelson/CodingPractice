import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(7);
        list.add(3);
        boolean solution = sum(17, list);
        System.out.println(solution);
    }

    public static boolean sum(int k, List<Integer> lst) {
        Set<Integer> seen = new HashSet<>();
        for(int num:lst) {
            if (seen.contains(k - num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 2, 2, 4, 2, 3, 3, 5);
        List<Integer> uniqueElements = list.stream().distinct().toList();

        for (Integer integer : uniqueElements) {
            System.out.println(integer);
        }
    }
}
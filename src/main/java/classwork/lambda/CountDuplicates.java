package classwork.lambda;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountDuplicates {
    public static <T> int countDuplicates(T t, List<T> list) {
        int cnt = 0;
        for (T elem : list) {
            if (elem.equals(t)) {
                cnt++;
            }
        }
        return cnt;
    }

    public static <T> void forEachWithDelay(List<T> list, int delay, Foo<T> foo) {
        for (T t : list) {
            foo.doSmt(t);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 7, 11, 13, 17);
//        forEachWithDelay(list, 500, x -> System.out.println(x));
        list.stream()
                .map(Integer::reverse)
                .forEach(System.out::println);
    }
}

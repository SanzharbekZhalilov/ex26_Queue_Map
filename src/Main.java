import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int min = 2010;
        int max = 2020;
        Map<Integer, Integer> map = new HashMap<>();
        Random random = new Random();

        for (int i = min; i <= max; i++) {
            map.put(i, 0);
        }
        System.out.println(map);

        int year = 0;
        for (int i = 0; i < 100; i++) {
            year = random.nextInt(min, max + 1);
            // year = (int) (Math.random() * ((maxYear - minYear) +1 ) + minYear);
            for (Integer integer : map.keySet()) {
                if (integer == year) {
                    map.put(integer, map.get(integer) + 1);
                }
            }
        }
        System.out.println(map);

        Integer y = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Max: " + y + "=" + map.get(y));

    }
}
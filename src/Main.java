import java.util.*;


public class Main {
    public static void main(String[] args) {
        String integers = "176151231213442176151231213442176151231213442176151231213442";
        System.out.println(integers);

        Map<String, Integer> quantity = new HashMap<>();
        for (int i = 0; i < integers.length(); i++) {
            String str = (integers.substring(i, i + 1));
            quantity.computeIfPresent(str, (k, v) -> v + 1);
            quantity.putIfAbsent(str, 1);
        }
        quantity.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + ":   встречается в строке " + entry.getValue() + " раз - " + (100 * (entry.getValue()) / integers.length()) + "%"));

    }
}

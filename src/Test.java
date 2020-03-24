import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String symbols = "abcdefghijklmnopqrstuvwxyz";
        Map<String, Integer> values = new HashMap<>();
        values.put(symbols, 26);

        values.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + ":  " + entry.getValue() +
                " Данная величина составляет " + (100 * (entry.getValue()) /symbols.length()) + "%"));
    }
}
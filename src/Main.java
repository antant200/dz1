import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        for (int i = 0; i < text.length(); i++) {
            char Char = text.charAt(i);
            if (Character.isLetter(Char)) {
                if (!map.containsKey(Char)) {
                    map.put(Char, 1);
                } else {
                    int value = map.get(Char);
                    value += 1;
                    map.put(Char, value);
                }
            }
        }
        System.out.println(map);
        char maxKey = 0;
        char minKey = 0;
        int maxValue = 0;
        int minValue = Integer.MAX_VALUE;
        for (Character key : map.keySet()) {
            if (map.get(key) > maxValue) {
                maxValue = map.get(key);
                maxKey = key;
            }
            if (map.get(key) < minValue) {
                minValue = map.get(key);
                minKey = key;
            }
        }
        System.out.println("Самый часто встречаемый символ: " + maxKey + ". Он повторяется: " + maxValue);
        System.out.println("Самый редко встречаемый символ: " + minKey + ". Он повторяется: " + minValue);
    }
}
package misc.problem_solving;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class roman_to_int {
    public static void main(String[] args) {
        String s = "XXIV";
        System.out.println(romanToInt(s));
    }

    // O(1) - algo has a finite set of input symbols
    // O(1)
    static int romanToInt(String s) {

        Map<String, Integer> values = new HashMap<>();
        values.put("M", 1000);
        values.put("D", 500);
        values.put("C", 100);
        values.put("L", 50);
        values.put("X", 10);
        values.put("V", 5);
        values.put("I", 1);

        int sum = 0;
        int i = 0;
        while (i < s.length()) {
            String currentSymbol = s.substring(i, i + 1);
            int currentValue = values.get(currentSymbol);
            int nextValue = 0;
            if (i + 1 < s.length()) {
                String nextSymbol = s.substring(i + 1, i + 2);
                nextValue = values.get(nextSymbol);
            }

            if (currentValue < nextValue) {
                sum += (nextValue - currentValue);
                i += 2;
            }
            else {
                sum += currentValue;
                i += 1;
            }

        }
        return sum;
    }
}

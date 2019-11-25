package problem1;

import java.util.ArrayList;
import java.util.List;

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println(findMultiples(1000).stream().mapToInt(Integer::valueOf).sum());
    }

    public static List<Integer> findMultiples(Integer value){
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i < value; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result.add(i);
            }
        }

        return result;
    }
}
package main.codility.lessons.lesson2;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Swathi Lakshmisetty on 11/07/2017.
 * Score 100 %
 */
public class OddOccurances {

    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length == 0)
            return 0;
        else if (A.length == 1) {
            return A[0];
        } else if (A.length % 2 == 0) {
            return 0;
        } else {
            Set<Integer> unique = new HashSet<>();
            for (int i : A) {
                if (unique.contains(i))
                    unique.remove(i);
                else
                    unique.add(i);
            }
            return unique.iterator().next();
        }
    }

    public static void main(String[] args) {
        OddOccurances occurances = new OddOccurances();
        occurances.solution(new int[]{9, 3, 9, 3, 9, 7, 9});
    }
}

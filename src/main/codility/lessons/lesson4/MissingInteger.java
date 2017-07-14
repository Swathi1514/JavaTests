package main.codility.lessons.lesson4;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Swathi Lakshmisetty on 14/07/2017.
 *  Score 100%
 */
public class MissingInteger {
    public int solution(int[] A) {
        if(A.length == 0)
            return 0;
        if(A.length == 1) {
            if(A[0] > 1 || A[0] <= 0)
                return 1;
            else
                return 2;
        } else {
            int result = 1;
            Set<Integer> numbers = new HashSet<>();

            for (int i = 0; i < A.length; i++) {
                if (A[i] > 0) {
                    if(A[i] > result) {
                        numbers.add(A[i]);
                    }
                    if(result == A[i]) {
                        result = A[i] + 1;
                        while (numbers.contains(result)) {
                            result = result + 1;
                        }
                    }
                }
            }
            return result == 0 ? 1 : result;
        }
    }

    public static void main(String[] args) {
        MissingInteger missingInt = new MissingInteger();
        System.out.println(missingInt.solution(new int[]{1,3,6,4,1,2}));
    }
}

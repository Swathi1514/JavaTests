package main.codility.lessons.lesson4;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Swathi Lakshmisetty on 15/07/2017.
 *  Score 100%
 */
public class PermCheck {

    public int solution(int[] A) {
        if(A.length == 0)
            return 0;
        else if(A.length == 1 ) {
            if(A[0] == 1)
                return 1;
            else return 0;
        } else {
            Set<Integer> numbers = new HashSet<>();
            for (int i : A) {
                if(!numbers.add(i))
                    return 0;
                else if(i > A.length)
                    return 0;
            }
            return 1;
        }
    }

    public static void main(String[] args) {
        PermCheck check = new PermCheck();
        System.out.println(check.solution(new int[] {4,1,3,2}));
    }
}

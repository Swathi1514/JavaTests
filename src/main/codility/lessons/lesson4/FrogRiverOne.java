package main.codility.lessons.lesson4;

import java.util.HashSet;
import java.util.Set;
/*
 * Created by Swathi Lakshmisetty on 15/07/2017.
 * Score 100%
*/

public class FrogRiverOne {

    public int solution(int X, int[] A) {
        if(A.length == 0)
            return -1;
        else if(A.length == 1) {
            if(A[0] == X)
                return 0;
            else return -1;
        } else {
            Set<Integer> numbers = new HashSet<>();
            for (int i = 0; i < A.length; i++) {
                    if(A[i] <= X )
                        numbers.add(A[i]);
                    if (numbers.size() == X)
                        return i;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FrogRiverOne riverOne = new FrogRiverOne();
        System.out.println(riverOne.solution(5, new int[] {1,3,1,4,2,3,5,6}));
        System.out.println(riverOne.solution(2, new int[] {2,2,2,2,2}));
        System.out.println(riverOne.solution(5, new int[]{1, 2, 3, 5, 3, 1}));
    }
}

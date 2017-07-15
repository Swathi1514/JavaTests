package main.codility.lessons.lesson4;

import java.util.Arrays;

/**
 * Created by Swathi Lakshmisetty on 15/07/2017.
 * Score 100%
 */
public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] result = new int[N];
        if(A.length == 0)
            return result;
        else if(A.length == 1) {
            int value = A[0];
            if(value  > N || value == 0)
                return result;
            else {
              result[value-1] = 1;
              return result;
            }
        } else {
            int count = 0;
            boolean isMaximRepeat = false;
            for (int i = 0; i < A.length; i++) {
                if(A[i] !=0 && A[i] <= N) {
                    isMaximRepeat = false;
                    result[A[i] - 1] += 1;
                    if(result[A[i]-1] > count)
                        count +=1;
                }
                else if(A[i] == N+1) {
                    if( !isMaximRepeat) {
                        for (int j = 0; j < result.length; j++) {
                            result[j] = count;
                        }
                        isMaximRepeat = true;
                    }
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        MaxCounters counters = new MaxCounters();
        System.out.println(Arrays.toString(counters.solution(5, new int[] {3,4,4,6,1,4,4})));
    }
}

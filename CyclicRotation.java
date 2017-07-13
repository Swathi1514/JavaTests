package main.codility.lessons.lesson2;

import java.util.Arrays;

/**
 * Created by Swathi Lakshmisetty on 10/07/2017.
 *  Score 100%
 */
public class CyclicRotation {

        public int[] solution(int[] A, int K) {
                // write your code in Java SE 8
                if(A.length == 0) {
                        return new int[0];
                } else {
                        if(K == 0) {
                                System.out.println(Arrays.toString(A));
                                return A;
                        } else if(K == A.length) {
                                return A;
                        } else if(A.length == 2 && K == 1) {
                                int[] result = new int[A.length];
                                result[0] = A[1];
                                result[1] = A[0];
                                System.out.println(Arrays.toString(result));
                                return result;
                        } else {
                                int[] result = new int[A.length];
                                //int count = 0;
                                while (K > A.length) {
                                        K = K - A.length;
                                }
                                while(K  > 0) {
                                        result[0] = A[A.length-1];
                                        for (int i = 1; i < A.length; i++) {
                                                result[i] = A[i-1];
                                        }
                                        A = result.clone();
                                        --K;
                                }
                                //System.out.println(Arrays.toString(result));
                                return result;
                        }
                }
        }

        public static void main(String[] args) {
                CyclicRotation rotate = new CyclicRotation();
                rotate.solution(new int[] {3,8,9,7,6}, 3);
                //rotate.solution(new int[] {2, 3, 4, 5, 6, 7, 1}, 5);
                //rotate.solution(new int[]{-5, -6, -1, -2, -3, -4}, 4);
                //rotate.solution(new int[] {5, -1000}, 1);
                //rotate.solution(new int[] {0, -9}, 1);
        }
}

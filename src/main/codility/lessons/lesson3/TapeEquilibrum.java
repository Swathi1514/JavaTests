package main.codility.lessons.lesson3;

/**
 * Created by Swathi Lakshmisetty on 13/07/2017.
 *  Score 100%
 */
public class TapeEquilibrum {

    public int solution(int[] A) {

        if (A.length == 0) {
            return 0;
        } else if (A.length == 1)
            return A[0];
        else if(A.length == 2)
            return Math.abs(A[0] - A[1]);
        else {
            int total =0;
            for (int i : A) {
                total += i;
            }
            int temp = A[0];
            int result = Math.abs(temp - (total-temp));
            for (int i = 1; i < A.length; i++) {
                temp += A[i];
                if(i == A.length-1 && temp == 0) {
                } else {
                    int value = Math.abs(temp - (total-temp));
                    if (result > value)
                        result = value;
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        TapeEquilibrum equilibrum = new TapeEquilibrum();
        //System.out.println(equilibrum.solution(new int[] {3, 1, 2, 4, 3}));
        System.out.println(equilibrum.solution(new int[] {-10, -20, -30, -40, 100}));
    }
}

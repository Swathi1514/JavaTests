package main.codility.lessons.lesson3;

/**
 * Created by Swathi Lakshmisetty on 13/07/2017.
 * Score 100%
 */
public class FromJmp {

    public int solution(int X, int Y, int D) {
        if(X == Y)
            return 0;
        else if( X < Y && D >= Y)
            return 1;
        else if(X+D >= Y)
            return 1;
        else {
            int result = (Y-X)/D;
            if(D*result+X < Y)
                return result + 1;
            else return result;
        }
    }

    public static void main(String[] args) {
        FromJmp jmp = new FromJmp();
        //System.out.println(jmp.solution(10,85,30));
        System.out.println(jmp.solution(1,5,2));
    }
}

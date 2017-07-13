package main.codility.lessons.lesson3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Swathi Lakshmisetty on 13/07/2017.
 */
public class PermMissingElem {

    public int solution(int[] A) {

        if(A.length == 0)
            return 1;
        else if(A.length == 1) {
            if(A[0] == 1)
                return 2;
            else return 1;
        } else {
            Set<Integer> unique = new HashSet<>();
            for (int i = 1; i <= A.length + 1; i++) {
                unique.add(i);
            }
            //System.out.println(unique);
            for (int i : A) {
                unique.remove(i);
            }
            Iterator it = unique.iterator();
            return it.hasNext()? (int)it.next() : 0;
        }
    }

    public static void main(String[] args) {
        PermMissingElem missing = new PermMissingElem();
        System.out.println(missing.solution(new int[] {2,3,5,1,4,7}));
    }

}

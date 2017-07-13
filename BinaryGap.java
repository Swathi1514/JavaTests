package main.codility.lessons.lesson1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Swathi Lakshmisetty on 8/06/2017.
 *  Executed 100%
 */
public class BinaryGap {

    int solution(int N) {

        String binary = Integer.toBinaryString(N);
        System.out.println(binary);
        boolean start = false;
        boolean end = false;
        List<Integer> gap = new ArrayList<>();
        int count = 0;
        gap.add(0);
        for(char c : binary.toCharArray()) {
            if(start && !end && c == '0') {
                count += 1;
            } else if(!start && c == '1')
                start = true;
            else if(start && c == '1') {
                //start = false;
                gap.add(count);
                count = 0;
            }
        }
        System.out.println(Collections.max(gap));
            //if()
        return 0;
    }

    public static void main(String[] args) {
        BinaryGap gap = new BinaryGap();
        gap.solution(2147483646);
    }
}

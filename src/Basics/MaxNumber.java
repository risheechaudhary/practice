package Basics;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {

    public int getMaxInt(List<Integer> list){

        int max=0;
        for (int i = 0; i < list.size()-1; i++) {
            if(max<list.get(i)){
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,6,56,89,34,23);

        MaxNumber m = new MaxNumber();

        System.out.println(m.getMaxInt(list));
    }
}

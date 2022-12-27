package Basics;

import java.util.Arrays;
import java.util.List;

public class MinNumber {

    public int getMinInt(List<Integer> list){
        int min= Integer.MAX_VALUE;
        for (int i = 0; i < list.get(i); i++) {
            if(min>list.get(i)){
                min=list.get(i);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1,32,5,2,5,7,8,2,8);

        MinNumber m = new MinNumber();
        System.out.println(m.getMinInt(al));

    }
}

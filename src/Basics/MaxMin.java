package Basics;

import java.util.Arrays;
import java.util.List;

public class MaxMin {

    public int getMaxInt(List<Integer> list){

        int max=0;
        for (int i = 0; i <=list.size()-1; i++) {
            if(max<list.get(i)){
                max = list.get(i);
            }
        }
        return max;
    }
    public int getMinInt(List<Integer> list){
        int min= Integer.MAX_VALUE;
        for (int i = 0; i <=list.size()-1; i++) {
            if(min>list.get(i)){
                min=list.get(i);
            }
        }
        return min;
    }

    public List<Integer> getHighestAndSecondHighestInList(List<Integer> li){
        int max = Integer.MIN_VALUE;
        int secondMax = 0;
        for (int i = 0; i < li.size(); i++) {
            if (max < li.get(i)) {
                secondMax = max;
                max= li.get(i);
            } else if (secondMax < li.get(i)) {
                secondMax = li.get(i);
            }
        }
        return Arrays.asList(secondMax, max);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,6,56,89,34,23);

        MaxMin m = new MaxMin();
        System.out.println(m.getMaxInt(list));
        System.out.println(m.getMinInt(list));

        System.out.println(m.getHighestAndSecondHighestInList(list));
    }
}

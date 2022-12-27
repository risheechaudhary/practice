package Collections;

import java.util.Arrays;
import java.util.List;

public class ListImpl {

    public List<Integer> createListUsingListOf(Integer[] arr){
        List<Integer> ll = List.of(arr);
        return ll;
    }

    public List<Integer> createListUsingAsList(Integer[] arr){
        return Arrays.asList(arr);
    }

    public static void main(String[] args) {
        Integer[] a1 = {12,3,4,1,2,7,8};

        ListImpl a = new ListImpl();
        List<Integer> l1 = a.createListUsingAsList(a1);
        System.out.println(l1);
        List<Integer> l2 = a.createListUsingListOf(a1);
        System.out.println(l2);
        a1[2] = 101;
        System.out.println("After modification");
        System.out.println(l1);
        System.out.println(l2);

    }
}

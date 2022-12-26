package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingUsingStream {
    public static List<Integer> sortIntegerListUsingStream(List<Integer> list){
        List<Integer> res = new ArrayList<>();
        return res;
    }

    public static List<String> sortStringListUsingStream(List<String> list){
        List<String> res = new ArrayList<>();
        return res;
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,11,2,4,-1,22,19,18);
        List<Integer> sortedIntList = sortIntegerListUsingStream(integerList);
    }
}

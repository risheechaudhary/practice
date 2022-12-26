package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingUsingStream {
    public static List<Integer> sortIntegerListUsingStream(List<Integer> list){
        List<Integer> res = list.stream().sorted().collect(Collectors.toList());
        return res;
    }

    public static List<String> sortStringListUsingStream(List<String> list){
        List<String> res = list.stream().sorted().collect(Collectors.toList());
        return res;
    }

    public static List<Integer> sortIntegerListUsingComparator(List<Integer> list){
        List<Integer> res = list.stream().sorted((x, y)->y.compareTo(x)).collect(Collectors.toList());
        return res;
    }

    public static Integer elementMinListUsingCompareTo(List<Integer> list){
        Integer res = list.stream().min((x, y)->x.compareTo(y)).get();
        return res;
    }

    public static Integer elementMaxListUsingCompareTo(List<Integer> list){
            Integer res = list.stream().max((x,y)->x.compareTo(y)).get();
            return res;
        }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,11,2,4,-1,22,19,18);
        System.out.println(integerList);

        List<String> stringList = Arrays.asList("rishee","sfdf","dsvcsdv","sdvdv");
        System.out.println(stringList);

        List<Integer> sortedIntList = sortIntegerListUsingStream(integerList);
        System.out.println(sortedIntList);

        List<String> sortedStrList = sortStringListUsingStream(stringList);
        System.out.println(sortedStrList);

        List<Integer> sortedCompList = sortIntegerListUsingComparator(integerList);
        System.out.println(sortedCompList);

        Integer int1 = elementMinListUsingCompareTo(integerList);
        System.out.println(int1);

        Integer int2 = elementMaxListUsingCompareTo(integerList);
        System.out.println(int2);
    }
}

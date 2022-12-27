package Collections;

import Helper.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class CountOccurence {

//    public static List<Double> getSalaryReverse(List<Employee> list) {
//
//        List<Employee> collect = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
//        return collect.stream().map(s -> s.getSalary()).collect(Collectors.toList());
//    }

    public static Map<Integer, Long> getCountOccurenceList(List<Integer> list) {

        Map<Integer, Long> ll = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return ll;
    }

    public static void main(String[] args) {

//        List<Employee> al = Arrays.asList(
//                new Employee("Rishee", 10000.0, 875667273, "java"),
//                new Employee("Rahul", 874628.4, 732687422, "dev"),
//                new Employee("Sahil", 8753532.3, 233333335, "dotnet"),
//                new Employee("jayesh", 8743876.32, 32986426, "flutter"));

        List<Integer> ll = Arrays.asList(1, 2, 3, 2, 3, 4, 5, 4, 6, 6);

//          Employee employee = al.stream().filter(Comparator.comparingDouble(Employee::getSalary)));
//          System.out.println(employee);
//            List<Double> list = getSalaryReverse(al);
//            System.out.println(list);

            Map<Integer, Long> l = getCountOccurenceList(ll);
            System.out.println(l);

            Collections.sort(ll);
            System.out.println(ll);
            int cnt = 1;
            for (int i = 0; i < ll.size(); i++) {
                if(i==ll.size()-1){
                    System.out.println(ll.get(i) + " -> "+cnt);
                    break;
                }
                if(ll.get(i) == ll.get(i+1)){
                    cnt++;
                }
                else {
                    System.out.println(ll.get(i) + " -> "+cnt);
                    cnt=1;
                }
            }
        }
    }


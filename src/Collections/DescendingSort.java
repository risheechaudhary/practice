package Collections;

import Helper.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class DescendingSort {

    public static List<Double> getSalaryReverse(List<Employee> list) {

        List<Employee> collect = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
        return collect.stream().map(s -> s.getSalary()).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Employee> al = Arrays.asList(
                new Employee("Rishee", 10000.0, 875667273, "java"),
                new Employee("Rahul", 874628.4, 732687422, "dev"),
                new Employee("Sahil", 8753532.3, 233333335, "dotnet"),
                new Employee("jayesh", 8743876.32, 32986426, "flutter"));

        List<Double> list = getSalaryReverse(al);
        System.out.println(list);
    }
}

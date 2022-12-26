package Helper;

public class Employee  implements Comparable<Employee>{
    private String empName;
    private Double salary;
    private int contact;
    private String dept;

    Employee(){

    }
    public Employee(String empName, Double salary, int contact, String dept){
        this.empName=empName;
        this.salary=salary;
        this.dept=dept;
        this.contact=contact;
    }

    public String getEmpName(){
        return empName;
    }
    public void setEmpName(){
        this.empName=empName;
    }
    public Double getSalary(){
        return salary;
    }
    public void setSalary(){
        this.salary=salary;
    }
    public int getContact(){
        return contact;
    }
    public void setContact(){
        this.contact=contact;
    }
    public String getDept(){
        return dept;
    }
    public void setDept(){
        this.dept=dept;
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}

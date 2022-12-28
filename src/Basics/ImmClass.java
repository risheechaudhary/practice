package Basics;
class SomethingRandom{
    private String name;
    private Integer age;
    SomethingRandom(){
    }
    SomethingRandom(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
final class ImmutableClassImpl{
    private final int empId;
    private final String empName;
    private final int contact;
    private final SomethingRandom somethingRandom;


    ImmutableClassImpl(int empId, String empName, int contact, SomethingRandom somethingRandom) {
        this.empId = empId;
        this.empName = empName;
        this.contact = contact;
        this.somethingRandom = new SomethingRandom();
        this.somethingRandom.setName(somethingRandom.getName());
        this.somethingRandom.setAge(somethingRandom.getAge());
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getContact() {
        return contact;
    }

    public SomethingRandom getSomethingRandom() {
        return somethingRandom;
    }

    @Override
    public String toString() {
        return "ImmutableClassImpl{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", contact=" + contact +
                ", age=" + somethingRandom.getAge() +
                ", name=" + somethingRandom.getName() +
                '}';
    }
}
public class ImmClass {

    public static void main(String[] args) {
        SomethingRandom somethingRandom = new SomethingRandom();
        somethingRandom.setName("Rishee");
        somethingRandom.setAge(23);

        ImmutableClassImpl immutableClass = new ImmutableClassImpl(1,"rahul",32637785,somethingRandom);
        System.out.println(immutableClass.toString());
        somethingRandom.setName("Random");
        System.out.println(immutableClass.toString());
        SomethingRandom S1 = new SomethingRandom();

    }
}

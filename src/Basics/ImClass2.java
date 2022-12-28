package Basics;

class ImClass2{
    private int number;
    private String name;

    ImClass2(){

    }
    public ImClass2(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
      this.name = name;
    }

//    public static void main(String[] args) {
//        ImClass2 m = new ImClass2Impl(12,"rishee","rishee@132", ImClass2Impl);
//        ImClass2Impl c = new ImClass2Impl();
//        System.out.println();
//
//
//    }
}

final class ImClass2Impl {
    private final int empId;
    private final String empName;
    private final String email;
    private final ImClass2 imClass2;

        ImClass2Impl(int empId, String empName, String email, ImClass2 imClass2) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.imClass2 = imClass2;
        }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmail() {
        return email;
    }

//    public ImClass2 getImClass2() {
//        return ImClass2;
//    }

    @Override
    public String toString() {
        return "ImClass2{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", email='" + email + '\'' +
//                ", number=" + car.getNumber() + '\'' +
//                ", name=" + car.getName() + '\'' +
                '}';
    }
}

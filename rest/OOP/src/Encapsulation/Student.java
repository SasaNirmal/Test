package Encapsulation;

public class Student {

    private String studentname;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String studentname, int age, String address) {
        this.studentname = studentname;
        this.age = age;
        this.address = address;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

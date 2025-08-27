package encapsulatiion;

public class Student {
    private String stuent_name;
    private String address;
    private String phone;
    private String gender;
    private int age;

    Student(){// no arg constructor

    }
    Student(String name,String address,String phone,String gender, int age){//full arg constructor
        this.stuent_name=name;
        this.address=address;
        this.phone=phone;
        this.gender=gender;
        this.age=age;
    }

    //name
    public String getName(){
        return stuent_name;
    }

    public void setName(String name){
        this.stuent_name =name;
    }

    //address
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address =address;
    }

    //phone
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }

    //Gender
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }

    //Age
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}

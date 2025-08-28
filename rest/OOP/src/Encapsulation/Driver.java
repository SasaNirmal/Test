package Encapsulation;


public class Driver {
    private String drivername;
    private int age;
    private String address;

    Driver(){

    }

    Driver(String name,int age,String address){
        this.drivername = name;
        this.age = age;
        this.address = address;
    }

    public String getName(){
        return drivername;
    }

    public void setName(String name){
        this.drivername = name;
    }
    public int getage(){
        return age;
    }

    public void setage(String name){
        this.age = age;
    }
}

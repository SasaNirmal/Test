package testPakage;

public class myClass {
    private int privateVariable = 10;// only diclared in this class
    protected int protectedVariavle = 20;//only diclar in the package but shod be subclass
    public int publicVariable = 30;//every whaer in prograam
    int defaltvVariable = 40;//only diclar in the package
    public void variableAccess(){
        System.out.println("Final Variable: " + privateVariable);
        System.out.println("Protected Variable: " + protectedVariavle);
        System.out.println("Public Variable: " + publicVariable);
        System.out.println("Default Variable: " + defaltvVariable);
    }
}

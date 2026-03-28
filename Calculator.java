public class Calculator {
    int num1=9;
    int num2=8;
    void add(){
        System.out.println(num1+num2);
    }
    void sub(){
        System.out.println(num1-num2);
    }
    void mul(){
        System.out.println(num1*num2);
    }
    void div(){
        System.out.println(num1/num2);
    }
    void modulus(){
        int mod=num1%num2;
        System.out.println(mod);
    }
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        c1.add();
        c1.sub();
        c1.div();
        c1.mul();
        c1.modulus();

    }
}

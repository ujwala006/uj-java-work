public class OOpsPhone {
    String brand="Apple iphone";
    String model="16 pro";
    void call(){
        System.out.println("Calling from iphone");
    }
    void message(){
        System.out.println("messaging from iphone");
    }
    void Account(){
        System.out.println("Account created by "+ brand );
    }

    public static void main(String[] args) {
        OOpsPhone p1= new OOpsPhone();
        OOpsPhone p2= new OOpsPhone();
        OOpsPhone p3= new OOpsPhone();
        p1.call();
        p3.message();
        p2.Account();

    }
}
    


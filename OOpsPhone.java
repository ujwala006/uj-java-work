public class OOpsPhone {
    String brand="Apple iphone";
    String model="16 pro";
    String game1="subway surfer";
    String game2="Cookig fever";
    void call(){
        System.out.println("Calling from iphone");
    }
    void message(){
        System.out.println("messaging from iphone");
    }
    void Account(){
        System.out.println("Account created by "+ brand );
    }
    void Game(){
        System.out.println("Game Running "+ game1);
        System.out.println("Game Running "+ game2);

    }

    public static void main(String[] args) {
        OOpsPhone p1= new OOpsPhone();
        OOpsPhone p2= new OOpsPhone();
        OOpsPhone p3= new OOpsPhone();
        p1.call();
        p3.message();
        p2.Account();
        p1.Game();
    }
}
    


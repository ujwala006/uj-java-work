public class JumpReturn {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                return; // Exit the main method when i is 3
            }
            System.out.println(i);
        }
    }
    
}

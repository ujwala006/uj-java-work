import java.util.Scanner;
public class Extractfirstdig {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Enter number: ");
        num=sc.nextInt();
        String digit=String.valueOf(num);
        if (num>=0)
            System.out.println(digit.charAt(0));
        else
            System.out.println(digit.charAt(1));
    }
    
}

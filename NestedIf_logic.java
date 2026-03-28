import java.util.Scanner;
public class NestedIf_logic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // age = 65;
        System.out.println("Enter the age");
        int age = sc.nextInt();

        if(age>=18){
            if(age>=65){
                System.out.println("Eligible to  vote a avail government fund");
            }else
                System.out.println("We are eligible to vote but not eligible avail government scheme");
        } else
        System.out.println("We are not eligible to vote and not eligible to avail government scaheme");
        sc.close();
    }
}
    


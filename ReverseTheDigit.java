import java.util.Scanner;
public class ReverseTheDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int rev=0;
        System.out.println("enter number");
        num=sc.nextInt();
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("Reverse of the number is: "+rev);
        sc.close();
    }
    

    
}

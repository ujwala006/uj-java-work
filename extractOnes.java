import java.util.Scanner;
public class extractOnes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int digit;
        int num;
        System.out.println("enter number");
        num=sc.nextInt();
        if (num>=10 | num<=-10){
            digit=num%10;
            System.out.println("Last digit: "+digit);}
        else{
            System.out.println(num);
        }
        }

    }


import java.util.Scanner;
public class Controlstructure {
    public static void main(String[] args) {
        //voting eligibility
        //System.out.println("Enter age: ");
        //int age=sc.nextInt();
        //if(age>=18){
        //    System.out.println("Eligible");
        //largesrt of 2 numbers
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("enter second numbder: ");
        int b=sc.nextInt();
        if(a>b)
            System.out.println("first number is biggest");
        else
            System.out.println("Second number is largest");
                
        sc.close();
    }
    }

    


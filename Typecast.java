public class Typecast {
    public static void main(String[] args) {
        double d=9.78;
        int num=(int)d;
        System.out.println("double value before conversion: "+d);
        System.out.println("After explicit type conversion: "+num);
        int a=5;
        double x=a;
        System.out.println("before: "+a);
        System.out.println("After implicit: "+x);
        
    }
}

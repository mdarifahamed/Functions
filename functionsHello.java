import java.util.*;
// function

public class functionsHello {

    public static void  printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    }

    public static void calculateSum(){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        int sum= a+b;
        System.out.println("sum is : " + sum);
    }
     

    public static void main(String arg[]){
        //printHelloWorld(); // function call
        calculateSum();

    }
}

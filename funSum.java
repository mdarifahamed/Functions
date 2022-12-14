import java.util.*;
public class funSum {
    // func to calc of sum 2 nums
    public static int sum(int a, int b){
        return a+b;
    }

    // fun to calc of sum 3 nums
    public static int  sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(4,6));
        System.out.println(sum(1,2,7));
    }
}

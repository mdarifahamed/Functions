import java.util.*;

public class funPrime {
    // only for n>=2
    /* 
    public static boolean IsPrime(int n){
    //corner cases //2    
    if(n == 2){
        return true;
    }

    for(int i=2; i<=n-1; i++){
            if(n %  i == 0) {
                return false;
            }
               
        }
        
        return true;

    }
    */

    // optimize methode
    public static boolean IsPrime(int n){
        // corner 2
        if(n == 2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
   
    

    public static void main(String[] args) {
        System.out.println(IsPrime(7));
    }
}

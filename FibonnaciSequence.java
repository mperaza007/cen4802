public class FibonacciSequence{
static int getNthFibonnaci(int n){
    if(n<=1){
        return n;
    }
    return getNthFibonnaci(n-1) + getNthFibonnaci(n-2);
}
public static void main(String [] args){
    int result = FibonacciSequence.getNthFibonnaci(10);
    System.out.println(result);
    }
}

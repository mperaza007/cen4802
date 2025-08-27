public class FibonacciSequence{
      /**
     * Returns the nth term of the Fibonacci sequence.
     * This method uses a recursive approach to compute the number.
     *
     * @param n the position or index in the Fibonacci sequence, where n ≥ 0
     * @return the nth Fibonacci number
     */
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

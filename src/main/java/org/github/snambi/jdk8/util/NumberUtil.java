package org.github.snambi.jdk8.util;

public class NumberUtil {
    
    // 0, 1, 1, 2, 3, 5, 8
    // fib = n + ( n-1 )
    // fib( 4 ) = 1 +1 = 2
    // fib( 5) = 2+ 1 = 3


    public static int findFibonacci(int n) {
        
        if (n < 0)
            throw new IllegalArgumentException("Input cannot be negative. The given input: "+n);
    
        if (n == 0 || n == 1)
            return n;
        
        int first = 0;
        int second = 1;
        int fibonacciNumber = 0;
        
        for (int i = 2; i <=n; i++) {
            fibonacciNumber = first + second;
            first = second;
            second = fibonacciNumber;            
        }
        
        return fibonacciNumber;
    }

    public static int fibonacciRecursive(int n) {
        
        if (n < 0)
            throw new IllegalArgumentException("Input cannot be negative. The given input: "+n);
            
        if (n == 0 || n == 1)
            return n;
        
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    public static void main(String args[]) {

       if (args.length ==  0 ) {
            System.out.println("Input is not provided");
            System.exit(-1);
        }
    
        int n = Integer.parseInt(args[0]);

        System.out.println(findFibonacci(n));
        System.out.println(fibonacciRecursive(n));
    
    }

}

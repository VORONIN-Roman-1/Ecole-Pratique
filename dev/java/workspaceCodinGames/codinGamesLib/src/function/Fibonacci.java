package function;

public class Fibonacci {
	// f(0)=1 ; f(1)=1; f(2)=2 ...
	public static int fib( int x ) {
        return x > 1 ? fib(x - 1) + fib(x - 2) : 1; }
}

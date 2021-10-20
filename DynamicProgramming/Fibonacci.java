// Finding the sum of the nth fibonacci number
// 
// Complexity: 
// Brute force: O(2^n) time		Current Solution(memoized): O(n) time
//              O(n) space                                  O(n) space
//
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Fibonacci {

	private Map<Integer, Integer> memo = new HashMap<>();

	public int fib(int n) {

		if (n <= 2)
			return 1;

		if (memo.containsKey(n))
			return memo.get(n);

		int result = fib(n - 1) + fib(n - 2);
		memo.put(n, result);
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		Fibonacci obj = new Fibonacci();
		System.out.println(n + "th fibonacci is : " + obj.fib(n));
		sc.close();

	}
}

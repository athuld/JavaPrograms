
// Say you are a traveller on a 2D grid. You begin in the top-left corner and your goal is to travel to the bottom-right corner . You mave move down or right
//
// In how many ways can you travel to the goal on a grid with dimensions m * n
//
// Complexity: 
// Brute force: O(2^m+n) time		Current Solution(memoized): O(m*n) time
//              O(m+n) space                                    O(m+n) space
//
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class GridTraveller {

	private Map<String, Integer> memo = new HashMap<>();

	public int gridTraveller(int m, int n) {

		// Create a unique key
		String Key = m + "," + n;

		if (m == 1 && n == 1)
			return 1;

		if (m == 0 || n == 0)
			return 0;

		// Check if the memo already contrains the result
		if (memo.containsKey(Key))
			return memo.get(Key);

		int result = gridTraveller(m - 1, n) + gridTraveller(m, n - 1);

		// Store the result with along with the unique key
		memo.put(Key, result);

		return result;
	}

	public static void main(String[] args) {

		GridTraveller obj = new GridTraveller();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row: ");
		int m = sc.nextInt();
		System.out.print("Enter the column: ");
		int n = sc.nextInt();
		System.out.println("Totol no: of ways to travel is : " + obj.gridTraveller(m, n));
		sc.close();

	}
}

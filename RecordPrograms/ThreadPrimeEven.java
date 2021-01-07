import java.util.Scanner;

public class ThreadPrimeEven {
	public static void main(String args[]) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Lower range:");
		x = sc.nextInt();
		System.out.print("\nEnter the Upper range:");
		y = sc.nextInt();

		Range r = new Range(x, y);
		Prime p = new Prime(r);
		Even e = new Even(r);
	}
}

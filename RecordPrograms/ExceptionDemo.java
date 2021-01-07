import java.util.*;

public class ExceptionDemo {
	static void checking(int a) throws MarksOutOfBound {
		if (a > 100 || a < 0)
			throw new MarksOutOfBound(a);
		System.out.println("Marks entered within range");
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter your marks:");
		int marks = sc.nextInt();
		try {
			checking(marks);
		} catch (MarksOutOfBound e) {
			System.out.println("Caught " + e);
		}
	}
}

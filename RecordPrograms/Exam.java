import java.util.*;

public class Exam extends Student {
	double examMarks;

	public void getTotal() {
		Scanner s = new Scanner(System.in);
		System.out.print("\nTotal exam marks:");
		examMarks = s.nextDouble();
	}
}

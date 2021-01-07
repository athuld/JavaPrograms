import java.util.*;
	public class Student {
	String studName;
	int studRno;

	public void getDetails()
	{
		Scanner s = new Scanner(System.in);
    System.out.println("Enter Student Details");
		System.out.print("\nStudent name :");
		studName = s.next();
		System.out.print("\nStudent Roll No: :");
		studRno = s.nextInt();
	}
}

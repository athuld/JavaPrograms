import java.util.*;

public class Results extends Exam implements Sports {

	double graceMarks;
	int postn;
	String choice;

	public void checkEligible() {
		Scanner s = new Scanner(System.in);
		System.out.print("\nAre you eligible for grace marks(y/n)?:");
		choice = s.next();
		switch (choice) {
		case "y":
			System.out.print("\nEnter your overall position in the games:");
			postn = s.nextInt();
			if (postn == 1)
				graceMarks = graceP1;
			else if (postn == 2)
				graceMarks = graceP2;
			else if (postn == 3)
				graceMarks = graceP3;
			break;
		case "n":
			graceMarks = 0.0;
			break;
		default:
			System.out.println("Invalid choice");
			checkEligible();
			break;
		}
	}

	public void getResults() {
		System.out.print("\n*************Results******************");
		System.out.print("\nRoll-no                   :" + studRno);
		System.out.print("\nName                      :" + studName);
		System.out.print("\nTotal Marks               :" + examMarks);
		System.out.print("\nGrace Marks               :" + graceMarks);
		System.out.println("\n=========================================");
		System.out.println("\nTotal Marks Awarded 	  :" + (examMarks + graceMarks));
	}
}

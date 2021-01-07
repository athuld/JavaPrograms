package homepack;
import java.util.*;
public class Income {
	
	public double salaryInc, allowanceInc, otherInc,totalInc;
	
	public void getIncome() {
		Scanner s = new Scanner(System.in);
		System.out.println("\n***** Enter the Income details *****");
		System.out.println("\nSalary: ");
		salaryInc =  s.nextDouble();
		System.out.println("\nAllowance: ");
		allowanceInc = s.nextDouble();
		System.out.println("\nOther Income:");
		otherInc = s.nextDouble();
		
		totalInc =  salaryInc+allowanceInc+otherInc;
	}
	
}

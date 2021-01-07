package homepack;
import java.util.*;
public class Expenditure {
	
	public double foodExp, clothExp, eduExp, totalExp;
	public void getExpenditure() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("\n***** Enter the Expenditure details *****");
		System.out.println("\nFood: ");
		foodExp =  s.nextDouble();
		System.out.println("\nCloth: ");
		clothExp = s.nextDouble();
		System.out.println("\nEducation:");
		eduExp = s.nextDouble();
		
		totalExp = foodExp+clothExp+eduExp;
	}
}

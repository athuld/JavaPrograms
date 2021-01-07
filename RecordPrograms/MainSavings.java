import homepack.*;
public class MainSavings {
	
	public static void main(String[] args) {
		
		double totalSavings;
		Income obj1 = new Income();
		Expenditure obj2 = new Expenditure();
		obj1.getIncome();
		obj2.getExpenditure();
		
		totalSavings = obj1.totalInc - obj2.totalExp;
		System.out.println("\nTotal Savings : "+totalSavings);
		
	}

	
}

import java.util.*;
public class empSeniority {
	
	int emp_code, day, month, year;
	String emp_name;
	
	public empSeniority() {
		
		emp_code = 0;
		emp_name = "Invalid";
		day = 0;
		month = 0;
		year = 0; 
		
	}
	
	public void getDetails () {
		
		Scanner s = new Scanner(System.in);
		System.out.println("\nEnter the Details of the Employee ");
		System.out.println("\nName of the employee: ");
		emp_name = s.nextLine();
		System.out.println("\nEmployee code:");
		emp_code = s.nextInt();
		System.out.println("\nDate of Joining");
		System.out.println("Day:");
		day = s.nextInt();
		System.out.println("Month:");
		month = s.nextInt();
		System.out.println("Year:");
		year = s.nextInt();
		
	}
	
	public void displayDetails() {
		System.out.println("\n " +emp_code+ "\t" +emp_name+ "\t" +day+"/"+month+"/"+year);
		
	}

}

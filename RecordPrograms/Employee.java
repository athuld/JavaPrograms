import java.util.*;
public class Employee {
	
	public static void main(String[] args) {
		
		int n,i,j;
		Scanner s = new Scanner(System.in);
		System.out.println("\nEnter the number of employees:");
		n = s.nextInt();
		empSeniority temp = new empSeniority();
		empSeniority obj[] = new empSeniority[n];
		
		for (i=0;i<n;i++) {
			
			obj[i] = new empSeniority();
			obj[i].getDetails();
			
		}
		
		for (i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(obj[i].year > obj[j].year ) {
					temp = obj[i];
					obj[i] = obj[j];
					obj[j] = temp;
				}
		
			}
		}
		
		for (i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(obj[i].year == obj[j].year ) {
					if (obj[i].month > obj[j].month) {
					temp = obj[i];
					obj[i] = obj[j];
					obj[j] = temp;
					}
				}
		
			}
		}

		System.out.println("\nEmployee Seniority List:"); 
		for (i=0;i<n;i++) {
			obj[i].displayDetails();
		}
	}
}

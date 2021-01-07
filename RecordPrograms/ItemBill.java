import java.util.*;
public class ItemBill {
	
	public static void main(String[] args) {
		int n,i;
		double grandTotal = 0.0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Items:");
		n = s.nextInt();
		Bill obj[] = new Bill[n];
		
		for (i=0;i<n;i++) {
			obj[i] = new Bill();
			obj[i].getTotal();
			
		}
		
		for (i=0;i<n;i++) {
			grandTotal += obj[i].itemTotal;
		}
		
		System.out.println("==============================================================================");
		System.out.println("\t\t\t\tBill");
		System.out.println("==============================================================================");
		System.out.println("\nSNO\tITEM CODE\tITEMNAME\tPRICE\tQUANTITY\tTOTAL");
		System.out.println();
		for(i=0;i<n;i++)
		{
			System.out.println((i+1)+"\t"+obj[i].itemNo+"\t\t"+obj[i].itemName+"\t\t"+obj[i].itemPrize+"\t\t"+obj[i].itemQuant+"\t"+obj[i].itemTotal);
		}
		System.out.println("\n\t\t\t\t\t\t Total \t\t"+grandTotal);
	}
	
}

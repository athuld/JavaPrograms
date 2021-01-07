import java.util.*;
public class Item {
	
	int itemNo,itemQuant;
	String itemName;
	double itemPrize;
	
	public Item() {

		itemNo = 0;
		itemQuant = 0;
		itemName = "Invalid";
		itemPrize = 0.0;
	}
	
	public void getItem() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("\nEnter the Item details:");
		System.out.println("Item Number:");
		itemNo = s.nextInt();
		s.nextLine();
		System.out.println("Item name:");
		itemName = s.nextLine();
		System.out.println("Item Prize:");
		itemPrize = s.nextDouble();
		System.out.println("Item Quantity:");
		itemQuant = s.nextInt();
		
	}

}

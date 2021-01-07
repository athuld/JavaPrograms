import java.util.*;
public class Bill extends Item {

	double itemTotal;
	
	public double getTotal() {
		
		super.getItem();
		itemTotal = itemPrize*itemQuant;
		return itemTotal;
		
	}
}

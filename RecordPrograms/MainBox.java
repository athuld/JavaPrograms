import java.util.*;
public class MainBox {

	public static void main(String[] args) {
		
	int side, sideLen, sideBr;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the side of the square: ");
	side = s.nextInt();
	System.out.println("Enter the sides of the rectangle: ");
	System.out.println("Length:");
	sideLen = s.nextInt();
	System.out.println("Breadth:");
	sideBr = s.nextInt();
	
	Box obj1 = new Box();
	Box obj2 = new Box();
	
	obj1.computeData(side);
	obj2.computeData(sideLen, sideBr);
	
	System.out.println("Squre");
	System.out.println("*******");
	obj1.display();
	System.out.println("Rectangle");
	System.out.println("*********");
	obj2.display();
	
	}
}

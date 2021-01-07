import java.util.*;
public class RightTriangle extends Shape {

	double trBase,trHeight,trArea;
	
	public void display() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the sides of the Right Triangle");
		System.out.println("Base:");
		trBase = s.nextDouble();
		System.out.println("Height");
		trHeight = s.nextDouble();
		trArea = (0.5)*trBase*trHeight;
		System.out.println("Area of Right Triangle : "+trArea);
		
		
	}
	
}

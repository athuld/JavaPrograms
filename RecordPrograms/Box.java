import java.util.*;
public class Box {
	
	int perimeter,area;
	
	public void computeData(int side) {
		area = side * side;
		perimeter = 4 * side;
	}
	
	public void computeData(int sideLen, int sideBr) {
		area = sideLen * sideBr;
		perimeter = 2 * (sideLen + sideBr);
	}
	
	public void display () {
		System.out.println("Area : " +area);
		System.out.println("Perimeter: " +perimeter+"\n");
	}
}
package method.black;

public class methodOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		printLoop(1,10, 1);
//		printLoop(20, 40, 2);
		
		System.out.println("The are of rectangle 3.2 length and width 5.4 is: "+areaRect(3.2, 5.4));
		
	}
	
	
	public static void printLoop(int x, int y, int z) {
		while (x <=y) {
			System.out.println(x);
			x+=z;
		}
		System.out.println("------------------------------------------------------------");
	}
	
	public static double areaRect(double length, double width) {
		return length*width;
	}

}

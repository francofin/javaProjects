import java.math.BigDecimal;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello World");
		int variableOne = 34;
		BigDecimal d1 = new BigDecimal("1.05");
		BigDecimal d2 = new BigDecimal("1.85");
		
		System.out.println(d1.add(d2));
		

	}

}

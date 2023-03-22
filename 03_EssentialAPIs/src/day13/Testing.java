package day13;

public class Testing {
	public static void main(String[] args) {
		
		Operation add = (a,b) -> a+b;
		Operation mul = (a,b) -> a*b;
		
		System.out.println("add = " + add.Calculate(200, 300));
		System.out.println("mul = " + mul.Calculate(200, 300));
	}
}

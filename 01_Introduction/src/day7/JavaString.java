package day7;

public class JavaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java Programming";
		String s2 = new String(new char[] {'J', 'A', 'V', 'A'});
		
		System.out.println("Len of s1: " + s1.length());
		System.out.println("Len of s2: " + s2.length());
		
		String tmp = s1.toLowerCase();
		System.out.println("After change case s1: " + s1);
		System.out.println("After change case tmp: " + tmp);
		
//		tmp = s1.replace("php");
		
		
		tmp = s1.concat("is a high level programming language");
		System.out.println("After concat s1: " + s1);
		System.out.println("After concat tmp: " + tmp);
		
		
	}

}

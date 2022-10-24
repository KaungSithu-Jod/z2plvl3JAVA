package assignments;
import java.util.Arrays;
import java.util.Scanner;

public class StringAssignment2 {

	public static void main(String[] args) {
		String[] pFword = {"Am", "Is", "Are", "Do", "Does", "Can", "May"};
		Arrays.sort(pFword);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type one sentence");
		
		String sentence = scanner.nextLine();
		if (sentence.endsWith("?")) 
		{
			String[] words = sentence.split(" ", 0);
			System.out.println("It's a Question Sentence");
			System.out.println("First word: " + words[0]);
			
//			The problem is what if "Subjective noun" has two separate words or more
			
			if ((Arrays.binarySearch(pFword, words[0]) >= 0) && !words[2].endsWith("ing")) {
				System.out.println("This is simple present tense.");
			} else if ((Arrays.binarySearch(pFword, words[1]) >= 1) && !words[3].endsWith("ing")) {
				System.out.println("This is simple present tense.");
			} else {
				System.out.println("This is not simple present tense.");
			}
		}
		else 
		{
			System.out.println("It's not a Question Sentence.");
		}
		
		
		scanner.close();
	}
	

}

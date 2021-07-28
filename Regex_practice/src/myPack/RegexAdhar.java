package myPack;

public class RegexAdhar {
	public static void main(String[] args) {
		System.out.println(isValidAdhar("2601 3456 4562"));
		System.out.println(isValidAdhar("1234 123 12312345"));
	}
		
	
public static boolean isValidAdhar(String Adhar) {
		
		return Adhar!=null && Adhar.matches("[0-9]{4} [0-9]{4} [0-9]{4}");
	
}
}
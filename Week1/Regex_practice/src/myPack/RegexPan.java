package myPack;

public class RegexPan {public static void main(String[] args) {
	System.out.println(isValidPan("2601 3456 4562"));
	System.out.println(isValidPan("ABCDE1234F"));
}
	

public static boolean isValidPan(String Pan) {
	
	return Pan!=null && Pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");

}
}
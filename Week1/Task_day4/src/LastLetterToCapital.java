


public class LastLetterToCapital {

	public static void main(String[] args) {
	
		String s="hello hi good noon hope we got thread safety";
		System.out.println(convertToTitleCase(s));

	}
	
	public static String convertToTitleCase(String s) {
		String ar[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int w = 0; w < ar.length; w++) {
			sb.append(ar[w].substring(0, ar[w].length()-1)).append(Character.toUpperCase(ar[w].charAt(ar[w].length()-1))).append(" ");
		}
		return sb.toString();
	}
}

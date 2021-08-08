//Task-If the word is of odd length then convert middle letter to uppercase else convert first letter to uppercase
public class OddLength {

	public static void main(String[] args) {
		
		String s="hello mann how are you";
		System.out.println(oddLength(s));

	}
	
	public static String oddLength(String s) {
		String ar[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int w = 0; w < ar.length; w++) {
			if(ar[w].length()%2==0) {
				sb.append(Character.toUpperCase(ar[w].charAt(0))).append(ar[w].substring(1)).append(" ");
			}
			else {
				//sb.append(ar[w].substring(0, ar[w].length()-1)).append(Character.toUpperCase(ar[w].charAt(ar[w].length()-1))).append(" ");
				sb.append(ar[w].substring(0,ar[w].length()/2)).append(Character.toUpperCase(ar[w].charAt(ar[w].length()/2))).append(ar[w].substring((ar[w].length()/2)+1, ar[w].length())).append(" ");
			}
		}
		return sb.toString();
	}
}


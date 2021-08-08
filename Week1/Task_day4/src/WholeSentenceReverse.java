//Task3 - In every word if it is not palindrome then reverse it and print back the whole sentence.  
public class WholeSentenceReverse {
public static void main(String[] args) {
		
		String s="I am From Madam";
		System.out.println(rev(s));

	}
	
	public static String rev(String s) {
		String ar[]=s.split(" ");
		//StringBuilder sb=new StringBuilder();
		StringBuilder st=new StringBuilder();
		for (int w = 0; w < ar.length; w++) {
			//sb.append(ar[w].substring(0, ar[w].length()-1)).append(Character.toUpperCase(ar[w].charAt(ar[w].length()-1))).append(" ");
			if(ar[w].equalsIgnoreCase(new StringBuilder(ar[w]).reverse().toString())) {
				st.append(new StringBuilder(ar[w])).append(" ");
			}
			else {
			
			st.append( new StringBuilder(ar[w]).reverse().toString()).append(" ");}
		}
		return st.toString().trim();
	}
}
		




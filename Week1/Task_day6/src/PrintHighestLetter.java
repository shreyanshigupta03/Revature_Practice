import java.util.Arrays;

public class PrintHighestLetter {

	public static void main(String[] args) {
	
		String s="hello hi how are you doing";
		System.out.println(printHighestWord(s));

	}
	
	public static String printHighestWord(String s) {
		String arr="";
		String ar[]=s.split(" ");
		
		
		for (int w = 0; w < ar.length; w++) {
			//String result[]=null;
			int l;
			int x=ar[0].length();
			l=ar[w].length();
			if(l>=x) {
				//Arrays.toString(ar);
				//System.out.println(ar[w+1]+ "");
				if(x<l) {
					arr="";
					
				}
				else {
					arr=arr.concat(ar[w])+" ";
					
				}
				x=l;
					
					
			}
			//System.out.println(""+result);
			
		}
		return arr;
	}
}
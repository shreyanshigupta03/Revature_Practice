import java.util.Arrays;
public class FindPalindromeInArray {
	public static void main(String[] args) {
		int arr[]= {12,33,11,232,41,10,12,23,13,101};
		findPalindrome(arr);
		
		}
	public static void findPalindrome(int arr[]) {
		System.out.println(""+Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++) {
			int x=arr[i];
			int rev=0;
			while(x!=0) {
				int digit=x%10;
				rev=rev*10+digit;
				x/=10;
				
			}
			if(rev==arr[i]) {
				Arrays.toString(arr);
				System.out.println(arr[i]+ "");
		}
			
		}
		
	}
}
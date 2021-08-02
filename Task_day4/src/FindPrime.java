import java.util.Arrays;
public class FindPrime {
	public static void main(String[] args) {
		int arr[]= {12,23,11,31,7,6,0};
		findPrimeNumber(arr);
		
		}
	public static void findPrimeNumber(int arr[]) {
		System.out.println(""+Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++) {
			int flag=0;
			for(int j=2;j<arr[i];j++) {
				if(arr[i]%j==0) {
					
					flag=1;
					//break;
				}
			}
			if(flag==0) {
				System.out.println(""+arr[i]);
			}
		
		}	
	}
			
}
		


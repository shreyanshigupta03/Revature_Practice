import java.util.Arrays;

public class SameFirstAndLast{
	public static void main(String[] args) {
		int arr[]= {121,23,11,3123,7,61,99,202};
		sameFirstAndLast(arr);
	}
	public static void sameFirstAndLast(int arr[]) {
		System.out.println(""+Arrays.toString(arr));
		for(int i=0;i<=arr.length;i++) {
			int x=arr[i];
			int lastdigit=0;
			lastdigit=x%10;
			while(!(x>0 && x<=9)) {
				x/=10;
			}
			if(x==lastdigit) {
				System.out.println(""+arr[i]);
			}
		}
	}
}	
import java.util.Arrays; 
public class RemoveDublicateFromArray {
	public static void main(String[] args) {
		int arr[]= {12,33,11,23,4,11,12,11,12,11};
		//int n=10;
		//Arrays.sort(arr);
		removeDublicateFromArray(arr);
		
		
	}
	public static void removeDublicateFromArray(int arr[]) {
		System.out.println(""+Arrays.toString(arr));
		int[] arr1=new int[arr.length];
		int j=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr1[j++]=arr[i];
				
			}
			
			}
		arr1[j++]=arr[arr.length-1];
		for(int i =0;i<j;i++) {
			System.out.println(" "+arr1[i]);
			
			
		}
		
	}
}
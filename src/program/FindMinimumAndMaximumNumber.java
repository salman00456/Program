package program;

public class FindMinimumAndMaximumNumber {
	
	public static void main(String[] args) {
		
		int[] arr= {12,14,-1,-4,23,28};
		
		int minimum=arr[0];
		int maximum = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maximum) {
				maximum=arr[i];
			}else if(arr[i]<minimum) {
				minimum=arr[i];
			}
		}
		
		System.out.println("the maximum number is "+maximum+" the minimum number is "+minimum);
	}

}

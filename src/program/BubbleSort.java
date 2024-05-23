package program;

public class BubbleSort {
	
	public static void swap(int[] arr, int i, int j) {
		if(i==j) {
			return;
		}
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,-1,-2,4,5,7,9};
		
		for(int i=arr.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr, j, j+1);
				}			}
			
		}
		
		

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
			
		}
		

		
		
	}

}

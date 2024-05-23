package program;

public class FindingSecondLargestNum {
	
	public static void swap(int[] arr,int i,int j) {
		
		if(i==j) {
			return;
		}
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void main(String[] args) {
		
		int[] arr= {2,3,8,9,12,-1,-5,67,23};
		
		for(int i=arr.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
		// this will give you second largest number
		System.out.println(arr[arr.length-2]);
		
		//for second smallest number 
		System.out.println(arr[1]);
		
		
	}

}

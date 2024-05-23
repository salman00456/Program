package program;

public class RerrangeOfAnArray {
	
	public static void rerrangeArray(int[] arr) {
		
		int j=0;
		//This loop will traverse the those value which is not equal to zero and moved to the new array
		//and last increase the j 
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[j]=arr[i];
				j++;
			}
		}
		
		while(j<arr.length) {
			arr[j]=0;
			j++;
		}
	
	}
	public static void main(String[] args) {

	int[] arr= {13,12,0,4,5,0,16,17};
	
	//creating the new array
	
	rerrangeArray(arr);
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
	
	}
}

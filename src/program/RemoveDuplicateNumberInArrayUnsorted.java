package program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNumberInArrayUnsorted {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,6,2,5,3,};
		// without Set approach
		Arrays.sort(arr);
		int j=0;
		
	for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j]=arr[i];
				j++;
			}
		}
		
		arr[j]=arr[arr.length-1];
		for(int i=0;i<=j;i++) {
			System.out.println(arr[i]);
		}
		
		//with set approach
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		
		for(int num:set) {
			System.out.println(num); 
			
		}
		
		
		
		
		
	}

}

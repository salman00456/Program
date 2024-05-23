  package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeperateNegativeAndPositiveArray {
	
	public static void main(String[] args) {
		
		int[] arr= {1,3,4,5,-5,-6,-7,8,9};
		
		List<Integer> positiveList = new ArrayList<>();
		List<Integer> negativeList = new ArrayList<>();
		
		for(int num:arr) {
			if(num>=0) {
				positiveList.add(num);
			}else {
				negativeList.add(num);
			}
	
		}
		
		int[] postiveArr = new int[positiveList.size()];
		int[] negativeArr = new int[negativeList.size()];
		
		for(int i=0;i<postiveArr.length;i++) {
			postiveArr[i]=positiveList.get(i);
		}
		
		for(int i=0;i<negativeArr.length;i++) {
			negativeArr[i]=negativeList.get(i);
		}
		
		System.out.println("Positive array is "+ Arrays.toString(postiveArr));
		System.out.println("Negative array is "+Arrays.toString(negativeArr));
	}
	

}

package program;

public class FindingTheMissingNumber {
	
	public static void main(String[] args) {
		
		int[] arr= {1,4,5,6,2,3,7,9};
		
		int sum=0;
		int sum1=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		
		for(int j=1;j<=9;j++) {
			sum1=sum1+j;
		}
		System.out.println("sum1 value is "+sum1);
		
		System.out.println("the missing number is "+ (sum1-sum));

	}

}

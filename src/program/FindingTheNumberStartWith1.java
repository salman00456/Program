package program;

public class FindingTheNumberStartWith1 {
	
	public static void main(String[] args) {
		
		int[] arr= {2,3,4,15,12,9};
		
		for(int number:arr) {
			
			String newNum = Integer.toString(number);
			
			if(newNum.startsWith("1")) {
				System.out.println(newNum);
			}
		}
		
	}
}

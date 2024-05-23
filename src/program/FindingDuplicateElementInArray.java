package program;

public class FindingDuplicateElementInArray {
	
	public static void main(String[] args) {
		
		String[] arr= {"Java","Python","C","Java","C"};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					System.out.println("the duplicate element is "+arr[i]);
					
					System.out.println(arr.length);
				}
			}
		}
	}
}

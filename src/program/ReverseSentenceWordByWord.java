package program;

public class ReverseSentenceWordByWord {
	
	public static void main(String[] args) {
		
		
		String str = "Java Conceot Of The Day"; //output: Day The Of Concept Java
		
		String[] arr = str.split(" ");
		
		String result="";
		
		for(int i=arr.length-1;i>=0;i--) {
			result=result+arr[i]+" ";
		}
		
		System.out.println(result);
	}

}

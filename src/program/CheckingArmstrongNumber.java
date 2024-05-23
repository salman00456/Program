package program;

public class CheckingArmstrongNumber {
	
	public static void main(String[] args) {
		
		int num =370;
		
		int temp=num;
		int rem;
		int arm=0;
		
		
		while(num>0) {
			
			rem=num%10;
			
			arm =(rem*rem*rem)+arm;
			
			num=num/10;
			
		}
		
		if(temp==arm) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not Armstrong number");
		}
	}

}

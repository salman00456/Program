package program;

public class CheckForFibonaciSereis {
	
	
	
	public static void main(String[] args) {
		
		 long f0=0;
		 long f1=1;
		 long f=f0+f1;
		 
		 for(int i=3;i<=10;i++) {
			 f0=f1;
			 f1=f;
			 f=f0+f1;
			 
			 System.out.println(f);
		 }

	}

}

package program;

import java.util.List;

public class SwappingTwoStringWithoutUsingThird {
	
	public static void main(String[] args) {
		
		
		String s1="apple";
		String s2="mango";
		
		s1=s1+s2;
		//System.out.println(s1);
		
		s2= s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		
		System.out.println("S1 string is "+s1);
		System.out.println("S2 string is "+s2);
		
		
		//swapping two number without using third variable 
		
		int a=10;
		int b=15;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swap output will be a---"+a);
		System.out.println("after swap output will be b---"+b);
		
	}

}

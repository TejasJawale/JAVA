package Operators;

public class LogicalBitwiseAnd {

	public static void main(String[] args) 
	{
		int a=10;  
		int b=5;  
		int c=20;  
		System.out.println(a<b&&a<c);//false && true = false  
		System.out.println(a<b&a<c);//false & true = false 
		
		int d=10;  
		int e=5;  
		int f=20;  
		System.out.println(d<e&&d++<f);//false && true = false  
		System.out.println(d);//10 because second condition is not checked  
		System.out.println(d<b&d++<f);//false && true = false  
		System.out.println(d);//11 because second condition is checked

	}

}

package If_Statement;

public class NestedIf_Program_AgeWt {

	public static void main(String[] args) {
//		 //Creating two variables for age and weight  
//	    int age=20;  
//	    int weight=80;    
//	    //applying condition on age and weight  
//	    if(age>=18){    
//	        if(weight>50){  
//	            System.out.println("You are eligible to donate blood");  
//	        }    
//	    } 
		
		//Creating two variables for age and weight    
	    int age=18;    
	    int weight=50;      
	    //applying condition on age and weight    
	    if(age>=18){      
	        if(weight>50){    
	            System.out.println("You are eligible to donate blood");    
	        } 
	        else{  
	            System.out.println("You are not eligible to donate blood");    
	        }  
	    } else{  
	      System.out.println("Age must be greater than 18");  
	    } 

	}

}

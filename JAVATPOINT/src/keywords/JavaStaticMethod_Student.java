package keywords;

 class Student {
	 int rollno;  
     String name;  
     static String college = "ITS";  
     //static method to change the value of static variable  
     static void change(){  
     college = "BBDIT";  
     }  
     //constructor to initialize the variable  
     Student(int r, String n){  
     rollno = r;  
     name = n;  
     }  
     //method to display values  
     void display(){System.out.println(rollno+" "+name+" "+college);}  
}  
//Test class to create and display the values of object  
 class JavaStaticMethod_Student{  
    public static void main(String args[]){  
    	Student.change();//calling change method  
    //creating objects  
    	Student s1 = new Student(1,"Tejas");  
    	Student s2 = new Student(2,"Satish");  
    	Student s3 = new Student(3,"Jawale");  
    //calling display method  
    s1.display();  
    s2.display();  
    s3.display();  
    }  

}

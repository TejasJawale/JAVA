package Oops;

class Employee{  
    int id;  
    String name;  
    float salary;  
    void insert(int i, String n, float s) {  
        id=i;  
        name=n;  
        salary=s;  
    }  
    void display(){System.out.println(id+" "+name+" "+salary);}  
}  
 class ObjectInitialise_Constructor_TestEmployee {  
public static void main(String[] args) {  
    Employee e1=new Employee();  
    Employee e2=new Employee();  
    Employee e3=new Employee();  
    e1.insert(1,"tejas",100000);  
    e2.insert(2,"satish",200000);  
    e3.insert(3,"jawale",300000);  
    e1.display();  
    e2.display();  
    e3.display();  
}  
}  
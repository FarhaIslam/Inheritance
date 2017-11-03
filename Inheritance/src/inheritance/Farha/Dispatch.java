package inheritance.Farha;

class A2{   

	   void callme() {    
	         System.out.println("Inside A2's callme method");   
	     } 
	}  
	class B2 extends A2 {   
	    void callme() {     
	         System.out.println("Inside B2's callme method"); 
	    }
	 }  
	class C2 extends A2 {   
	    void callme() {    
	         System.out.println("Inside C2's callme method"); 
	    } 
	}  
public class Dispatch {

}

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


    public static void main(String args[]) {    
          A2 a = new A2();     
          B2 b = new B2();    
          C2 c = new C2();  

          A2 r;  
          r = a; 
          r.callme();   
          
          r = b;   
          r.callme(); 
          
         r = c;    
         r.callme();   
         
    } 
}

package inheritance.Farha;

class E {
	int k;
	} 
class F extends E {   
	int k;  
  F(int m, int n) {    
	super.k = m;
   
     }
  
	void show(){     
		System.out.println("k in superclass: " + super.k);     
		System.out.println("k in subclass: " + k);   
	
  }
}
public class UseSuper {

public static void main(String args[]) {     
		
		F subOb = new F(1, 2);  
	  
		subOb.show();  
    
    }	
	
 }

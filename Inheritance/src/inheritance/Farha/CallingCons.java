package inheritance.Farha;
 
class M{   
    
    M() {    
     
        System.out.println("Inside M's constructor.");

      }

}

class N extends M{   
    
   N() {    

       System.out.println("Inside N's constructor.");   

    }

}  

class O extends N { 

  O() {    

       System.out.println("Inside O's constructor.");  

     }

}  

public class CallingCons {

	public static void main(String args[]) {    

	       O o = new O(); 
	  }  
	
}


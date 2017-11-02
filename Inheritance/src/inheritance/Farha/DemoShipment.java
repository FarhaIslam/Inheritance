package inheritance.Farha;

class Box2 {  
	  private double width; 
	  private double height;   
	  private double depth; 
	    

	Box2(Box2 ob) {   
	      width = ob.width;     
	      height = ob.height;     
	      depth = ob.depth;  
	     
	     }  
    Box2(double w, double h, double d) {    
	    width = w;     
	    height = h;   
	    depth = d;   
	     
        }  
	    
	Box2() {     
	    width = -1;  
	    height = -1;
	    depth = -1;    
	    
	   }  
	     
	Box2(double len) {     
	         
		width = height = depth = len;  
		
	}  
	   
	double volume() {     
		return width * height * depth;   
		
	    } 
	} 

class BoxWeight1 extends Box2 {  
	
	double weight; 
	BoxWeight1(BoxWeight1 ob) { 
	     super(ob);     
	     weight = ob.weight; 
	  }  
	 
	BoxWeight1(double w, double h, double d, double m) {     
	        super(w, h, d);    
	        weight = m;  
	        
	 }  
	   
	 BoxWeight1() {    
		 super();     
		 weight = -1; 
	 }
	 
	 BoxWeight1(double len, double m) {     
		 super(len);    
		 weight = m;  
		 
	 } 
	 
} 
public class DemoShipment {

}

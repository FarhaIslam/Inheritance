package inheritance.Farha;

abstract class Figure1 {   

    double dim1;   
    double dim2;  

    Figure1(double a, double b) {    
         dim1 = a;     
         dim2 = b;  

      }  
    abstract double area(); 

}  

class Rectangle1 extends Figure1{   
    Rectangle1(double a, double b) {     
     super(a, b);  

     }  
    double area() {    
    System.out.println("Inside Area for Rectangle.");    
     return dim1 * dim2;  
     
    }

}  
public class AbstractAreas {

}

package inheritance.Farha;
class C{
	int a;
	private b;
	void setab(int x , int y){
		x = a;
		y = b;
	}
	
}
class D extends C{
	int total;
	void sum(){
		total = a + b;
	}
	
}
public class Access {
 
	public static void main(String args[]){
	 D subOb = new D();
	 subOb.setab(10 , 20);
	 
	 subOb.sum();
	 System.out.println("Total is :" + subOb.total);
   
	}
}

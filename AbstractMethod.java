public class AbstractMethod extends abc{
	
	 void display(){
		System.out.println("welcome to display");
	 }
	  
	  public static void main(String arg[]){
		  AbstractMethod am=new AbstractMethod();
		  am.display();
		  System.out.println(am.getName());
		   
	  }
	 
}


abstract class abc{
	
	public String name="dimpi";
	
	abstract void display();
	
	public String getName(){
		return name;
	}
}
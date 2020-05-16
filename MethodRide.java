public class MethodRide extends multi{
	
	MethodRide(){
		super();
		System.out.println(text);
	}
	
	int multiply(int a, int b, int c){
		return a*b*c;
	}
	
	
	public static void main(String arg[]){
		MethodRide mr=new MethodRide();
		
		System.out.println(mr.multiply(10, 20));
		System.out.println(mr.multiply(10, 20, 30));
	}
}


class multi{
	
	String text="welcome to inheritance";
	
	int multiply(int a, int b){
		return a*b;
	} 
	
}
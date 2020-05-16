public class MethodOverload{
	
	int multiply(int a, int b){
		return a*b;
	}
	
	int multiply(int a, int b, int c){
		return a*b*c;
	}
	
	
	public static void main(String arg[]){
		MethodOverload mo=new MethodOverload();
		
		System.out.println(mo.multiply(10, 20));
		System.out.println(mo.multiply(10, 20, 30));
	}
}
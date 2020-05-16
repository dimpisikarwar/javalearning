public class Interface implements addition, multiply  {
	
	public int add(int a, int b){
		return a+b;
	}
	
	public int multy(int a, int b){
		return a*b;
	}
	
	public static void main(String args[]){
		Interface i=new Interface();
		int c=i.add(10, 20);
		int d=i.multy(10, 20);
		System.out.println(c);
		System.out.println(d);
	}
}


interface addition{
	int add(int a, int b);	
}

interface multiply{
	int multy(int a, int b);	
}
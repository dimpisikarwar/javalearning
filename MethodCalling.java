public class MethodCalling{
	private String name="";
	private int a;
	private int b;	
	
	final static int age=30;
    static String city="saket";
	private static String address="delhi";
	
	public int getA(){
		return this.a;
	}
	
	public void setA(int a){
		this.a=a;
	}
	
	public int getB(){
		return this.b;
	}
	
	public void setB(int b){
		this.b=b;
	}
	
	int addd(int a, int b){		
		return a+b;
	}
	
	int add(int a, int b){		
		return a+b;
	}	
	
	void ad(){		
		System.out.println(a+b);
	}
	
	public int getAd(){
		return a+b;
	}
	
	public void setAd(int a, int b){
		 this.a=a;
		 this.b=b;
	}
	
	
	public String getName(){
		return this.name;		
	}
	
	public void setName(String name){
		 this.name=name;		
	}
	
	
	MethodCalling(String name){		
		 this.name=name;
		// System.out.println(this.name);
	}
	
	MethodCalling(int a, int b){
        this.a=a;
        this.b=b;		
		 // this.name=name;
		// System.out.println(this.name);
	}
	public static void main(String args[]){
		MethodCalling mc=new MethodCalling("test");
		// age=40;
		System.out.println(age);
		
		System.out.println(salary);
		System.out.println(city);
		System.out.println(address);
		
		// when return type void
		int c=mc.add(10, 20);
		
		// int DataType getter and setter
		mc.setA(50);
		mc.setB(70);
        int d=mc.addd(mc.getA(), mc.getB());	
		System.out.println(d);
		
		// datatype define
		mc.ad();		
		System.out.println(c);
		
		// string DataType  getter and setter
		mc.setName("roaj");		
		mc.getName();		
		System.out.println(mc.getName());
		
		//hsgdfs
		mc.setAd(20, 30);
		System.out.println(mc.getAd());
		
	}
}
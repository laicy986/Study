package obsqurapackage;

public class ThisConstructor {
	int a,b,c;
	
	
	
	public ThisConstructor(int a, int b)
	{
		//this(); here you are caling the below constructor
		this();
		//this(10); you can not do this because constructor call should be 
		//first statement in a constructor
		this.a=a;
		this.b=b;
		c=a+b;
		System.out.println(c);
	}
    
	public ThisConstructor()
	{
		this(10); 
		// here below constructor is called.
		System.out.println("hi");
		}
	public ThisConstructor(int a)
	{
		
		System.out.println(a);
	}
	
	public void display()
	{
		System.out.println("hello");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisConstructor b= new ThisConstructor(10,20);

	}

}

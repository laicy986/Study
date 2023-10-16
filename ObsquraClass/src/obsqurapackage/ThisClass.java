package obsqurapackage;

public class ThisClass {
	int a,b,c;
	public   ThisClass(int a,int b)
	{
		this.method1();

		this.a=a;
		this.b=b;
		c=a+b;
		System.out.println(c);
		
	}
	
	public void method1()
	{
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisClass obj=new ThisClass(10,20);
		//obj.method1();

	}

}

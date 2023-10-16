package obsqurapackage;

public class Calculator {

	
	
	 int c;
	
	
	
	public void add(int a,int b)
	{
		
		
		c=a+b;
		System.out.println(c);
	}
	
	public void  sub(int a,int b)
	{
		
		
		c=a-b;
		System.out.println(c);

	}
	public void mul(int a, int b)
	{
		
		
		c=a*b;
		System.out.println(c);

	}
	public void div(int a, int b)
	{
		
		
		c=a/b;
		System.out.println(c);

	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		c.add(10,20);
		//System.out.println(c.add());
		c.sub(10,20);
		c.mul(10,20);
		c.div(10,20);


	}

}

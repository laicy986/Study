package obsqurapackage;

public class CalculatorResultMain {
	

		
		
		 int a=10,b=20,c;
		
		
		
		public int add()
		{
			
			
			c=a+b;
			return c;
		}
		
		public int  sub()
		{
			
			
			c=a-b;
			return c;

		}
		public int mul()
		{
			
			
			c=a*b;
			return c;


		}
		public int div()
		{
			
			
			c=a/b;
			return c;


		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculatorResultMain c =new CalculatorResultMain();
		System.out.println(c.add());
		System.out.println(c.sub());
		System.out.println(c.mul());
		System.out.println(c.div());

	}

}

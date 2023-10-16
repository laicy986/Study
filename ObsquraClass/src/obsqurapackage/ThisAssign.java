package obsqurapackage;

public class ThisAssign {
	int a,b,c;
	
	//*public   ThisAssign(int a,int b)
	
	public void addNumb(int a,int b)
	{

		this.a=a;
		this.b=b;
		c=a+b;
		System.out.println(c);
	}
	
	
	
	
	
	public void averageNumb()
	{
		this.addNumb(10,20);
		//this.addNumb(10,20);
		int d=c/2;
		System.out.println(d);
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisAssign c = new ThisAssign();
		c.averageNumb();
		//c.addNumb(10,20);
		

	}

}

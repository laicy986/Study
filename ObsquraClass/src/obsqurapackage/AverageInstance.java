package obsqurapackage;

public class AverageInstance {

	
	public void methodOver(int a,int b,int c)
	{
		int d=(a+b+c)/3;
		System.out.println(d);
	}

	public void methodOver(float a,float b,float c)
	{
		float e=(a+b+c)/3;
		System.out.println(e);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AverageInstance a=new AverageInstance();
		a.methodOver(1, 2, 3);
		a.methodOver(1.1f, 2.1f, 3.1f);
		
	}

}

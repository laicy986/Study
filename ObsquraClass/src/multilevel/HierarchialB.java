package multilevel;

public class HierarchialB extends HierarchialA {
	
	public void sub()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HierarchialB c = new HierarchialB();
		c.sub();
		c.add();

	}

}

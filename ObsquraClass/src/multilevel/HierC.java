package multilevel;

public class HierC extends HierarchialA {
	
	public void mul()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HierC c= new HierC();
		c.mul();
        c.add();
       // c.sub();
	}

}

package multilevel;

public class MultilevelChild1 extends MultilevelChild {
	
	public void multilevelChildB()
	{
		System.out.println("name");

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelChild1 c = new MultilevelChild1();
		c.parentmultilevel1();
		c.multilevelchildA();
		c.multilevelChildB();
		
		
	}
	
		
	}



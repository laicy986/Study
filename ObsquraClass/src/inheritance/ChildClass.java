package inheritance;

public class ChildClass extends SingleInheritance {

	
	public void child()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass b = new ChildClass();
		b.child();
		b.parentclass();
	}

}

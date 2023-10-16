package obsqurapackage;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s = new StringBuffer("hello");
		s.insert(2, "hi");
		System.out.println(s);
        s.replace(1, 3, "welcome");
		System.out.println(s);
		s.delete(1,3);
		System.out.println(s);
		s.reverse();
		System.out.println(s);


	}

}

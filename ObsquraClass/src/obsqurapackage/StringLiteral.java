package obsqurapackage;

public class StringLiteral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="hello";
String b="hi";
System.out.println(a+ "" +b);

String c=new String("hello");
System.out.println(c);
c.indexOf("e");
System.out.println(c);

a=a.concat("qwer");
System.out.println(a);

a=a.concat("zxcv");
System.out.println(a);

int s= a.length();
System.out.println(s);
System.out.println(a.equals(b));




	}

}

package obsqurapackage;

import java.util.Scanner;

public class ScannerIn {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of string");	
		String j=sc.nextLine();
		System.out.println("enter the value of a");
		int a =sc.nextInt();
		System.out.println("enter the value of b");		
		int b=sc.nextInt();
		int c=a+b;
		System.out.println(c);
		System.out.println("enter the value of float z");

		float z=sc.nextFloat();

		System.out.println("enter the value of char z");

		char d=sc.next().charAt(0);
		

		
	}

}

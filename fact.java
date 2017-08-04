package factorial;

import java.util.Scanner;

public class fact {

void facto()
{
		String ch;
Scanner sc=new Scanner(System.in);
	do {
	System.out.println("Enter the no.");
	 int n=sc.nextInt();
	 int fact=1;
	    for(int i=1;i<=n;i++) {
	    	
		fact=fact*i;
	    }
	System.out.println("Factorial of a number is:"+fact);
	    System.out.println("Do u want again");
	ch=sc.next();
	}while(ch.equals("yes"));
}
	public static void main(String args[])
	{
		fact f=new fact();
		f.facto();
	}
}

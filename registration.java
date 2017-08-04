package login;

import java.util.Scanner;

public class registration {
	String name,passwd,fname,lname,ch;
	int age;
	String a,b;
	Scanner sc=new Scanner(System.in);
	void  get()
	{
		System.out.println("REGISTRATION FORM");
		System.out.println("Enter the username:");
		name=sc.nextLine();
		System.out.println("Enter the password:");
		passwd=sc.nextLine();
		System.out.println("Enter your firstname:");
		 fname=sc.next();
		 System.out.println("Enter your lastname:");
		  lname=sc.next();
		System.out.println("Enter your age:");
		age=sc.nextInt();
	}
	void display()
	{
		System.out.println("Username:"+name);
		System.out.println("password:"+passwd);
		System.out.println("FirstName:"+fname);
		System.out.println("Lastname:"+lname);
		System.out.println("Age:"+age);
		System.out.println("REGISTRATION SUCCESSFULL!!!!!!!!!!!");
		}
	 void login()
	{
		System.out.println("Login form");
		 System.out.println("Enter username:");
		a=sc.next();
		System.out.println("Enter password:");
		b=sc.next();
	}
	void validate()
	{
		do {
			get();
			login();
			if((name.equals(a))&&(passwd.equals(b)))
{
	
		System.out.println("LOGIN SUCCESS!!!");
		display();
		
	}
	else
	{
		System.out.println("LOGIN FAILED!!");
		}
	System.out.println("Do u want to register again(yes/no):");
	ch=sc.next();
}while(ch.equals("yes"));
	}
	
public static void main(String args[]) {
		registration r=new registration();
		r.validate();
	}
}
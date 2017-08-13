package file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class studentreg {
	public static void main(String args[])throws IOException{
		Scanner sc=new Scanner(System.in);
		FileWriter out=new FileWriter("Studentregistration.txt");
	System.out.println("Enter the number of students:");
	int n=sc.nextInt();
	out.write("---STUDENT REGISTRATION---");
	for(int i=1;i<=n;i++)
		{
		
		System.out.println("Student no:"+i);
	out.write("\nStudent no:"+i);	
	System.out.println("Enter rollno:");
	int id=sc.nextInt();
	out.write("\nRoll no:"+id);
	System.out.println("Enter the name:");
	String name=sc.next();
	out.write("\nStudent Name:"+name);
	out.write("\n***********************\n");
	}
	
	System.out.println("REGISTRATION IS SUCCESS!!! AND YOU CAN DOWNLOAD THE FILE");
	out.flush();
	out.close();
}

}

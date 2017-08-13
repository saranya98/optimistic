package sorting;

import java.util.Scanner;
 public class sort {
	 public static void main(String args[])
	 {
	Scanner sc=new Scanner(System.in);
	int temp;
		System.out.println("Enter the total no.of numbers:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the numbers to be sorted:");
		for(int i=0;i<a.length;i++)
		{
			
		a[i]=sc.nextInt();
		}
		System.out.println("The numbers are:");
		for( int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length-i;j++)
				{
				if(a[j-1]>a[j])
				{
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
			
		}
	
		System.out.println("the sorted numbers are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
				
			}
		
	
	
 }


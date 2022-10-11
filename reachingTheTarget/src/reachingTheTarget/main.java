package reachingTheTarget;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size if the transaction array  ");
		int X=sc.nextInt();// to read the transaction value
		System.out.println(X);
		int A[]=new int[X];
		System.out.println("Enter the values of array  ");
		for(int i=0;i<X;i++) {
		A[i]=sc.nextInt();
		}
		for(int i=0;i<X;i++) {
			System.out.print(" " + A[i]);
			System.out.println("");
			
		}
		System.out.println("Enter the no of targets to be achieved");
		int Y=sc.nextInt();	// to tread the no of targets;
		int target;
		int j,sum,flag;
		for(int i=1;i<=Y;i++)
		{
			sum=0;
			flag=0;
			System.out.println("Enter Target Amount of " + i + "case");  //120
			target=sc.nextInt();
			for(j=0;j<A.length;j++)
			{
				sum=sum+A[j];
				if(sum>=target)
				{
					System.out.println(" Target complete on "+ ++j + "day" );
					flag=1;
					break;
				}
			}
			if(flag==0)
			System.out.println("Target not achieved" );
		}
		}
}

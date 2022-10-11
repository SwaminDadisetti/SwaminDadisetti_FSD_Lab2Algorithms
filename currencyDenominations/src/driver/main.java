package driver;

import java.util.Arrays;
import java.util.Scanner;

import Sorting.insertionSort;

import noOfNotes.noOfNotes;
public class main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //HAS-A
		System.out.println("Enter the size of currency denominations");
		int size=sc.nextInt();
		System.out.println(size);
		int A[]=new int[size];// array to collect currency  denominations in random
		System.out.println("Enter the Currency Denomination values  ");
		for(int i=0;i<size;i++)
		{
			A[i]=sc.nextInt();
			
		}for(int i=0;i<size;i++) {
		System.out.println(A[i]);
		}
		insertionSort is=new insertionSort();
		is.insertionsort(A);
		
		

		System.out.println("Please enter How much payment u need to make");
		int amount=sc.nextInt();

		noOfNotes nc=new noOfNotes();
		nc.counting(A,amount);

	}


}

package wtn;

import java.util.Scanner;

public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a[],t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[i])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("Sorted array: ");
		for(int i=0;i<n;i++)
		{
			System.out.printf(a[i]+" ");
		}
		
		sc.close();
	}

}

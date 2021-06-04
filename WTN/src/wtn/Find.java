package wtn;

import java.util.Scanner;

public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a[],p,c=-1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter an element to find");
		p=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==p)
			{
				c=i;
				break;
			}
		}
		if(c!=-1)
		System.out.println("Number is found at index "+c);
		else
			System.out.println(c);
		sc.close();

	}

}

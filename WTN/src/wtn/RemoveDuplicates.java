package wtn;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a[],t=0,b[],flag=0,k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		n=sc.nextInt();
		a=new int[n];
		b=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			flag=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				b[k++]=a[i];
				t++;
			}
		}
		for(int i=0;i<t;i++)
			System.out.printf(b[i]+" ");
		
		sc.close();
	}

}

package wtn;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows and columns ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a =new int[m][n];
		System.out.print("Enter the elements");
		int i,j;
		for(i=0;i<n;i++) 
		{
			for(j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=m-1;i>=0;i--)
		{
			for(j=n-1;j>=0;j--)
			{
				System.out.printf(a[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}

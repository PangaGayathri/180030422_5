package wtn;

import java.util.Scanner;

public class MaxIn2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array (row and column)");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		System.out.println("Enter array elements");
		for(int i=0; i<n; i++)
	       {
	           for(int j=0; j<m; j++)
	           {
	               a[i][j] = sc.nextInt();
	           }
	       }
		int max=a[0][0];
		for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]>max)
                    max=a[i][j];
            System.out.print(a[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println("The maximum value is "+max);
        sc.close();

	}

}

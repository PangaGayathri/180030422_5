package wtn;

import java.util.Scanner;

public class CaseChanging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c1 = sc.next().charAt(0);
		if(c1>=97 && c1<=123)
		System.out.println(Character.toUpperCase(c1));
		else
			System.out.println(Character.toLowerCase(c1));
		sc.close();

	}

}

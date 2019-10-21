package Decisionmaking;

import java.util.Scanner;

public class Exampleifelse3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the username");
		char a=s.next().charAt(0);
		System.out.println("enter the password");
		int b=s.nextInt();
		if(a=='j'&& b==1)
		{
			System.out.printf("acess granted");
		}
		else
		{
			System.out.printf("unauthorized user");
		}

	}

}

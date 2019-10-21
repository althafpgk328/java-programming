package Decisionmaking;

import java.util.Scanner;

public class Ifelseladder2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the weight");
		int a=s.nextInt();
		if(a<=20)
		{
			System.out.println("low weight");
		}
		
		else if(a>20&&a<=25)
		{
			System.out.println("sd");
		}
		else if(a>25&&a<=40)
		{
			System.out.println("better");
		}

	else
	{
		System.out.println("over weight");
	}

	}

}

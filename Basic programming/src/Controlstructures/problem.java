package Controlstructures;

import java.util.Scanner;

public class problem {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int d=s.nextInt();
		int a=0;
		int b=1;
		int i;
		int m=0;
		System.out.printf("%d %d",a, b);
		for(i=0;i<=5;i++)
		{
			int c=a+b;
			if(c==d)
			{
				m++;
				
			}
			System.out.printf(" %d ",c);
			a=b;
			b=c;
		}
		if(m!=0)
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("no");
		}

	}

}

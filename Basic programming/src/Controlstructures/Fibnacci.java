package Controlstructures;
import java.util.Scanner;
public class Fibnacci {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=0;
	int b=1;
	int i;
	System.out.printf("%d %d",a, b);
	for(i=0;i<=5;i++)
	{
		int c=a+b;
		System.out.printf(" %d ",c);
		a=b;
		b=c;
	}
	
	

	}

}

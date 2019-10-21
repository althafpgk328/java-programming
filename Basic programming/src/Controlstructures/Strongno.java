package Controlstructures;
import java.util.Scanner;
public class Strongno {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int sum=0;
		int b=a;
		int i;
		while(a!=0)
		{
			int f=1;
		int r=a%10;
		for(i=1;i<=r;i++)
		{
			f=f*i;
		}
		sum=sum+f;
		a=a/10;
		}
		if(sum==b)
		{
			System.out.println("strongno");
		}
		else
		{
			System.out.println("not strongno");
		}
		

	}

}

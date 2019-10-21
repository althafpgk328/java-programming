package Controlstructures;
import java.util.Scanner;
public class Hcflcm {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int i;
		int g=0;
		int min=(a>b)?b:a;
		int max=(a>b)?b:a;
		
		for(i=min;i>0;i--)
		{
		if(a%i==0&&b%i==0)
		{
			g=i;
			break;
		}
		}
		System.out.println(g);
		

	}

}

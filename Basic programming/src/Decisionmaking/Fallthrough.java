package Decisionmaking;
import java.util.Scanner;
public class Fallthrough {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int n=s.nextInt();
		int t=0;
		int r=n%10;
		int q=n/10;
		if(q!=1)
		{
			switch(r)
			{
			case 1:
			case 2:
			case 6:
				t=t+3;
				break;
			case 4:
			case 5:
			case 9:
				t=t+4;
				break;
			case 3:
			case 7:
			case 8:
				t=t+5;
				break;
			}
			switch (q)
			{
			case 2:
			case 3:
			case 4:
				t=t+6;
				break;
			case 5:
			case 6:
			case 9:
				t=t+5;
				break;
			case 7:
			case 8:
				t=t+7;
				break;
			}
		}
		else
		{
			switch(r)
			{
			case 1:
			case 2:
				t=t+6;
				break;
			case 3:
			case 4:
			case 8:
				t=t=8;
				break;
			case 5:
			case 6:
			case 9:
				t=t+7;
				break;
			case 0:
				t=t+3;
			    break;
			case 7:
				t=t+9;
				break;
				
			
				
			}
		}
		System.out.println(t);
	}

}

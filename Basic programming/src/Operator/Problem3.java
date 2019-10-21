package Operator;
import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
	int a=57;
	System.out.println("no is"+a);
	int b=a%10;
	int c=a/10;
	int d=b-c;
	int e=b*c;
	System.out.printf("%d%d\n",d,e);
	int f=c*d;
	System.out.printf("%d%d\n",f,b);
	int g=f*c;
	System.out.printf("%d",c);
	
	

	}

}

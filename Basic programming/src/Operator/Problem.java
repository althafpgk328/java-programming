package Operator;
import java.util.Scanner;
public class Problem {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER TWO NUMBERS");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a^b;
		int d=a&b;
		System.out.printf("%d%d\n",c,d);
		System.out.println("difference is"+d);
	}

}

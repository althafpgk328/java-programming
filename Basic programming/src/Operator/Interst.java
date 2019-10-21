package Operator;
import java.util.Scanner;
public class Interst {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("INVESTMENT");
		int p=s.nextInt();
		System.out.println("DURATION");
		int n=s.nextInt();
		System.out.println("RATE");
		float r=s.nextFloat();
		float i=(p*n*r)/100;
		System.out.println("INTEREST IS:"+i);

	}

}

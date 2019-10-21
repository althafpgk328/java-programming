package Controlstructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dowhile {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a;
		int s=0;
		do {
			System.out.println("enter a no");
			a=Integer.parseInt(br.readLine());
			if(a>0)
			{
				s=s+a;
			}
		}
		while(a>0);
		{
			System.out.println(s);
		}
		
		
		
		

	}

}

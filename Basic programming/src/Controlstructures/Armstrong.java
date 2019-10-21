package Controlstructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Armstrong {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int r;
	double s=0;
	int c=0;
	int a=Integer.parseInt(br.readLine());
	int x=a;
	int y=x;
	while(y!=0)
	{
		c++;
		y=y/10;
	}
	while(x!=0)
	{
		r=x%10;
		s=s+Math.pow(r, c);
		x=x/10;
	}
	System.out.println(s);
	if(a==s)
	{
		System.out.println("Armstrong");
	}
		else
		{
			System.out.println("not armstrong");
		}
		
		
		
	

	}

	}


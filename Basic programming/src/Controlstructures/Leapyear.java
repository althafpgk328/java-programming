package Controlstructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Basics.Intiger;

public class Leapyear {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int y=Integer.parseInt(br.readLine());
		if((y%4==0&&y%100!=0)||(y %400==0))
		{
			System.out.println("lp");
		}
		else
		{
			System.out.println("nlp");
		}
	}

}

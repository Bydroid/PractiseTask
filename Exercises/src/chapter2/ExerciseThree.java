package chapter2;

import java.util.*;
public class ExerciseThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float c,f;
		System.out.print("Enter Celsius temperature :");
		c=sc.nextFloat();
		f=((c*9)/5)+32;
		System.out.println("Farenheit Temperature :"+f);

	}

}

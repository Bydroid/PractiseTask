package chapter2;

import java.util.*;

public class ExerciseTwo {

	public static void main(String[] args) {
		double pi=22/7,volume;
		float r,h;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Radius:");
		r=sc.nextFloat();
		System.out.print("Enter Height:");
		h=sc.nextFloat();
		volume=pi*r*r*h;
		System.out.print("Volume of Cylinder :"+volume);
	}

}

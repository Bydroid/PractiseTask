package chapter2;

import java.util.*;

public class ExerciseOne {

	public static void main(String[] args) {
		float u,a,t;
		double d;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Initial Velocity :");
		u=sc.nextFloat();
		System.out.print("1Enter Acceleration :");
		a=sc.nextFloat();
		System.out.print("Enter Time Taken :");
		t=sc.nextFloat();
		d=(u*t)+(a*t*t*0.5);
		System.out.println("The Distance Travelled :"+d);
		

	}

}

package chapter1;

import java.util.Scanner;

public class ExerciseOne {
	int e_id;
	String e_name,department,doj,dob,m_stat,dom,address;
	long m_num;
	
	void getter() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emplayee id :");
		this.e_id=sc.nextInt();
		System.out.println("Enter emplayee name :");
		this.e_name=sc.next();
		System.out.println("Enter emplayee department :");
		this.department=sc.next();
		System.out.println("Enter emplayee date of joining :");
		this.doj=sc.next();
		System.out.println("Enter emplayee date of birth :");
		this.dob=sc.next();
		System.out.println("Enter emplayee marital status :");
		this.m_stat=sc.next();
		System.out.println("Enter emplayee date of marriage :");
		this.dom=sc.next();
		System.out.println("Enter emplayee address :");
		this.address=sc.next();
		System.out.println("Enter emplayee mobile number :");
		this.m_num=sc.nextLong();
		
	}
	
	void printer() {
		System.out.println("Enter emplayee id :"+this.e_id);
		
		System.out.println("Enter emplayee name :"+this.e_name);
		
		System.out.println("Enter emplayee department :"+this.department);
		
		System.out.println("Enter emplayee date of joining :"+this.doj);
		
		System.out.println("Enter emplayee date of birth :"+this.dob);
		
		System.out.println("Enter emplayee marital status :"+this.m_stat);
		
		System.out.println("Enter emplayee date of marriage :"+this.dom);
		
		System.out.println("Enter emplayee address :"+this.address);
		
		System.out.println("Enter emplayee mobile number :"+this.m_num);
		
		
	}

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employee :");
		n=sc.nextInt();
		ExerciseOne[] obj=new ExerciseOne[n];
		for(int i=0;i<n;i++) {
			obj[i]=new ExerciseOne();
			obj[i].getter();
		}
		for(int i=0;i<n;i++) {
			obj[i].printer();
		}
	  

	}

}

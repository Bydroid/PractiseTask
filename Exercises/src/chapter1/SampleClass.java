package chapter1;

public class SampleClass {
	public int counter=1;
	
	public void display() {
		System.out.println(counter);
	}
	
	public static void main(String arg[]) {
		SampleClass sc=new SampleClass();
		sc.display();
	}

}

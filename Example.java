package sampleproject;

public class Example {
	
	int i= 10;
	int j = 10;
	int k;
	
	
	
	 public void sum() {
	
		k= i+j;
		System.out.println("Addition of two numbers is " +k);
	}
	
	
	
	 public void sub() {
		 k=i-j;
		 System.out.println("Subration of two numbers is  " +k);
	 }
	 
	 public void mul() {
		 k=i*j;
		 System.out.println("Multipication of two numbers is  " +k);
	 }
	
	public static void main(String[] args) {
		Example ex = new Example();
		ex.sum();
		ex.div();
		ex.sub();
		ex.mul();
	}

}

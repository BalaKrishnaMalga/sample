package sampleproject;

public class Example {
	
	int i= 10;
	int j = 10;
	int k;
	
	
	
	 public void sum() {
	
		k= i+j;
		System.out.println("Addition of two numbers is " +k);
	}
	
	
	 public void div() {
		
		k=i/j;
		System.out.println("Division of two numers is " +k);
		
	}
	
	public static void main(String[] args) {
		Example ex = new Example();
		ex.sum();
		ex.div();
	}

}

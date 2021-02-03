package Service;

public class ServiceImplementation implements Operations {

	@Override
	public void add(int a, int b) {
		int sum=a+b;
		System.out.println("Sum is: "+ sum);
		
	}

	@Override
	public void subtract(int a, int b) {
		int diff=a-b;
		System.out.println("Difference is: "+diff);
		
	}

	@Override
	public void multiply(int a, int b) {
		int product=a*b;
		System.out.println("Product is: "+product);
		
	}

	@Override
	public void division(int a, int b) {
		try{
			 float div=a/b;
			 System.out.println("Division is: "+div);
			} 
		catch (ArithmeticException aExp) { 
			   System.out.println("Division by zero.");
			}
		finally {
			System.out.println("The finally block executed");
		}
	}

}

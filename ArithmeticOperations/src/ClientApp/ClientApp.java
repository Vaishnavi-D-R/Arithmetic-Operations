package ClientApp;
import java.util.Scanner;
import Service.ServiceImplementation;
public class ClientApp extends ServiceImplementation {
public static void main(String[] args) 
{
	ServiceImplementation service=new ServiceImplementation();
    int num1, num2, opt, add, sub, mul;
    double div;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter first number:");
    num1 = s.nextInt();
    System.out.print("Enter second number:");
    num2 = s.nextInt();
    do
    {
        displayMenu();
        opt = s.nextInt();
        switch(opt)
        {
            case 1:service.add(num1,num2);
            	   break;

            case 2:service.subtract(num1,num2);
                   break;

            case 3:service.multiply(num1, num2);
            	   break;

            case 4:service.division(num1, num2);
            	   break;   
        }
    }while(opt!=5);
}

private static void displayMenu() {
	System.out.println("-----------------------------");
	System.out.println("Enter your choice:");
	System.out.println("-----------------------------");
	System.out.println("Enter 1 for addition");
	System.out.println("Enter 2 for subtraction");
	System.out.println("Enter 3 for multiplication");
	System.out.println("Enter 4 for division");
	System.out.println("Enter 5 to Exit");
	System.out.println("-----------------------------");
}
}

package first;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		
      Scanner S = new Scanner(System.in);
      
      System.out.println("Enter Frist Number =");
      
      double Number1 = S.nextDouble();
      
      System.out.println("Enter Second Number =");
      
      double Number2 = S.nextDouble();
    
      System.out.println("Addition : "+Number1 + " + " + Number2 + " = " + (Number1+Number2));
      System.out.println("Substraction : "+Number1 + " - " + Number2 + " = " + (Number1-Number2));
      System.out.println("Multiplication : "+Number1 + " * " + Number2 + " = " + (Number1*Number2));
      System.out.println("Devidation : "+Number1 + " / " + Number2 + " = " + (Number1/Number2));
      
	}

}

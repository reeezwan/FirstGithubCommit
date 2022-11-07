package javaLesson2;

public class ArithmeticOperators {

	public static void main(String[] args) {
	
		int num1, num2, sumoftwo,diffoftwo, division, multiplication, reminder, increment, decrement;
		num1 = 10;
		num2 = 20;
		sumoftwo = num1 + num2;
		System.out.println("the addiation of two number is:"+sumoftwo);
		
		diffoftwo = num2 - num1;
		System.out.println(diffoftwo);
		
		division = num2 / num1; 
		System.out.println(division);
		
		multiplication = num2 * num1; 
		System.out.println(multiplication);
		
		reminder = num2%num1;
		System.out.println(reminder); 
		
		increment = ++num1;
		System.out.println(increment);
		
		decrement =--num2;
		System.out.println(decrement);
	}

}

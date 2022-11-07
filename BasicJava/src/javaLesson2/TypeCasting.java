package javaLesson2;

public class TypeCasting {

	public static void main(String[] args) {
		
		//widening casting
		
		int myInt = 78;
		long myLong = myInt;
		double myDouble = myLong;
		
		System.out.println(myInt);
		System.out.println(myLong);
		System.out.println(myDouble);
		
		//norrowing casting
		
		double num1 = 786.2589;
		long num2 = (long)num1;
		int num3 = (int)num2;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		
	}

}

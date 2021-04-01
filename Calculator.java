public class Calculator {
	public static void main(String [] args){
		 System.out.println("This Calculator program performs add subtract multiply and devide functions on two number 7 and 2");
		 
		 //add(7,2);
		 //subtract(7,2);
		 //multiply (7,2);
		 //devide (7,2);
		 
		 CalculatorMethods cm = new CalculatorMethods();
			cm.add(7,2);
			cm.subtract(7,2);
			cm.multiply(7,2);
			cm.devide(7,2);
		}	
	}

	class CalculatorMethods{
		public void add (int a , int b){
			int result = a+b;
			System.out.println("addition of 7 and 2 is :" +result);
		}
		public void subtract (int a , int b){
			int result = a-b;
			System.out.println("subtraction of 7 and 2 is :" +result);
		}
		public void multiply (int a , int b){
			int result = a*b;
			System.out.println("multiplication of 7 and 2 is :" +result);
		}
		public void devide (int a , int b){
			int result = a/b;
			System.out.println("devide  7 by 2 is :" +result);
		}
	}

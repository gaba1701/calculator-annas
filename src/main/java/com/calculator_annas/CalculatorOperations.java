package com.calculator_annas;
/**
 * 
 * Class CalculatorOperations. The class of basic calculator operations that implements CalculatorBasicOperationsInterface. 
 *In this method calculates four basic operations as Addition, Subtraction, Multiplying, Division. The methods take double as parameters and
 * return a double value.
 * 
 * 
 * 
 * @author Ganna Barysheva
 * @version 1.0
 * 
 **/
public class CalculatorOperations implements CalculatorBasicOperationsInterface{
	double firstNumber; 
	double secondNumber;
	int operation;

	
	public double getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	public double getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	public int getOperation() {
		return operation;
	}
	public void setOperation(int operation) {
		this.operation = operation;
	}
	/**
	 * Add- add two doubles.
	 * 
	 * @param firstNumber
	 *            : the first number as a double
	 * @param secondNumber:
	 *            the second number as a double
	 * 
	 * @return: the result of the addition.
	 */
	public double addition() {
		
		return firstNumber+secondNumber;
	}
	/**
	 * subtract - subtracts two doubles.
	 * 
	 * @param firstNumber
	 *            : the first number as a double
	 * @param secondNumber:
	 *            the second number as a double
	 * 
	 * @return: the result of the subtraction.
	 */
	public double subtracion() {
		 
		return firstNumber-secondNumber;
	}

	/**
	 * multiply - multiplies two doubles.
	 * 
	 * @param firstNumber
	 *            : the first number as a double
	 * @param secondNumber:
	 *            the second number as a double
	 * 
	 * @return: the result of the multiplication.
	 */
	public double multiply() {
		
		return firstNumber*secondNumber;
	}
	/**
	 * divide- divides two doubles.
	 * 
	 * @param firstNumber
	 *            : the first number as a double
	 * @param secondNumber:
	 *            the second number as a double
	 * 
	 * @return: the result of the division.
	 */
	public double division() {
		double result=0;
		try {
			result = firstNumber / secondNumber;
			
		} catch (Exception e) { 
		//result = Double.POSITIVE_INFINITY;
	//		System.out.println("You can not divide by zero");
		}
		return result;
	}	  

}


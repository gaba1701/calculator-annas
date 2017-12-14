package com.calculator_annas;
/**
 * 
 * Class CalculatorAdvancedOperationsClass. The class of advanced calculator operations that implements CalculatorAdvancedOperationsInterface. 
 * In this method calculates: multiplying given number with Pi, he value square of number, sine and cosine of number, and number in power of 2 and 3.
 *  The methods take double as parameters and
 * return a double value.
 * 
 * 
 * 
 * @author Ganna Barysheva 
 * @version 1.0
 * 
 **/

public class CalculatorAdvancedOperationsClass implements CalculatorAdvancedOperationsInterface{
	double number;
	 
	public double getNumber() {
		return number; 
	}
	public void setNumber(double number) {  
		this.number = number;
	}
	/**
	 * piMultiplyByX- multiples Pi for number times.
	 * 
	 * @param number
	 *            : the number as a double
	 * 
	 * @return: the result of the multiplying.
	 */
	public double piMultiplyByX() {
		
		return Math.PI*number;
	}
	/**
	 * sqrt - counts square root of positive number.
	 * 
	 * @param number
	 *            : the number as a double
	 * 
	 * @return: the value square of number.
	 */
	public double sqrt() {
		double result = 0; 
		try { 
			result = Math.sqrt(number);
		} catch (Exception e) {
		//	System.out.println("Error: you can not find square of negative number");
		}
		return result;
	} 
	/**
	 * sin - counts trigonometric sine of an angle.
	 * 
	 * @param number
	 *            : the number as a double
	 * 
	 * @return: the sine of number.
	 */
	public double sinus() {
	return Math.sin(number);
	}
	/**
	 * cos - counts trigonometric cosine of an angle.
	 * 
	 * @param number
	 *            : the number as a double
	 * 
	 * @return: the cosine of number.
	 */
	public double cosinus() {
		
		return Math.cos(number);
	}
	/**
	 * x2 - counts number to the power of 2.
	 * 
	 * @param number
	 *            : the number as a double
	 * 
	 * @return: the number in the power of 2.
	 */
	public double x2() {
		
		return number*number;
	}
	/**
	 * x3 - counts number to the power of 3.
	 * 
	 * @param number
	 *            : the number as a double
	 * 
	 * @return: the number in the power of 3.
	 */
	public double x3() {
		
		return Math.pow(number, 3);
	}

}

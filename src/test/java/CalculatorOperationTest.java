import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Logger;

import org.junit.Test;

import com.calculator_annas.CalculatorOperations;

public class CalculatorOperationTest {
	private static final Logger LOG = Logger.getLogger(CalculatorOperations.class.getName());
	CalculatorOperations calcOperations = new CalculatorOperations(); 
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	@Test
	public void testGetFirstNumber() {
		for (int i = 0; i < 50; i++) {
			double a = random.nextDouble();
			calcOperations.setFirstNumber(a);
			LOG.info("Testing testGetFirstNumber method with random number: " + a);
			assertEquals(Math.round(calcOperations.getFirstNumber()), Math.round(a), 1);
		}

	}

	@Test
	public void testSetFirstNumber() {
		for (int i = 0; i < 50; i++) {
			double a = random.nextDouble();
			calcOperations.setFirstNumber(a);
			LOG.info("Testing testSetFirstNumber method with random number: " + a);

			assertEquals(Math.round(calcOperations.getFirstNumber()), Math.round(a), 1);
		}
	}

	@Test
	public void testGetSecondNumber() {
		for (int i = 0; i < 50; i++) {
			double a = random.nextDouble();
			calcOperations.setSecondNumber(a);
			LOG.info("Testing testGetSecondNumber method with random number: " + a);

			assertEquals(Math.round(calcOperations.getSecondNumber()), Math.round(a), 1);
		}
	}

	@Test
	public void testSetSecondNumber() {
		for (int i = 0; i < 50; i++) {
			double a = random.nextDouble();
			calcOperations.setSecondNumber(a);
			LOG.info("Testing testSetSecondNumber method with random number: " + a);
			assertEquals(Math.round(calcOperations.getSecondNumber()), Math.round(a), 1);
		}
	}

	@Test
	public void testGetOperation() {
		for (int i = 0; i < 50; i++) {
			int a = random.nextInt();
			calcOperations.setOperation(a);
			LOG.info("Testing testGetOperation method with random number: " + a);

			assertEquals(Math.round(calcOperations.getOperation()), Math.round(a), 1);
		}
	}

	@Test
	public void testSetOperation() {
		for (int i = 0; i < 50; i++) {
			int a = random.nextInt();
			calcOperations.setOperation(a);
			LOG.info("Testing testSetOperation method with random number: " + a);
			assertEquals(Math.round(calcOperations.getOperation()), Math.round(a), 1);
		}
	}

	@Test
	public void testAdditionPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0; 

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble() * 100));
			result = firstNumber + secondNumber;
			calcOperations.setFirstNumber(firstNumber);
			calcOperations.setSecondNumber(secondNumber);
			LOG.info("Testing testAdditionPositiveNumbers method with random numbers: " + 
			firstNumber + " and "+ secondNumber);

			assertEquals(Math.round(calcOperations.addition()), result, 1);
		}
	}

	@Test
	public void testAdditionNegariveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {

			firstNumber = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble((-100), 1)));
			secondNumber = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble((-100), 1)));
			result = firstNumber + secondNumber;
			calcOperations.setFirstNumber(firstNumber);
			calcOperations.setSecondNumber(secondNumber);
			LOG.info("Testing testAdditionNegariveNumbers method with random numbers: " + 
					firstNumber + " and "+ secondNumber);
			assertEquals(Math.round(calcOperations.addition()), result, 1);
		}
	}

	@Test
	public void testAddZero() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		result = firstNumber + secondNumber;
		calcOperations.setFirstNumber(firstNumber);
		calcOperations.setSecondNumber(secondNumber);
		LOG.info("Testing testAddZero method");
		assertEquals(Math.round(calcOperations.addition()), result, 0);

	}

	@Test
	public void testSubtracionPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble() * 100));
			result = firstNumber - secondNumber;
			calcOperations.setFirstNumber(firstNumber);
			calcOperations.setSecondNumber(secondNumber);
			LOG.info("Testing testSubtracionPositiveNumbers method with random numbers: " + 
					firstNumber + " and "+ secondNumber);
			assertEquals(Math.round(calcOperations.subtracion()), result, 1);
		}
	}

	@Test
	public void testSubstructNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {

			firstNumber = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble((-100), 1)));
			secondNumber = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble((-100), 1)));
			result = firstNumber - secondNumber;
			calcOperations.setFirstNumber(firstNumber);
			calcOperations.setSecondNumber(secondNumber);
			LOG.info("Testing testSubstructNegativeNumbers method with random numbers: " + 
					firstNumber + " and "+ secondNumber);
			assertEquals(Math.round(calcOperations.subtracion()), result, 1);
		}
	}

	@Test
	public void testSubtructZero() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		result = firstNumber - secondNumber;
		calcOperations.setFirstNumber(firstNumber);
		calcOperations.setSecondNumber(secondNumber);
		LOG.info("Testing testSubtructZero with random number: "+ firstNumber +"and 0");
		assertEquals(Math.round(calcOperations.subtracion()), result, 0);

	}

	@Test
	public void testMultiplyPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble() * 100));
			result = firstNumber * secondNumber;
			calcOperations.setFirstNumber(firstNumber);
			calcOperations.setSecondNumber(secondNumber);
			LOG.info("Testing testMultiplyPositiveNumbers method with random numbers: " + 
					firstNumber + " and "+ secondNumber);
			assertEquals(Math.round(calcOperations.multiply()), result, 1);
		}
	}

	@Test
	public void testMultiplyNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {

			firstNumber = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble((-100), 1)));
			secondNumber = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble((-100), 1)));
			result = firstNumber * secondNumber;
			calcOperations.setFirstNumber(firstNumber);
			calcOperations.setSecondNumber(secondNumber);
			LOG.info("Testing testMultiplyNegativeNumbers method with random numbers: " + 
					firstNumber + " and "+ secondNumber);
			assertEquals(Math.round(calcOperations.multiply()), result, 1);
		}
	}

	@Test
	public void testMultiplyZero() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		result = firstNumber * secondNumber;
		calcOperations.setFirstNumber(firstNumber);
		calcOperations.setSecondNumber(secondNumber);
		LOG.info("Testing testMultiplyZero method with zeroes");
		assertEquals(Math.round(calcOperations.multiply()), result, 0);

	}

	@Test
	public void testDivisionPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble() * 100));
			result = firstNumber / secondNumber;
			calcOperations.setFirstNumber(firstNumber);
			calcOperations.setSecondNumber(secondNumber);
			LOG.info("Testing testDivisionPositiveNumbers method with random numbers: " + 
					firstNumber + " and "+ secondNumber);
			assertEquals(Math.round(calcOperations.division()), result, 1);
		}
	}

	@Test
	public void testDivisionNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {

			firstNumber = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble((-100), 1)));
			secondNumber = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble((-100), 1)));
			result = firstNumber / secondNumber;
			calcOperations.setFirstNumber(firstNumber);
			calcOperations.setSecondNumber(secondNumber);
			LOG.info("Testing testDivisionNegativeNumbers method with random numbers: " + 
					firstNumber + " and "+ secondNumber);
			assertEquals(Math.round(calcOperations.division()), result, 1);
		}
	}

	@Test
	public void testDividebyZero() { //throws Exception
		double firstNumber = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble() * 100));
		double secondNumber = 0;
		double result = Double.POSITIVE_INFINITY;
		calcOperations.setFirstNumber(firstNumber);
		calcOperations.setSecondNumber(secondNumber);  
		LOG.info("Testing testDividebyZero method");
		assertEquals(calcOperations.division(), result, 0) ; 
		
	} 

}

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Logger;

import org.junit.Test;

import com.calculator_annas.CalculatorAdvancedOperationsClass;

public class CalculatorAdvancedOperationsClassTest {
	private static final Logger LOG = Logger.getLogger(CalculatorAdvancedOperationsClass.class.getName());
	CalculatorAdvancedOperationsClass calcAdvancedOperations = new CalculatorAdvancedOperationsClass();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	@Test
	public void testGet() {
		double a = random.nextDouble();
		calcAdvancedOperations.setNumber(a);
		LOG.info("Testing the get method with random number: " + a);
		assertEquals(calcAdvancedOperations.getNumber(), a, 0.1);
	}

	@Test 
	public void testPIMyltiplyPositiveNumbers() {
		for (int i = 0; i < 50; i++) {
			double a = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble() * 100));
			double result = Math.PI * a;
			calcAdvancedOperations.setNumber(a);
			LOG.info("Testing testPIMyltiplyPositiveNumbers method with positiv random number: " + a + " and PI: "
					+ Math.PI);
			assertEquals(calcAdvancedOperations.piMultiplyByX(), result, 0.1);
		}
	}

	@Test
	public void testPIMyltiplyNegativeNumbers() {
		for (int i = 0; i < 50; i++) {
			double a = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble((-100), 1)));
			double result = Math.PI * a;
			calcAdvancedOperations.setNumber(a);
			LOG.info("Testing testPIMyltiplyNegativeNumbers method with negative random number: " + a + " and PI: "
					+ Math.PI);
			assertEquals(calcAdvancedOperations.piMultiplyByX(), result, 0.1);
		}
	}

	@Test
	public void testPIMyltiplyZero() {
		double a = 0;
		double result = Math.PI * a;
		calcAdvancedOperations.setNumber(a);
		LOG.info("Testing testPIMyltiplyZero method with zero");
		assertEquals(calcAdvancedOperations.piMultiplyByX(), result, 0.1);
	}

	@Test
	public void testSqrtOfPositiveNumber() {
		for (int i = 0; i < 50; i++) {
			double a = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble() * 100));
			double result = Math.sqrt(a);
			calcAdvancedOperations.setNumber(a);
			LOG.info("Testing testSqrtOfPositiveNumber method with random positive number: " + a);

			assertEquals(calcAdvancedOperations.sqrt(), result, 0.1);

		}
	}

	@Test
	public void testSqrtOfNegativeNumber() {
		for (int i = 0; i < 50; i++) {
			double a = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble((-100), 1)));
			double result = Math.sqrt(a);
			calcAdvancedOperations.setNumber(a);
			LOG.info("Testing testSqrtOfNegativeNumber method with random negative number: " + a);

			assertEquals(calcAdvancedOperations.sqrt(), result, 0.1);

		}
	}

	@Test
	public void testSqrtOfZero() {
		double a = 0;
		double result = Math.sqrt(a);
		calcAdvancedOperations.setNumber(a);
		LOG.info("Testing testSqrtOfZero method with zero");

		assertEquals(calcAdvancedOperations.sqrt(), result, 0.1);
	}

	@Test
	public void testSinusOfPositiveNumber() {
		for (int i = 0; i < 50; i++) {
			double a = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble() * 1000));
			double result = Math.sin(a);
			calcAdvancedOperations.setNumber(a);
			LOG.info("Testing testSinusOfPositiveNumber method with random positive number: " + a);

			assertEquals(calcAdvancedOperations.sinus(), result, 0.1);

		}
	}

	@Test
	public void testSinusOfNegativeNumber() {
		for (int i = 0; i < 50; i++) {
			double a = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble((-1000), 1)));
			double result = Math.sin(a);
			calcAdvancedOperations.setNumber(a);
			LOG.info("Testing testSinusOfNegativeNumber method with random negative number: " + a);

			assertEquals(calcAdvancedOperations.sinus(), result, 0.1);

		}
	}

	@Test
	public void testSinusOfZero() {
		double a = 0;
		double result = Math.sin(a);
		calcAdvancedOperations.setNumber(a);
		LOG.info("Testing testSinusOfZero");
		assertEquals(calcAdvancedOperations.sinus(), result, 0.1);

	}

	@Test
	public void testCosinusOfPositiveNumber() {
		for (int i = 0; i < 50; i++) {
			double a = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble() * 1000));
			double result = Math.cos(a);
			calcAdvancedOperations.setNumber(a);
			LOG.info("testCosinusOfPositiveNumber with random number: " + a);
			assertEquals(calcAdvancedOperations.cosinus(), result, 0.1);

		}
	}

	@Test
	public void testCosinusOfNegativeNumber() {
		for (int i = 0; i < 50; i++) {
			double a = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble((-1000), 1)));
			double result = Math.cos(a);
			calcAdvancedOperations.setNumber(a);
			LOG.info("testCosinusOfNegativeNumber with random number: " + a);
			assertEquals(calcAdvancedOperations.cosinus(), result, 0.1);

		}
	}

	@Test
	public void testCosOfZero() {
		double a = 0;
		double result = Math.cos(a);
		calcAdvancedOperations.setNumber(a);
		LOG.info("testCosinusOfPositiveNumber with zero");
		assertEquals(calcAdvancedOperations.cosinus(), result, 0.1);

	}

	@Test
	public void testInPowerOf2PositiveNumber() {
		for (int i = 0; i < 50; i++) {
			double a = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble() * 1000));
			double result = Math.pow(a, 2);
			calcAdvancedOperations.setNumber(a);
			LOG.info("testInPowerOf2PositiveNumber with random number: " + a);
			assertEquals(calcAdvancedOperations.x2(), result, 0);

		}
	}

	@Test
	public void testInPowerOf2NegativeNumber() {
		for (int i = 0; i < 50; i++) {
			double a = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble((-1000), 1)));
			double result = Math.pow(a, 2);
			calcAdvancedOperations.setNumber(a);
			LOG.info("testInPowerOf2NegativeNumber with random number: " + a);

			assertEquals(calcAdvancedOperations.x2(), result, 0);

		}
	}

	@Test
	public void testInPowerOf2Zero() {
		for (int i = 0; i < 50; i++) {
			double a = 0;
			double result = Math.pow(a, 2);
			calcAdvancedOperations.setNumber(a);
			LOG.info("testInPowerOf2Zero with zero");

			assertEquals(calcAdvancedOperations.x2(), result, 0);
		}
	}

	@Test
	public void testInPowerOf3PositiveNumber() {
		for (int i = 0; i < 50; i++) {
			double a = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble() * 100));
			double result = Math.pow(a, 3);
			calcAdvancedOperations.setNumber(a);
			LOG.info("testInPowerOf3PositiveNumber with random number: " + a);

			assertEquals(calcAdvancedOperations.x3(), result, 0);

		}
	}

	@Test
	public void testInPowerOf3NegativeNumber() {
		for (int i = 0; i < 50; i++) {
			double a = Double.valueOf(df.format(ThreadLocalRandom.current().nextDouble((-100), 1)));
			double result = Math.pow(a, 3);
			calcAdvancedOperations.setNumber(a);
			LOG.info("testInPowerOf3NegativeNumber with random number: " + a);

			assertEquals(calcAdvancedOperations.x3(), result, 0);

		}
	}

	@Test
	public void testInPowerOf3Zero() {
		for (int i = 0; i < 50; i++) {
			double a = 0;
			double result = Math.pow(a, 3);
			calcAdvancedOperations.setNumber(a);
			LOG.info("testInPowerOf3Zero with zero");

			assertEquals(calcAdvancedOperations.x3(), result, 0);
		}
	}

}

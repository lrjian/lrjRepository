package com.lrj.web.firstMaven;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

public class CalculatorTest {
	private static Calculator calculator = new Calculator();
	// Fixture（暂且翻译为“固定代码段”）
	//在任何一个测试执行之前必须执行的代码”就是一个Fixture，我们用@Before来标注它
	@Before
	public void setUp() throws Exception {
		calculator.clear();
	}

	@Test
	public void testAdd() {
		calculator.add(2);
		calculator.add(3);
		assertEquals(5, calculator.getResult());
	}

	@Test
	public void testSubstract() {
		calculator.add(10);
		calculator.substract(2);
		assertEquals(8, calculator.getResult());
	}
	//测试函数的前面加上@Ignore标注，这个标注的含义就是“某些方法尚未完成，暂不参与此次测试”
	@Ignore
	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		calculator.add(8);
		calculator.divide(2);
		assertEquals(4, calculator.getResult());
	}

	@Test(timeout = 1000)
	public void squareRoot(){
		calculator.squareRoot(4);
		assertEquals(2, calculator.getResult());
	}

	//这当然是 Bug ，并 JUnit 也考虑到了这一点，来帮助我们找到这种 Bug
	@Test(expected  =  ArithmeticException.class)
	public void divideByZero() {
		calculator.divide(0);
	}
}

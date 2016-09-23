package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	public static MyInteger n;
	public static MyInteger n2;
	public static MyInteger n3;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		n= new MyInteger(2);
		n2= new MyInteger(5);
		n3= new MyInteger(2);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1()
	{
		assertTrue(n.isEven());
		assertFalse(n2.isEven());
	}
	
	@Test
	public void test2()
	{
		assertTrue(n.isOdd());
		assertFalse(n2.isOdd());
	}
	
	@Test
	public void test3()
	{
		assertTrue(n.isPrime());
		assertFalse(n2.isPrime());
	}
	
	@Test
	public void test4()
	{
		assertTrue(MyInteger.isEven(2));
		assertFalse(MyInteger.isEven(5));
	}
	
	@Test
	public void test5()
	{
		assertTrue(MyInteger.isOdd(5));
		assertFalse(MyInteger.isOdd(2));
	}
	
	@Test
	public void test6()
	{
		assertTrue(MyInteger.isPrime(5));
		assertFalse(MyInteger.isPrime(2));
	}
	
	@Test
	public void test7()
	{
		assertTrue(MyInteger.isPrime(n));
		assertFalse(MyInteger.isPrime(n2));
	}
	
	@Test
	public void test8()
	{
		assertTrue(MyInteger.isEven(n2));
		assertFalse(MyInteger.isEven(n));
	}
	
	@Test
	public void test9()
	{
		assertTrue(MyInteger.isOdd(n2));
		assertFalse(MyInteger.isOdd(n));
	}
	
	@Test
	public void test10()
	{
		assertTrue(n.isEquals(5));
		assertFalse(n.isEquals(2));
	}
	
	@Test
	public void test11()
	{
		assertTrue(n.isEquals(n3));
		assertFalse(n2.isEquals(n3));
	}

}

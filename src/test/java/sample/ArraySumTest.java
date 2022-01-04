package sample;

import static org.junit.Assert.*;


import org.junit.Test;



public class ArraySumTest {

	@Test
	public void testSuccess() {
		int arr[] = {10,3,2,4,5};
		int sum = 15;
		ArraySum ob = new ArraySum();
		assertEquals(1,ob.trip(arr,sum));
	}
	
	@Test
	public void testFailure() {
		int arr[] = {10,3,2,4,5};
		int sum = 20;
		ArraySum ob = new ArraySum();
		assertNotEquals(1,ob.trip(arr,sum));
	}
	
	@Test
	public void testCheck() {
		int arr[] = {};
		int sum = 20;
		ArraySum ob = new ArraySum();
		assertEquals(-1,ob.trip(arr,sum));
	}
	@Test
	public void testCheck1() {
		int arr[] = {-1,2,0,4,8};
		int sum = -5;
		ArraySum ob = new ArraySum();
		assertEquals(-1,ob.trip(arr,sum));
	}
	@Test
	public void testCheck2() {
		int arr[] = {-1,2,0,4,8};
		int sum = -5;
		ArraySum ob = new ArraySum();
		assertNotEquals(1,ob.trip(arr,sum));
	}

	

}

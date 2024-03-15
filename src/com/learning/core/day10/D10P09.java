package com.learning.core.day10;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

class Calculator{
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		return a / b;
	}
	 public int findMax(int[] arr) {
	      int max = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        return max;
	    }
}
public class D10P09 {
	Calculator calculator = new Calculator();
	@Test
	public void testAdd() {
		assertEquals(300, calculator.add(100, 200));
	}
	
	@Test
	public void testSub() {
		assertEquals(300, calculator.sub(345, 45));
	}
	@Test
    public void testMultiply() {
        assertEquals(600, calculator.mul(20, 30));
    }

    @Test
    public void testDivide() {
        assertEquals(20, calculator.div(100, 5));
    }

    @Test
    public void testFindMax1() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        assertEquals(6, calculator.findMax(arr));
    }

    @Test
    public void testFindMax2() {
        int[] arr = {-1, -1, -2, -3, -4, -5};
        assertEquals(-1, calculator.findMax(arr));
    }

    

}

package com.learning.core.day10;
import org.junit.Assert;
import org.junit.Test;

public class D10P08 {
	public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
    @Test
    public void testAdd() {
        D10P08 calculator = new D10P08();
        int result = calculator.add(456,778);
        Assert.assertEquals(1234, result); 
    }
    @Test
    public void testSub() {
        D10P08 calculator = new D10P08();
        int result = calculator.sub(6247,1926);
        Assert.assertEquals(4321, result); 
    }
    @Test
    public void testMul() {
        D10P08 calculator = new D10P08();
        int result = calculator.mul(201, 302);
        Assert.assertEquals(60702, result); 
    }
    @Test
    public void testDiv() {
        D10P08 calculator = new D10P08();
        int result = calculator.div(414, 9);
        Assert.assertEquals(46, result); 
    }
}
	

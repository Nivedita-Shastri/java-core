package com.learning.core.day10;
import org.junit.Assert;
import org.junit.Test;

public class D10P07 {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    @Test
    public void testAdd() {
        D10P07 calculator = new D10P07();
        int result = calculator.add(456,778);
        Assert.assertEquals(1234, result); 
    }
    @Test
    public void testSub() {
        D10P07 calculator = new D10P07();
        int result = calculator.sub(6247,1926);
        Assert.assertEquals(4321, result); 
    }
}
	

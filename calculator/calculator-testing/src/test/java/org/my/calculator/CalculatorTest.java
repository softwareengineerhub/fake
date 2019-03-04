package org.my.calculator;


//import org.junit.Assert;

//import static org.junit.Assert.*;

import org.junit.Assert;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator = new CalculatorImpl();

    @Test
    public void simpleTest(){
        Assert.assertTrue(1<2);
    }

    //@Ignore
    @Test
    public void add() {
        int a = 1;
        int b = 2;
        int res=calculator.add(a,b);
        Assert.assertTrue(res==3);
        /*if(res!=3){
           throw new Error();
       }*/
    }

    @Test
    public void subtract() {
        int a = 1;
        int b = 2;
        int res=calculator.subtract(a, b);
        Assert.assertSame(res, -1);
    }

    //@Ignore
    @Test
    public void multiply() {
        int a = 3;
        int b = 2;
        int res=calculator.multiply(a, b);
        Assert.assertSame(res, 6);
    }

    //@Ignore
    @Test
    public void devide() {
        int a = 10;
        int b = 4;
        float res=calculator.devide(a, b);
        Assert.assertTrue(res==2.5);
    }

}

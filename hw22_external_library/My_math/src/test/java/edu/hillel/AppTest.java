package edu.hillel;

import junit.framework.TestCase;
import org.junit.Assert;

import static edu.hillel.MyMathOperations.*;


public class AppTest extends TestCase {

    public void testCheckSum() {
        Assert.assertEquals(11, mySum(4, 7));
    }


    public void testCheckSqrt() {
        Assert.assertEquals(16, mySqrt(4));
    }


    public void testCheckMultiply() {
        Assert.assertEquals(21, myMultiply(4, 5));
    }
}

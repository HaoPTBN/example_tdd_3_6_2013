package org.qsoft.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by IntelliJ IDEA.
 * User: haopt
 * Date: 6/3/13
 * Time: 2:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestMathService {
    private MathService mathService;

    @Test
    public void testWithParamNull() {
        assertEquals(0, mathService.methodAdd(null));
    }

    @Test
    public void testWithParamEmpty() {
        assertEquals(0, mathService.methodAdd(""));
    }

    @Test
    public void testWithOneNumber() {
        assertEquals(1, mathService.methodAdd("1"));
    }

    @Test
    public void testWithTwoNumber() {
        assertEquals(3, mathService.methodAdd("1,2"));
    }

    @Test
    public void testWithSpecialNumber() {
        assertEquals(6, mathService.methodAdd("1\n3,2"));
    }

    @Test
    public void testWithDelimiters() {
        assertEquals(3, mathService.methodAdd("//;\n1;2"));
    }

    @Test
    public void testWithNumbersBiggerThan1000() {
        assertEquals(2, mathService.methodAdd("2,1001"));
    }

    @Test
    public void testWithDelimitersAnyLenght() {
        assertEquals(6, mathService.methodAdd("//[***]\n1***2***3"));
    }
    @Test
    public void testWithAllowMultipleDelimitersAnyLenght() {
        assertEquals(6, mathService.methodAdd("//[***][%]\n1*2%3"));
    }

}

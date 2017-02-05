package model;


import model.entity.Triangle;
import model.entity.TriangleType;
import model.logic.AbstractChecker;
import model.logic.Data;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestTriangle {
    private static AbstractChecker checker;

    @BeforeClass
    public static void init() {
        checker = controller.Test.getChainOfCheckers();
    }

    @Test
    public void testCheckInputPositiveOne() {
        String a = "989";
        assertEquals(true, Data.checkInput(a));
    }

    @Test
    public void testCheckInputPositiveTwo() {
        String a = "98";
        assertEquals(true, Data.checkInput(a));
    }

    @Test
    public void testCheckInputNegativeChar() {
        String a = "9a9";
        assertEquals(false, Data.checkInput(a));
    }

    @Test
    public void testCheckInputNegativeDouble() {
        String a = "9.9";
        assertEquals(false, Data.checkInput(a));
    }

    @Test
    public void testCheckInputNegativeSpecialCharacter() {
        String a = "99!";
        assertEquals(false, Data.checkInput(a));
    }


    @Test
    public void testCheckPositiveChekerPositive() {
        Triangle triangle = new Triangle(3, 3, 3);
        checker.handleRequest(triangle);
        assertEquals(TriangleType.EQUILATERAL, triangle.getType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCheckPositiveChekerNegative() {
        Triangle triangle = new Triangle(0, 3, 3);
        checker.handleRequest(triangle);
    }
}

package model.logic;

import model.entity.Triangle;
import model.entity.TriangleType;
import view.Printer;

/**
 * Created by Administrator on 2/5/2017.
 */
public class EquilateralChecker extends AbstractChecker {
    @Override
    public void handleRequest(Triangle triangle) {
        if ((triangle.getA() == triangle.getB() && triangle.getB() == triangle.getC()))
            triangle.setType(TriangleType.EQUILATERAL);
        else {
            if (nextChecker != null)
                nextChecker.handleRequest(triangle);
        }
    }
}

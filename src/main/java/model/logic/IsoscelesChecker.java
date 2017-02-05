package model.logic;

import model.entity.Triangle;
import model.entity.TriangleType;
import view.Printer;

/**
 * Created by Administrator on 2/5/2017.
 */
public class IsoscelesChecker extends AbstractChecker {
    @Override
    public void handleRequest(Triangle triangle) {
        if (triangle.getB() == triangle.getC() || triangle.getA() == triangle.getB()
                || triangle.getC() == triangle.getA())
            triangle.setType(TriangleType.ISOSCELES);
        else {
            if (nextChecker != null)
                nextChecker.handleRequest(triangle);
        }
    }
}

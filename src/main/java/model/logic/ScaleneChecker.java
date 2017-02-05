package model.logic;

import model.entity.Triangle;
import model.entity.TriangleType;
import view.Printer;

/**
 * Created by Administrator on 2/5/2017.
 */
public class ScaleneChecker extends AbstractChecker {
    @Override
    public void handleRequest(Triangle triangle) {
        if (triangle.getA() != triangle.getB() &&
                triangle.getB() != triangle.getC() &&
                triangle.getC() != triangle.getA())
            triangle.setType(TriangleType.SCALENE);
        else {
            if (nextChecker != null)
                nextChecker.handleRequest(triangle);
        }
    }
}

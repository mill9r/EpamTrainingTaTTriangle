package model.logic;

import model.entity.Triangle;

public class PositiveChecker extends AbstractChecker {
    @Override
    public void handleRequest(Triangle triangle) {
        if (triangle.getA() > 0 && triangle.getB() > 0 && triangle.getC() > 0) {
            if (nextChecker != null) {
                nextChecker.handleRequest(triangle);
            }
        } else {
            throw new IllegalArgumentException("You entered a null value");
        }


    }
}

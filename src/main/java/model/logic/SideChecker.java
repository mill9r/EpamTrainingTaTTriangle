package model.logic;

import model.entity.Triangle;


public class SideChecker extends AbstractChecker {
    @Override
    public void handleRequest(Triangle triangle) {
        if (triangle.getA() + triangle.getB() > triangle.getC() & triangle.getA() +
                triangle.getC() > triangle.getB() & triangle.getC() + triangle.getB() > triangle.getA()) {
            if (nextChecker != null)
                nextChecker.handleRequest(triangle);
        }
            else{
                throw new IllegalArgumentException("Please enter correct sides");
            }

    }
}

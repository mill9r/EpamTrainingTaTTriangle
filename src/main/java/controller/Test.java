package controller;

import model.entity.Triangle;
import model.logic.*;

public class Test {
    public static AbstractChecker getChainOfCheckers() {
        AbstractChecker positive = new PositiveChecker();
        AbstractChecker side = new SideChecker();
        AbstractChecker equilateral = new EquilateralChecker();
        AbstractChecker isosceles = new IsoscelesChecker();
        AbstractChecker scalene = new ScaleneChecker();

        positive.setNextChecker(side);
        side.setNextChecker(equilateral);
        equilateral.setNextChecker(isosceles);
        isosceles.setNextChecker(scalene);

        return positive;
    }

    public static void main(String[] args) {
        AbstractChecker chain = getChainOfCheckers();
        Triangle triangle = Input.readInput();


        chain.handleRequest(triangle);
    }

}

package model.logic;


import model.entity.Triangle;

public abstract class AbstractChecker {
    protected AbstractChecker nextChecker;

    public void setNextChecker(AbstractChecker nextChecker) {
        this.nextChecker = nextChecker;
    }

    public abstract void handleRequest(Triangle triangle);
}

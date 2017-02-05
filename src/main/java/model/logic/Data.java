package model.logic;

import model.entity.Triangle;

public class Data {

    public static boolean checkInput(String input) {

        if (input.matches("\\d{1,3}")) {
            return true;
        } else
            return false;
    }


}

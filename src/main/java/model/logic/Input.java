package model.logic;

import model.entity.Triangle;
import view.Printer;

import java.util.Scanner;

/**
 * Created by Administrator on 2/5/2017.
 */
public class Input {
    public static Triangle readInput() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int [] inputArray = new int[3];
        String input ="";
        Printer.print("Enter a positive integer value from 1 to 999: ");
        while (i <= 2){
            Printer.print((i+1) + " number: ");
            input = scanner.nextLine();
            if(Data.checkInput(input)){
                inputArray[i] = Integer.parseInt(input);
                i++;
            }else{
                Printer.print("Please enter integer value");
            }
        }
        return new Triangle(inputArray[0],inputArray[1],inputArray[2]);
    }
}

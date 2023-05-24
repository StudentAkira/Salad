package View;

import java.util.InputMismatchException;
import java.util.Scanner;
import Controller.*;
import Model.*;

public class MenuSalads {
    protected static int choise = 10;

    public  void setChoise (int choise) {
        this.choise = choise;
    }
    public static int show_menu () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your salad: 1 - Carrots + Cabbage + Champignon  2 - Tomato + Garlic + Greenery  3 - Tomato + Cucumber + Cabbage");
        try {
            choise = sc.nextInt();
            //System.out.println("Add oil?  1 - Yes  2 - No");
            //add_oil = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("The answer must be an integer!");
            show_menu();
        }
        return choise;
    }
    public static int show_menu_operations () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose operation:  1 -  Total weight  2 - Total calories  3 - Most caloric ingredient  0 - Exit");
        try {
            choise = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("The answer must be an integer!");
            show_menu_operations();
        }
        return choise;
    }
}

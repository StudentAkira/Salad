package Controller;

import Model.*;
import View.*;

public class Main {
    static {
        System.out.println("Welcome to our restaurant!");
    }
    public static void main(String[] args) {
        try {
            boolean a = true;
            int choise = 0;
            while (a) {
                switch (MenuSalads.show_menu()) {//динамический массив -  ArrayList
                    case 1:
                        choise = 1;
                        a = false;
                        break;
                    case 2:
                        choise = 2;
                        a = false;
                        break;
                    case 3:
                        choise = 3;
                        a = false;
                        break;
                    default:
                        System.out.println("Wrong order number selected!");
                }
            }
            Salad salad = new Salad(choise);
            System.out.println(SaltOrNot.Salt(salad.salad));
            while (true) {
                switch (MenuSalads.show_menu_operations()) {
                    case 1:
                        System.out.println(TotalWeight.AllWeight(salad));
                        break;
                    case 2:
                        System.out.println(TotalCalories.AllCalories(salad));
                        break;
                    case 3:
                        System.out.println(MostCaloricIngredients.Caloric(salad));
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Wrong order number selected!");
                }
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException! Check your salad.");
        }
    }
}
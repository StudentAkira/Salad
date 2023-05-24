package View;

import Model.Ingredients;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SaltOrNot {
    protected static String salt = "Not salted";

    public void SetSalt(String salt) {
        this.salt = salt;
    }

    public String GetSalt() {
        return salt;
    }

    public static String Salt(Ingredients[] salade) {
        boolean a = true;
        while (a) {
            System.out.println("\nDo you want to salt your salad?  1 - Yes  2 - No");
            Scanner sc = new Scanner(System.in);
            try {
                int answer = sc.nextInt();
                switch (answer) {
                    case 1:
                        salt = "Salt";
                        a = false;
                        break;
                    case 2:
                        a = false;
                        break;
                    default:
                        System.out.println("\nWrong order number selected!");
                }
            } catch (InputMismatchException e) {
                System.out.println("The answer must be an integer!");
            }
        }
        try {
            for (int i = 0; i <= salade.length - 1; i++) {
                System.out.print(salade[i].GetName() + " ");
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerExeption! Check your salad!");
        }
        return salt + "\n";
    }
}

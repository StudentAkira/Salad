package Controller;

import Model.Salad;

public class TotalCalories {
    public static String AllCalories (Salad salad) {
        int maxCal = 0;
        for (int i = 0; i <= salad.salad.length - 1; i++) {
            maxCal += salad.salad[i].GetCalories();
        }
        String answer = "Total calories is: " + maxCal;
        return answer;
    }
}

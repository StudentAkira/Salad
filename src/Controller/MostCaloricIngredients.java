package Controller;

import Model.Salad;

public class MostCaloricIngredients {
    public static String Caloric(Salad salad) {
        int HighestCalories = salad.salad[0].GetCalories();
        for (int i = 0; i <= salad.salad.length - 1; i++) {
            if (HighestCalories < salad.salad[i].GetCalories()) {
                HighestCalories = salad.salad[i].GetCalories();
            }
        }
        String answer = "Default";
        for (int j = 0; j <= salad.salad.length - 1; j++) {
            if (HighestCalories == salad.salad[j].GetCalories()) {
                //System.out.print("Most caloric ingredient: " + salad.salad[j].GetName() + "\n");
                answer = "Most caloric ingredient: " + salad.salad[j].GetName();
            }
        }
        return answer;
    }
}

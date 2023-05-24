package Controller;

import Model.Salad;

public class TotalWeight {
    public static String AllWeight(Salad salad) {
        int maxV = 0;
        for (int i = 0; i <= salad.salad.length - 1; i++) {
            maxV += salad.salad[i].GetWeight();
        }
        String answer = "Total weight is: " + maxV;
        return answer;
    }
}

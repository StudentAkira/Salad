package Tests;

import Controller.TotalCalories;
import Model.Salad;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotalCaloriesTest {

    @Test
    void allCaloriesSaladOne() {
        Salad salad = new Salad(1);
        assertEquals("Total calories is: 87", TotalCalories.AllCalories(salad));
    }

    @Test
    void allCaloriesSaladTwo() {
        Salad salad = new Salad(2);
        assertEquals("Total calories is: 121", TotalCalories.AllCalories(salad));
    }

    @Test
    void allCaloriesSaladThree() {
        Salad salad = new Salad(3);
        assertEquals("Total calories is: 63", TotalCalories.AllCalories(salad));
    }

}
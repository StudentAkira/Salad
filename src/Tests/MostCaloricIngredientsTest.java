package Tests;

import Controller.MostCaloricIngredients;
import Model.Salad;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostCaloricIngredientsTest {

    @Test
    void testCaloricSaladOne() {
        Salad salad = new Salad(1);
        assertEquals("Most caloric ingredient: Carrots", MostCaloricIngredients.Caloric(salad));
    }

    @Test
    void testCaloricSaladTwo() {
        Salad salad = new Salad(2);
        assertEquals("Most caloric ingredient: Garlic", MostCaloricIngredients.Caloric(salad));
    }

    @Test
    void testCaloricSaladThree() {
        Salad salad = new Salad(3);
        assertEquals("Most caloric ingredient: Cabbage", MostCaloricIngredients.Caloric(salad));
    }
}
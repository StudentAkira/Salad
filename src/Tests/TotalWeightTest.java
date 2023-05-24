package Tests;

import Controller.TotalWeight;
import Model.Salad;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotalWeightTest {

    @Test
    void allWeightSaladOne() {
        Salad salad = new Salad(1);
        assertEquals("Total weight is: 300", TotalWeight.AllWeight(salad));
    }

    @Test
    void allWeightSaladTwo() {
        Salad salad = new Salad(2);
        assertEquals("Total weight is: 250", TotalWeight.AllWeight(salad));
    }

    @Test
    void allWeightSaladThree() {
        Salad salad = new Salad(3);
        assertEquals("Total weight is: 300", TotalWeight.AllWeight(salad));
    }
}
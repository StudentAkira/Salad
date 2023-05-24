package Tests;

import Model.Cabbage;
import Model.Carrots;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarrotsTest {

    Carrots carrots;

    @BeforeEach
    void prepareData() {
        carrots = new Carrots();
    }

    @Test
    void setName() {
        carrots.SetName("Carrots1");
        assertEquals("Carrots1",carrots.GetName());
    }

    @Test
    void getName() {
        assertEquals("Carrots", carrots.GetName());
    }

    @Test
    void setWeight() {
        carrots.SetWeight(101);
        assertEquals(101,carrots.GetWeight());
    }

    @Test
    void getWeight() {
        assertEquals(100, carrots.GetWeight());
    }

    @Test
    void setCalories() {
        carrots.SetCalories(101);
        assertEquals(101,carrots.GetCalories());
    }

    @Test
    void getCalories() {
        assertEquals(32, carrots.GetCalories());
    }
}
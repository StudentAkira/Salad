package Tests;

import Model.Greenery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreeneryTest {

    Greenery greenery;

    @BeforeEach
    void prepareData() {
        greenery = new Greenery();
    }
    @Test
    void setName() {
        greenery.SetName("Greenery1");
        assertEquals("Greenery1",greenery.GetName());
    }

    @Test
    void getName() {
        assertEquals("Greenery", greenery.GetName());
    }

    @Test
    void setWeight() {
        greenery.SetWeight(101);
        assertEquals(101,greenery.GetWeight());
    }

    @Test
    void getWeight() {
        assertEquals(100, greenery.GetWeight());
    }

    @Test
    void setCalories() {
        greenery.SetCalories(101);
        assertEquals(101,greenery.GetCalories());
    }

    @Test
    void getCalories() {
        assertEquals(36, greenery.GetCalories());
    }
}
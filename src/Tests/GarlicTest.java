package Tests;

import Model.Garlic;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarlicTest {

    Garlic garlic;

    @BeforeEach
    void prepareData() {
        garlic = new Garlic();
    }

    @Test
    void setName() {
        garlic.SetName("Garlic1");
        assertEquals("Garlic1",garlic.GetName());
    }

    @Test
    void getName() {
        assertEquals("Garlic", garlic.GetName());
    }

    @Test
    void setWeight() {
        garlic.SetWeight(101);
        assertEquals(101,garlic.GetWeight());
    }

    @Test
    void getWeight() {
        assertEquals(50, garlic.GetWeight());
    }

    @Test
    void setCalories() {
        garlic.SetCalories(101);
        assertEquals(101,garlic.GetCalories());
    }

    @Test
    void getCalories() {
        assertEquals(65, garlic.GetCalories());
    }
}
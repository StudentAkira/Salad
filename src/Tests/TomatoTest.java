package Tests;

import Model.Tomato;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TomatoTest {

    Tomato tomato;

    @BeforeEach
    void prepareData() {
        tomato = new Tomato();
    }
    @Test
    void setName() {
        tomato.SetName("Tomato1");
        assertEquals("Tomato1",tomato.GetName());
    }

    @Test
    void getName() {
        assertEquals("Tomato", tomato.GetName());
    }

    @Test
    void setWeight() {
        tomato.SetWeight(101);
        assertEquals(101,tomato.GetWeight());
    }

    @Test
    void getWeight() {
        assertEquals(100, tomato.GetWeight());
    }

    @Test
    void setCalories() {
        tomato.SetCalories(101);
        assertEquals(101,tomato.GetCalories());
    }

    @Test
    void getCalories() {
        assertEquals(20, tomato.GetCalories());
    }
}
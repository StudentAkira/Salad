package Tests;

import Model.Cucumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CucumberTest {

    Cucumber cucumber;

    @BeforeEach
    void prepareData() {
        cucumber = new Cucumber();
    }
    @Test
    void setName() {
        cucumber.SetName("Cucumber1");
        assertEquals("Cucumber1",cucumber.GetName());
    }

    @Test
    void getName() {
        assertEquals("Cucumber", cucumber.GetName());
    }

    @Test
    void setWeight() {
        cucumber.SetWeight(101);
        assertEquals(101,cucumber.GetWeight());
    }

    @Test
    void getWeight() {
        assertEquals(100, cucumber.GetWeight());
    }

    @Test
    void setCalories() {
        cucumber.SetCalories(101);
        assertEquals(101,cucumber.GetCalories());
    }

    @Test
    void getCalories() {
        assertEquals(15, cucumber.GetCalories());
    }
}
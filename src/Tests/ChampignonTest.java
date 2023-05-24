package Tests;

import Model.Champignon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChampignonTest {

    Champignon champignon;

    @BeforeEach
    void prepareData() {
        champignon = new Champignon();
    }

    @Test
    void setName() {
        champignon.SetName("Champignon1");
        assertEquals("Champignon1", champignon.GetName());
    }

    @Test
    void getName() {
        assertEquals("Champignon", champignon.GetName());
    }

    @Test
    void setWeight() {
        champignon.SetWeight(101);
        assertEquals(101, champignon.GetWeight());
    }

    @Test
    void getWeight() {
        assertEquals(100, champignon.GetWeight());
    }

    @Test
    void setCalories() {
        champignon.SetCalories(101);
        assertEquals(101, champignon.GetCalories());
    }

    @Test
    void getCalories() {
        assertEquals(27, champignon.GetCalories());
    }
}
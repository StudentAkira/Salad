package Tests;
import Model.Cabbage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CabbageTest {
    Cabbage cabbage;

    @BeforeEach
    void prepareData(){
        cabbage = new Cabbage();
    }

    @Test
    void TestSetName() {
        cabbage.SetName("Cabbage1");
        assertEquals("Cabbage1",cabbage.GetName());
    }

    @Test
    void TestGetName() {
        assertEquals("Cabbage", cabbage.GetName());
    }

    @Test
    void TestSetWeight() {
        cabbage.SetWeight(101);
        assertEquals(101,cabbage.GetWeight());
    }

    @Test
    void TestGetWeight() {
        assertEquals(100, cabbage.GetWeight());
    }

    @Test
    void TestSetCalories() {
        cabbage.SetCalories(101);
        assertEquals(101,cabbage.GetCalories());
    }

    @Test
    void TestGetCalories() {
        assertEquals(28, cabbage.GetCalories());
    }
}
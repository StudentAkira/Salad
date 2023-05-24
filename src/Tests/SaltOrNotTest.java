package Tests;

import Model.Ingredients;
import View.SaltOrNot;
import Model.Salad;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SaltOrNotTest {
    @org.junit.jupiter.api.Test
    void TestSaltMethod() {
        Salad salad = new Salad(1);
        assertEquals("NullPointerExeption! Check your salad!", SaltOrNot.Salt(null));
    }
}
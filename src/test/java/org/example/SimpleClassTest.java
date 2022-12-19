package org.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleClassTest {


    @Test
    @Tag("1")
    void shouldGetLowerCase() {
        System.out.println("CHOSEN TEST 1");
        //given
        String input = "Test";
        //when
        String actual = SimpleClass.getLowerCase(input);
        //then
        assertEquals("test", actual);
    }

    @Test
    @Tag("2")
    void shouldGetAddition() {
        System.out.println("CHOSEN TEST 2");
        //given
        int a = 3;
        int b = 4;
        //when
        int actual = SimpleClass.getAddition(a, b);
        //then
        assertEquals(a + b, actual);
    }
}

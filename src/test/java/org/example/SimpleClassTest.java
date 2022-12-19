package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleClassTest {

    @Test
    void shouldGetLowerCase() {
        //given
        String input = "Test";
        //when
        String actual = SimpleClass.getLowerCase(input);
        //then
        assertEquals("test", actual);
    }

    @Test
    void shouldGetAddition() {
        //given
        int a = 3;
        int b = 4;
        //when
        int actual = SimpleClass.getAddition(a, b);
        //then
        assertEquals(a + b, actual);
    }
}

package org.psu.java.example.infrastructure;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test TicketImpl
 */

public class TicketImplTest {
    @Test
    public void testSuccessfullyCreated() {
        //given
        var length = 6;
        var number = 100_500;
        //when
        var actual = new TicketImpl(length, number);
        //then
        assertNotNull("Constructor", actual);
    }
    /**

     */
    @Test
    public void testNegativeNumber() {
        //given
        var length = 6;
        var number = -100_500;
        var expected = String.format("Передан %d < 0 ", number);
        //when
        try {
            new TicketImpl(length, number);
        } catch (IllegalArgumentException actual) {
            //then
            assertEquals("Должно быть брошено исключение с нужным текстом", expected, actual);
        }
        fail("Exception");
    }
    @Test
    public void testNumber(){
        var length = 7;
        var number = 100_500;
        //when
        var actual = new TicketImpl(length, number);
        //then
        assertNotNull("Message", actual);
    }
}
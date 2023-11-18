package org.psu.java.example.application;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.psu.java.example.domain.Ticket;
import org.psu.java.example.infrastructure.TicketGenerator;

import java.util.stream.IntStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 *
 */

public class FortunateTicketStreamImplTest {
    private TicketGenerator generator;
    private int maxNumber;
    private FortunateTicketService service;
    @After
    public void tearDown(){
        servise
    }
    @Before
    public void setUp() {
        maxNumber = (int) Math.pow(10, 4);
        var mockIterator = IntStream.rangeClosed(0, 10000).mapToObj(number -> {
                    Ticket mockTicket = Mockito.mock(Ticket.class);
                    when(mockTicket.getNumber()).thenReturn((long) number);
                    when(mockTicket.getLength()).thenReturn(4);
                    when(mockTicket.isFortunate()).thenReturn(true);
                    return mockTicket;
                })
                .iterator();
        TicketGenerator ticketGenerator = Mockito.mock(TicketGenerator.class);
        when(ticketGenerator.getTickets()).thenReturn(mockIterator);
    }

    @Test
    public void testCount() {
        service = Mockito.mock(TicketGenerator.class);
    }
}
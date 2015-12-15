package com.cspark.books.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cspark on 2015. 12. 15..
 */
public class DollarTest {

    @Test
    public void testMuliplication() throws Exception {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
        five.times(3);
        assertEquals(15, five.amount);
    }

}

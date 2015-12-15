package com.cspark.books.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cspark on 2015. 12. 15..
 */
public class DollarTest {

    @Test
    public void testNothing() throws Exception {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}

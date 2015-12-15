package com.cspark.books.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by cspark on 2015. 12. 15..
 */
public class DollarTest {

    @Test
    public void testMuliplication() throws Exception {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(new Dollar(10), product);

        product = five.times(3);
        assertEquals(new Dollar(15), product);
    }

    @Test
    public void testEquality() throws Exception {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

}

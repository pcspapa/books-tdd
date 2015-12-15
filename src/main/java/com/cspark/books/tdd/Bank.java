package com.cspark.books.tdd;

import java.util.Hashtable;

/**
 * Created by cspark on 2015. 12. 15..
 */
public class Bank {

    private Hashtable rates = new Hashtable();

    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), new Integer(rate));
    }

    public int rate(String from, String to) {
        return ((Integer) rates.get(new Pair(from, to))).intValue();
    }
}
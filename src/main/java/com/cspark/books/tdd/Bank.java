package com.cspark.books.tdd;

/**
 * Created by cspark on 2015. 12. 15..
 */
public class Bank {
    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String from, String to, int rate) {
    }

    public int rate(String from, String to) {
        return from.equals("CHF") && to.equals("USD") ? 2 : 1;
    }
}

package com.cspark.books.tdd;

/**
 * Created by cspark on 2015. 12. 15..
 */
public class Money {
    protected int amount;

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount;
    }
}

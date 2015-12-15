package com.cspark.books.tdd;

/**
 * Created by cspark on 2015. 12. 15..
 */
public class Dollar {
    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}

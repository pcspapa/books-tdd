package com.cspark.books.tdd;

/**
 * Created by cspark on 2015. 12. 15..
 */
public abstract class Money {
    protected int amount;

    static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    public abstract Money times(int amount);

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}

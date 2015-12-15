package com.cspark.books.tdd;

/**
 * Created by cspark on 2015. 12. 15..
 */
public abstract class Money {
    protected int amount;
    protected String currency;

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public String currency() {
        return currency;
    }

    public abstract Money times(int amount);

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}

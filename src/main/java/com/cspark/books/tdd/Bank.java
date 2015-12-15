package com.cspark.books.tdd;

/**
 * Created by cspark on 2015. 12. 15..
 */
public class Bank {
    public Money reduce(Expression source, String to) {
        Sum sum = (Sum) source ;
        return sum.reduce(to);
    }
}

package com.pluralsight.bookstore.util;

import java.util.Random;

public class isbnGenerator implements NumberGenerator {
    @Override
    public String generateNumber() {
        return "13-5677-"+Math.abs(new Random().nextInt());
    }
}

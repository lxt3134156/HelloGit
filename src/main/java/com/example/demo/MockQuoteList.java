package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MockQuoteList implements QuoteList {

    @Override
    public List<String> getQuoteList() {
        return Arrays.asList(
                "May the force be with you",
                "There is no place like home",
                "I'll be back",
                "You're going to need a bigger boat",
                "My precious");
    }

}

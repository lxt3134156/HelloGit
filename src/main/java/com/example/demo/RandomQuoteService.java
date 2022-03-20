package com.example.demo;

import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@Service
public class RandomQuoteService {

    final QuoteList quote;

    public RandomQuoteService(QuoteList quote) {
        this.quote = quote;
    }

    public String getRandomQuote() throws FileNotFoundException, IOException {
        List<String> quoteList = quote.getQuoteList();
        Random random = new Random();
        int index = random.nextInt(quoteList.size());
        return (String) quoteList.get(index);
    }
}

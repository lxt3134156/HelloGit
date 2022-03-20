package com.example.demo.Controller;

import java.io.IOException;

import com.example.demo.RandomQuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomQuoteController {

    RandomQuoteService randQ;

    @Autowired
    public void setRandQ(RandomQuoteService randQ) {
        this.randQ = randQ;
    }

    @RequestMapping("daily-quote")
    public String getMyQuote() {
        try {
            return randQ.getRandomQuote();
        } catch (IOException e) {
            return "To be or not to be";
        }
    }
}

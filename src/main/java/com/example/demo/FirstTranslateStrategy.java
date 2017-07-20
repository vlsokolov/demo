package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * Created by vsokolov on 17.07.17.
 */
@Component
public class FirstTranslateStrategy implements TranslateStrategy {

    @Override
    public String translate() {
        return "First";
    }
}

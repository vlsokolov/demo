package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * Created by vsokolov on 17.07.17.
 */
@Component
public class SecondTranslateStrategy implements TranslateStrategy{

    @Override
    public String translate() {
        return "Second";
    }
}

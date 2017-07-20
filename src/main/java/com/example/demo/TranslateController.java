package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsokolov on 17.07.17.
 */
@RestController
public class TranslateController {

    @Autowired
    private final Map<String, TranslateStrategy> translateStrategies = new HashMap<>();

    @RequestMapping("/strategy/{strategyId}")
    public String strategy(@PathVariable("strategyId") String strategyId){
        return translateStrategies.get(strategyId).translate();
    }
}

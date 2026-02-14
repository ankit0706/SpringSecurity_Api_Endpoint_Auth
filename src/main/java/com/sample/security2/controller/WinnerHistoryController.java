package com.sample.security2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WinnerHistoryController {
	
	@GetMapping("/winners/{year}")
    public String getChampionName(@PathVariable int year){
        String prefix =  "Champions for " + year;
        return switch (year) {
            case 2007, 2024 ->prefix + " India";
            case 2009 -> prefix + " Pakistan";
            case 2010, 2022 -> prefix + " England";
            case 2012, 2016 -> prefix + " West Indies";
            case 2014 -> prefix + " Sri Lanka";
            case 2021 -> prefix + " Australia";
            default -> "Invalid year";
        };
    }
}

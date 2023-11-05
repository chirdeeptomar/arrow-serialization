package com.empyrean.micronaut.arrow.api.controllers;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class HomeController {

    @Get
    public String index() {
        return "Hello From Micronaut";
    }
}

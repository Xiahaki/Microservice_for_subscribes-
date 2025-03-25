package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/search")
    public String index() {
        return "свободных номеров нет";
    }

    @GetMapping("/book")
    public String goodbuy(@RequestParam("number") String number) {
        return "Номер " + number + " забронирован";
    }

}

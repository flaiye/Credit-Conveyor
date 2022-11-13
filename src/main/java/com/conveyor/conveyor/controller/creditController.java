package com.conveyor.conveyor.controller;

import com.conveyor.conveyor.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class creditController {

@GetMapping("/get/all")
    public User getUser(int id) {
        return null;
    }
}

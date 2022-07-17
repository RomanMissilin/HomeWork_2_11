package com.example.homework_2_11.controller;

import com.example.homework_2_11.item.Item;
import com.example.homework_2_11.service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public Item add(@RequestParam Long id,
                    @RequestParam String name) {
        return storeService.add(id, name);
    }

    @GetMapping("/get")
    public List<Item> get() {
        return storeService.getItem();
    }
}
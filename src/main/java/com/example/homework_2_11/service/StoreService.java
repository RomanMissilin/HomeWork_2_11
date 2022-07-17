package com.example.homework_2_11.service;

import com.example.homework_2_11.element.Basket;
import com.example.homework_2_11.item.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    private final Basket basket;

    public StoreService(Basket basket) {
        this.basket = basket;
    }

    public Item add(Long id, String name) {
        Item item = new Item(id, name);
        basket.add(item);
        return item;
    }

    public List<Item> getItem() {
        return basket.getItems();
    }
}
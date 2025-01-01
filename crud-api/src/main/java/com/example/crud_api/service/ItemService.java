package com.example.crud_api.service;


import org.springframework.stereotype.Service;

import com.example.crud_api.model.Item;
import com.example.crud_api.repository.ItemRepository;

import java.util.List;

@Service
public class ItemService {
    private final ItemRepository repository;

    public ItemService(ItemRepository repository) {
        this.repository = repository;
    }

    public List<Item> getAllItems() {
        return repository.findAll();
    }

    public Item getItemById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Item saveItem(Item item) {
        return repository.save(item);
    }

    public void deleteItem(Long id) {
        repository.deleteById(id);
    }
}

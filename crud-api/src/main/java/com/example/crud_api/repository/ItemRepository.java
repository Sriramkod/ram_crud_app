package com.example.crud_api.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud_api.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}

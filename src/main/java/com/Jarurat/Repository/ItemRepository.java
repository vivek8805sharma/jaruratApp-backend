package com.Jarurat.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Jarurat.Entity.Item;

public interface ItemRepository extends CrudRepository<Item, Integer>{

}

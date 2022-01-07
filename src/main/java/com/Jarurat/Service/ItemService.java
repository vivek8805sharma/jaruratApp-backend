package com.Jarurat.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Jarurat.Entity.Item;
import com.Jarurat.Repository.ItemRepository;

@Component
public class ItemService {
	
	@Autowired
	ItemRepository itemRepo;
	
	public List<Item> getAllItems(){
		return (List<Item>) itemRepo.findAll();
	}
	
	public void addItem(String itemName) {
		Item newItem=new Item();
		newItem.setName(itemName);
		itemRepo.save(newItem);
	}
	
	public void deleteItem(int id) {
		itemRepo.deleteById(id);
	}
}


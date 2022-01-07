package com.Jarurat.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Jarurat.Entity.Item;
import com.Jarurat.Service.ItemService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class JaruratController {
	
	@Autowired
	ItemService itemService;
	
	@GetMapping("/getAllItems")
	public ResponseEntity<List<Item>> getAllItems(){
		List<Item> allItems=itemService.getAllItems();
		return new ResponseEntity<>(allItems,HttpStatus.OK);
	}
	
	@PostMapping("/addItem/{item}")
	public ResponseEntity<?> addNewItem(@PathVariable String item){
		itemService.addItem(item);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{itemid}")
	public void deleteItem(@PathVariable int itemid) {
		itemService.deleteItem(itemid);
	}

}

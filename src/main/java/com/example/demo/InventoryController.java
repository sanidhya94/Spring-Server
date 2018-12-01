package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class InventoryController {
	
	@Autowired
	InventoryRepository invenotryRepository;
	
	 @RequestMapping("/")
	    public String index() {
	        return "Congratulations from InventoryController.java";
	    }
	 
	 @GetMapping("/items")
	 public List<Product_Details> allproducts() 
	 {
		return invenotryRepository.findAll();
		 
	 }
	 
	 @GetMapping("/items/{id}")
	 public String selectedproduct(@PathVariable String id){
		 return null;
	 }
	 
	 @PostMapping("/items/new")
	    public InventoryController create(@RequestBody Map<String, String> body){
	        int product_id = Integer.parseInt(body.get("product_id"));
	        String product_name = body.get("product_name");
	        String product_category = body.get("product_category");
	        String total_item_remaining = body.get("total_item_remaining");
	        String product_location = body.get("product_location");
	        return null;
	 }
	 
	 


}

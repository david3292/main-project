package com.example.demo.service.inventory.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.enventory.Product;
import com.example.demo.service.inventory.IProductService;

@Service
public class ProductService implements IProductService{

	@Override
	public List<Product> getAll() {
		List<Product> productList = new ArrayList<Product>();
		
		Product product = new Product("", "Test-Wemalo", false, "", 5, false, "", 0, true, "", 0, "1234567890123", "0815-stift", "69nnaW5y", 4, 196935, "", 196935, 0, 0, 7260, 110, 2, true, 121, 0, "default", "TestStift Cloudtestmandant", 15, "", "");
		
		productList.add(product);
		
		return productList;
	}

}

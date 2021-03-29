package com.example.demo.api.inventory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.enventory.Product;
import com.example.demo.service.inventory.IProductService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/v1/product")
public class ProductApi {

	
	@Autowired
	IProductService productService;
	
	@GetMapping("/getAll")
	public ResponseEntity<Map<String, Object>> getAll(String fromDate) {
		
		log.info(fromDate);
		
		if(fromDate!= null)
			formatDate(fromDate);
		
		List<Product> productList = productService.getAll();
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("Success", true);
		response.put("products", productList);
		response.put("status", "200");
		
		return ResponseEntity.ok(response);
	}
	
	private String formatDate(String date) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyyHH"); 
		LocalDateTime dateTime = LocalDateTime.parse(date, formatter);

		formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy hh a");
		
		String newDateFormat = dateTime.format(formatter);
		
		log.info(newDateFormat);
		
		return newDateFormat;
	}
	
}

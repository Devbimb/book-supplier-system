package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.BookSupplierDTO;
import com.example.model.BookSupplier;
import com.example.service.BookSupplierService;

@RestController
public class BookSupplierController {
	
		private BookSupplierService booksupplierservice;

		public BookSupplierController(BookSupplierService booksupplierservice) {
			super();
			this.booksupplierservice = booksupplierservice;
		}
		@PostMapping("/BookSupplier/createbooksupplier")
		public BookSupplier createbooksupplier(@RequestBody BookSupplier bks1) {
			return this.booksupplierservice.createBookSupplier(bks1);
		}
			
		@GetMapping("/Booksupplier/readbooksupplier")
		public List<BookSupplierDTO> readBookSupplier(){
			return this.booksupplierservice.readBookSupplier();
		}

		@PutMapping("/Booksupplier/updatebook/{bkId}")
		public BookSupplierDTO updatebook(@PathVariable Long bkId,@RequestBody BookSupplier bks2){
			return this.booksupplierservice.updateBookSupplier(bkId, bks2);
		}
			
		@DeleteMapping("/Booksupplier/deletebooksupplier/{bkId}")
		public void delete (@PathVariable Long bkId) {
			this.booksupplierservice.deleteBookSupplier(bkId);
		
		}
		@GetMapping("/Booksupplier/readOne")
		public void readOne(){
		}
			
		@GetMapping("booksupplier/login/{userName}/{password}")
		public int login(@PathVariable String userName,@PathVariable String password){
			{
				return this.booksupplierservice.checkCredentials(userName, password);
			}
			
	}
}

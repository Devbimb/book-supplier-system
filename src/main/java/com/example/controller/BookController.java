package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.BookDTO;
import com.example.model.Books;
import com.example.service.BookService;


@RestController
public class BookController {
	private BookService bookservice;

	public BookController(BookService bookservice) {
		super();
		this.bookservice = bookservice;
		
		
	}
	@PostMapping("/Book/createbook")
	public BookDTO createbook(@RequestBody Books bk1) {
		return this.bookservice.createBook(bk1);
	}
		
	@GetMapping("/Book/readbook")
	public List<BookDTO> readbook(){
		return this.bookservice.readBook();
	}

	@PutMapping("/Book/updatebook/{bkId}")
	public BookDTO updateBook(@PathVariable Long bkId,@RequestBody Books bk2){
		return this.bookservice.updateBook(bkId, bk2);
	}
		
	@DeleteMapping("/Book/deletebook/{bkId}")
//	public void delete (@PathVariable long bkId) {
//	this.bookservice.deleteBook(bkId);
	public boolean deleteBook(@PathVariable Long bkId) {
		return this.bookservice.deleteBook(bkId);
	
	}
	@GetMapping("/Book/readOne")
	public void readOne(){
		}
		
//	@GetMapping("book/login/{userName}/{password}")
//	public int login(@PathVariable String userName,@PathVariable String password){
//		{
//			return this.bookservice.checkCredentials(userName, password);
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//----------------------------------------------------------------------------	
//	@PostMapping("/Book/createbook")
//	public Books createbook(@RequestBody Books bk1) {
//		return this.bookservice.createBook(bk1);
//	}
//		
//	@GetMapping("/Book/readbook")
//	public List<Books> readbook(){
//		return this.bookservice.readBook();
//	}
//
//	@PutMapping("/Book/updatebook/{bkId}")
//	public Books updateBook(@PathVariable long bkId,@RequestBody Books bk2){
//		return this.bookservice.updateBook(bkId, bk2);
//	}
//		
//	@DeleteMapping("/Book/deletebook/{bkId}")
//	public void delete (@PathVariable long bkId) {
//	this.bookservice.deleteBook(bkId);
////	public boolean deleteBook(@PathVariable long bkId) {
////		return this.bookservice.deleteBook(bkId);
//	
//	}
//	@GetMapping("/Book/readOne")
//	public void readOne(){
//		}
//		
////	@GetMapping("book/login/{userName}/{password}")
////	public int login(@PathVariable String userName,@PathVariable String password){
////		{
////			return this.bookservice.checkCredentials(userName, password);
//		
//		
}

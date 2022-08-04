package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.BookSupplierDTO;
import com.example.model.BookSupplier;
import com.example.repo.BookSupplierRepo;

@Service
public class BookSupplierService {

		@Autowired
		public BookSupplierRepo booksupplierrepo;
		
		private ModelMapper mapper;

		private Object mapToDTO;

	    public BookSupplierService(BookSupplierRepo Booksupplierrepo, ModelMapper mapper) {
	        super();
	        this.booksupplierrepo = booksupplierrepo;
	        this.mapper = mapper;
	    }		
		
		
		public BookSupplier createBookSupplier(BookSupplier bks1)
		{
			return this.booksupplierrepo.save(bks1);
		}
		
		public List<BookSupplierDTO> readBookSupplier() {
			return this.booksupplierrepo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
		}
		public int checkCredentials(String userName, String password)
		{
			int flag = 0;
			if(!booksupplierrepo.login(userName, password).isEmpty())
			{
				flag = 1;
				System.out.println("inside " + flag);
				return flag;
			}
				System.out.println("out -- " + flag);
				return flag;
		}
		public BookSupplierDTO updateBookSupplier(Long bkId, BookSupplier bks2) {
			Optional<BookSupplier>existingOptional = this.booksupplierrepo.findBookSupplierByBkId(bkId);
			BookSupplier existing = existingOptional.get();
			
			existing.setSupplierName(bks2.getSupplierName()); 
			existing.setSupplierAddress(bks2.getSupplierAddress()); 
			existing.setSupplierPhone(bks2.getSupplierPhone()); 
			existing.setSupplierEmail(bks2.getSupplierEmail());
			 
			BookSupplier updated =  this.booksupplierrepo.save(existing);
			return this.mapToDTO(updated);
			
		}
		private BookSupplierDTO mapToDTO(BookSupplier updated) {
			// TODO Auto-generated method stub
			return null;
		}


		public boolean deleteBookSupplier(Long bkId) {
			this.booksupplierrepo.deleteBkSupplierByBkId(bkId); //delete without info
			boolean exists = this.booksupplierrepo.existsByBkId(bkId);
			return !exists;
		}
		
		public List<BookSupplier> getBookSupplierByName(String suppliername){ 
			return this.booksupplierrepo.findBookSupplierByName(suppliername);
		}
		public List<BookSupplier> getBookSupplierByAddress(String supplierAddress){ 
			return this.booksupplierrepo.findBookSupplierByAddress(supplierAddress);
		}
		public List<BookSupplier> getBookSupplierByPhone(String supplierPhone){ 
			return this.booksupplierrepo.findBookSupplierByPhone(supplierPhone);
		}
		
		public List<BookSupplier> getBookSupplierByEmail(String supplierEmail){ 
			return this.booksupplierrepo.findBookSupplierByEmail(supplierEmail);
		}
	}


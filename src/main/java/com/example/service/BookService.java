package com.example.service;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.BookDTO;
import com.example.model.Books;
import com.example.repo.BookRepo;

@Service
public class BookService {

	private BookRepo bookrepo;
	
	private ModelMapper mapper;
	
	public BookService(BookRepo bookrepo, ModelMapper mapper) {
		super();
		this.bookrepo = bookrepo;
		this.mapper = mapper;
	}

    private BookDTO mapToDTO(Books bk1) {
        return this.mapper.map(bk1, BookDTO.class);
    }

    public BookDTO createBook(Books bk1) {
        Books saved =  this.bookrepo.save(bk1);
        return this.mapToDTO(saved);
    }
    public List<BookDTO> readBook() {
        return this.bookrepo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }
    public BookDTO updateBook(Long bkId, Books bk2) {
        Optional<Books> existingOptional = this.bookrepo.findById(bkId);
        Books existing = existingOptional.get();

        existing.setBkname(bk2.getBkname());
        existing.setBktitle(bk2.getBktitle());
        existing.setBkauthor(bk2.getBkauthor());
        existing.setBkpublisher(bk2.getBkpublisher());
        existing.setBkedition(bk2.getBkedition());
        existing.setBkqantity(bk2.getBkqantity());
        existing.setBktype(bk2.getBktype());
        existing.setBksource(bk2.getBksource());
        existing.setSourcetype(bk2.getSourcetype());
        existing.setSourceName(bk2.getSourceName());
        existing.setSourceAddress(bk2.getSourceAddress());
        existing.setSourcePhone(bk2.getSourcePhone());
        existing.setBkstate(bk2.getBkstate());
        existing.setBkneed(bk2.getBkneed());
        
        Books updated =  this.bookrepo.save(existing);
        return this.mapToDTO(updated);
    }

    public boolean deleteBook(Long bkId) {
        this.bookrepo.deleteById(bkId);
        boolean exists = this.bookrepo.existsById(bkId);
        return !exists;
    }
  
    
//	public Books createBook(Books bk1)
//	{
//		return this.bookrepo.save(bk1);
//	}
//	
//	public List<Books> readBook() {
//		return this.bookrepo.findAll();
//	}
//	
//	public Books updateBook(long bkId, Books bk2) {
//		Optional<Books>myTempBook = this.bookrepo.findBookByBkId(bkId);
//		Books existing = myTempBook.get();
//		existing.setBkname(bk2.getBkname()); //from request body
//		existing.setBktitle(bk2.getBktitle()); //from request body
//		return this.bookrepo.save(existing);
//		
//	}
//	public boolean deleteBook(long bkId) {
//		this.bookrepo.deleteById(bkId); //delete without info
//		boolean exists = this.bookrepo.existsById(bkId);
//		return !exists;
//	}
//	
//	public List<Books> getBookByName(String bkname){ 
//		return this.bookrepo.findBookByName(bkname);
//	}
//	public List<Books> getBookByTitle(String bktitle){ 
//		return this.bookrepo.findBookByTitle(bktitle);
//	}
//	public List<Books> getBookByAuthor(String bkauthor){ 
//		return this.bookrepo.findBookByAuthor(bkauthor);
//	}
//	
//	public List<Books> getBookByPublisher(String bkpublisher){ 
//		return this.bookrepo.findBookByPublisher(bkpublisher);
//	}
//	public List<Books> getBookByEdition(String bkedition){ 
//		return this.bookrepo.findBookByEdition(bkedition);
//	}
//	public List<Books> getBookByQuantity(String bkquantity){ 
//		return this.bookrepo.findBookByQuantity(bkquantity);
//	}
//	public List<Books> getBookByType(String bktype){ 
//		return this.bookrepo.findBookByType(bktype);
//	}
//	public List<Books> getBookBySource(String bksource){ 
//		return this.bookrepo.findBookBySource(bksource);
//	}
//	public List<Books> getBookBySourceType(String bksourcetype){ 
//		return this.bookrepo.findBookBySourceType(bksourcetype);
//	}
//	public List<Books> getBookBySourceName(String bksourcename){ 
//		return this.bookrepo.findBookBySourceName(bksourcename);
//	}
//	public List<Books> getBookBySourceAddress(String bksourceaddress){ 
//		return this.bookrepo.findBookBySourceAddress(bksourceaddress);
//	}
//	public List<Books> getBookBySourcePhone(String bksourcephone){ 
//		return this.bookrepo.findBookBySourcePhone(bksourcephone);
//	}
//	public List<Books> getBookBySourceBookNeed(String bkneed){ 
//		return this.bookrepo.findBookByBookNeed(bkneed);
//	}		
//
//	
//	
//	
////	public int checkCredentials(String userName, String password)
////		int flag = 0;
////		if(!bookrepo.login(userName, password).isEmpty())
////		{
////			flag = 1;
////			System.out.println("inside " + flag);
////			return flag;
////		}
////		System.out.println("out -- " + flag);
////		return flag;
	
}

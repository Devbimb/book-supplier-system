package com.example.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.model.Books;

@Repository
@EnableJpaRepositories
public interface BookRepo extends JpaRepository<Books, Long>{
		//@Query(value = "select * from books where name = ?1", nativeQuery = true)
		//List<Books> findBooksByName(long name);
	
//		@Query("SELECT bk from Books bk WHERE bk.BkId = ?1")
//		List<Books> findBookByBkId(long bkId);
	
		@Query("SELECT bk from Books bk WHERE bk.bkname = ?1")
		List<Books> findBookByName(String bkname);
		
		@Query("SELECT bk from Books bk WHERE bk.bktitle = ?1")
		List<Books> findBookByTitle(String bktitle);
		
		@Query("SELECT bk from Books bk WHERE bk.bkauthor = ?1")
		List<Books> findBookByAuthor(String bkauthor);
		
		@Query("SELECT bk from Books bk WHERE bk.bkpublisher = ?1")
		List<Books> findBookByPublisher(String bkpublisher);
		
		@Query("SELECT bk from Books bk WHERE bk.bkedition = ?1")
		List<Books> findBookByEdition(String bkedition);
		
		@Query("SELECT bk from Books bk WHERE bk.bkquantity = ?1")
		List<Books> findBookByQuantity(String bkquantity);
		
		@Query("SELECT bk from Books bk WHERE bk.bktype = ?1")
		List<Books> findBookByType(String bktype);
		
		@Query("SELECT bk from Books bk WHERE bk.bksource = ?1")
		List<Books> findBookBySource(String bksource);
		
		@Query("SELECT bk from Books bk WHERE bk.sourcetype = ?1")
		List<Books> findBookBySourceType(String sourcetype);
		
		@Query("SELECT bk from Books bk WHERE bk.sourcename = ?1")
		List<Books> findBookBySourceName(String sourcename);
		
		@Query("SELECT bk from Books bk WHERE bk.sourceaddress = ?1")
		List<Books> findBookBySourceAddress(String sourceaddress);
		
		@Query("SELECT bk from Books bk WHERE bk.sourcephone = ?1")
		List<Books> findBookBySourcePhone(String sourcephone);
		
		@Query("SELECT bk from Books bk WHERE bk.bkneed = ?1")
		List<Books> findBookByBookNeed(String bkneed);

//		Optional<Books> findBookByBkId(long bkId);
		
		
}

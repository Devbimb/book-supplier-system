package com.example.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.model.BookSupplier;
import com.example.model.Books;

	@Repository
	@EnableJpaRepositories
	public interface BookSupplierRepo extends JpaRepository<BookSupplier, Long>{
			//@Query(value = "select * from books where name = ?1", nativeQuery = true)
			//List<Books> findBooksByName(long name);

			@Query("SELECT bks from BookSupplier bks WHERE bks.userName = ?1 and bks.password=?2")
			List<BookSupplier> login(String userName, String password);
			
			@Query("SELECT bks from BookSupplier bks WHERE bks.supplierName = ?1")
			List<BookSupplier> findBookSupplierByName(String supplierName);
			
			@Query("SELECT bks from BookSupplier bks WHERE bks.supplierAddress = ?1")
			List<BookSupplier> findBookSupplierByAddress(String supplierAddress);
			
			@Query("SELECT bks from Books bks WHERE bks.supplierPhone = ?1")
			List<BookSupplier> findBookSupplierByPhone(String supplierPhone);
			
			@Query("SELECT bks from Books bks WHERE bks.supplierEmail = ?1")
			List<BookSupplier> findBookSupplierByEmail(String supplierEmail);

			void deleteBkSupplierByBkId(long bkId);

			boolean existsByBkId(long bkId);

			Optional<BookSupplier> findBookSupplierByBkId(long bkId);
			

}

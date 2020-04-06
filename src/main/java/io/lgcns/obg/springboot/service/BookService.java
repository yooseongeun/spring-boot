package io.lgcns.obg.springboot.service;

import java.util.Optional;

import io.lgcns.obg.springboot.domain.Book;

public interface BookService {
	
	Optional<Book> findById(Long id);

}

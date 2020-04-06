package io.lgcns.obg.springboot.service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import io.lgcns.obg.springboot.domain.Book;
import io.lgcns.obg.springboot.domain.BookRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.NONE)
public class BookServiceTest {

	@Autowired
	BookService bookService;
	
	
	
	@Test(expected = RuntimeException.class)
	public void testFindById() {
		Long id = 1L;
		 bookService.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
	}
	
}

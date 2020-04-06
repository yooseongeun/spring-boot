package io.lgcns.obg.springboot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.Generated;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Generated
@Setter
@NoArgsConstructor
@Entity
public class Book extends AbstractPersistable<Long> {

	private String name;
	private String isbn13;
	private String isbn10;
	
	
	
}

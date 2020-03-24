package com.example.bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.bookstore.model.Category;
import com.example.bookstore.model.Book;
import com.example.bookstore.model.BookRepository;


@RunWith(SpringRunner.class)
@DataJpaTest
public class BookRepositoryTest {

	@Autowired
    private BookRepository bookRepository;

    @Test
    public void findByTitleShouldReturnBook() {
        List<Book> books = bookRepository.findByTitle("Dracula");
        
        assertThat(books).hasSize(1);
        assertThat(books.get(1).getAuthor()).isEqualTo("Bram Stoker");
    }
    
    @Test
    public void createNewBook() {
    	Book book = new Book("title", "author", "year", "isbn", "price", new Category("CATEGORY"));
    	bookRepository.save(book);
    	assertThat(book.getId()).isNotNull();
    }    

}

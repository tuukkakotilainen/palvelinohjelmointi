package com.example.bookstore;



import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.bookstore.web.BookController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmokeBookControllerTest {

	@Autowired
	private BookController bookController;
	
	@Test
	public void contextLoads() throws Exception {
		assertThat(bookController).inNotNull();
	}
}

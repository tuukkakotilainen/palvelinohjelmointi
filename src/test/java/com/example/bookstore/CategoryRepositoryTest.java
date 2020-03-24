package com.example.bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.example.bookstore.model.Category;
import com.example.bookstore.model.CategoryRepository;



@RunWith(SpringRunner.class)
@DataJpaTest
public class CategoryRepositoryTest {
	@Autowired
    private CategoryRepository categoryRepository;
	
	@Test
    public void findByNameShouldReturnName() {
		List<Category> category = categoryRepository.findByName("Novel");
        
        assertThat(category).hasSize(2);
        assertThat(category.get(0).getName()).isEqualTo("Novel");
    }
}

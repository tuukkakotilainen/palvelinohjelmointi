package com.example.bookstore;

import static org.assertj.core.api.Assertions.assertThat;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.example.bookstore.model.User;
import com.example.bookstore.model.UserRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

	@Autowired
    private UserRepository userRepository;
	
	@Test
    public void findByUsernameShouldReturnUsername() {
        User user = userRepository.findByUsername("admin");
        
        assertThat(user);
        assertThat(user.getUsername()).isEqualTo("admin");
    }
}

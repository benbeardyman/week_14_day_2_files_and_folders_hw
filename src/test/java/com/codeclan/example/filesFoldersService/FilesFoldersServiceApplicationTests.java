package com.codeclan.example.filesFoldersService;

import com.codeclan.example.filesFoldersService.models.Person;
import com.codeclan.example.filesFoldersService.repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilesFoldersServiceApplicationTests {

	@Autowired
	PersonRepository personRepository;

	@Test
	void contextLoads() {
	}

}

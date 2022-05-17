package br.com.cicdteste.data.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.cicdteste.data.controller.DataController;

@SpringBootTest
public class DataControllerTest {

	@Autowired
	DataController dataController;
	
	@Test
	void version() {
		assertEquals("Version 1.0.0", dataController.version());
	}
	
	@Test
	void getBooks() {
		Integer total = dataController.getBooks().size();
		assertEquals(10, total);
	}
	
}

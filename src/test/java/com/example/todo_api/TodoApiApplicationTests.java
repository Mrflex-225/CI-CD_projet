package com.example.todo_api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TodoApiApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private TodoRepository todoRepository;

	@Test
	void createTodo_shouldSaveTodo() {
		Todo todo = new Todo("Faire les courses", false);
		Todo saved = todoRepository.save(todo);
		Assertions.assertNotNull(saved.getId());
	}
}

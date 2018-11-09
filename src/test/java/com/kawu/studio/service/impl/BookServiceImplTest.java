package com.kawu.studio.service.impl;

import static org.junit.Assert.fail;

import com.kawu.studio.dto.AppointExecution;
import com.kawu.studio.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.kawu.studio.BaseTest;

public class BookServiceImplTest extends BaseTest {

	@Autowired
	private BookService bookService;

	@Test
	public void testAppoint() throws Exception {
		long bookId = 1001;
		long studentId = 12345678910L;
		AppointExecution execution = bookService.appoint(bookId, studentId);
		System.out.println(execution);
	}

}

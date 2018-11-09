package com.kawu.studio.web;

import com.kawu.studio.dto.AppointExecution;
import com.kawu.studio.dto.Result;
import com.kawu.studio.entity.Book;
import com.kawu.studio.enums.AppointStateEnum;
import com.kawu.studio.exception.NoNumberException;
import com.kawu.studio.exception.RepeatAppointException;
import com.kawu.studio.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/add")
    public Object add(@RequestBody Book book) {
        int result = bookService.addBook(book);
        return new Result<>(true, result);
    }

    @GetMapping("/delete")
    public Object delete(@RequestParam Long bookId) {
        int result = bookService.deleteBook(bookId);
        return new Result<>(true, result);
    }

    @PostMapping("/update")
    public Object update(@RequestBody Book book) {
        int result = bookService.updateBook(book);
        return new Result<>(true, result);
    }

    @GetMapping("/list")
    public Object list() {
        List<Book> list = bookService.getList();
        return new Result<>(true, list);
    }

    @GetMapping("/{bookId}/detail")
    public Object detail(@PathVariable("bookId") Long bookId) {
        if (bookId == null) {
            return new Result<>(false, "bookId不能为空");
        }
        Book book = bookService.getById(bookId);
        if (book == null) {
            return new Result<>(false, "book不存在");
        }
        return new Result<>(true, book);
    }

    // ajax json
    @PostMapping(value = "/{bookId}/appoint")
    public Result<AppointExecution> appoint(@PathVariable("bookId") Long bookId, @RequestParam("studentId") Long studentId) {
        if (studentId == null || studentId.equals("")) {
            return new Result<>(false, "学号不能为空");
        }
        AppointExecution execution = null;
        try {
            execution = bookService.appoint(bookId, studentId);
        } catch (NoNumberException e1) {
            execution = new AppointExecution(bookId, AppointStateEnum.NO_NUMBER);
        } catch (RepeatAppointException e2) {
            execution = new AppointExecution(bookId, AppointStateEnum.REPEAT_APPOINT);
        } catch (Exception e) {
            execution = new AppointExecution(bookId, AppointStateEnum.INNER_ERROR);
        }
        return new Result<AppointExecution>(true, execution);
    }

}

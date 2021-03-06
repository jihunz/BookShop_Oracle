package kr.ac.kopo.bookshop.dao;

import java.util.List;

import kr.ac.kopo.bookshop.model.Book;

public interface BookDao {

	List<Book> list();

	void add(Book item);

	Book item(int bookId);

	void update(Book item);

	void delete(int bookId);

}

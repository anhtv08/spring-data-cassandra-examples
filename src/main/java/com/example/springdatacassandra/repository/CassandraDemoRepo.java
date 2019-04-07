package com.example.springdatacassandra.repository;
import java.util.List;
public class CassandraDemoRepo implements  DemoRepository<Book> {

    @Override
    public Book save(Book value) {
        return null;
    }

    @Override
    public Book saveOrUpdate(Book value) {
        return null;
    }

    @Override
    public List<Book> find(String query) {
        return null;
    }

    @Override
    public boolean delete(Book value) {
        return false;
    }
}

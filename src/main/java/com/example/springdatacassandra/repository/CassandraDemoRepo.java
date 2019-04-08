package com.example.springdatacassandra.repository;
import com.datastax.driver.core.Session;
import java.util.List;
public class CassandraDemoRepo implements  DemoRepository<Book> {

    Session session;
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

package com.example.springdatacassandra.repository;

import java.util.List;

public interface DemoRepository<T> {
     T save (T value);
     T saveOrUpdate (T value);
     List<T> find  (final String query);
     boolean delete(T value);
}

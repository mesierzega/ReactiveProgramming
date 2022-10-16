package com.example.ReactiveProgrammingTutorial.repository;

import com.example.ReactiveProgrammingTutorial.entity.ProductEntity;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ReactiveCassandraRepository<ProductEntity, Integer> {
}

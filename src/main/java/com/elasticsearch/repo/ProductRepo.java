package com.elasticsearch.repo;

import com.elasticsearch.document.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ProductRepo extends ElasticsearchRepository<Product, Long> {
  List<Product> findByName(String name);

  List<Product> findByNameContaining(String name);

  List<Product> findByCreatorAndName(String creator, String name);
}

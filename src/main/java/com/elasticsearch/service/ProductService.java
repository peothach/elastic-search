package com.elasticsearch.service;

import com.elasticsearch.document.Product;
import com.elasticsearch.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

  private final ProductRepo productRepo;

  @Autowired
  public ProductService(ProductRepo productRepo) {
    this.productRepo = productRepo;
  }

  //save a product
  public void createProduct(Product product) {
    productRepo.save(product);
  }

  //findProduct
  public List<Product> findProductByName(String name) {
    return productRepo.findByName(name);
  }


}

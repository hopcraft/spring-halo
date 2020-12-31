package io.hopcraft.halo.service;

import java.util.List;

import io.hopcraft.halo.bean.Product;
import io.hopcraft.halo.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

  @Autowired
  private ProductMapper productMapper;

  public List<Product> getAllProducts() {
    return productMapper.products();
  }
}

package com.obydul.springmvc.service;

import com.obydul.springmvc.dao.ProductDao;
import com.obydul.springmvc.model.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl implements ProductService{
    
    @Autowired
    ProductDao productDao;
    

    @Override
    @Transactional
    public void addProduct(Product product) {
         productDao.addProduct(product);
    }

    @Override
    @Transactional
    public void updateProduct(Product product) {
      
    }

    @Override
    @Transactional
    public List<Product> listProduct() {
        return productDao.listProduct();
    }

    @Override
    @Transactional
    public Product getProductById(Integer productId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public void removeProduct(Integer productId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

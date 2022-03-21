package com.codegym.Service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    public static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "iPhone XS Max", "6000", "very expensive and beautiful","USA"));
        products.put(2, new Product(2, "Samsung Galaxy", "3000", "white and Gold","Korea"));
        products.put(3, new Product(3, "Oppo ", "2000", "Galaxy Color","China"));
        products.put(4, new Product(4, "Nokia 1280", "500", "Black, extremely durable bettery","Fin-land"));
        products.put(5, new Product(5, "VinSmart", "1200", "cheap and easy to use","Vietnam"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}

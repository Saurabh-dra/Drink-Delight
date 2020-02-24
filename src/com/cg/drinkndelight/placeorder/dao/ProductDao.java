package com.cg.drinkndelight.placeorder.dao;

import java.util.HashMap;

import com.cg.drinkndelight.placerorder.beans.Product;

public interface ProductDao {

	HashMap<String, Product> addProductList(Product product);

	HashMap<String, Product> displayOrderList();
}

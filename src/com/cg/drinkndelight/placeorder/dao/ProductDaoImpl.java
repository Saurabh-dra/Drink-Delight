package com.cg.drinkndelight.placeorder.dao;

import java.util.HashMap;
import java.util.Random;

import com.cg.drinkndelight.placerorder.beans.Product;
public class ProductDaoImpl implements ProductDao {

	public static final HashMap<String,Product> productList=new HashMap<>();
	

	@Override
	public HashMap<String, Product> displayOrderList() {
		// TODO Auto-generated method stub
		return productList;
	}

	@Override
	public HashMap<String, Product> addProductList(Product product) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		String orderID="P"+rand.nextInt(10000);
		productList.put(orderID, product);
		return null;
	}
	
}

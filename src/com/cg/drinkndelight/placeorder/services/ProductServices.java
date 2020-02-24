package com.cg.drinkndelight.placeorder.services;


import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;

import com.cg.drinkndelight.placeorder.dao.ProductDao;
import com.cg.drinkndelight.placeorder.dao.ProductDaoImpl;
import com.cg.drinkndelight.placeorder.exception.InvalidInputExpection;
import com.cg.drinkndelight.placerorder.beans.Product;

public class ProductServices {
	ProductDao productDao;
	
	public ProductServices() {
		productDao=new ProductDaoImpl();
	}
	public void addProduct(Product product) throws InvalidInputExpection {
		LocalDate now=LocalDate.now();
		Period diff=Period.between(now, now);
		if(diff.getMonths()>2||diff.getMonths()<0) {
			throw new InvalidInputExpection("Date is out of Bound");
		}
		else
			productDao.addProductList(product);
	}

	public HashMap<String,Product> displayProduct(){
		return productDao.displayOrderList();
	}
}

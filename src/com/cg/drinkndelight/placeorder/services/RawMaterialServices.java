package com.cg.drinkndelight.placeorder.services;

import com.cg.drinkndelight.placerorder.beans.RawMaterial;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;

import com.cg.drinkndelight.placeorder.dao.RawMaterialDao;
import com.cg.drinkndelight.placeorder.dao.RawMaterialDaoImpl;
import com.cg.drinkndelight.placeorder.exception.InvalidInputExpection;

public class RawMaterialServices {
	RawMaterialDao rawmaterialDao;

	public RawMaterialServices() {
		rawmaterialDao = new RawMaterialDaoImpl();
	}

	public void addRawMaterial(RawMaterial rawMaterial) throws InvalidInputExpection {
		// TODO Auto-generated method stub
		LocalDate now=LocalDate.now();
		Period diff=Period.between(rawMaterial.getDateOfDelivery(), now);
		if(diff.getMonths()>2||diff.getMonths()<0) {
			throw new InvalidInputExpection("Date is out of Bound");
		}
		else
			rawmaterialDao.addRawMAtertial(rawMaterial);		
	}
	
	public HashMap<String,RawMaterial> displayRawMaterial(){
		return rawmaterialDao.displayRawMaterialList();
	}

}

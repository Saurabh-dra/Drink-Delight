package com.cg.drinkndelight.placeorder.dao;


import java.util.HashMap;
import java.util.Random;

import com.cg.drinkndelight.placerorder.beans.RawMaterial;

public class RawMaterialDaoImpl implements RawMaterialDao {
	
	public static final HashMap<String,RawMaterial> rawList=new HashMap<>();
	
	@Override
	public void addRawMAtertial(RawMaterial rm) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		String orderID="RM"+rand.nextInt(10000);
		rawList.put(orderID, rm);
	}

	@Override
	public HashMap<String, RawMaterial> displayRawMaterialList() {
		
		return rawList;
		// TODO Auto-generated method stub
		
	}

	
	
	

}

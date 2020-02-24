package com.cg.drinkndelight.placeorder.dao;

import java.util.HashMap;


import com.cg.drinkndelight.placerorder.beans.RawMaterial;

public interface RawMaterialDao {
	void addRawMAtertial(RawMaterial rm);
	HashMap<String, RawMaterial> displayRawMaterialList();
	
}

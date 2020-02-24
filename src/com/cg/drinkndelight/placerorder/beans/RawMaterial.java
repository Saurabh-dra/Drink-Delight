package com.cg.drinkndelight.placerorder.beans;

import java.time.LocalDate;;

public class RawMaterial {
	private String RawName, SupplierID, WarehouseID, OrderID, StockID;
	private double PricePerUnit;
	private int Quantity;
	LocalDate DateOfDelivery;

	public String getRawName() {
		return RawName;
	}

	@Override
	public String toString() {
		return "RawMaterial [RawName=" + RawName + ", SupplierID=" + SupplierID + ", WarehouseID=" + WarehouseID
				+ ", PricePerUnit=" + PricePerUnit + ", Quantity=" + Quantity
				+ ", PricePerUnit=" + PricePerUnit + ", DateOfDelivery=" + DateOfDelivery + "]";
	}
	
	
	public RawMaterial(String rawName, String supplierID, String warehouseID,
			int quantity, double pricePerUnit, LocalDate dateOfDelivery) {
		super();
		RawName = rawName;
		SupplierID = supplierID;
		WarehouseID = warehouseID;
		Quantity = quantity;
		PricePerUnit = pricePerUnit;
		DateOfDelivery = dateOfDelivery;
	}

	public void setRawName(String rawName) {
		RawName = rawName;
	}

	public String getSupplierID() {
		return SupplierID;
	}

	public void setSupplierID(String supplierID) {
		SupplierID = supplierID;
	}

	public String getWarehouseID() {
		return WarehouseID;
	}

	public void setWarehouseID(String warehouseID) {
		WarehouseID = warehouseID;
	}

	public String getOrderID() {
		return OrderID;
	}

	public void setOrderID(String orderID) {
		OrderID = orderID;
	}

	public double getPricePerUnit() {
		return PricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		PricePerUnit = pricePerUnit;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public LocalDate getDateOfDelivery() {
		return DateOfDelivery;
	}

	public void setDateOfDelivery(LocalDate dateOfDelivery) {
		DateOfDelivery = dateOfDelivery;
	}

	public String getStockID() {
		return StockID;
	}

	public void setStockID(String stockID) {
		StockID = stockID;
	}

}

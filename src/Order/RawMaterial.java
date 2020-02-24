package Order;

import java.util.Date;

public class RawMaterial {

	private String RawName, SupplierID, WarehouseID, OrderID, StockID;
	private double PricePerUnit;
	private int Quantity;
	Date DateOfDelivery, ExpiryDate, ManufactureDate;

	public String getRawName() {
		return RawName;
	}

	@Override
	public String toString() {
		return "RawMaterial [RawName=" + RawName + ", SupplierID=" + SupplierID + ", WarehouseID=" + WarehouseID
				+ ", StockID=" + StockID + ", PricePerUnit=" + PricePerUnit + ", Quantity=" + Quantity
				+ ", PricePerUnit=" + PricePerUnit + ", DateOfDelivery=" + DateOfDelivery + "]";
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

	public Date getDateOfDelivery() {
		return DateOfDelivery;
	}

	public void setDateOfDelivery(Date dateOfDelivery) {
		DateOfDelivery = dateOfDelivery;
	}

	public Date getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		ExpiryDate = expiryDate;
	}

	public Date getManufactureDate() {
		return ManufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		ManufactureDate = manufactureDate;
	}

	public String getStockID() {
		return StockID;
	}

	public void setStockID(String stockID) {
		StockID = stockID;
	}

}
